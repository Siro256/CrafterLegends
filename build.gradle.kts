import java.net.URI
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.3.72"
}

group = "dev.siro256.spigotpl.crafterlegends"
version = "0.0.1-Alpha"

repositories {
    mavenCentral()
    maven { url = URI("https://hub.spigotmc.org/nexus/content/repositories/snapshots") }
    maven { url = URI("https://oss.sonatype.org/content/repositories/snapshots") }
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))
    compileOnly("org.spigotmc:spigot-api:1.12.2-R0.1-SNAPSHOT")
}

tasks{
    withType<JavaCompile> {
        options.encoding = "UTF-8"
    }

    withType<KotlinCompile> {
        kotlinOptions.jvmTarget = "1.8"
    }

    withType<ProcessResources> {
        filteringCharset = "UTF-8"
        from(projectDir) { include("LICENSE") }
        from(sourceSets.main.get().resources.srcDirs) {
            include("plugin.yml")
                .expand(
                    Pair("VERSION", project.version)
                )
        }
    }

    withType<Jar> {
        from(configurations.getByName("implementation")
            .apply{ isCanBeResolved = true }
            .map{ if (it.isDirectory) it else zipTree(it) })
    }
}
import java.net.URI

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
    implementation("org.spigotmc:spigot-api:1.12.2-R0.1-SNAPSHOT")
}

tasks {
    compileKotlin {
        kotlinOptions.jvmTarget = "1.8"
    }
    compileTestKotlin {
        kotlinOptions.jvmTarget = "1.8"
    }

    withType<ProcessResources> {
        from(projectDir) { include("LICENSE") }
        from(sourceSets.main.get().resources.srcDirs) {
            include("plugin.yml")
                .expand(
                    Pair("VERSION", project.version)
                )
        }
    }

    withType<Jar> {
        from(configurations.getByName("compile").map { if (it.isDirectory) it else zipTree(it) })
    }
}
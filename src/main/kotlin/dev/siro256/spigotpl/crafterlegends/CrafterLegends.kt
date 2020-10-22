package dev.siro256.spigotpl.crafterlegends

import dev.siro256.spigotpl.crafterlegends.commands.TestCommand
import dev.siro256.spigotpl.crafterlegends.util.ConsoleColor
import org.bukkit.Bukkit
import org.bukkit.command.CommandExecutor
import org.bukkit.event.Listener
import org.bukkit.plugin.java.JavaPlugin
import java.util.logging.Logger

class CrafterLegends: JavaPlugin() {
    init {
        Companion.logger = logger
    }

    private val version = "0.0.1-Alpha"

    override fun onEnable() {
        //コマンド登録
        mapOf<String, CommandExecutor>(
            "test" to TestCommand
        ).forEach { (command, executor) ->
            Bukkit.getPluginCommand(command).executor = executor
        }

        //イベント登録
        listOf<Listener>(

        ).forEach {
            Bukkit.getPluginManager().registerEvents(it, this)
        }

        logger.info("""
            ${ChatColor.GREEN}CrafterLegends起動:
              ${ChatColor.WHITE}現在のプラグインのバージョンは ${ChatColor.YELLOW}$version ${ChatColor.WHITE}です
              ${ChatColor.WHITE}プラグインの最新バージョンは ${ChatColor.YELLOW}${getLatestVersion()} ${ChatColor.WHITE}です
        """.trimIndent())
    }

    override fun onDisable() {
        logger.info("""
            CrafterLegends停止:
        """.trimIndent())
    }

    private fun getLatestVersion(): String {
        //TODO: 処理
        return ""
    }

    companion object {
        lateinit var logger: Logger
    }
}
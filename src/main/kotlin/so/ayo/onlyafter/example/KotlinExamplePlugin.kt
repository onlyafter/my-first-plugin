package so.ayo.onlyafter.example

import me.saiintbrisson.bukkit.command.BukkitFrame
import me.saiintbrisson.minecraft.command.message.MessageType
import org.bukkit.Bukkit
import org.bukkit.plugin.java.JavaPlugin
import so.ayo.onlyafter.example.listener.BattleListener

class KotlinExamplePlugin : JavaPlugin() {

    override fun onEnable() {

        BukkitFrame(this).also {
            it.messageHolder.setMessage(MessageType.NO_PERMISSION, "§cVocê não tem permissão.")

        }

        Bukkit.getPluginManager().registerEvents(BattleListener(), this)
        logger.info("Plugin iniciado")

    }

    override fun onDisable() {
        logger.info("Plugin desligado.")

    }
}
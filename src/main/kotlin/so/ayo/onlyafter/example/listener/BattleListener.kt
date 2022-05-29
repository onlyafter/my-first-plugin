package so.ayo.onlyafter.example.listener

import org.bukkit.Material
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.entity.PlayerDeathEvent
import org.bukkit.event.player.PlayerInteractEvent
import org.bukkit.inventory.ItemStack
import so.ayo.onlyafter.example.controller.BattleController

class BattleListener : Listener {

    @EventHandler
    fun οnBattle(event: PlayerInteractEvent) {

        if(event.item.type == Material.WOOD_SWORD) {
            BattleController.insertBattle(event.player)
            event.player.sendMessage("§aVocê entrou na batalha")

        }

    }

    @EventHandler
    fun onDeath(event: PlayerDeathEvent) {

        if(BattleController.battlePlayers.contains(event.entity.player.name)) {
            BattleController.removeBattle(event.entity.player);
            event.entity.player.sendMessage("§aVocê saiu da batalha.")

        }

    }

}
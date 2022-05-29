package so.ayo.onlyafter.example.controller

import com.google.common.collect.Lists
import org.bukkit.Material
import org.bukkit.entity.Player
import org.bukkit.inventory.ItemStack

object BattleController {

    val battlePlayers = mutableListOf<String>()

    fun insertBattle(player: Player) {

        battlePlayers.add(player.name)
        player.inventory.clear()

        val helmet = ItemStack(Material.DIAMOND_HELMET)
        val chestplate = ItemStack(Material.DIAMOND_HELMET)
        val leggings = ItemStack(Material.DIAMOND_HELMET)
        val boots = ItemStack(Material.DIAMOND_HELMET)

        player.inventory.helmet = helmet
        player.inventory.chestplate = chestplate
        player.inventory.leggings = leggings
        player.inventory.boots = boots

        player.inventory.addItem(ItemStack(Material.DIAMOND_SWORD))

    }

    fun removeBattle(player: Player) {

        battlePlayers.remove(player.name)
        player.inventory.clear()

        player.sendMessage(
            "§aVocê saiu da batalha."
        )

    }

}
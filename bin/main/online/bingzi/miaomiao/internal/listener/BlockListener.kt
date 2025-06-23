package online.bingzi.miaomiao.internal.listener

import org.bukkit.Material
import org.bukkit.event.player.PlayerInteractEvent
import taboolib.common.platform.event.SubscribeEvent

object BlockListener {
    @SubscribeEvent
    fun onPlayerInteractEvent(event: PlayerInteractEvent){
        // 如果玩家交互的是炼药台
        if (event.clickedBlock?.type == Material.BREWING_STAND) {
            // 阻止玩家交互炼药台
            event.isCancelled = true
        }
    }
}
package online.bingzi.miaomiao.internal.listener

import online.bingzi.miaomiao.internal.config.BlockConfig
import org.bukkit.event.player.PlayerInteractEvent
import taboolib.common.platform.event.SubscribeEvent

object BlockListener {
    @SubscribeEvent
    fun onPlayerInteractEvent(event: PlayerInteractEvent){
        event.clickedBlock?.type?.let {
            if (BlockConfig.noInteraction.contains(it)) {
                event.isCancelled = true
            }
        }
    }
}
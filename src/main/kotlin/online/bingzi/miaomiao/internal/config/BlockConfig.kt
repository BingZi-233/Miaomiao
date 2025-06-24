package online.bingzi.miaomiao.internal.config

import org.bukkit.Material
import taboolib.common.LifeCycle
import taboolib.common.platform.Awake
import taboolib.module.configuration.Config
import taboolib.module.configuration.Configuration

object BlockConfig {
    @Config(value = "block.yml")
    lateinit var config: Configuration
        private set

    var noInteraction: List<Material> = listOf()

    @Awake(LifeCycle.ENABLE)
    fun registerAutoReload() {
        config.onReload {
            reload()
        }
    }

    @Awake(LifeCycle.ENABLE)
    fun reload() {
        noInteraction = config.getStringList("noInteraction").map {
            Material.valueOf(it)
        }
    }

}
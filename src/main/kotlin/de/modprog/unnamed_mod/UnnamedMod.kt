package net.fabricmc.unnamed_mod

import kotlin.collections.*
import net.fabricmc.api.*
import net.fabricmc.unnamed_mod.blocks.*
import net.minecraft.block.*
import net.minecraft.item.*
import net.minecraft.util.*
import net.minecraft.util.registry.*

class UnnamedMod : ModInitializer {
    companion object {
        private val blocks =
                listOf(
                        object {
                            val block = WallClock(AbstractBlock.Settings.copy(Blocks.OAK_WOOD))
                            val id = "wall_clock"
                            val group = ItemGroup.DECORATIONS
                        }
                )
        final val MODID = "unnamed_mod"
    }

    override fun onInitialize() {
        for (block in blocks) {
            Registry.register(Registry.BLOCK, Identifier(MODID, block.id), block.block)
            Registry.register(
                    Registry.ITEM,
                    Identifier(MODID, block.id),
                    BlockItem(block.block, Item.Settings().group(ItemGroup.MISC))
            )
        }
    }
}

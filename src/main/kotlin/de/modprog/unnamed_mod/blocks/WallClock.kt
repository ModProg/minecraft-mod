package net.fabricmc.unnamed_mod.blocks

import net.fabricmc.unnamed_mod.blocks.Cuboids._0
import net.fabricmc.unnamed_mod.blocks.Cuboids._32
import net.fabricmc.unnamed_mod.blocks.Cuboids._8
import net.fabricmc.unnamed_mod.blocks.Cuboids._m32
import net.minecraft.block.*
import net.minecraft.util.math.*
import net.minecraft.util.shape.*
import net.minecraft.world.*

class WallClock : Block {
    public constructor(settings: Settings) : super(settings)

    override fun getOutlineShape(
            state: BlockState,
            world: BlockView,
            pos: BlockPos,
            context: ShapeContext
    ): VoxelShape {
        return VoxelShapes.cuboid(_32, _0, _32, _m32, _8, _m32)
    }
}

object Cuboids {
    val _32 = 0.03125
    val _m32 = 1.0 - _32
    val _8 = 0.125
    val _0 = 0.0
}

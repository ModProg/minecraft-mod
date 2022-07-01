package net.fabricmc.unnamed_mod.mixin

import net.minecraft.client.gui.screen.TitleScreen
import org.spongepowered.asm.mixin.Mixin
import org.spongepowered.asm.mixin.injection.At
import org.spongepowered.asm.mixin.injection.Inject
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo

@Mixin(TitleScreen::class)
class UnnamedModMixin {
    @Inject(at = [At("HEAD")], method = ["init()V"])
    private fun init(info:CallbackInfo) {
        println("This line is printed by an unnamed_mod mod mixin!")
    }
}

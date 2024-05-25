package net.bball_262.backrooms.mixin;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.JigsawBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value = JigsawBlock.class)
public class ModJigsawInfiniteSaver {

    private static final BooleanProperty INFINITE = BooleanProperty.create("infinite");

    @Inject(method = "createBlockStateDefinition", at = @At("HEAD"))
    public void injectCreateBlockStateDefinition(StateDefinition.Builder<Block, BlockState> pBuilder, CallbackInfo ci) {
        pBuilder.add(INFINITE);
    }
}
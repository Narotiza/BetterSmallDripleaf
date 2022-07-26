package club.moonlane.bettersmalldripleaf.mixin;

import net.minecraft.block.BlockState;
import net.minecraft.block.SmallDripleafBlock;
import net.minecraft.block.TallPlantBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import org.spongepowered.asm.mixin.Mixin;

import java.util.Random;

import static net.minecraft.block.Block.dropStack;

@Mixin(SmallDripleafBlock.class)
public abstract class MixinSmallDripleafGrow extends TallPlantBlock {
    public MixinSmallDripleafGrow(Settings settings) {
        super(settings);
    }

    public void grow(ServerWorld world, Random random, BlockPos pos, BlockState state) {
        dropStack(world, pos, new ItemStack(this));
    }
}

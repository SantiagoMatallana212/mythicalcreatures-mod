package com.github.santiagomatallana212.mythicalcreatures.entity.ai;

import com.github.santiagomatallana212.mythicalcreatures.entity.EntityBoar;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.animal.Rabbit;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockState;

public class BoarAIRaidCrops extends BoarAIMoveToBlock {
    private final EntityBoar boar;
    private boolean wantsToRaid;
    private boolean canRaid;

    public BoarAIRaidCrops(EntityBoar boar) {
        super(boar, (double)0.7F, 16);
        this.boar = boar;
    }

    public boolean canUse() {
        if (this.nextStartTick <= 0) {
            if (!net.minecraftforge.event.ForgeEventFactory.getMobGriefingEvent(this.boar.level, this.boar)) {
                return false;
            }

            this.canRaid = false;
            this.wantsToRaid = true;
        }

        return super.canUse();
    }

    public boolean canContinueToUse() {
        return this.canRaid && super.canContinueToUse();
    }

    public void tick() {
        super.tick();
        this.boar.getLookControl().setLookAt((double)this.blockPos.getX() + 0.5D, (double)(this.blockPos.getY() + 1), (double)this.blockPos.getZ() + 0.5D, 10.0F, (float)this.boar.getMaxHeadXRot());
        if (this.isReachedTarget()) {
            Level level = this.boar.level;
            BlockPos blockpos = this.blockPos.above();
            BlockState blockstate = level.getBlockState(blockpos);
            Block block = blockstate.getBlock();
            if (this.canRaid && block instanceof CarrotBlock) {
                int i = blockstate.getValue(CarrotBlock.AGE);
                if (i == 0) {
                    level.setBlock(blockpos, Blocks.AIR.defaultBlockState(), 2);
                    level.destroyBlock(blockpos, true, this.boar);
                } else {
                    level.setBlock(blockpos, blockstate.setValue(CarrotBlock.AGE, Integer.valueOf(i - 1)), 2);
                    level.levelEvent(2001, blockpos, Block.getId(blockstate));
                }
            }
            if (this.canRaid && block instanceof PotatoBlock) {
                int i = blockstate.getValue(PotatoBlock.AGE);
                if (i == 0) {
                    level.setBlock(blockpos, Blocks.AIR.defaultBlockState(), 2);
                    level.destroyBlock(blockpos, true, this.boar);
                } else {
                    level.setBlock(blockpos, blockstate.setValue(PotatoBlock.AGE, Integer.valueOf(i - 1)), 2);
                    level.levelEvent(2001, blockpos, Block.getId(blockstate));
                }
            }
            if (this.canRaid && block instanceof BeetrootBlock) {
                int i = blockstate.getValue(BeetrootBlock.AGE);
                if (i == 0) {
                    level.setBlock(blockpos, Blocks.AIR.defaultBlockState(), 2);
                    level.destroyBlock(blockpos, true, this.boar);
                } else {
                    level.setBlock(blockpos, blockstate.setValue(BeetrootBlock.AGE, Integer.valueOf(i - 1)), 2);
                    level.levelEvent(2001, blockpos, Block.getId(blockstate));
                }
            }

            this.canRaid = false;
            this.nextStartTick = 10;
        }

    }

    protected boolean isValidTarget(LevelReader p_29785_, BlockPos p_29786_) {
        BlockState blockstate = p_29785_.getBlockState(p_29786_);
        if (blockstate.is(Blocks.FARMLAND) && this.wantsToRaid && !this.canRaid) {
            blockstate = p_29785_.getBlockState(p_29786_.above());
            if (blockstate.getBlock() instanceof CarrotBlock && ((CarrotBlock)blockstate.getBlock()).isMaxAge(blockstate)) {
                this.canRaid = true;
                return true;
            }
            if (blockstate.getBlock() instanceof PotatoBlock && ((PotatoBlock)blockstate.getBlock()).isMaxAge(blockstate)) {
                this.canRaid = true;
                return true;
            }
            if (blockstate.getBlock() instanceof BeetrootBlock && ((BeetrootBlock)blockstate.getBlock()).isMaxAge(blockstate)) {
                this.canRaid = true;
                return true;
            }
        }

        return false;
    }
}

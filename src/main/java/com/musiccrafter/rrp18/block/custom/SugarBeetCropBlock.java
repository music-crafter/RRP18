package com.musiccrafter.rrp18.block.custom;

import com.musiccrafter.rrp18.item.ModItems;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.BeetrootBlock;

public class SugarBeetCropBlock extends BeetrootBlock {
    public SugarBeetCropBlock(Properties properties) {
        super(properties);
    }

    @Override
    protected ItemLike getBaseSeedId() {
        return ModItems.SUGAR_BEET_SEEDS.get();
    }
}

package com.Pdiddy973.AllTheCompressed.blocks.ato;


import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;

public class Platinum extends Block {
    public Platinum() {
        super(Properties.of(Material.METAL)
                .sound(SoundType.METAL)
                .strength(15f, 30F)
                .requiresCorrectToolForDrops());
    }
}

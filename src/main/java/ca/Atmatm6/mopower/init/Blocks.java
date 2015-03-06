package ca.Atmatm6.mopower.init;

import ca.Atmatm6.mopower.block.StaticHarvester;
import ca.Atmatm6.mopower.block.StaticOre;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class Blocks {
    public static Block oreStatic = new StaticOre(Material.rock);
    public static Block harvesterStatic = new StaticHarvester(Material.iron);
}

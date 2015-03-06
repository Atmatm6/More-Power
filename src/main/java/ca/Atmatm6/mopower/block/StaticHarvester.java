package ca.Atmatm6.mopower.block;


import cofh.api.energy.IEnergyConnection;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.util.ForgeDirection;

public class StaticHarvester extends Block implements IEnergyConnection {
    public StaticHarvester(Material iron) {
        super(Material.iron);
    }
    @Override
    public boolean canConnectEnergy(ForgeDirection from) {
        return true;
    }
}
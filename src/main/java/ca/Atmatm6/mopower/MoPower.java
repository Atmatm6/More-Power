package ca.Atmatm6.mopower;

import ca.Atmatm6.mopower.init.Blocks;
import ca.Atmatm6.mopower.init.Oregen;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(
        modid = Reference.modid,
        name = Reference.name,
        version = Reference.version,
        dependencies = Reference.dependencies
    )
public class MoPower {
    public static Logger log = LogManager.getLogger(Reference.modid);
    public static Oregen oregen = new Oregen();
    public void preInit(FMLPreInitializationEvent preInitializationEvent)
    {
        log.info(Reference.loggerPreInit);
        GameRegistry.registerWorldGenerator(oregen, 0);
        GameRegistry.registerBlock(Blocks.oreStatic, "orestatic");
        GameRegistry.registerBlock(Blocks.harvesterStatic, "harvester");
        log.info(Reference.loggerPreInitFinish);
    }
}
package ca.Atmatm6.mopower;

import cpw.mods.fml.common.Loader;

public class Reference {
    //@Mod strings
    public static final String modid = "MorePower";
    public static final String name = "More Power";
    public static final String version = "0.0.0.a";
    public static final String dependencies = "required-after:Catalog";

    public static final String loggerPreInit = modid + "has started preinit";

    public class ModsLoaded
    {
        public final Boolean cofhcoreInstalled;

        public ModsLoaded() {
            cofhcoreInstalled = Loader.isModLoaded("CoFHCore");
        }
    }
}

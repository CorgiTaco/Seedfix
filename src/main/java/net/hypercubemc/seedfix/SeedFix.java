package net.hypercubemc.seedfix;

import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(SeedFix.MODID)
public class SeedFix {
    public static final String MODID = "seedfix";
    public static final Logger LOGGER = LogManager.getLogger(MODID);

    public SeedFix() {
        LOGGER.info("Loaded seedfix v1.0 by Justsnoopy30!");
    }
}

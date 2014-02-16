package akkamaddi.netherrocksaddenda.code;

import java.io.File;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import net.minecraftforge.common.Configuration;
import net.minecraftforge.common.MinecraftForge;

@Mod(modid = "netherrocksAddenda", name = "akkamaddi's Addenda to Netherrocks", version = "1.0.0", dependencies = "required-after:simpleores ; required-after:simpleoresfusion ; required-after:netherrocks")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)

public class NetherrocksAddenda
{
    // The instance of your mod that Forge uses.
    @Instance("netherrocksAddenda")
    public static NetherrocksAddenda instance;

    // Says where the client and server 'proxy' code is loaded.
    @SidedProxy(clientSide = "akkamaddi.netherrocksaddenda.code.ClientProxy", serverSide = "akkamaddi.netherrocksaddenda.code.CommonProxy")
    public static CommonProxy proxy;

    public static boolean enableNetherrocksRecycling;
    public static boolean enableNetherrocksMobEquips;
    public static boolean enableNetherrocksChestGen;
    
    
    @EventHandler // used in 1.6.2
    public void preInit(FMLPreInitializationEvent event)
    {

    	File installDir = event.getModConfigurationDirectory();
		File configDir = new File(installDir, "akkamaddi");
		File configFile = new File(configDir, "akkamaddi_Netherrocks_addenda.cfg");
    	Configuration config = new Configuration(configFile);
    	
    	config.load();
    	enableNetherrocksRecycling = config.get("1. Enable Simple Fusion Recycling recipes for Netherrocks materials", "Enable Recycling, false or true", false).getBoolean(false);
    	enableNetherrocksMobEquips = config.get("2. Enable Netherrocks material equips on mobs", "Mob equips, false or true", false).getBoolean(false);
    	enableNetherrocksChestGen = config.get("3. Enable chest loot generation for Netherrocks material items", "Chest gen, false or true", false).getBoolean(false);
    	config.save();
    	
    	if (NetherrocksAddenda.enableNetherrocksChestGen) {
    		NRChestGen.doNRChestGen();
    	}

    }

    @EventHandler // used in 1.6.2
    public void load(FMLInitializationEvent event)
    {
        proxy.registerRenderers();
        

        if (NetherrocksAddenda.enableNetherrocksMobEquips) {
        MinecraftForge.EVENT_BUS.register(new JoinWorldNR());
        }
        
        if (NetherrocksAddenda.enableNetherrocksRecycling) {
        	NRRecycleRecipes.doRecycleRecipes();
        }
        
    }

    @EventHandler // used in 1.6.2
    public void postInit(FMLPostInitializationEvent event)
    {
        // Stub Method
    }
}
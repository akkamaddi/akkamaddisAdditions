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
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraftforge.common.Configuration;
import net.minecraftforge.common.MinecraftForge;

@Mod(modid = "netherrocksAddenda", name = "akkamaddi's Addenda to Netherrocks", version = "1.0.1", dependencies = "required-after:simpleores ; required-after:simpleoresfusion ; required-after:netherrocks")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)

public class NetherrocksAddenda
{
    // The instance of your mod that Forge uses.
    @Instance("netherrocksAddenda")
    public static NetherrocksAddenda instance;

    // Says where the client and server 'proxy' code is loaded.
    @SidedProxy(clientSide = "akkamaddi.netherrocksaddenda.code.ClientProxy", serverSide = "akkamaddi.netherrocksaddenda.code.CommonProxy")
    public static CommonProxy proxy;

    // config
    public static Configuration config;

    public static boolean enableNetherrocksRecycling;
    public static boolean enableNetherrocksMobEquips;
    public static boolean enableNetherrocksChestGen;
    public static boolean enableHigherDimensionGen;

    //Higher Dimensions
    public static int[] dimensionIDsArray;


    @EventHandler // used in 1.6.2
    public void preInit(FMLPreInitializationEvent event)
    {
        File installDir = event.getModConfigurationDirectory();
        File configDir = new File(installDir, "akkamaddi");
        File configFile = new File(configDir, "akkamaddi_Netherrocks_addenda.cfg");
        config = new Configuration(configFile);
        config.load();
        enableNetherrocksRecycling = config.get("1. Enable Simple Fusion Recycling recipes for Netherrocks materials", "Enable Recycling, false or true", false).getBoolean(false);
        enableNetherrocksMobEquips = config.get("2. Enable Netherrocks material equips on mobs", "Mob equips, false or true", false).getBoolean(false);
        enableNetherrocksChestGen = config.get("3. Enable chest loot generation for Netherrocks material items", "Chest gen, false or true", false).getBoolean(false);
        

        //higher dimension
        enableHigherDimensionGen = config.get("ZZZ. Higher World Gen for Netherrocks", "Spawn Netherrocks in higher dimensions? (Advanced)", false).getBoolean(enableHigherDimensionGen);
        
        //Higher Dimensions
        if (enableHigherDimensionGen)
        {
            dimensionIDsArray = config.get("Higher Dimensions", "Higher Dimensions ID List", new int[] {}).getIntList();
            System.out.println("Number of dimension ID's in the array = " + dimensionIDsArray.length);

            try
            {
                for (int i = 0; i < dimensionIDsArray.length; i++)
                {
                	config.get("Higher Dimension ID: " + dimensionIDsArray[i], "Fyrite Spawn Rate", 10).getInt();
                	config.get("Higher Dimension ID: " + dimensionIDsArray[i], "Fyrite Maximum Spawn Height", 256).getInt();
                	config.get("Higher Dimension ID: " + dimensionIDsArray[i], "Fyrite Minimum Spawn Height", 0).getInt();
                	config.get("Higher Dimension ID: " + dimensionIDsArray[i], "Fyrite Vein Size", 6).getInt();

                	config.get("Higher Dimension ID: " + dimensionIDsArray[i], "Malachite Spawn Rate", 10).getInt();
                	config.get("Higher Dimension ID: " + dimensionIDsArray[i], "Malachite Maximum Spawn Height", 256).getInt();
                	config.get("Higher Dimension ID: " + dimensionIDsArray[i], "Malachite Minimum Spawn Height", 0).getInt();
                	config.get("Higher Dimension ID: " + dimensionIDsArray[i], "Malachite Vein Size", 7).getInt();

                	config.get("Higher Dimension ID: " + dimensionIDsArray[i], "Ashstone Spawn Rate", 10).getInt();
                	config.get("Higher Dimension ID: " + dimensionIDsArray[i], "Ashstone Maximum Spawn Height", 256).getInt();
                	config.get("Higher Dimension ID: " + dimensionIDsArray[i], "Ashstone Minimum Spawn Height", 0).getInt();
                	config.get("Higher Dimension ID: " + dimensionIDsArray[i], "Ashstone Vein Size", 5).getInt();

                	config.get("Higher Dimension ID: " + dimensionIDsArray[i], "Illumenite Spawn Rate", 350).getInt();
                	config.get("Higher Dimension ID: " + dimensionIDsArray[i], "Illumenite Maximum Spawn Height", 256).getInt();
                	config.get("Higher Dimension ID: " + dimensionIDsArray[i], "Illumenite Minimum Spawn Height", 0).getInt();
                	config.get("Higher Dimension ID: " + dimensionIDsArray[i], "Illumenite Vein Size", 15).getInt();

                	config.get("Higher Dimension ID: " + dimensionIDsArray[i], "Dragonstone Spawn Rate", 6).getInt();
                	config.get("Higher Dimension ID: " + dimensionIDsArray[i], "Dragonstone Maximum Spawn Height", 256).getInt();
                	config.get("Higher Dimension ID: " + dimensionIDsArray[i], "Dragonstone Minimum Spawn Height", 0).getInt();
                	config.get("Higher Dimension ID: " + dimensionIDsArray[i], "Dragonstone Vein Size", 5).getInt();

                	config.get("Higher Dimension ID: " + dimensionIDsArray[i], "Argonite Spawn Rate", 10).getInt();
                	config.get("Higher Dimension ID: " + dimensionIDsArray[i], "Argonite Maximum Spawn Height", 256).getInt();
                	config.get("Higher Dimension ID: " + dimensionIDsArray[i], "Argonite Minimum Spawn Height", 0).getInt();
                	config.get("Higher Dimension ID: " + dimensionIDsArray[i], "Argonite Vein Size", 6).getInt();
                	
                    System.out.println("Dimension ID in position " + i + " is " + dimensionIDsArray[i]);
                }
            }
            catch (Exception e)
            {
            }
        }
        else
            dimensionIDsArray = new int[] {};

        config.save();

        if (NetherrocksAddenda.enableNetherrocksChestGen)
        {
            NRChestGen.doNRChestGen();
        }
    }

    @EventHandler // used in 1.6.2
    public void load(FMLInitializationEvent event)
    {
        proxy.registerRenderers();

        if (NetherrocksAddenda.enableNetherrocksMobEquips)
        {
            MinecraftForge.EVENT_BUS.register(new JoinWorldNR());
        }

        if (NetherrocksAddenda.enableNetherrocksRecycling)
        {
            NRRecycleRecipes.doRecycleRecipes();
        }
    }

    @EventHandler // used in 1.6.2
    public void postInit(FMLPostInitializationEvent event)
    {
    	GameRegistry.registerWorldGenerator(new NetherrocksGenerator());
    }
}
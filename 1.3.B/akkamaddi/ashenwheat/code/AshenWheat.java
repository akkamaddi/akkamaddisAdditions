package akkamaddi.ashenwheat.code;

import java.io.File;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.Configuration;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid = "ashenwheat", name = "Ashenwheat", version = "0.0.0")
@NetworkMod(clientSideRequired = true)

public class AshenWheat
{
    /*
	public static Block ashWheatCrop = new  AshWheatCrop(1295);
    public static Item ashSeeds = new AshSeeds(12120, ashWheatCrop.blockID, Block.tilledField.blockID);
    public static Item ashWheatItem = new AshenWheatItem(12121);
    */
	
	public static Block ashWheatCrop;
	public static Block ashWheatBale;
    public static Item ashSeeds;
    public static Item ashWheatItem;
    public static Item ashBread;
    public static Item ashCookie;
    
    public static int ashWheatCropID;
    public static int ashWheatBaleID;
    public static int ashSeedsID;
    public static int ashWheatItemID;
    public static int ashBreadID;
    public static int ashCookieID;
    
    public static boolean MakeWheatSmoky;
    public static boolean MakeBalesFlame;
    
    
    // The instance of your mod that Forge uses.
    @Instance(value = "ashenwheat")
    public static AshenWheat instance;

    // Says where the client and server 'proxy' code is loaded.
    @SidedProxy(clientSide = "akkamaddi.ashenwheat.code.ClientProxy", serverSide = "SimpleOres.plugins.ashenwheatc.CommonProxy")
    public static CommonProxy proxy;

    @EventHandler // used in 1.6.2
    public void preInit(FMLPreInitializationEvent event)
    {
    	File installDir = event.getModConfigurationDirectory();
		File configDir = new File(installDir, "akkamaddi");
		File configFile = new File(configDir, "ashenwheat.cfg");
    	Configuration config = new Configuration(configFile);
    	
    	config.load();
    	
    	ashWheatCropID = config.getBlock("Ashenwheat", "Crop Block", 1295).getInt();
    	ashWheatBaleID = config.getBlock("Ashenwheat Bale", "Wheat Bale",1296).getInt();
		ashSeedsID = config.getItem("Ashenwheat Seeds", "Seeds", 12120).getInt();
        ashWheatItemID = config.getItem("Ashenwheat Sheaf", "Ashenwheat", 12121).getInt();
        ashBreadID = config.getItem("Ashenwheat Bread", "Ashenbread", 12122).getInt();
        ashCookieID = config.getItem("Ashenwheat Cookie", "Ashencookie", 12123).getInt();
        MakeWheatSmoky = config.get(Configuration.CATEGORY_GENERAL, "Smoky particles on crop, false or true", false).getBoolean(false);
        MakeBalesFlame = config.get(Configuration.CATEGORY_GENERAL, "Smoke and flame particles on bales, false or true", false).getBoolean(false);
        
    	config.save();
    	
    	ashWheatCrop = new AshWheatCrop(ashWheatCropID).setUnlocalizedName("ashWheatCrop") .setLightValue(0.5F);
    	ashWheatBale = new AshWheatBale(ashWheatBaleID).setUnlocalizedName("ashWheatBale") .setLightValue(0.8F);
    	ashSeeds = new AshSeeds(ashSeedsID, ashWheatCrop.blockID, Block.tilledField.blockID).setUnlocalizedName("ashSeeds");
    	ashWheatItem = new AshenWheatItem(ashWheatItemID).setUnlocalizedName("ashWheatItem");
    	ashBread = new AshBread(ashBreadID, 4, 0.5F, false).setUnlocalizedName("ashBread");
    	ashCookie = new AshCookie(ashCookieID, 1, 0.1F, false).setUnlocalizedName("ashCookie");
    	   
    	GameRegistry.registerItem(ashSeeds,"ashSeeds");
    	GameRegistry.registerItem(ashWheatItem,"ashWheatItem");
    	GameRegistry.registerItem(ashBread, "ashBread");
    	GameRegistry.registerItem(ashCookie, "ashCookie");
        GameRegistry.registerBlock(ashWheatCrop, "ashWheatCrop");
        GameRegistry.registerBlock(ashWheatBale, "ashWheatBale");
        
        AshenRecipes.doAshenRecipes();
    	
    }

    @EventHandler // used in 1.6.2
    public void load(FMLInitializationEvent event)
    {
        proxy.registerRenderers();
        
        GameRegistry.registerFuelHandler(new AshenwheatFuel());
        

        MinecraftForge.addGrassSeed(new ItemStack(ashSeeds), 4);
        
    }

    @EventHandler // used in 1.6.2
    public void postInit(FMLPostInitializationEvent event)
    {
        // Stub Method
        LanguageRegistry.addName(ashWheatItem, "Ashenwheat Sheaf");
        LanguageRegistry.addName(ashSeeds, "Ashenwheat Seeds");
        LanguageRegistry.addName(ashBread, "Ashenwheat Bread");
        LanguageRegistry.addName(ashCookie, "Ashenwheat Cookie");
        LanguageRegistry.addName(ashWheatBale, "Ashenwheat Bale");
        MinecraftForge.EVENT_BUS.register(new AshyBonemeal());
    }
}

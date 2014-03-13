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

@Mod(modid = "ashenwheat", name = "Ashenwheat", version = "0.1.0")
@NetworkMod(clientSideRequired = true)

public class AshenWheatCore
{
    
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
    
    public static Block ossidRootCrop;
    public static Block ossidRoot;
    public static Block ossidLantern;
    public static Item ossidSeeds;
    public static Item calcifiedAsh;
    
    public static int ossidRootCropID;
    public static int ossidRootID;
    public static int ossidLanternID;
    public static int ossidSeedsID;
    public static int calcifiedAshID;

    public static Block thunderGrassCrop;
    public static Item thunderSeeds;
    public static Item unstableSoot;
    
    public static int thunderGrassCropID;
    public static int thunderSeedsID;
    public static int unstableSootID;
    
    public static boolean MakeAshenwheatFlame;
    public static boolean MakeAshenBalesFlame;
    
    public static boolean MakeOssidCropGloom;
    public static boolean MakeOssidLanternGloom;

    public static boolean MakeThunderGrassSmoke;


    // The instance of your mod that Forge uses.
   @Instance(value = "ashenwheat")
   public static AshenWheatCore instance;

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
        ashWheatBaleID = config.getBlock("Ashenwheat", "Wheat Bale", 1296).getInt();
        ashSeedsID = config.getItem("Ashenwheat", "Seeds", 12120).getInt();
        ashWheatItemID = config.getItem("Ashenwheat", "Sheaf", 12121).getInt();
        ashBreadID = config.getItem("Ashenwheat", "Ashenbread", 12122).getInt();
        ashCookieID = config.getItem("Ashenwheat", "Ashencookie", 12123).getInt();

        ossidRootCropID = config.getBlock("Ossidroot", "Crop Block", 1292).getInt();
        ossidRootID = config.getBlock("Ossidroot", "Melon Block", 1293).getInt();
        ossidLanternID = config.getBlock("Ossidroot", "Lantern Block", 1294).getInt();
        ossidSeedsID = config.getItem("Ossidroot", "Seeds", 12119).getInt();
        calcifiedAshID = config.getItem("Ossidroot", "Calcified Ash", 12118).getInt();
        
        thunderGrassCropID = config.getBlock("Thundergrass", "Crop Block", 1297).getInt();
        thunderSeedsID = config.getItem("Thundergrass", "Seeds", 12117).getInt();
        unstableSootID = config.getItem("Thundergrass", "Unstable Soot", 12116).getInt();
        
        MakeAshenwheatFlame = config.get("zz Boolean Configuration", "Flame particles on Ashenwheat crop, false or true", false).getBoolean(false);
        MakeAshenBalesFlame = config.get("zz Boolean Configuration", "Flame and smoke particles on Ashenwheatbales, false or true", false).getBoolean(false);
        
        MakeOssidCropGloom = config.get("zz Boolean Configuration", "Gloom particles on Ossidroot crop, false or true", false).getBoolean(false);
        MakeOssidLanternGloom = config.get("zz Boolean Configuration", "Gloom particles on Ossid Lanterns, false or true", false).getBoolean(false);

        MakeThunderGrassSmoke = config.get("zz Boolean Configuration", "Smoke particles on Thundergrass crop, false or true", false).getBoolean(false);
        
        config.save();
        
        ashWheatCrop = new AshWheatCrop(ashWheatCropID).setUnlocalizedName("ashWheatCrop").setLightValue(0.5F);
        ashWheatBale = new AshWheatBale(ashWheatBaleID).setUnlocalizedName("ashWheatBale").setLightValue(0.8F);
        ashSeeds = new AshSeeds(ashSeedsID, ashWheatCrop.blockID, Block.tilledField.blockID).setUnlocalizedName("ashSeeds");
        ashWheatItem = new AshenWheatItem(ashWheatItemID).setUnlocalizedName("ashWheatItem");
        ashBread = new AshBread(ashBreadID, 4, 0.5F, false).setUnlocalizedName("ashBread");
        ashCookie = new AshCookie(ashCookieID, 1, 0.1F, false).setUnlocalizedName("ashCookie");
        
        ossidRootCrop = new OssidRootCrop(ossidRootCropID).setUnlocalizedName("ossidRootCrop");
        ossidRoot = new OssidRoot(ossidRootID, false).setUnlocalizedName("ossidRoot");
        ossidLantern = new OssidRoot(ossidLanternID, true).setUnlocalizedName("ossidLantern").setLightValue(1.0F);
        ossidSeeds = new OssidSeeds(ossidSeedsID, ossidRootCrop.blockID, Block.tilledField.blockID).setUnlocalizedName("ossidSeeds");
        calcifiedAsh = new OssidAsh(calcifiedAshID).setUnlocalizedName("calcifiedAsh");
        
        thunderGrassCrop = new ThunderGrassCrop(thunderGrassCropID).setUnlocalizedName("thunderGrassCrop") .setLightValue(0.45F);
        thunderSeeds = new ThunderSeeds(thunderSeedsID, thunderGrassCrop.blockID, Block.tilledField.blockID).setUnlocalizedName("thunderSeeds");
        unstableSoot = new UnstableSoot(unstableSootID).setUnlocalizedName("unstableSoot");
        
               
        GameRegistry.registerItem(ashSeeds, "ashSeeds");
        GameRegistry.registerItem(ashWheatItem, "ashWheatItem");
        GameRegistry.registerItem(ashBread, "ashBread");
        GameRegistry.registerItem(ashCookie, "ashCookie");
        GameRegistry.registerBlock(ashWheatCrop, "ashWheatCrop");
        GameRegistry.registerBlock(ashWheatBale, "ashWheatBale");
        
        GameRegistry.registerBlock(ossidRootCrop, "ossidRootCrop");
        GameRegistry.registerBlock(ossidRoot, "ossidRoot");
        GameRegistry.registerBlock(ossidLantern, "ossidLantern");
        GameRegistry.registerItem(ossidSeeds, "ossidSeeds");
        GameRegistry.registerItem(calcifiedAsh, "calcifiedAsh");
        
        GameRegistry.registerBlock(thunderGrassCrop, "thunderGrassCrop");
        GameRegistry.registerItem(thunderSeeds, "thunderSeeds");
        GameRegistry.registerItem(unstableSoot, "unstableSoot");

        AshenRecipes.doAshenRecipes();
        
    }

    @EventHandler // used in 1.6.2
    public void load(FMLInitializationEvent event)
    {
        proxy.registerRenderers();
        GameRegistry.registerFuelHandler(new AshenwheatFuel());
        MinecraftForge.addGrassSeed(new ItemStack(ashSeeds), 4);
        MinecraftForge.addGrassSeed(new ItemStack(ossidSeeds), 4);
        MinecraftForge.addGrassSeed(new ItemStack(thunderSeeds), 4);
    }

    @EventHandler // used in 1.6.2
    public void postInit(FMLPostInitializationEvent event)
    {
        // Stub Method
    	LanguageRegistry.addName(ashWheatCrop, "Ashenwheat");
        LanguageRegistry.addName(ashWheatItem, "Ashenwheat Sheaf");
        LanguageRegistry.addName(ashSeeds, "Ashenwheat Seeds");
        LanguageRegistry.addName(ashBread, "Ashenwheat Bread");
        LanguageRegistry.addName(ashCookie, "Ashenwheat Cookie");
        LanguageRegistry.addName(ashWheatBale, "Ashenwheat Bale");
        
        LanguageRegistry.addName(ossidRootCrop, "Ossidroot Vines");
        LanguageRegistry.addName(ossidRoot, "Oossidroot");
        LanguageRegistry.addName(ossidLantern, "Ossidroot Lantern");
        LanguageRegistry.addName(ossidSeeds, "Ossidwheat Seeds");
        LanguageRegistry.addName(calcifiedAsh, "Calcified Ash");

        LanguageRegistry.addName(thunderGrassCrop, "Thundergrass");
        LanguageRegistry.addName(thunderSeeds, "Thundergrass Seeds");
        LanguageRegistry.addName(unstableSoot, "Unstable Soot");
        
        MinecraftForge.EVENT_BUS.register(new AshyBonemeal());
    }
}

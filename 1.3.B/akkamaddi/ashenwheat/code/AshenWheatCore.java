package akkamaddi.ashenwheat.code;

import java.io.File;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.WeightedRandomChestContent;
import net.minecraftforge.common.ChestGenHooks;
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
    public static Item ashWheatSheaf;
    public static Item ashBread;
    public static Item ashCookie;

    public static int ashWheatCropID;
    public static int ashWheatBaleID;
    public static int ashSeedsID;
    public static int ashWheatSheafID;
    public static int ashBreadID;
    public static int ashCookieID;

    public static Block scintillaWheatCrop;
    public static Block scintillaWheatBale;
    public static Item scintillaSeeds;
    public static Item scintillaWheatSheaf;
    public static Item scintillaBread;
    public static Item scintillaCookie;
    public static Item scintillatingAsh;

    public static int scintillaWheatCropID;
    public static int scintillaWheatBaleID;
    public static int scintillaSeedsID;
    public static int scintillaWheatSheafID;
    public static int scintillaBreadID;
    public static int scintillaCookieID;
    public static int scintillatingAshID;
   
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

    public static boolean MakeScintillawheatScintillate;
    public static boolean MakeScintillaBalesScintillate;
    
    public static boolean MakeOssidCropGloom;
    public static boolean MakeOssidLanternGloom;

    public static boolean MakeThunderGrassSmoke;
    
    public static boolean dropAsh;
    public static boolean dropScintilla;
    public static boolean dropOssid;
    public static boolean dropThunder;
    
    public static boolean seedsInChests;
    
    public static CreativeTabs tabAshenwheat = new CreativeTabs("tabAshenwheat") {
        public ItemStack getIconItemStack() {return new ItemStack(AshenWheatCore.ashWheatSheaf);}
        };


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
        ashWheatSheafID = config.getItem("Ashenwheat", "Sheaf", 12121).getInt();
        ashBreadID = config.getItem("Ashenwheat", "Ashenbread", 12122).getInt();
        ashCookieID = config.getItem("Ashenwheat", "Ashencookie", 12123).getInt();

        scintillaWheatCropID = config.getBlock("Scintillawheat", "Crop Block", 1290).getInt();
        scintillaWheatBaleID = config.getBlock("Scintillawheat", "Wheat Bale", 1291).getInt();
        scintillaSeedsID = config.getItem("Scintillawheat", "Seeds", 12124).getInt();
        scintillaWheatSheafID = config.getItem("Scintillawheat", "Sheaf", 12125).getInt();
        scintillaBreadID = config.getItem("Scintillawheat", "Scintillabread", 12126).getInt();
        scintillaCookieID = config.getItem("Scintillawheat", "Scintillacookie", 12127).getInt();
        scintillatingAshID = config.getItem("Scintillawheat", "Scintillating Ash", 12128).getInt();
 
        ossidRootCropID = config.getBlock("Ossidroot", "Crop Block", 1292).getInt();
        ossidRootID = config.getBlock("Ossidroot", "Melon Block", 1293).getInt();
        ossidLanternID = config.getBlock("Ossidroot", "Lantern Block", 1294).getInt();
        ossidSeedsID = config.getItem("Ossidroot", "Seeds", 12119).getInt();
        calcifiedAshID = config.getItem("Ossidroot", "Calcified Ash", 12118).getInt();
        
        thunderGrassCropID = config.getBlock("Thundergrass", "Crop Block", 1297).getInt();
        thunderSeedsID = config.getItem("Thundergrass", "Seeds", 12117).getInt();
        unstableSootID = config.getItem("Thundergrass", "Unstable Soot", 12116).getInt();
        
        seedsInChests = config.get("xx Seeds in Chests", "Seeds appear in some chests, true or false", true).getBoolean(true);
        
        dropAsh = config.get("yy Wild Grass Drops", "Ashenwheat Seeds, false or true", false).getBoolean(false);
        dropScintilla = config.get("yy Wild Grass Drops", "Scintillawheat Seeds, false or true", false).getBoolean(false);
        dropOssid = config.get("yy Wild Grass Drops", "Ossidroot Seeds, false or true", false).getBoolean(false);
        dropThunder = config.get("yy Wild Grass Drops", "Thundergrass Seeds, false or true", false).getBoolean(false);
        
        MakeAshenwheatFlame = config.get("zz Boolean Configuration", "Flame particles on Ashenwheat crop, false or true", false).getBoolean(false);
        MakeAshenBalesFlame = config.get("zz Boolean Configuration", "Flame and smoke particles on Ashenwheat bales, false or true", false).getBoolean(false);

        MakeScintillawheatScintillate = config.get("zz Boolean Configuration", "Scintillating particles on Scintillawheat crop, false or true", false).getBoolean(false);
        MakeScintillaBalesScintillate = config.get("zz Boolean Configuration", "Scintillating particles on Scintillawheat bales, false or true", false).getBoolean(false);
        
        MakeOssidCropGloom = config.get("zz Boolean Configuration", "Gloom particles on Ossidroot crop, false or true", false).getBoolean(false);
        MakeOssidLanternGloom = config.get("zz Boolean Configuration", "Gloom particles on Ossid Lanterns, false or true", false).getBoolean(false);

        MakeThunderGrassSmoke = config.get("zz Boolean Configuration", "Smoke particles on Thundergrass crop, false or true", false).getBoolean(false);
        
        config.save();
        
        ashWheatCrop = new AshWheatCrop(ashWheatCropID).setUnlocalizedName("ashWheatCrop").setLightValue(0.5F);
        ashWheatBale = new AshWheatBale(ashWheatBaleID).setUnlocalizedName("ashWheatBale").setLightValue(0.8F).setCreativeTab(this.tabAshenwheat);
        ashSeeds = new AshSeeds(ashSeedsID, ashWheatCrop.blockID, Block.tilledField.blockID).setUnlocalizedName("ashSeeds").setCreativeTab(this.tabAshenwheat);
        ashWheatSheaf = new AshenWheatSheaf(ashWheatSheafID).setUnlocalizedName("ashWheatItem").setCreativeTab(this.tabAshenwheat);
        ashBread = new AshBread(ashBreadID, 4, 0.5F, false).setUnlocalizedName("ashBread").setCreativeTab(this.tabAshenwheat);
        ashCookie = new AshCookie(ashCookieID, 1, 0.1F, false).setUnlocalizedName("ashCookie").setCreativeTab(this.tabAshenwheat);

        scintillaWheatCrop = new ScintillaWheatCrop(scintillaWheatCropID).setUnlocalizedName("scintillaWheatCrop").setLightValue(0.55F);
        scintillaWheatBale = new ScintillaWheatBale(scintillaWheatBaleID).setUnlocalizedName("scintillaWheatBale").setLightValue(1.0F).setCreativeTab(this.tabAshenwheat);
        scintillaSeeds = new ScintillaSeeds(scintillaSeedsID, scintillaWheatCrop.blockID, Block.tilledField.blockID).setUnlocalizedName("scintillaSeeds").setCreativeTab(this.tabAshenwheat);
        scintillaWheatSheaf = new ScintillaWheatSheaf(scintillaWheatSheafID).setUnlocalizedName("scintillaWheatItem").setCreativeTab(this.tabAshenwheat);
        scintillaBread = new ScintillaBread(scintillaBreadID, 4, 0.7F, false).setUnlocalizedName("scintillaBread").setCreativeTab(this.tabAshenwheat);
        scintillaCookie = new ScintillaCookie(scintillaCookieID, 1, 0.1F, false).setUnlocalizedName("scintillaCookie").setCreativeTab(this.tabAshenwheat);
        scintillatingAsh = new ScintillatingAsh(scintillatingAshID).setUnlocalizedName("scintillatingAsh").setCreativeTab(this.tabAshenwheat);
        
        ossidRootCrop = new OssidRootCrop(ossidRootCropID).setUnlocalizedName("ossidRootCrop");
        ossidRoot = new OssidRoot(ossidRootID, false).setUnlocalizedName("ossidRoot").setCreativeTab(this.tabAshenwheat);
        ossidLantern = new OssidRoot(ossidLanternID, true).setUnlocalizedName("ossidLantern").setLightValue(1.0F).setCreativeTab(this.tabAshenwheat);
        ossidSeeds = new OssidSeeds(ossidSeedsID, ossidRootCrop.blockID, Block.tilledField.blockID).setUnlocalizedName("ossidSeeds").setCreativeTab(this.tabAshenwheat);
        calcifiedAsh = new OssidAsh(calcifiedAshID).setUnlocalizedName("calcifiedAsh").setCreativeTab(this.tabAshenwheat);
        
        thunderGrassCrop = new ThunderGrassCrop(thunderGrassCropID).setUnlocalizedName("thunderGrassCrop") .setLightValue(0.45F);
        thunderSeeds = new ThunderSeeds(thunderSeedsID, thunderGrassCrop.blockID, Block.tilledField.blockID).setUnlocalizedName("thunderSeeds").setCreativeTab(this.tabAshenwheat);
        unstableSoot = new UnstableSoot(unstableSootID).setUnlocalizedName("unstableSoot").setCreativeTab(this.tabAshenwheat);
        
        
        GameRegistry.registerItem(ashSeeds, "ashSeeds");
        GameRegistry.registerItem(ashWheatSheaf, "ashWheatSheaf");
        GameRegistry.registerItem(ashBread, "ashBread");
        GameRegistry.registerItem(ashCookie, "ashCookie");
        GameRegistry.registerBlock(ashWheatCrop, "ashWheatCrop");
        GameRegistry.registerBlock(ashWheatBale, "ashWheatBale");

        GameRegistry.registerItem(scintillaSeeds, "scintillaSeeds");
        GameRegistry.registerItem(scintillaWheatSheaf, "scintillaWheatSheaf");
        GameRegistry.registerItem(scintillaBread, "scintillaBread");
        GameRegistry.registerItem(scintillaCookie, "scintillaCookie");
        GameRegistry.registerItem(scintillatingAsh, "scintillatingAsh");
        GameRegistry.registerBlock(scintillaWheatCrop, "scintillaWheatCrop");
        GameRegistry.registerBlock(scintillaWheatBale, "scintillaWheatBale");
        
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
        
        if (dropAsh){
        MinecraftForge.addGrassSeed(new ItemStack(ashSeeds), 4);
        }

        if (dropScintilla){
        MinecraftForge.addGrassSeed(new ItemStack(scintillaSeeds), 1);
        }
        
        if (dropOssid){
        MinecraftForge.addGrassSeed(new ItemStack(ossidSeeds), 3);
        }
        
        if (dropThunder){ 
        MinecraftForge.addGrassSeed(new ItemStack(thunderSeeds), 2); 
        }
        
        if (seedsInChests){
        ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_JUNGLE_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(AshenWheatCore.ashSeeds),2,8,20));
        ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_JUNGLE_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(AshenWheatCore.scintillaSeeds),2,4,10));
        ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_JUNGLE_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(AshenWheatCore.ossidSeeds),2,6,15));
        ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_JUNGLE_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(AshenWheatCore.thunderSeeds),2,6,15));

        ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(AshenWheatCore.scintillaSeeds),4,8,16));
        ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(AshenWheatCore.scintillaWheatSheaf),2,4,6));
        ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(AshenWheatCore.ashCookie),6,16,12));
        ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(AshenWheatCore.scintillaCookie),6,16,12));
        
        ChestGenHooks.getInfo(ChestGenHooks.VILLAGE_BLACKSMITH).addItem(new WeightedRandomChestContent(new ItemStack(AshenWheatCore.ashSeeds),2,6,10));
        ChestGenHooks.getInfo(ChestGenHooks.VILLAGE_BLACKSMITH).addItem(new WeightedRandomChestContent(new ItemStack(AshenWheatCore.scintillaSeeds),1,3,2));
        ChestGenHooks.getInfo(ChestGenHooks.VILLAGE_BLACKSMITH).addItem(new WeightedRandomChestContent(new ItemStack(AshenWheatCore.ossidSeeds),2,4,5));
        ChestGenHooks.getInfo(ChestGenHooks.VILLAGE_BLACKSMITH).addItem(new WeightedRandomChestContent(new ItemStack(AshenWheatCore.thunderSeeds),2,4,5));
        
        ChestGenHooks.getInfo(ChestGenHooks.VILLAGE_BLACKSMITH).addItem(new WeightedRandomChestContent(new ItemStack(AshenWheatCore.ashWheatSheaf),2,4,5));
        ChestGenHooks.getInfo(ChestGenHooks.VILLAGE_BLACKSMITH).addItem(new WeightedRandomChestContent(new ItemStack(AshenWheatCore.scintillaWheatSheaf),1,3,2));
        ChestGenHooks.getInfo(ChestGenHooks.VILLAGE_BLACKSMITH).addItem(new WeightedRandomChestContent(new ItemStack(AshenWheatCore.ashCookie),6,16,4));
        ChestGenHooks.getInfo(ChestGenHooks.VILLAGE_BLACKSMITH).addItem(new WeightedRandomChestContent(new ItemStack(AshenWheatCore.scintillaCookie),6,16,2));
        
        ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(AshenWheatCore.ashSeeds),2,6,15));
        ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(AshenWheatCore.scintillaSeeds),1,3,5));
        ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(AshenWheatCore.ossidSeeds),2,4,10));
        ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(AshenWheatCore.thunderSeeds),2,4,10));

        ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(AshenWheatCore.ashSeeds),1,4,3));
        ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(AshenWheatCore.scintillaSeeds),1,2,1));
        ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(AshenWheatCore.ossidSeeds),1,3,2));
        ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(AshenWheatCore.thunderSeeds),1,3,2));
        }
        
    }

    @EventHandler // used in 1.6.2
    public void postInit(FMLPostInitializationEvent event)
    {
        // Stub Method
    	LanguageRegistry.addName(ashWheatCrop, "Ashenwheat");
        LanguageRegistry.addName(ashWheatSheaf, "Ashenwheat Sheaf");
        LanguageRegistry.addName(ashSeeds, "Ashenwheat Seeds");
        LanguageRegistry.addName(ashBread, "Ashenwheat Bread");
        LanguageRegistry.addName(ashCookie, "Ashenwheat Cookie");
        LanguageRegistry.addName(ashWheatBale, "Ashenwheat Bale");

    	LanguageRegistry.addName(scintillaWheatCrop, "Scintillawheat");
        LanguageRegistry.addName(scintillaWheatSheaf, "Scintillawheat Sheaf");
        LanguageRegistry.addName(scintillaSeeds, "Scintillawheat Seeds");
        LanguageRegistry.addName(scintillaBread, "Scintillawheat Bread");
        LanguageRegistry.addName(scintillaCookie, "Scintillawheat Cookie");
        LanguageRegistry.addName(scintillaWheatBale, "Scintillawheat Bale");
        LanguageRegistry.addName(scintillatingAsh, "Scintillating Ash");
        
        LanguageRegistry.addName(ossidRootCrop, "Ossidroot Vines");
        LanguageRegistry.addName(ossidRoot, "Oossidroot");
        LanguageRegistry.addName(ossidLantern, "Ossidroot Lantern");
        LanguageRegistry.addName(ossidSeeds, "Ossidwheat Seeds");
        LanguageRegistry.addName(calcifiedAsh, "Calcified Ash");

        LanguageRegistry.addName(thunderGrassCrop, "Thundergrass");
        LanguageRegistry.addName(thunderSeeds, "Thundergrass Seeds");
        LanguageRegistry.addName(unstableSoot, "Unstable Soot");
        
        LanguageRegistry.instance().addStringLocalization("itemGroup.tabAshenwheat", "en_US", "akkamaddi's Ashenwheat");
        
        MinecraftForge.EVENT_BUS.register(new AshyBonemeal());
    }
}

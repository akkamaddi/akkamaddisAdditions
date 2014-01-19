package SimpleOres.plugins.akkamaddi.hadite.code;

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
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.EnumHelper;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.Configuration;
import net.minecraftforge.event.ForgeSubscribe;
import SimpleOres.core.api.SimpleIngot;
import SimpleOres.core.api.SimpleSword;
import SimpleOres.core.api.SimpleShovel;
import SimpleOres.core.api.SimpleAxe;
import SimpleOres.core.api.SimplePickaxe;
import SimpleOres.core.api.SimpleOre;
import SimpleOres.core.api.HandlerLoot;
import SimpleOres.core.api.SimpleTab;

@Mod(modid = "haditecoal", name = "Hadite Coal, nether utility ore", version = "1.1.6", dependencies = "required-after:simpleores; required-after:simpleoresfusion")
@NetworkMod(clientSideRequired = true)

public class HaditeCoalCore
{
    // The instance of your mod that Forge uses.
    @Instance(value = "haditecoal")
    public static HaditeCoalCore instance;

    // Says where the client and server 'proxy' code is loaded.
    @SidedProxy(clientSide = "SimpleOres.plugins.akkamaddi.hadite.code.ClientProxy", serverSide = "SimpleOres.plugins.akkamaddi.hadite.code.CommonProxy")
    public static CommonProxy proxy;

    // Set Item ID's
    //Hadite
    public static int haditeCoalIngotID;
    public static int blockHaditeCoalOreID;
    public static int blockHaditeCoalBlockID;

    //Hadite Steel
    public static int haditeSteelIngotID;
    public static int largeHaditeSteelChunkItemID;
    public static int blockHaditeSteelID;

    public static int haditeSteelSwordID;
    public static int haditeSteelShovelID;
    public static int haditeSteelAxeID;
    public static int haditeSteelPickaxeID;

    //Gestankenzinn
    public static int gestankenzinnIngotID;
    public static int largeGestankenzinnChunkItemID;
    public static int blockGestankenzinnID;

    public static int gestankenzinnSwordID;
    public static int gestankenzinnShovelID;
    public static int gestankenzinnAxeID;
    public static int gestankenzinnPickaxeID;

    // set names
    
    // Hadite
    public static Item haditeCoalIngot;

    //Hadite Steel
    public static Item haditeSteelIngot;
    public static Item largeHaditeSteelChunkItem;

    public static Item haditeSteelSword;
    public static Item haditeSteelShovel;
    public static Item haditeSteelAxe;
    public static Item haditeSteelPickaxe;

    //Gestankenzinn
    public static Item gestankenzinnIngot;
    public static Item largeGestankenzinnChunkItem;

    public static Item gestankenzinnSword;
    public static Item gestankenzinnShovel;
    public static Item gestankenzinnAxe;
    public static Item gestankenzinnPickaxe;

    //blocks
    public static Block blockHaditeCoalOre;
    public static Block blockHaditeCoalBlock;
    public static Block blockHaditeSteel;
    public static Block blockGestankenzinn;

    // spawning
    public static int haditeSpawnRate;
    public static int haditeVeinSize;
    public static int haditeSpawnHeight;

    // Booleans
    public static boolean MakeOreFlame;
    public static boolean MakeBlockFlame;

    public static boolean enableRecycling;

    // tab
    public static SimpleTab tabAkkamaddiHadite = new SimpleTab("tabAkkamaddiHadite");

    // set tool properties
    // EnumToolMaterial. In form ("NAME", mining level, max uses, speed, damage to entity, enchantability)
    public static EnumToolMaterial toolHaditeSteel = EnumHelper.addToolMaterial("HADITESTEEL", 3, 510, 6.5F, 2, 13);
    public static EnumToolMaterial toolGestankenzinn = EnumHelper.addToolMaterial("GESTANKENZINN", 2, 390, 4.0F, 1, 13);

    // Tab
    public void setTabIcons()
    {
        /**
         * Creating the custom tabs using the API class "SimpleTab" and setting their icon.
         */
        tabAkkamaddiHadite.setIcon(new ItemStack(HaditeCoalCore.blockHaditeCoalOre));
    }

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        // Stub Method
        Configuration config = new Configuration(event.getSuggestedConfigurationFile());
        config.load();
        haditeCoalIngotID = config.getItem("1", "Hadite Coal lump ID", 12220).getInt();
        blockHaditeCoalOreID = config.getBlock("2", "Hadite Coal ore ID", 1313).getInt();
        blockHaditeCoalBlockID = config.getBlock("3", "Hadite Coal block ID", 1314).getInt();
        MakeOreFlame = config.get(Configuration.CATEGORY_GENERAL, "Hadite Ore spits fire", true).getBoolean(true);
        MakeBlockFlame = config.get(Configuration.CATEGORY_GENERAL, "Hadite Block emits flames", true).getBoolean(true);
        //Adjustable Ore Spawn Rates
        haditeSpawnRate = config.get("4 Spawning parameters", "Hadite Coal Spawn Rate", 5).getInt();
        //Adjustable Ore Vein Sizes
        haditeVeinSize = config.get("4 Spawning parameters", "Hadite Coal Vein Size", 17).getInt();
        //Adjustable Ore Spawn Heights
        haditeSpawnHeight = config.get("4 Spawning parameters", "Hadite Coal Spawn Height", 256).getInt();
        // Hadite Steel
        haditeSteelIngotID = config.getItem("4. Hadite Steel Item", "Hadite Steel Ingot", 12216).getInt();
        largeHaditeSteelChunkItemID = config.getItem("4. Hadite Steel Item", "Large Hadite Steel Chunk", 12217).getInt();
        haditeSteelSwordID = config.getItem("4. Hadite Steel Item", "Hadite Steel Sword", 12221).getInt();
        haditeSteelShovelID = config.getItem("4. Hadite Steel Item", "Hadite Steel Shovel", 12222).getInt();
        haditeSteelAxeID = config.getItem("4. Hadite Steel Item", "Hadite Steel Axe", 12223).getInt();
        haditeSteelPickaxeID = config.getItem("4. Hadite Steel Item", "Hadite Steel Pickaxe", 12224).getInt();
        blockHaditeSteelID = config.getBlock("5. Hadite Steel Block", "Hadite Steel Block", 1315).getInt();
        //Gestankenzinn
        gestankenzinnIngotID = config.getItem("6. Gestankenzinn Item", "Gestankenzinn Ingot", 12218).getInt();
        largeGestankenzinnChunkItemID = config.getItem("6. Gestankenzinn Item", "Large Gestankenzinn Chunk", 12219).getInt();
        gestankenzinnSwordID = config.getItem("6. Gestankenzinn Item", "Gestankenzinn Sword", 12225).getInt();
        gestankenzinnShovelID = config.getItem("6. Gestankenzinn Item", "Gestankenzinn Shovel", 12226).getInt();
        gestankenzinnAxeID = config.getItem("6. Gestankenzinn Item", "Gestankenzinn Axe", 12227).getInt();
        gestankenzinnPickaxeID = config.getItem("6. Gestankenzinn Item", "Gestankenzinn Pickaxe", 12228).getInt();
        blockGestankenzinnID = config.getBlock("7. Gestankenzinn Block", "Gestankenzinn Block", 1316).getInt();
        //Recycling
        enableRecycling= config.get(Configuration.CATEGORY_GENERAL, "Enable Hadite Steel & Gestankenzinn item recycling recipes: false or true?", false).getBoolean(false);
        //
        // end config
        config.save();
        //
        // Define Items
        haditeCoalIngot = new SimpleIngot(haditeCoalIngotID, "haditecoal", HaditeCoalCore.tabAkkamaddiHadite).setUnlocalizedName("haditeCoalIngot");
        //Hadite Steel
        haditeSteelIngot = new SimpleIngot(haditeSteelIngotID, "haditecoal", HaditeCoalCore.tabAkkamaddiHadite).setUnlocalizedName("haditeSteelIngot");
        largeHaditeSteelChunkItem = new SimpleIngot(largeHaditeSteelChunkItemID, "haditecoal", HaditeCoalCore.tabAkkamaddiHadite).setUnlocalizedName("largeHaditeSteelChunkItem");
        haditeSteelSword = new SimpleSword(haditeSteelSwordID, toolHaditeSteel, "haditecoal", HaditeCoalCore.tabAkkamaddiHadite).setUnlocalizedName("haditeSteelSword");
        haditeSteelShovel = new SimpleShovel(haditeSteelShovelID, toolHaditeSteel, "haditecoal", HaditeCoalCore.tabAkkamaddiHadite).setUnlocalizedName("haditeSteelShovel");
        haditeSteelAxe = new SimpleAxe(haditeSteelAxeID, toolHaditeSteel, "haditecoal", HaditeCoalCore.tabAkkamaddiHadite).setUnlocalizedName("haditeSteelAxe");
        haditeSteelPickaxe = new SimplePickaxe(haditeSteelPickaxeID, toolHaditeSteel, "haditecoal", HaditeCoalCore.tabAkkamaddiHadite).setUnlocalizedName("haditeSteelPickaxe");
        //Gestankenzinn
        gestankenzinnIngot = new SimpleIngot(gestankenzinnIngotID, "haditecoal", HaditeCoalCore.tabAkkamaddiHadite).setUnlocalizedName("gestankenzinnIngot");
        largeGestankenzinnChunkItem = new SimpleIngot(largeGestankenzinnChunkItemID, "haditecoal", HaditeCoalCore.tabAkkamaddiHadite).setUnlocalizedName("largeGestankenzinnChunkItem");
        gestankenzinnSword = new SimpleSword(gestankenzinnSwordID, toolGestankenzinn, "haditecoal", HaditeCoalCore.tabAkkamaddiHadite).setUnlocalizedName("gestankenzinnSword");
        gestankenzinnShovel = new SimpleShovel(gestankenzinnShovelID, toolGestankenzinn, "haditecoal", HaditeCoalCore.tabAkkamaddiHadite).setUnlocalizedName("gestankenzinnShovel");
        gestankenzinnAxe = new SimpleAxe(gestankenzinnAxeID, toolGestankenzinn, "haditecoal", HaditeCoalCore.tabAkkamaddiHadite).setUnlocalizedName("gestankenzinnAxe");
        gestankenzinnPickaxe = new SimplePickaxe(gestankenzinnPickaxeID, toolGestankenzinn, "haditecoal", HaditeCoalCore.tabAkkamaddiHadite).setUnlocalizedName("gestankenzinnPickaxe");
        // define blocks
        blockHaditeCoalOre = new HaditeOreBlock(blockHaditeCoalOreID, Material.rock, "haditecoal")
        .setHardness(4.0F).setResistance(6.0F).setStepSound(Block.soundStoneFootstep)
        .setUnlocalizedName("blockHaditeCoalOre").setCreativeTab(HaditeCoalCore.tabAkkamaddiHadite)
        .setLightValue(0.6F);
        blockHaditeCoalBlock = new HaditeStorageBlock(blockHaditeCoalBlockID, Material.rock, "haditecoal")
        .setHardness(4.0F).setResistance(6.0F).setStepSound(Block.soundStoneFootstep)
        .setUnlocalizedName("blockHaditeCoalBlock").setCreativeTab(HaditeCoalCore.tabAkkamaddiHadite)
        .setLightValue(0.7F);
        blockHaditeSteel = new SimpleOre(blockHaditeSteelID, Material.iron, "haditecoal", HaditeCoalCore.tabAkkamaddiHadite)
        .setHardness(14.0F).setResistance(22.0F).setStepSound(Block.soundMetalFootstep)
        .setUnlocalizedName("blockHaditeSteel").setCreativeTab(HaditeCoalCore.tabAkkamaddiHadite);
        blockGestankenzinn = new SimpleOre(blockGestankenzinnID, Material.iron, "haditecoal", HaditeCoalCore.tabAkkamaddiHadite)
        .setHardness(12.0F).setResistance(20.0F).setStepSound(Block.soundMetalFootstep)
        .setUnlocalizedName("blockGestankenzinn").setCreativeTab(HaditeCoalCore.tabAkkamaddiHadite);
        
        //Registrations
        GameRegistry.registerItem(haditeCoalIngot,"haditeCoalIngot");
        GameRegistry.registerItem(haditeSteelIngot,"haditeSteelIngot");
        GameRegistry.registerItem(largeHaditeSteelChunkItem,"largeHaditeSteelChunkItem");
        GameRegistry.registerItem(haditeSteelSword,"haditeSteelSword");
        GameRegistry.registerItem(haditeSteelShovel,"haditeSteelShovel");
        GameRegistry.registerItem(haditeSteelAxe,"haditeSteelAxe");
        GameRegistry.registerItem(haditeSteelPickaxe,"haditeSteelPickaxe");
        GameRegistry.registerItem(gestankenzinnIngot,"gestankenzinnIngot");
        GameRegistry.registerItem(largeGestankenzinnChunkItem,"largeGestankenzinnChunkItem");
        GameRegistry.registerItem(gestankenzinnSword,"gestankenzinnSword");
        GameRegistry.registerItem(gestankenzinnShovel,"gestankenzinnShovel");
        GameRegistry.registerItem(gestankenzinnAxe,"gestankenzinnAxe");
        GameRegistry.registerItem(gestankenzinnPickaxe,"gestankenzinnPickaxe");
        
        GameRegistry.registerBlock(blockHaditeCoalOre, "blockHaditeCoalOre");
        GameRegistry.registerBlock(blockHaditeCoalBlock, "blockHaditeCoalBlock");
        GameRegistry.registerBlock(blockHaditeSteel, "blockHaditeSteel");
        GameRegistry.registerBlock(blockGestankenzinn, "blockGestankenzinn");
        
        
        // loot
        HandlerLoot.lootHandler().addLoot("villageBlacksmith", haditeCoalIngot, 3, 5, 7);
        HandlerLoot.lootHandler().addLoot("villageBlacksmith", gestankenzinnIngot, 2, 3, 2);
        HandlerLoot.lootHandler().addLoot("villageBlacksmith", haditeSteelIngot, 2, 3, 2);
        HandlerLoot.lootHandler().addLoot("villageBlacksmith", gestankenzinnSword, 1, 1, 2);
        HandlerLoot.lootHandler().addLoot("villageBlacksmith", haditeSteelSword, 1, 1, 2);
        HandlerLoot.lootHandler().addLoot("villageBlacksmith", gestankenzinnPickaxe, 1, 1, 2);
        HandlerLoot.lootHandler().addLoot("villageBlacksmith", haditeSteelPickaxe, 1, 1, 2);
        HandlerLoot.lootHandler().addLoot("villageBlacksmith", gestankenzinnAxe, 1, 1, 1);
        HandlerLoot.lootHandler().addLoot("villageBlacksmith", haditeSteelAxe, 1, 1, 1);
        HandlerLoot.lootHandler().addLoot("villageBlacksmith", gestankenzinnShovel, 1, 1, 1);
        HandlerLoot.lootHandler().addLoot("villageBlacksmith", haditeSteelShovel, 1, 1, 1);
        HandlerLoot.lootHandler().addLoot("strongholdCrossing", haditeCoalIngot, 1, 2, 4);
        HandlerLoot.lootHandler().addLoot("strongholdCorridor", haditeCoalIngot, 1, 2, 2);
        HandlerLoot.lootHandler().addLoot("pyramidDesertyChest", haditeCoalIngot, 1, 4, 2);
        HandlerLoot.lootHandler().addLoot("pyramidDesertyChest", gestankenzinnSword, 1, 2, 1);
        HandlerLoot.lootHandler().addLoot("pyramidDesertyChest", haditeSteelSword, 1, 6, 1);
        HandlerLoot.lootHandler().addLoot("dungeonChest", gestankenzinnIngot, 1, 3, 5);
        HandlerLoot.lootHandler().addLoot("dungeonChest", haditeSteelIngot, 1, 3, 5);
        HandlerLoot.lootHandler().addLoot("dungeonChest", gestankenzinnSword, 1, 2, 2);
        HandlerLoot.lootHandler().addLoot("dungeonChest", haditeSteelSword, 1, 2, 2);
        HandlerLoot.lootHandler().addLoot("dungeonChest", gestankenzinnPickaxe, 1, 2, 2);
        HandlerLoot.lootHandler().addLoot("dungeonChest", haditeSteelPickaxe, 1, 2, 2);
        HandlerLoot.lootHandler().addLoot("mineshaftCorridor", gestankenzinnPickaxe, 1, 2, 1);
        HandlerLoot.lootHandler().addLoot("mineshaftCorridor", haditeSteelPickaxe, 1, 2, 1);
        HandlerLoot.lootHandler().addLoot("mineshaftCorridor", gestankenzinnShovel, 1, 2, 1);
        HandlerLoot.lootHandler().addLoot("mineshaftCorridor", haditeSteelShovel, 1, 2, 1);
        
        // run tab icon call
        setTabIcons();
        
        // Recipes
        HaditeRecipes.doHaditeRecipes();
        
    }

    @EventHandler
    public void load(FMLInitializationEvent event)
    {
        proxy.registerRenderers();
        //mobs hold stuff
        MinecraftForge.EVENT_BUS.register(new HandlerJoinWorld());
        // world generation
        GameRegistry.registerWorldGenerator(new HaditeGenerator());
        // Set fuel burntime
        GameRegistry.registerFuelHandler(new HaditeFuel());
        // name stuff
        LanguageRegistry.addName(haditeCoalIngot, "Hadite Coal");
        LanguageRegistry.addName(haditeSteelIngot, "Hadite Steel Ingot");
        LanguageRegistry.addName(largeHaditeSteelChunkItem, "Large Hadite Steel Chunk");
        LanguageRegistry.addName(haditeSteelSword, "Hadite Steel Sword");
        LanguageRegistry.addName(haditeSteelShovel, "Hadite Steel Shovel");
        LanguageRegistry.addName(haditeSteelAxe, "Hadite Steel Axe");
        LanguageRegistry.addName(haditeSteelPickaxe, "Hadite Steel Pickaxe");
        LanguageRegistry.addName(gestankenzinnIngot, "Gestankenzinn Ingot");
        LanguageRegistry.addName(largeGestankenzinnChunkItem, "Large Gestankenzinn Chunk");
        LanguageRegistry.addName(gestankenzinnSword, "Gestankenzinn Sword");
        LanguageRegistry.addName(gestankenzinnShovel, "Gestankenzinn Shovel");
        LanguageRegistry.addName(gestankenzinnAxe, "Gestankenzinn Axe");
        LanguageRegistry.addName(gestankenzinnPickaxe, "Gestankenzinn Pickaxe");
        
        LanguageRegistry.addName(blockHaditeCoalOre, "Hadite Coal Ore");
        MinecraftForge.setBlockHarvestLevel(blockHaditeCoalOre, "pickaxe", 1);
        
        LanguageRegistry.addName(blockHaditeCoalBlock, "Hadite Coal Block");
        MinecraftForge.setBlockHarvestLevel(blockHaditeCoalBlock, "pickaxe", 0);
        
        LanguageRegistry.addName(blockHaditeSteel, "Hadite Steel Block");
        MinecraftForge.setBlockHarvestLevel(blockHaditeSteel, "pickaxe", 0);
        
        LanguageRegistry.addName(blockGestankenzinn, "Gestankenzinn Block");
        MinecraftForge.setBlockHarvestLevel(blockGestankenzinn, "pickaxe", 0);
        
        MinecraftForge.setToolClass(haditeSteelPickaxe, "pickaxe", 3);
        MinecraftForge.setToolClass(haditeSteelShovel, "shovel", 3);
        MinecraftForge.setToolClass(haditeSteelAxe, "axe", 3);
        MinecraftForge.setToolClass(gestankenzinnPickaxe, "pickaxe", 2);
        MinecraftForge.setToolClass(gestankenzinnShovel, "shovel", 2);
        MinecraftForge.setToolClass(gestankenzinnAxe, "axe", 2);
        toolHaditeSteel.customCraftingMaterial = HaditeCoalCore.haditeSteelIngot;
        toolGestankenzinn.customCraftingMaterial = HaditeCoalCore.gestankenzinnIngot;
        LanguageRegistry.instance().addStringLocalization("itemGroup.tabAkkamaddiHadite", "en_US", "akkamaddi's Hadite Coal");
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        // Stub Method
    }
}

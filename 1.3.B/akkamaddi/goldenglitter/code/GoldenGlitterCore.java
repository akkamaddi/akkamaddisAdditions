package akkamaddi.goldenglitter.code;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler; // used in 1.6.2
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.common.FMLLog;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.world.World;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.common.EnumHelper;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.Configuration;
import net.minecraftforge.event.ForgeSubscribe;
import alexndr.SimpleOres.api.content.SimpleIngot;
import alexndr.SimpleOres.api.content.SimpleSword;
import alexndr.SimpleOres.api.content.SimpleShovel;
import alexndr.SimpleOres.api.content.SimpleAxe;
import alexndr.SimpleOres.api.content.SimplePickaxe;
import alexndr.SimpleOres.api.content.SimpleHoe;
import alexndr.SimpleOres.api.content.SimpleArmor;
import alexndr.SimpleOres.api.content.SimpleTab;
import alexndr.SimpleOres.api.helpers.LootHelper;;

@Mod(modid = "goldenglitter", name = "Simple Golden Glitter, gold alloys", version = "1.3.0", dependencies = "required-after:simpleores ; required-after:simpleoresfusion")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)

public class GoldenGlitterCore
{
    // The instance of your mod that Forge uses.
    @Instance("goldenglitter")
    public static GoldenGlitterCore instance;

    // Says where the client and server 'proxy' code is loaded.
    @SidedProxy(clientSide = "akkamaddi.goldenglitter.code.ClientProxy", serverSide = "akkamaddi.goldenglitter.code.CommonProxy")
    public static CommonProxy proxy;

    // set item ID, to-from config file

    //Rose Gold
    public static int roseGoldIngotID;
    public static int largeRoseGoldChunkItemID;
    public static int blockRoseGoldID;

    public static int roseGoldSwordID;
    public static int roseGoldShovelID;
    public static int roseGoldAxeID;
    public static int roseGoldPickaxeID;
    public static int roseGoldHoeID;

    public static int roseGoldHelmID;
    public static int roseGoldChestID;
    public static int roseGoldLegsID;
    public static int roseGoldBootsID;

    //Erubescent Gold
    public static int erubescentGoldIngotID;
    public static int largeErubescentGoldChunkItemID;
    public static int blockErubescentGoldID;

    public static int erubescentGoldSwordID;
    public static int erubescentGoldShovelID;
    public static int erubescentGoldAxeID;
    public static int erubescentGoldPickaxeID;

    //Scarlatite Gold
    public static int scarlatiteGoldIngotID;
    public static int largeScarlatiteGoldChunkItemID;
    public static int blockScarlatiteGoldID;

    public static int scarlatiteGoldSwordID;
    public static int scarlatiteGoldShovelID;
    public static int scarlatiteGoldAxeID;
    public static int scarlatiteGoldPickaxeID;

    //Hephaestan Gold
    public static int hephaestanGoldIngotID;
    public static int largeHephaestanGoldChunkItemID;
    public static int blockHephaestanGoldID;

    public static int hephaestanGoldSwordID;
    public static int hephaestanGoldShovelID;
    public static int hephaestanGoldAxeID;
    public static int hephaestanGoldPickaxeID;

    // rail
    public static int redGoldRailID;

    // set actual item names

    //Rose Gold
    public static Item roseGoldIngot;
    public static Item largeRoseGoldChunkItem;

    public static Item roseGoldSword;
    public static Item roseGoldShovel;
    public static Item roseGoldAxe;
    public static Item roseGoldPickaxe;
    public static Item roseGoldHoe;

    public static Item roseGoldHelm;
    public static Item roseGoldChest;
    public static Item roseGoldLegs;
    public static Item roseGoldBoots;

    //Erubescent Gold
    public static Item erubescentGoldIngot;
    public static Item largeErubescentGoldChunkItem;

    public static Item erubescentGoldSword;
    public static Item erubescentGoldShovel;
    public static Item erubescentGoldAxe;
    public static Item erubescentGoldPickaxe;

    //Scarlatite Gold

    public static Item scarlatiteGoldIngot;
    public static Item largeScarlatiteGoldChunkItem;

    public static Item scarlatiteGoldSword;
    public static Item scarlatiteGoldShovel;
    public static Item scarlatiteGoldAxe;
    public static Item scarlatiteGoldPickaxe;

    //Hephaestan Gold

    public static Item hephaestanGoldIngot;
    public static Item largeHephaestanGoldChunkItem;

    public static Item hephaestanGoldSword;
    public static Item hephaestanGoldShovel;
    public static Item hephaestanGoldAxe;
    public static Item hephaestanGoldPickaxe;

    // set block names
    public static Block blockRoseGold;
    public static Block blockErubescentGold;
    public static Block blockScarlatiteGold;
    public static Block blockHephaestanGold;
    public static Block redGoldRail;

    public static boolean MakeRoseHideous;
    public static boolean MakeErubescentSparkle;
    public static boolean MakeScarlatiteSparkle;
    public static boolean MakeHephaestanSparkle;
    public static boolean MakeRedGoldRailSparkle;

    public static boolean werewolfEffectiveness;
    public static boolean enableRecycling;

    // tab
    public static SimpleTab tabAkkamaddiGolden = new SimpleTab("tabAkkamaddiGolden");

    /**
     * EnumArmorMaterial. In form ("NAME", max damage (like uses, multiply by pieces for their max damage), new int[] {helmet defense, chestplate defense, leggings defense, boots defense}, enchantability)
     */
    public static EnumArmorMaterial armorRoseGold = EnumHelper.addArmorMaterial("ROSEGOLD", 10, new int[] {2, 4, 2, 1}, 14);

    /**
     * Creating the Armor Renderers. This is simply so you can see the armor texture when you wear it.
     */
    public static int rendererRoseGold;

    // set tool properties
    // EnumToolMaterial. In form ("NAME", mining level, max uses, speed, damage to entity, enchantability)
    public static EnumToolMaterial toolRoseGold = EnumHelper.addToolMaterial("ROSEGOLD", 1, 240, 9.0F, 1, 14);
    public static EnumToolMaterial toolErubescentGold = EnumHelper.addToolMaterial("ERUBESCENTGOLD", 3, 18, 16.0F, 3, 22);
    public static EnumToolMaterial toolScarlatiteGold = EnumHelper.addToolMaterial("SCARLATITEGOLD", 5, 38, 18.0F, 4, 28);
    public static EnumToolMaterial toolHephaestanGold = EnumHelper.addToolMaterial("HEPHAESTANGOLD", 7, 222, 28.0F, 5, 30);

    // Tab
    public void setTabIcons()
    {
        /**
         * Creating the custom tabs using the API class "SimpleTab" and setting their icon.
         */
        tabAkkamaddiGolden.setIcon(new ItemStack(GoldenGlitterCore.blockRoseGold));
    }

    @EventHandler // used in 1.6.2
    public void preInit(FMLPreInitializationEvent event)
    {
        // Stub Method
        Configuration config = new Configuration(event.getSuggestedConfigurationFile());
        config.load();
        // Rose Gold
        roseGoldIngotID = config.getItem("01. Rose Gold Item", "Rose Gold Ingot", 12230).getInt();
        largeRoseGoldChunkItemID = config.getItem("01. Rose Gold Item", "Large Rose Gold Chunk", 12231).getInt();
        roseGoldSwordID = config.getItem("02. Rose Gold Tool", "Rose Gold Sword", 12232).getInt();
        roseGoldShovelID = config.getItem("02. Rose Gold Tool", "Rose Gold Shovel", 12233).getInt();
        roseGoldAxeID = config.getItem("02. Rose Gold Tool", "Rose Gold Axe", 12234).getInt();
        roseGoldPickaxeID = config.getItem("02. Rose Gold Tool", "Rose Gold Pickaxe", 12235).getInt();
        roseGoldHoeID = config.getItem("02. Rose Gold Tool", "Rose Gold Hoe", 12236).getInt();
        roseGoldHelmID = config.getItem("03. Rose Gold Armor", "Rose Gold Helm", 12237).getInt();
        roseGoldChestID = config.getItem("03. Rose Gold Armor", "Rose Gold Chest", 12238).getInt();
        roseGoldLegsID = config.getItem("03. Rose Gold Armor", "Rose Gold Legs", 12239).getInt();
        roseGoldBootsID = config.getItem("03. Rose Gold Armor", "Rose Gold Boots", 12240).getInt();
        blockRoseGoldID = config.getBlock("04. Rose Gold Block", "Rose Gold Block", 1317).getInt();
        MakeRoseHideous = config.get(Configuration.CATEGORY_GENERAL, "Make Rose Gold Blocks Hideous, false or true", false).getBoolean(false);
        // Erubescent Gold
        erubescentGoldIngotID = config.getItem("05. Erubescent Gold Item", "Erubescent Gold Ingot", 12241).getInt();
        largeErubescentGoldChunkItemID = config.getItem("05. Erubescent Gold Item", "Large Erubescent Gold Chunk", 12242).getInt();
        erubescentGoldSwordID = config.getItem("06. Erubescent Gold Tool", "Erubescent Gold Sword", 12243).getInt();
        erubescentGoldShovelID = config.getItem("06. Erubescent Gold Tool", "Erubescent Gold Shovel", 12244).getInt();
        erubescentGoldAxeID = config.getItem("06. Erubescent Gold Tool", "Erubescent Gold Axe", 12245).getInt();
        erubescentGoldPickaxeID = config.getItem("06. Erubescent Gold Tool", "Erubescent Gold Pickaxe", 12246).getInt();
        blockErubescentGoldID = config.getBlock("07. Erubescent Gold Block", "Erubescent Gold Block", 1318).getInt();
        MakeErubescentSparkle = config.get(Configuration.CATEGORY_GENERAL, "Make Erubescent Gold Blocks sparkle, true or false", true).getBoolean(true);
        //Scarlatite Gold
        scarlatiteGoldIngotID = config.getItem("08. Scarlatite Gold Item", "Scarlatite Gold Ingot", 12247).getInt();
        largeScarlatiteGoldChunkItemID = config.getItem("08. Scarlatite Gold Item", "Large Scarlatite Gold Chunk", 12248).getInt();
        scarlatiteGoldSwordID = config.getItem("09. Scarlatite Gold Tool", "Scarlatite Gold Sword", 12249).getInt();
        scarlatiteGoldShovelID = config.getItem("09. Scarlatite Gold Tool", "Scarlatite Gold Shovel", 12250).getInt();
        scarlatiteGoldAxeID = config.getItem("09. Scarlatite Gold Tool", "Scarlatite Gold Axe", 12251).getInt();
        scarlatiteGoldPickaxeID = config.getItem("09. Scarlatite Gold Tool", "Scarlatite Gold Pickaxe", 12252).getInt();
        blockScarlatiteGoldID = config.getBlock("10. Scarlatite Gold Block", "Scarlatite Gold Block", 1319).getInt();
        MakeScarlatiteSparkle = config.get(Configuration.CATEGORY_GENERAL, "Make Scarlatite Gold Blocks sparkle, true or false", true).getBoolean(true);
        //Hephaestan Gold
        hephaestanGoldIngotID = config.getItem("11. Hephaestan Gold Item", "Hephaestan Gold Ingot", 12253).getInt();
        largeHephaestanGoldChunkItemID = config.getItem("11. Hephaestan Gold Item", "Large Hephaestan Gold Chunk", 12254).getInt();
        hephaestanGoldSwordID = config.getItem("12. Hephaestan Gold Tool", "Hephaestan Gold Sword", 12255).getInt();
        hephaestanGoldShovelID = config.getItem("12. Hephaestan Gold Tool", "Hephaestan Gold Shovel", 12256).getInt();
        hephaestanGoldAxeID = config.getItem("12. Hephaestan Gold Tool", "Hephaestan Gold Axe", 12257).getInt();
        hephaestanGoldPickaxeID = config.getItem("12. Hephaestan Gold Tool", "Hephaestan Gold Pickaxe", 12258).getInt();
        blockHephaestanGoldID = config.getBlock("13. Hephaestan Gold Block", "Hephaestan Gold Block", 1320).getInt();
        //powered rail
        redGoldRailID = config.getBlock("14. Red Gold Powered Rail", "Powered Rail Block", 1321).getInt();
        //booleans
        MakeHephaestanSparkle = config.get(Configuration.CATEGORY_GENERAL, "Make Hephaestan Gold Blocks sparkle, true or false", true).getBoolean(true);
        werewolfEffectiveness = config.get(Configuration.CATEGORY_GENERAL, "Works on Mo'Creatures lycanthropes, true or false", true).getBoolean(true);
        enableRecycling = config.get(Configuration.CATEGORY_GENERAL, "Enable Golden item recycling recipes: false or true?", false).getBoolean(false);
        MakeRedGoldRailSparkle = config.get(Configuration.CATEGORY_GENERAL, "Make Red Gold Rails sparkle: true or false?", true).getBoolean(true);
        config.save();
        // define items
        // Rose Gold
        roseGoldIngot = new SimpleIngot(roseGoldIngotID).modId("goldenglitter").setCreativeTab(GoldenGlitterCore.tabAkkamaddiGolden).setUnlocalizedName("roseGoldIngot");
        largeRoseGoldChunkItem = new SimpleIngot(largeRoseGoldChunkItemID).modId("goldenglitter").setCreativeTab(GoldenGlitterCore.tabAkkamaddiGolden).setUnlocalizedName("largeRoseGoldChunkItem");
        roseGoldSword = new SimpleSword(roseGoldSwordID, toolRoseGold).modId("goldenglitter").setCreativeTab(GoldenGlitterCore.tabAkkamaddiGolden).setUnlocalizedName("roseGoldSword");
        roseGoldShovel = new SimpleShovel(roseGoldShovelID, toolRoseGold).modId("goldenglitter").setCreativeTab(GoldenGlitterCore.tabAkkamaddiGolden).setUnlocalizedName("roseGoldShovel");
        roseGoldAxe = new SimpleAxe(roseGoldAxeID, toolRoseGold).modId("goldenglitter").setCreativeTab(GoldenGlitterCore.tabAkkamaddiGolden).setUnlocalizedName("roseGoldAxe");
        roseGoldPickaxe = new SimplePickaxe(roseGoldPickaxeID, toolRoseGold).modId("goldenglitter").setCreativeTab(GoldenGlitterCore.tabAkkamaddiGolden).setUnlocalizedName("roseGoldPickaxe");
        roseGoldHoe = new SimpleHoe(roseGoldHoeID, toolRoseGold).modId("goldenglitter").setCreativeTab(GoldenGlitterCore.tabAkkamaddiGolden).setUnlocalizedName("roseGoldHoe");
        roseGoldHelm = new SimpleArmor(roseGoldHelmID, armorRoseGold, rendererRoseGold, 0).modId("goldenglitter").setType("roseGold").setCreativeTab(GoldenGlitterCore.tabAkkamaddiGolden).setUnlocalizedName("roseGoldHelm");
        roseGoldChest = new SimpleArmor(roseGoldChestID, armorRoseGold, rendererRoseGold, 1).modId("goldenglitter").setType("roseGold").setCreativeTab(GoldenGlitterCore.tabAkkamaddiGolden).setUnlocalizedName("roseGoldChest");
        roseGoldLegs = new SimpleArmor(roseGoldLegsID, armorRoseGold, rendererRoseGold, 2).modId("goldenglitter").setType("roseGold").setCreativeTab(GoldenGlitterCore.tabAkkamaddiGolden).setUnlocalizedName("roseGoldLegs");
        roseGoldBoots = new SimpleArmor(roseGoldBootsID, armorRoseGold, rendererRoseGold, 3).modId("goldenglitter").setType("roseGold").setCreativeTab(GoldenGlitterCore.tabAkkamaddiGolden).setUnlocalizedName("roseGoldBoots");
        //Erubescent Gold
        erubescentGoldIngot = new SimpleIngot(erubescentGoldIngotID).modId("goldenglitter").setCreativeTab(GoldenGlitterCore.tabAkkamaddiGolden).setUnlocalizedName("erubescentGoldIngot");
        largeErubescentGoldChunkItem = new SimpleIngot(largeErubescentGoldChunkItemID).modId("goldenglitter").setCreativeTab(GoldenGlitterCore.tabAkkamaddiGolden).setUnlocalizedName("largeErubescentGoldChunkItem");
        erubescentGoldSword = new SimpleSword(erubescentGoldSwordID, toolErubescentGold).modId("goldenglitter").setCreativeTab(GoldenGlitterCore.tabAkkamaddiGolden).setUnlocalizedName("erubescentGoldSword");
        erubescentGoldShovel = new SimpleShovel(erubescentGoldShovelID, toolErubescentGold).modId("goldenglitter").setCreativeTab(GoldenGlitterCore.tabAkkamaddiGolden).setUnlocalizedName("erubescentGoldShovel");
        erubescentGoldAxe = new SimpleAxe(erubescentGoldAxeID, toolErubescentGold).modId("goldenglitter").setCreativeTab(GoldenGlitterCore.tabAkkamaddiGolden).setUnlocalizedName("erubescentGoldAxe");
        erubescentGoldPickaxe = new SimplePickaxe(erubescentGoldPickaxeID, toolErubescentGold).modId("goldenglitter").setCreativeTab(GoldenGlitterCore.tabAkkamaddiGolden).setUnlocalizedName("erubescentGoldPickaxe");
        //Scarlatite Gold
        scarlatiteGoldIngot = new SimpleIngot(scarlatiteGoldIngotID).modId("goldenglitter").setCreativeTab(GoldenGlitterCore.tabAkkamaddiGolden).setUnlocalizedName("scarlatiteGoldIngot");
        largeScarlatiteGoldChunkItem = new SimpleIngot(largeScarlatiteGoldChunkItemID).modId("goldenglitter").setCreativeTab(GoldenGlitterCore.tabAkkamaddiGolden).setUnlocalizedName("largeScarlatiteGoldChunkItem");
        scarlatiteGoldSword = new SimpleSword(scarlatiteGoldSwordID, toolScarlatiteGold).modId("goldenglitter").setCreativeTab(GoldenGlitterCore.tabAkkamaddiGolden).setUnlocalizedName("scarlatiteGoldSword");
        scarlatiteGoldShovel = new SimpleShovel(scarlatiteGoldShovelID, toolScarlatiteGold).modId("goldenglitter").setCreativeTab(GoldenGlitterCore.tabAkkamaddiGolden).setUnlocalizedName("scarlatiteGoldShovel");
        scarlatiteGoldAxe = new SimpleAxe(scarlatiteGoldAxeID, toolScarlatiteGold).modId("goldenglitter").setCreativeTab(GoldenGlitterCore.tabAkkamaddiGolden).setUnlocalizedName("scarlatiteGoldAxe");
        scarlatiteGoldPickaxe = new SimplePickaxe(scarlatiteGoldPickaxeID, toolScarlatiteGold).modId("goldenglitter").setCreativeTab(GoldenGlitterCore.tabAkkamaddiGolden).setUnlocalizedName("scarlatiteGoldPickaxe");
        //Hephaestan Gold
        hephaestanGoldIngot = new SimpleIngot(hephaestanGoldIngotID).modId("goldenglitter").setCreativeTab(GoldenGlitterCore.tabAkkamaddiGolden).setUnlocalizedName("hephaestanGoldIngot");
        largeHephaestanGoldChunkItem = new SimpleIngot(largeHephaestanGoldChunkItemID).modId("goldenglitter").setCreativeTab(GoldenGlitterCore.tabAkkamaddiGolden).setUnlocalizedName("largeHephaestanGoldChunkItem");
        hephaestanGoldSword = new HephaestanSword(hephaestanGoldSwordID, toolHephaestanGold).modId("goldenglitter").setCreativeTab(GoldenGlitterCore.tabAkkamaddiGolden).setUnlocalizedName("hephaestanGoldSword");
        hephaestanGoldShovel = new SimpleShovel(hephaestanGoldShovelID, toolHephaestanGold).modId("goldenglitter").setCreativeTab(GoldenGlitterCore.tabAkkamaddiGolden).setUnlocalizedName("hephaestanGoldShovel");
        hephaestanGoldAxe = new SimpleAxe(hephaestanGoldAxeID, toolHephaestanGold).modId("goldenglitter").setCreativeTab(GoldenGlitterCore.tabAkkamaddiGolden).setUnlocalizedName("hephaestanGoldAxe");
        hephaestanGoldPickaxe = new SimplePickaxe(hephaestanGoldPickaxeID, toolHephaestanGold).modId("goldenglitter").setCreativeTab(GoldenGlitterCore.tabAkkamaddiGolden).setUnlocalizedName("hephaestanGoldPickaxe");
        // define blocks
        blockRoseGold = new RoseStorageBlock(blockRoseGoldID, Material.iron, "goldenglitter")
        .setHardness(7.0F).setResistance(16.0F).setStepSound(Block.soundMetalFootstep)
        .setUnlocalizedName("blockRoseGold").setCreativeTab(GoldenGlitterCore.tabAkkamaddiGolden);
        blockErubescentGold = new ErubescentStorageBlock(blockErubescentGoldID, Material.iron, "goldenglitter")
        .setHardness(9.0F).setResistance(14.0F).setStepSound(Block.soundMetalFootstep)
        .setUnlocalizedName("blockErubescentGold").setCreativeTab(GoldenGlitterCore.tabAkkamaddiGolden)
        .setLightValue(0.5F);
        blockScarlatiteGold = new ScarlatiteStorageBlock(blockScarlatiteGoldID, Material.iron, "goldenglitter")
        .setHardness(11.0F).setResistance(18.0F).setStepSound(Block.soundMetalFootstep)
        .setUnlocalizedName("blockScarlatiteGold").setCreativeTab(GoldenGlitterCore.tabAkkamaddiGolden)
        .setLightValue(1.0F);
        blockHephaestanGold = new HephaestanStorageBlock(blockHephaestanGoldID, Material.iron, "goldenglitter")
        .setHardness(18.0F).setResistance(24.0F).setStepSound(Block.soundMetalFootstep)
        .setUnlocalizedName("blockHephaestanGold").setCreativeTab(GoldenGlitterCore.tabAkkamaddiGolden)
        .setLightValue(1.0F);
        redGoldRail = new RedGoldRail(redGoldRailID)
        .setHardness(1.0F).setResistance(1.0F).setStepSound(Block.soundMetalFootstep)
        .setUnlocalizedName("redGoldRail").setCreativeTab(GoldenGlitterCore.tabAkkamaddiGolden)
        .setLightValue(1.0F).setTextureName("redGoldRail");
        // registration
        GameRegistry.registerBlock(blockRoseGold, "blockRoseGold");
        GameRegistry.registerBlock(blockErubescentGold, "blockErubescentGold");
        GameRegistry.registerBlock(blockScarlatiteGold, "blockScarlatiteGold");
        GameRegistry.registerBlock(blockHephaestanGold, "blockHephaestanGold");
        GameRegistry.registerBlock(redGoldRail, "redGoldRail");
        /*
        GameRegistry.registerItem(roseGoldIngot,"roseGoldIngot");
        GameRegistry.registerItem(largeRoseGoldChunkItem,"largeRoseGoldChunkItem");
        GameRegistry.registerItem(roseGoldSword,"roseGoldSword");
        GameRegistry.registerItem(roseGoldShovel,"roseGoldShovel");
        GameRegistry.registerItem(roseGoldAxe,"roseGoldAxe");
        GameRegistry.registerItem(roseGoldPickaxe,"roseGoldPickaxe");
        GameRegistry.registerItem(roseGoldHoe,"roseGoldHoe");
        GameRegistry.registerItem(roseGoldHelm,"roseGoldHelm");
        GameRegistry.registerItem(roseGoldChest,"roseGoldChest");
        GameRegistry.registerItem(roseGoldLegs,"roseGoldLegs");
        GameRegistry.registerItem(roseGoldBoots,"roseGoldBoots");

        GameRegistry.registerItem(erubescentGoldIngot,"erubescentGoldIngot");
        GameRegistry.registerItem(largeErubescentGoldChunkItem,"largeErubescentGoldChunkItem");
        GameRegistry.registerItem(erubescentGoldSword,"erubescentGoldSword");
        GameRegistry.registerItem(erubescentGoldShovel,"erubescentGoldShovel");
        GameRegistry.registerItem(erubescentGoldAxe,"erubescentGoldAxe");
        GameRegistry.registerItem(erubescentGoldPickaxe,"erubescentGoldPickaxe");

        GameRegistry.registerItem(scarlatiteGoldIngot,"scarlatiteGoldIngot");
        GameRegistry.registerItem(largeScarlatiteGoldChunkItem,"largeScarlatiteGoldChunkItem");
        GameRegistry.registerItem(scarlatiteGoldSword,"scarlatiteGoldSword");
        GameRegistry.registerItem(scarlatiteGoldShovel,"scarlatiteGoldShovel");
        GameRegistry.registerItem(scarlatiteGoldAxe,"scarlatiteGoldAxe");
        GameRegistry.registerItem(scarlatiteGoldPickaxe,"scarlatiteGoldPickaxe");

        GameRegistry.registerItem(hephaestanGoldIngot,"hephaestanGoldIngot");
        GameRegistry.registerItem(largeHephaestanGoldChunkItem,"largeHephaestanGoldChunkItem");
        GameRegistry.registerItem(hephaestanGoldSword,"hephaestanGoldSword");
        GameRegistry.registerItem(hephaestanGoldShovel,"hephaestanGoldShovel");
        GameRegistry.registerItem(hephaestanGoldAxe,"hephaestanGoldAxe");
        GameRegistry.registerItem(hephaestanGoldPickaxe,"hephaestanGoldPickaxe");
        */
        // loot
        LootHelper.addLoot("villageBlacksmith", new ItemStack(roseGoldIngot), 2, 4, 4);
        LootHelper.addLoot("villageBlacksmith", new ItemStack(largeRoseGoldChunkItem), 1, 2, 3);
        LootHelper.addLoot("villageBlacksmith", new ItemStack(roseGoldSword), 2, 4, 1);
        LootHelper.addLoot("villageBlacksmith", new ItemStack(roseGoldPickaxe), 2, 4, 1);
        LootHelper.addLoot("villageBlacksmith", new ItemStack(roseGoldAxe), 1, 2, 1);
        LootHelper.addLoot("villageBlacksmith", new ItemStack(roseGoldShovel), 1, 2, 1);
        LootHelper.addLoot("villageBlacksmith", new ItemStack(roseGoldHelm), 1, 4, 1);
        LootHelper.addLoot("villageBlacksmith", new ItemStack(roseGoldChest), 1, 4, 1);
        LootHelper.addLoot("villageBlacksmith", new ItemStack(roseGoldLegs), 1, 4, 1);
        LootHelper.addLoot("villageBlacksmith", new ItemStack(roseGoldBoots), 1, 4, 1);
        LootHelper.addLoot("villageBlacksmith", new ItemStack(erubescentGoldPickaxe), 1, 3, 1);
        LootHelper.addLoot("villageBlacksmith", new ItemStack(scarlatiteGoldPickaxe), 1, 2, 1);
        LootHelper.addLoot("villageBlacksmith", new ItemStack(hephaestanGoldPickaxe), 1, 1, 1);
        LootHelper.addLoot("dungeonChest", new ItemStack(roseGoldIngot), 2, 4, 6);
        LootHelper.addLoot("dungeonChest", new ItemStack(roseGoldPickaxe), 2, 6, 1);
        LootHelper.addLoot("dungeonChest", new ItemStack(erubescentGoldIngot), 1, 2, 2);
        LootHelper.addLoot("dungeonChest", new ItemStack(scarlatiteGoldIngot), 1, 1, 1);
        LootHelper.addLoot("dungeonChest", new ItemStack(erubescentGoldSword), 1, 3, 1);
        LootHelper.addLoot("dungeonChest", new ItemStack(scarlatiteGoldSword), 1, 2, 1);
        LootHelper.addLoot("dungeonChest", new ItemStack(hephaestanGoldSword), 1, 1, 1);
        LootHelper.addLoot("mineshaftCorridor", new ItemStack(roseGoldSword), 1, 3, 1);
        LootHelper.addLoot("mineshaftCorridor", new ItemStack(roseGoldPickaxe), 2, 4, 1);
        LootHelper.addLoot("mineshaftCorridor", new ItemStack(roseGoldShovel), 1, 2, 1);
        LootHelper.addLoot("mineshaftCorridor", new ItemStack(erubescentGoldPickaxe), 1, 3, 1);
        LootHelper.addLoot("mineshaftCorridor", new ItemStack(scarlatiteGoldPickaxe), 1, 2, 1);
        LootHelper.addLoot("mineshaftCorridor", new ItemStack(hephaestanGoldPickaxe), 1, 1, 1);
        LootHelper.addLoot("mineshaftCorridor", new ItemStack(erubescentGoldShovel), 1, 3, 1);
        LootHelper.addLoot("mineshaftCorridor", new ItemStack(scarlatiteGoldShovel), 1, 2, 1);
        LootHelper.addLoot("mineshaftCorridor", new ItemStack(hephaestanGoldShovel), 1, 1, 1);
        LootHelper.addLoot("pyramidDesertyChest", new ItemStack(erubescentGoldIngot), 1, 4, 4);
        LootHelper.addLoot("pyramidDesertyChest", new ItemStack(scarlatiteGoldIngot), 1, 3, 3);
        LootHelper.addLoot("pyramidDesertyChest", new ItemStack(hephaestanGoldIngot), 1, 2, 2);
        LootHelper.addLoot("pyramidDesertyChest", new ItemStack(erubescentGoldSword), 1, 1, 1);
        LootHelper.addLoot("pyramidDesertyChest", new ItemStack(scarlatiteGoldSword), 1, 2, 1);
        LootHelper.addLoot("pyramidDesertyChest", new ItemStack(hephaestanGoldSword), 1, 3, 1);
        LootHelper.addLoot("pyramidJungleChest", new ItemStack(erubescentGoldIngot), 1, 4, 4);
        LootHelper.addLoot("pyramidJungleChest", new ItemStack(scarlatiteGoldIngot), 1, 3, 3);
        LootHelper.addLoot("pyramidJungleChest", new ItemStack(hephaestanGoldIngot), 1, 2, 2);
        LootHelper.addLoot("pyramidJungleChest", new ItemStack(erubescentGoldSword), 1, 1, 1);
        LootHelper.addLoot("pyramidJungleChest", new ItemStack(scarlatiteGoldSword), 1, 2, 1);
        LootHelper.addLoot("pyramidJungleChest", new ItemStack(hephaestanGoldSword), 1, 3, 1);

        if (GoldenGlitterCore.werewolfEffectiveness)
            try
            {
                MinecraftForge.EVENT_BUS.register(new WerewolfHandler());
            }
            catch (ClassNotFoundException ignored) {}

        // run tab icon call
        setTabIcons();
        //recipes
        GlitterRecipes.doGlitterRecipes();
    }

    @EventHandler // used in 1.6.2
    public void load(FMLInitializationEvent event)
    {
        proxy.registerRenderers();
        MinecraftForge.EVENT_BUS.register(new HandlerJoinWorld());
        //Armor Renderers
        rendererRoseGold = proxy.addArmor("roseGold");
        // name stuff
        LanguageRegistry.addName(roseGoldIngot, "Rose Gold Ingot");
        LanguageRegistry.addName(largeRoseGoldChunkItem, "Large Rose Gold Chunk");
        LanguageRegistry.addName(roseGoldSword, "Rose Gold Sword");
        LanguageRegistry.addName(roseGoldShovel, "Rose Gold Shovel");
        LanguageRegistry.addName(roseGoldAxe, "Rose Gold Axe");
        LanguageRegistry.addName(roseGoldPickaxe, "Rose Gold Pickaxe");
        LanguageRegistry.addName(roseGoldHoe, "Rose Gold Hoe");
        LanguageRegistry.addName(roseGoldHelm, "Rose Gold Helm");
        LanguageRegistry.addName(roseGoldChest, "Rose Gold Chestplate");
        LanguageRegistry.addName(roseGoldLegs, "Rose Gold Leggings");
        LanguageRegistry.addName(roseGoldBoots, "Rose Gold Boots");
        LanguageRegistry.addName(erubescentGoldIngot, "Erubescent Gold Ingot");
        LanguageRegistry.addName(largeErubescentGoldChunkItem, "Large Erubescent Gold Chunk");
        LanguageRegistry.addName(erubescentGoldSword, "Erubescent Gold Sword");
        LanguageRegistry.addName(erubescentGoldShovel, "Erubescent Gold Shovel");
        LanguageRegistry.addName(erubescentGoldAxe, "Erubescent Gold Axe");
        LanguageRegistry.addName(erubescentGoldPickaxe, "Erubescent Gold Pickaxe");
        LanguageRegistry.addName(scarlatiteGoldIngot, "Scarlatite Gold Ingot");
        LanguageRegistry.addName(largeScarlatiteGoldChunkItem, "Large Scarlatite Gold Chunk");
        LanguageRegistry.addName(scarlatiteGoldSword, "Scarlatite Gold Sword");
        LanguageRegistry.addName(scarlatiteGoldShovel, "Scarlatite Gold Shovel");
        LanguageRegistry.addName(scarlatiteGoldAxe, "Scarlatite Gold Axe");
        LanguageRegistry.addName(scarlatiteGoldPickaxe, "Scarlatite Gold Pickaxe");
        LanguageRegistry.addName(hephaestanGoldIngot, "Hephaestan Gold Ingot");
        LanguageRegistry.addName(largeHephaestanGoldChunkItem, "Large Hephaestan Gold Chunk");
        LanguageRegistry.addName(hephaestanGoldSword, "Hephaestan Gold Sword");
        LanguageRegistry.addName(hephaestanGoldShovel, "Hephaestan Gold Shovel");
        LanguageRegistry.addName(hephaestanGoldAxe, "Hephaestan Gold Axe");
        LanguageRegistry.addName(hephaestanGoldPickaxe, "Hephaestan Gold Pickaxe");
        LanguageRegistry.instance().addStringLocalization("itemGroup.tabAkkamaddiGolden", "en_US", "akkamaddi's Golden Glitter");
        LanguageRegistry.addName(blockRoseGold, "Rose Gold Block");
        MinecraftForge.setBlockHarvestLevel(blockRoseGold, "pickaxe", 0);
        LanguageRegistry.addName(blockErubescentGold, "Erubescent Gold Block");
        MinecraftForge.setBlockHarvestLevel(blockErubescentGold, "pickaxe", 0);
        LanguageRegistry.addName(blockScarlatiteGold, "Scarlatite Gold Block");
        MinecraftForge.setBlockHarvestLevel(blockScarlatiteGold, "pickaxe", 0);
        LanguageRegistry.addName(blockHephaestanGold, "Hephaestan Gold Block");
        MinecraftForge.setBlockHarvestLevel(blockHephaestanGold, "pickaxe", 0);
        LanguageRegistry.addName(redGoldRail, "Red Gold Power Rail");
        MinecraftForge.setBlockHarvestLevel(redGoldRail, "pickaxe", 0);
        MinecraftForge.setToolClass(roseGoldPickaxe, "pickaxe", 1);
        MinecraftForge.setToolClass(roseGoldShovel, "shovel", 1);
        MinecraftForge.setToolClass(roseGoldAxe, "axe", 1);
        MinecraftForge.setToolClass(erubescentGoldPickaxe, "pickaxe", 3);
        MinecraftForge.setToolClass(erubescentGoldShovel, "shovel", 3);
        MinecraftForge.setToolClass(erubescentGoldAxe, "axe", 3);
        MinecraftForge.setToolClass(scarlatiteGoldPickaxe, "pickaxe", 5);
        MinecraftForge.setToolClass(scarlatiteGoldShovel, "shovel", 5);
        MinecraftForge.setToolClass(scarlatiteGoldAxe, "axe", 5);
        MinecraftForge.setToolClass(hephaestanGoldPickaxe, "pickaxe", 7);
        MinecraftForge.setToolClass(hephaestanGoldShovel, "shovel", 7);
        MinecraftForge.setToolClass(hephaestanGoldAxe, "axe", 7);
        toolRoseGold.customCraftingMaterial = GoldenGlitterCore.roseGoldIngot;
        armorRoseGold.customCraftingMaterial = GoldenGlitterCore.roseGoldIngot;
        toolErubescentGold.customCraftingMaterial = GoldenGlitterCore.erubescentGoldIngot;
        toolScarlatiteGold.customCraftingMaterial = GoldenGlitterCore.scarlatiteGoldIngot;
        toolHephaestanGold.customCraftingMaterial = GoldenGlitterCore.hephaestanGoldIngot;
    }

    @EventHandler // used in 1.6.2
    public void postInit(FMLPostInitializationEvent event)
    {
        // Stub Method
    }
}

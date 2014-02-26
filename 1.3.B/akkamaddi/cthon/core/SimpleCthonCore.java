package akkamaddi.cthon.core;

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
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
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
import alexndr.SimpleOres.api.content.SimpleOre;
import alexndr.SimpleOres.api.content.SimpleTab;
import alexndr.SimpleOres.api.helpers.LootHelper;
import akkamaddi.cthon.core.CthonOreBlock;

@Mod(modid = "simplecthon", name = "Simple Cthon", version = "1.2.0", dependencies = "required-after:simpleores ; required-after:simpleoresfusion")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)

public class SimpleCthonCore
{
    // The instance of your mod that Forge uses.
    @Instance("simplecthon")
    public static SimpleCthonCore instance;

    // Says where the client and server 'proxy' code is loaded.
    @SidedProxy(clientSide = "akkamaddi.cthon.core.ClientProxy", serverSide = "akkamaddi.cthon.core.CommonProxy")
    public static CommonProxy proxy;

    // set item ID, to-from config file

    //Cthon
    public static int cthonIngotID;
    public static int cthonElutriatedChunkID;
    public static int cthonMephiticChunkID;

    public static int cthonSwordID;
    public static int cthonShovelID;
    public static int cthonAxeID;
    public static int cthonPickaxeID;
    public static int cthonHoeID;

    public static int cthonHelmID;
    public static int cthonChestID;
    public static int cthonLegsID;
    public static int cthonBootsID;

    public static int blockCthonID;
    public static int oreCthonID;

    // set actual item names

    //Cthon
    public static Item cthonIngot;
    public static Item cthonElutriatedChunk;
    public static Item cthonMephiticChunk;

    public static Item cthonSword;
    public static Item cthonShovel;
    public static Item cthonAxe;
    public static Item cthonPickaxe;
    public static Item cthonHoe;

    public static Item cthonHelm;
    public static Item cthonChest;
    public static Item cthonLegs;
    public static Item cthonBoots;

    // set block names
    public static Block blockCthon;
    public static Block oreCthon;

    // spawning
    public static int cthonSpawnRate;
    public static int cthonVeinSize;
    public static int cthonSpawnHeight;
    
    // booleans
    public static boolean enableRecycling;

    // tab
    public static SimpleTab tabAkkamaddiCthon = new SimpleTab("tabAkkamaddiCthon");

    // set tool properties
    // EnumToolMaterial. In form ("NAME", mining level, max uses, speed, damage to entity, enchantability)
    public static EnumToolMaterial toolCthon = EnumHelper.addToolMaterial("CTHON", 5, 4350, 22.0F, 7, 2);

    /**
     * EnumArmorMaterial. In form ("NAME", max damage (like uses, multiply by pieces for their max damage), new int[] {helmet defense, chestplate defense, leggings defense, boots defense}, enchantability)
     */
    public static EnumArmorMaterial armorCthon = EnumHelper.addArmorMaterial("CTHON", 66, new int[] {5, 9, 8, 5}, 2);

    // Armor
    public static int rendererCthon;

// Tab
    public void setTabIcons()
    {
        /**
         * Creating the custom tabs using the API class "SimpleTab" and setting their icon.
         */
        tabAkkamaddiCthon.setIcon(new ItemStack(SimpleCthonCore.oreCthon));
    }

    @EventHandler // used in 1.6.2
    public void preInit(FMLPreInitializationEvent event)
    {
        
    	// Stub Method
        
    	MinecraftForge.EVENT_BUS.register(new HandlerArmor());
        
    	Configuration config = new Configuration(event.getSuggestedConfigurationFile());
        
    	config.load();
        
    	// Cthon
        cthonIngotID = config.getItem("01. Cthon Item", "Cthon Ingot", 12330).getInt();
        cthonElutriatedChunkID = config.getItem("01. Cthon Item", "Cthon Elutriated Chunk", 12331).getInt();
        cthonMephiticChunkID = config.getItem("01. Cthon Item", "Cthon Mephitic Chunk", 12332).getInt();
        cthonSwordID = config.getItem("02. Cthon Tool", "Cthon Sword", 12333).getInt();
        cthonShovelID = config.getItem("02. Cthon Tool", "Cthon Shovel", 12334).getInt();
        cthonAxeID = config.getItem("02. Cthon Tool", "Cthon Axe", 12335).getInt();
        cthonPickaxeID = config.getItem("02. Cthon Tool", "Cthon Pickaxe", 12336).getInt();
        cthonHoeID = config.getItem("02. Cthon Tool", "Cthon Hoe", 12337).getInt();
        cthonHelmID = config.getItem("03. Cthon Armor", "Cthon Helm", 12338).getInt();
        cthonChestID = config.getItem("03. Cthon Armor", "Cthon Chest Plate", 12339).getInt();
        cthonLegsID = config.getItem("03. Cthon Armor", "Cthon Leggings", 12340).getInt();
        cthonBootsID = config.getItem("03. Cthon Armor", "Cthon Boots", 12341).getInt();
        blockCthonID = config.getBlock("04. Cthon Block", "Cthon Storage Block", 1327).getInt();
        oreCthonID = config.getBlock("04. Cthon Block", "Cthon Ore", 1328).getInt();
        
        //Adjustable Ore Spawn Rates
        cthonSpawnRate = config.get("05. Spawn Rate", "Cthon Spawn Rate", 4).getInt();
        cthonVeinSize = config.get("05. Vein Size", "Cthon Vein Size", 4).getInt();
        cthonSpawnHeight = config.get("05. Spawn Height", "Cthon Spawn Height", 256).getInt();
        
        //Recycling
        enableRecycling= config.get(Configuration.CATEGORY_GENERAL, "Enable Cthon item recycling recipes: false or true?", false).getBoolean(false);
        
        config.save();
        
        // define items
        // Cthon
        
        cthonIngot = new SimpleIngot(cthonIngotID).modId("simplecthon").setCreativeTab(SimpleCthonCore.tabAkkamaddiCthon).setUnlocalizedName("cthonIngot");
        cthonElutriatedChunk = new SimpleIngot(cthonElutriatedChunkID).modId("simplecthon").setCreativeTab(SimpleCthonCore.tabAkkamaddiCthon).setUnlocalizedName("cthonElutriatedChunk");
        cthonMephiticChunk = new SimpleIngot(cthonMephiticChunkID).modId("simplecthon").setCreativeTab(SimpleCthonCore.tabAkkamaddiCthon).setUnlocalizedName("cthonMephiticChunk");
        cthonSword = new SimpleSword(cthonSwordID, toolCthon).modId("simplecthon").setCreativeTab(SimpleCthonCore.tabAkkamaddiCthon).setUnlocalizedName("cthonSword");
        cthonShovel = new SimpleShovel(cthonShovelID, toolCthon).modId("simplecthon").setCreativeTab(SimpleCthonCore.tabAkkamaddiCthon).setUnlocalizedName("cthonShovel");
        cthonAxe = new SimpleAxe(cthonAxeID, toolCthon).modId("simplecthon").setCreativeTab(SimpleCthonCore.tabAkkamaddiCthon).setUnlocalizedName("cthonAxe");
        cthonPickaxe = new SimplePickaxe(cthonPickaxeID, toolCthon).modId("simplecthon").setCreativeTab(SimpleCthonCore.tabAkkamaddiCthon).setUnlocalizedName("cthonPickaxe");
        cthonHoe = new SimpleHoe(cthonHoeID, toolCthon).modId("simplecthon").setCreativeTab(SimpleCthonCore.tabAkkamaddiCthon).setUnlocalizedName("cthonHoe");
        cthonHelm = new SimpleArmor(cthonHelmID, armorCthon, rendererCthon, 0).modId("simplecthon").setType("cthon").setCreativeTab(SimpleCthonCore.tabAkkamaddiCthon).setUnlocalizedName("cthonHelm");
        cthonChest = new SimpleArmor(cthonChestID, armorCthon, rendererCthon, 1).modId("simplecthon").setType("cthon").setCreativeTab(SimpleCthonCore.tabAkkamaddiCthon).setUnlocalizedName("cthonChest");
        cthonLegs = new SimpleArmor(cthonLegsID, armorCthon, rendererCthon, 2).modId("simplecthon").setType("cthon").setCreativeTab(SimpleCthonCore.tabAkkamaddiCthon).setUnlocalizedName("cthonLegs");
        cthonBoots = new SimpleArmor(cthonBootsID, armorCthon, rendererCthon, 3).modId("simplecthon").setType("cthon").setCreativeTab(SimpleCthonCore.tabAkkamaddiCthon).setUnlocalizedName("cthonBoots");
        
        // define blocks        
        blockCthon = new SimpleOre(blockCthonID, Material.iron).modId("simplecthon")
        .setHardness(16.0F).setResistance(42.0F).setStepSound(Block.soundMetalFootstep)
        .setCreativeTab(SimpleCthonCore.tabAkkamaddiCthon)
        .setUnlocalizedName("blockCthon");
        
        oreCthon = new CthonOreBlock(oreCthonID, Material.iron, "simplecthon")
        .setHardness(14.0F).setResistance(14.0F).setStepSound(Block.soundStoneFootstep)
        .setCreativeTab(SimpleCthonCore.tabAkkamaddiCthon)
        .setUnlocalizedName("oreCthon");
        
        // Register items
        GameRegistry.registerBlock(oreCthon, "oreCthon");
        /*
        GameRegistry.registerItem(cthonIngot,"cthonIngot");
        GameRegistry.registerItem(cthonElutriatedChunk,"cthonElutriatedChunk");
        GameRegistry.registerItem(cthonMephiticChunk,"cthonMephiticChunk");
        GameRegistry.registerItem(cthonSword,"cthonSword");
        GameRegistry.registerItem(cthonShovel,"cthonShovel");
        GameRegistry.registerItem(cthonAxe,"cthonAxe");
        GameRegistry.registerItem(cthonPickaxe,"cthonPickaxe");
        GameRegistry.registerItem(cthonHoe,"cthonHoe");
        GameRegistry.registerItem(cthonHelm,"cthonHelm");
        GameRegistry.registerItem(cthonChest,"cthonChest");
        GameRegistry.registerItem(cthonLegs,"cthonLegs");
        GameRegistry.registerItem(cthonBoots,"cthonBoots");
        
        GameRegistry.registerBlock(blockCthon, "blockCthon");
        */
        
        // loot
        LootHelper.addLoot("pyramidDesertyChest", new ItemStack(cthonIngot), 1, 1, 1);
        LootHelper.addLoot("pyramidDesertyChest", new ItemStack(cthonPickaxe), 1, 1, 1);
        LootHelper.addLoot("pyramidJungleChest", new ItemStack(cthonIngot), 1, 1, 1);
        LootHelper.addLoot("pyramidJungleChest", new ItemStack(cthonPickaxe), 1, 1, 1);
        LootHelper.addLoot("dungeonChest", new ItemStack(cthonIngot), 1, 1, 1);
        LootHelper.addLoot("dungeonChest", new ItemStack(cthonShovel), 1, 1, 1);
        
        // run tab icon call
        setTabIcons();
        
        // recipes
        CthonRecipes.doCthonRecipes();
        
    }

    @EventHandler // used in 1.6.2
    public void load(FMLInitializationEvent event)
    {
        proxy.registerRenderers();
        
        GameRegistry.registerWorldGenerator(new SimpleCthonGenerator());
        
        MinecraftForge.EVENT_BUS.register(new HandlerJoinWorld());
                
        //Armor Renderers
        rendererCthon = proxy.addArmor("cthon");
        
        // name stuff
        LanguageRegistry.addName(cthonIngot, "Cthon Ingot");
        LanguageRegistry.addName(cthonElutriatedChunk, "Elutriated Cthon Chunk");
        LanguageRegistry.addName(cthonMephiticChunk, "Mephitic Cthon Chunk");
        LanguageRegistry.addName(cthonSword, "Cthon Sword");
        LanguageRegistry.addName(cthonShovel, "Cthon Shovel");
        LanguageRegistry.addName(cthonAxe, "Cthon Axe");
        LanguageRegistry.addName(cthonPickaxe, "Cthon Pickaxe");
        LanguageRegistry.addName(cthonHoe, "Cthon Hoe");
        LanguageRegistry.addName(cthonHelm, "Cthon Helm");
        LanguageRegistry.addName(cthonChest, "Cthon Chestplate");
        LanguageRegistry.addName(cthonLegs, "Cthon Leggings");
        LanguageRegistry.addName(cthonBoots, "Cthon Boots");
        
        LanguageRegistry.addName(blockCthon, "Cthon Block");
        MinecraftForge.setBlockHarvestLevel(blockCthon, "pickaxe", 0);
        
        LanguageRegistry.addName(oreCthon, "Cthon Ore");
        MinecraftForge.setBlockHarvestLevel(oreCthon, "pickaxe", 4);
        
        MinecraftForge.setToolClass(cthonPickaxe, "pickaxe", 5);
        MinecraftForge.setToolClass(cthonShovel, "shovel", 5);
        MinecraftForge.setToolClass(cthonAxe, "axe", 5);
        
        LanguageRegistry.instance().addStringLocalization("itemGroup.tabAkkamaddiCthon", "en_US", "akkamaddi's Simple Cthon");
        
        toolCthon.customCraftingMaterial = SimpleCthonCore.cthonIngot;
        
        armorCthon.customCraftingMaterial = SimpleCthonCore.cthonIngot;
        
    }

    @EventHandler // used in 1.6.2
    public void postInit(FMLPostInitializationEvent event)
    {
        // Stub Method
    }
}

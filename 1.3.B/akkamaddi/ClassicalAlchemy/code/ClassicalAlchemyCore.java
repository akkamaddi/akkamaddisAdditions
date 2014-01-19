package akkamaddi.ClassicalAlchemy.code;

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
import alexndr.SimpleOres.api.SimpleIngot;
import alexndr.SimpleOres.api.SimpleSword;
import alexndr.SimpleOres.api.SimpleShovel;
import alexndr.SimpleOres.api.SimpleAxe;
import alexndr.SimpleOres.api.SimplePickaxe;
import alexndr.SimpleOres.api.SimpleHoe;
import alexndr.SimpleOres.api.SimpleArmor;
import alexndr.SimpleOres.api.HandlerLoot;
import alexndr.SimpleOres.api.SimpleOre;
import alexndr.SimpleOres.api.SimpleTab;

@Mod(modid = "classicalalchemy", name = "Classical Alchemy", version = "0.1.0", dependencies = "required-after:simpleores ; required-after:simpleoresfusion")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)

public class ClassicalAlchemyCore
{
    // The instance of your mod that Forge uses.
    @Instance("classicalalchemy")
    public static ClassicalAlchemyCore instance;

    // Says where the client and server 'proxy' code is loaded.
    @SidedProxy(clientSide = "akkamaddi.ClassicalAlchemy.code.ClientProxy", serverSide = "akkamaddi.ClassicalAlchemy.code.CommonProxy")
    public static CommonProxy proxy;

    // set item ID, to-from config file

    //Stannum
    public static int stannumIngotID;
    public static int smallStannumChunkItemID;
    public static int mediumStannumChunkItemID;
    public static int largeStannumChunkItemID;

    public static int stannumSwordID;
    public static int stannumShovelID;
    public static int stannumAxeID;
    public static int stannumPickaxeID;
    public static int stannumHoeID;

    public static int stannumHelmID;
    public static int stannumChestID;
    public static int stannumLegsID;
    public static int stannumBootsID;

    public static int blockStannumID;

    // set actual item names

    //Stannum
    public static Item stannumIngot;
    public static Item smallStannumChunkItem;
    public static Item mediumStannumChunkItem;
    public static Item largeStannumChunkItem;

    public static Item stannumSword;
    public static Item stannumShovel;
    public static Item stannumAxe;
    public static Item stannumPickaxe;
    public static Item stannumHoe;

    public static Item stannumHelm;
    public static Item stannumChest;
    public static Item stannumLegs;
    public static Item stannumBoots;

    // set block names
    public static Block blockStannum;
    
    // booleans
    
    public static boolean enableRecycling;

    // tab
    public static SimpleTab tabAkkamaddiClassicalAlchemy = new SimpleTab("tabAkkamaddiClassicalAlchemy");

    // set tool properties
    // EnumToolMaterial. In form ("NAME", mining level, max uses, speed, damage to entity, enchantability)
    public static EnumToolMaterial toolStannum = EnumHelper.addToolMaterial("STANNUM", 2, 380, 8.5F, 2, 10);

    /**
     * EnumArmorMaterial. In form ("NAME", max damage (like uses, multiply by pieces for their max damage), new int[] {helmet defense, chestplate defense, leggings defense, boots defense}, enchantability)
     */
    public static EnumArmorMaterial armorStannum = EnumHelper.addArmorMaterial("STANNUM", 14, new int[] {2, 4, 3, 2}, 10);

    // Armor
    public static int rendererStannum;

// Tab
    public void setTabIcons()
    {
        /**
         * Creating the custom tabs using the API class "SimpleTab" and setting their icon.
         */
        tabAkkamaddiClassicalAlchemy.setIcon(new ItemStack(ClassicalAlchemyCore.blockStannum));
    }

    @EventHandler // used in 1.6.2
    public void preInit(FMLPreInitializationEvent event)
    {
        // Stub Method
		
        MinecraftForge.EVENT_BUS.register(new HandlerArmor());
		
        Configuration config = new Configuration(event.getSuggestedConfigurationFile());
		
        config.load();
        
		// Stannum
        
		stannumIngotID = config.getItem("011. Stannum Item", "Stannum Ingot", 12450).getInt();
        smallStannumChunkItemID = config.getItem("011. Stannum Item", "Small Stannum Chunk", 12451).getInt();
        mediumStannumChunkItemID = config.getItem("011. Stannum Item", "Medium Stannum Chunk", 12452).getInt();
        largeStannumChunkItemID = config.getItem("011. Stannum Item", "Large Stannum Chunk", 12453).getInt();
		
        stannumSwordID = config.getItem("012. Stannum Tool", "Stannum Sword", 12454).getInt();
        stannumShovelID = config.getItem("012. Stannum Tool", "Stannum Shovel", 12455).getInt();
        stannumAxeID = config.getItem("012. Stannum Tool", "Stannum Axe", 12456).getInt();
        stannumPickaxeID = config.getItem("012. Stannum Tool", "Stannum Pickaxe", 12457).getInt();
        stannumHoeID = config.getItem("012. Stannum Tool", "Stannum Hoe", 12458).getInt();
		
        stannumHelmID = config.getItem("013. Stannum Armor", "Stannum Helm", 12459).getInt();
        stannumChestID = config.getItem("013. Stannum Armor", "Stannum Chest Plate", 12460).getInt();
        stannumLegsID = config.getItem("013. Stannum Armor", "Stannum Leggings", 12461).getInt();
        stannumBootsID = config.getItem("013. Stannum Armor", "Stannum Boots", 12462).getInt();
		
        blockStannumID = config.getBlock("014. Stannum Block", "Stannum Storage Block", 1340).getInt();
        
        enableRecycling= config.get(Configuration.CATEGORY_GENERAL, "Enable Classical Alchemy item recycling recipes: false or true?", false).getBoolean(false);
		
        config.save();
        
		// define items
		
        // Stannum
        
		stannumIngot = new SimpleIngot(stannumIngotID).modId("classicalalchemy").setCreativeTab(ClassicalAlchemyCore.tabAkkamaddiClassicalAlchemy).setUnlocalizedName("stannumIngot");
        smallStannumChunkItem = new SimpleIngot(smallStannumChunkItemID).modId("classicalalchemy").setCreativeTab(ClassicalAlchemyCore.tabAkkamaddiClassicalAlchemy).setUnlocalizedName("smallStannumChunkItem");
        mediumStannumChunkItem = new SimpleIngot(mediumStannumChunkItemID).modId("classicalalchemy").setCreativeTab(ClassicalAlchemyCore.tabAkkamaddiClassicalAlchemy).setUnlocalizedName("mediumStannumChunkItem");
        largeStannumChunkItem = new SimpleIngot(largeStannumChunkItemID).modId("classicalalchemy").setCreativeTab(ClassicalAlchemyCore.tabAkkamaddiClassicalAlchemy).setUnlocalizedName("largeStannumChunkItem");
        
		stannumSword = new SimpleSword(stannumSwordID, toolStannum).modId("classicalalchemy").setCreativeTab(ClassicalAlchemyCore.tabAkkamaddiClassicalAlchemy).setUnlocalizedName("stannumSword");
        stannumShovel = new SimpleShovel(stannumShovelID, toolStannum).modId("classicalalchemy").setCreativeTab(ClassicalAlchemyCore.tabAkkamaddiClassicalAlchemy).setUnlocalizedName("stannumShovel");
        stannumAxe = new SimpleAxe(stannumAxeID, toolStannum).modId("classicalalchemy").setCreativeTab(ClassicalAlchemyCore.tabAkkamaddiClassicalAlchemy).setUnlocalizedName("stannumAxe");
        stannumPickaxe = new SimplePickaxe(stannumPickaxeID, toolStannum).modId("classicalalchemy").setCreativeTab(ClassicalAlchemyCore.tabAkkamaddiClassicalAlchemy).setUnlocalizedName("stannumPickaxe");
        stannumHoe = new SimpleHoe(stannumHoeID, toolStannum).modId("classicalalchemy").setCreativeTab(ClassicalAlchemyCore.tabAkkamaddiClassicalAlchemy).setUnlocalizedName("stannumHoe");
        
		stannumHelm = new SimpleArmor(stannumHelmID, armorStannum, rendererStannum, 0).modId("classicalalchemy").setType("stannum").setCreativeTab(ClassicalAlchemyCore.tabAkkamaddiClassicalAlchemy).setUnlocalizedName("stannumHelm");
        stannumChest = new SimpleArmor(stannumChestID, armorStannum, rendererStannum, 1).modId("classicalalchemy").setType("stannum").setCreativeTab(ClassicalAlchemyCore.tabAkkamaddiClassicalAlchemy).setUnlocalizedName("stannumChest");
        stannumLegs = new SimpleArmor(stannumLegsID, armorStannum, rendererStannum, 2).modId("classicalalchemy").setType("stannum").setCreativeTab(ClassicalAlchemyCore.tabAkkamaddiClassicalAlchemy).setUnlocalizedName("stannumLegs");
        stannumBoots = new SimpleArmor(stannumBootsID, armorStannum, rendererStannum, 3).modId("classicalalchemy").setType("stannum").setCreativeTab(ClassicalAlchemyCore.tabAkkamaddiClassicalAlchemy).setUnlocalizedName("stannumBoots");
        
		// define blocks
        
		blockStannum = new SimpleOre(blockStannumID, Material.iron).modId("classicalalchemy")
				.setCreativeTab(ClassicalAlchemyCore.tabAkkamaddiClassicalAlchemy)
        .setHardness(4.0F).setResistance(8.0F).setStepSound(Block.soundMetalFootstep)
        .setUnlocalizedName("blockStannum");
		
		/*
		// Item Registry
        GameRegistry.registerItem(stannumIngot, "stannumIngot");
        GameRegistry.registerItem(smallStannumChunkItem,"smallStannumChunkItem");
        GameRegistry.registerItem(mediumStannumChunkItem,"mediumStannumChunkItem");
        GameRegistry.registerItem(largeStannumChunkItem,"largeStannumChunkItem");

        GameRegistry.registerItem(stannumSword,"stannumSword");
        GameRegistry.registerItem(stannumShovel,"stannumShovel");
        GameRegistry.registerItem(stannumAxe,"stannumAxe");
        GameRegistry.registerItem(stannumPickaxe,"stannumPickaxe");
        GameRegistry.registerItem(stannumHoe,"stannumHoe");

        GameRegistry.registerItem(stannumHelm,"stannumHelm");
        GameRegistry.registerItem(stannumChest,"stannumChest");
        GameRegistry.registerItem(stannumLegs,"stannumLegs");
        GameRegistry.registerItem(stannumBoots,"stannumBoots");
        
        GameRegistry.registerBlock(blockStannum, "blockStannum");
        */

		
        // loot
		HandlerLoot.addLoot("mineshaftCorridor", new ItemStack(stannumIngot), 2, 4, 2);
        HandlerLoot.addLoot("mineshaftCorridor", new ItemStack(stannumSword), 1, 2, 1);
        HandlerLoot.addLoot("mineshaftCorridor", new ItemStack(stannumPickaxe), 1, 5, 1);
        HandlerLoot.addLoot("mineshaftCorridor", new ItemStack(stannumShovel), 2, 4, 1);
        HandlerLoot.addLoot("mineshaftCorridor", new ItemStack(stannumAxe), 1, 3, 1);
        HandlerLoot.addLoot("villageBlacksmith", new ItemStack(stannumIngot), 3, 6, 2);
        HandlerLoot.addLoot("villageBlacksmith", new ItemStack(stannumSword), 3, 5, 1);
        HandlerLoot.addLoot("villageBlacksmith", new ItemStack(stannumPickaxe), 2, 4, 1);
        HandlerLoot.addLoot("villageBlacksmith", new ItemStack(stannumAxe), 2, 4, 1);
        HandlerLoot.addLoot("villageBlacksmith", new ItemStack(stannumHoe), 1, 2, 1);
        HandlerLoot.addLoot("villageBlacksmith", new ItemStack(stannumHelm), 2, 3, 1);
        HandlerLoot.addLoot("villageBlacksmith", new ItemStack(stannumChest), 2, 4, 1);
        HandlerLoot.addLoot("villageBlacksmith", new ItemStack(stannumLegs), 2, 3, 1);
        HandlerLoot.addLoot("villageBlacksmith", new ItemStack(stannumBoots), 2, 3, 1);
        HandlerLoot.addLoot("dungeonChest", new ItemStack(stannumIngot), 3, 5, 2);
        HandlerLoot.addLoot("dungeonChest", new ItemStack(stannumSword), 2, 3, 1);
        HandlerLoot.addLoot("dungeonChest", new ItemStack(stannumPickaxe), 2, 3, 1);
        HandlerLoot.addLoot("dungeonChest", new ItemStack(stannumShovel), 1, 1, 1);
        
        // run tab icon call
        setTabIcons();
        
        // recipes
        ClassicalAlchemyRecipes.doStannumRecipes();
        
		
    }

    @EventHandler // used in 1.6.2
    public void load(FMLInitializationEvent event)
    {
        
		proxy.registerRenderers();
        
        MinecraftForge.EVENT_BUS.register(new HandlerJoinWorld());
        
		//Armor Renderers
        rendererStannum = proxy.addArmor("stannum");
        
		// name stuff
        LanguageRegistry.addName(stannumIngot, "Stannum Ingot");
        LanguageRegistry.addName(smallStannumChunkItem, "Small Stannum Chunk");
        LanguageRegistry.addName(mediumStannumChunkItem, "Medium Stannum Chunk");
        LanguageRegistry.addName(largeStannumChunkItem, "Large Stannum Chunk");

        LanguageRegistry.addName(stannumSword, "Stannum Sword");
        LanguageRegistry.addName(stannumShovel, "Stannum Shovel");
        LanguageRegistry.addName(stannumAxe, "Stannum Axe");
        LanguageRegistry.addName(stannumPickaxe, "Stannum Pickaxe");
        LanguageRegistry.addName(stannumHoe, "Stannum Hoe");
        LanguageRegistry.addName(stannumHelm, "Stannum Helm");
        LanguageRegistry.addName(stannumChest, "Stannum Chestplate");
        LanguageRegistry.addName(stannumLegs, "Stannum Leggings");
        LanguageRegistry.addName(stannumBoots, "Stannum Boots");

        LanguageRegistry.addName(blockStannum, "Stannum Block");		
        MinecraftForge.setBlockHarvestLevel(blockStannum, "pickaxe", 0);
        
        MinecraftForge.setToolClass(stannumPickaxe, "pickaxe", 2);
        MinecraftForge.setToolClass(stannumShovel, "shovel", 2);
        MinecraftForge.setToolClass(stannumAxe, "axe", 2);
		
        LanguageRegistry.instance().addStringLocalization("itemGroup.tabAkkamaddiClassicalAlchemy", "en_US", "akkamaddi's Classical Alchemy");
        
		toolStannum.customCraftingMaterial = ClassicalAlchemyCore.stannumIngot;
        
		armorStannum.customCraftingMaterial = ClassicalAlchemyCore.stannumIngot;
		
    }

    @EventHandler // used in 1.6.2
    public void postInit(FMLPostInitializationEvent event)
    {
        // Stub Method
    }
}

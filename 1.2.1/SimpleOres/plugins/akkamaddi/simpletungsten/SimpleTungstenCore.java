package SimpleOres.plugins.akkamaddi.simpletungsten;

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
import SimpleOres.core.api.SimpleIngot;
import SimpleOres.core.api.SimpleSword;
import SimpleOres.core.api.SimpleShovel;
import SimpleOres.core.api.SimpleAxe;
import SimpleOres.core.api.SimplePickaxe;
import SimpleOres.core.api.SimpleHoe;
import SimpleOres.core.api.SimpleArmor;
import SimpleOres.core.api.HandlerLoot;
import SimpleOres.core.api.SimpleOre;
import SimpleOres.core.api.SimpleTab;

@Mod(modid = "simpletungsten", name = "Simple Tungsten, and Tungsten alloys", version = "1.0.2", dependencies = "required-after:simpleores ; required-after:simpleoresfusion")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)

public class SimpleTungstenCore
{
    // The instance of your mod that Forge uses.
    @Instance("simpletungsten")
    public static SimpleTungstenCore instance;

    // Says where the client and server 'proxy' code is loaded.
    @SidedProxy(clientSide = "SimpleOres.plugins.akkamaddi.simpletungsten.ClientProxy", serverSide = "SimpleOres.plugins.akkamaddi.simpletungsten.CommonProxy")
    public static CommonProxy proxy;

    // set item ID, to-from config file

    //Tungsten
    public static int tungstenIngotID;

    public static int tungstenSwordID;
    public static int tungstenShovelID;
    public static int tungstenAxeID;
    public static int tungstenPickaxeID;
    public static int tungstenHoeID;

    public static int tungstenHelmID;
    public static int tungstenChestID;
    public static int tungstenLegsID;
    public static int tungstenBootsID;

    public static int blockTungstenID;
    public static int oreTungstenID;

    //Tungsten Carbide
    public static int tungstenCarbideIngotID;
    public static int smallTungstenCarbideChunkItemID;
    public static int mediumTungstenCarbideChunkItemID;
    public static int largeTungstenCarbideChunkItemID;

    public static int tungstenCarbideSwordID;
    public static int tungstenCarbideShovelID;
    public static int tungstenCarbideAxeID;
    public static int tungstenCarbidePickaxeID;
    public static int tungstenCarbideHoeID;

    public static int tungstenCarbideHelmID;
    public static int tungstenCarbideChestID;
    public static int tungstenCarbideLegsID;
    public static int tungstenCarbideBootsID;

    public static int blockTungstenCarbideID;

    // Valfram
    public static int valframIngotID;
    public static int smallValframChunkItemID;
    public static int mediumValframChunkItemID;
    public static int largeValframChunkItemID;

    public static int valframSwordID;
    public static int valframShovelID;
    public static int valframAxeID;
    public static int valframPickaxeID;
    public static int valframHoeID;

    public static int valframHelmID;
    public static int valframChestID;
    public static int valframLegsID;
    public static int valframBootsID;

    public static int blockValframID;

    // set actual item names

    //Tungsten
    public static Item tungstenIngot;

    public static Item tungstenSword;
    public static Item tungstenShovel;
    public static Item tungstenAxe;
    public static Item tungstenPickaxe;
    public static Item tungstenHoe;

    public static Item tungstenHelm;
    public static Item tungstenChest;
    public static Item tungstenLegs;
    public static Item tungstenBoots;

    // set block names
    public static Block blockTungsten;
    public static Block oreTungsten;

    // spawning
    public static int tungstenSpawnRate;
    public static int tungstenVeinSize;
    public static int tungstenSpawnHeight;
    public static int tungstenMinSpawnHeight;

    // Tungsten Carbide
    public static Item tungstenCarbideIngot;
    public static Item smallTungstenCarbideChunkItem;
    public static Item mediumTungstenCarbideChunkItem;
    public static Item largeTungstenCarbideChunkItem;

    public static Item tungstenCarbideSword;
    public static Item tungstenCarbideShovel;
    public static Item tungstenCarbideAxe;
    public static Item tungstenCarbidePickaxe;
    public static Item tungstenCarbideHoe;

    public static Item tungstenCarbideHelm;
    public static Item tungstenCarbideChest;
    public static Item tungstenCarbideLegs;
    public static Item tungstenCarbideBoots;

    public static Block blockTungstenCarbide;

    // Valfram
    public static Item valframIngot;
    public static Item smallValframChunkItem;
    public static Item mediumValframChunkItem;
    public static Item largeValframChunkItem;

    public static Item valframSword;
    public static Item valframShovel;
    public static Item valframAxe;
    public static Item valframPickaxe;
    public static Item valframHoe;

    public static Item valframHelm;
    public static Item valframChest;
    public static Item valframLegs;
    public static Item valframBoots;

    public static Block blockValfram;

    // config
    public static Configuration config;

    //boolean
    public static boolean enableRecycling;
    
    public static boolean enableHigherDimensionGen;


    //Higher Dimensions
    public static int[] dimensionIDsArray;

    // tab
    public static SimpleTab tabAkkamaddiTungsten = new SimpleTab("tabAkkamaddiTungsten");

    /**
     * EnumArmorMaterial. In form ("NAME", max damage (like uses, multiply by pieces for their max damage), new int[] {helmet defense, chestplate defense, leggings defense, boots defense}, enchantability)
     */
    public static EnumArmorMaterial armorTungsten = EnumHelper.addArmorMaterial("TUNGSTEN", 24, new int[] {3, 4, 3, 3}, 8);
    public static EnumArmorMaterial armorTungstenCarbide = EnumHelper.addArmorMaterial("TUNGSTENCARBIDE", 30, new int[] {4, 6, 5, 4}, 12);
    public static EnumArmorMaterial armorValfram = EnumHelper.addArmorMaterial("VALFRAM", 36, new int[] {4, 7, 6, 4}, 20);

    /**
     * Creating the Armor Renderers. This is simply so you can see the armor texture when you wear it.
     */
    public static int rendererTungsten;
    public static int rendererTungstenCarbide;
    public static int rendererValfram;

    // set tool properties
    // EnumToolMaterial. In form ("NAME", mining level, max uses, speed, damage to entity, enchantability)
    public static EnumToolMaterial toolTungsten = EnumHelper.addToolMaterial("TUNGSTEN", 2, 1320, 4.5F, 2, 6);
    public static EnumToolMaterial toolTungstenCarbide = EnumHelper.addToolMaterial("TUNGSTENCARBIDE", 2, 1540, 15.0F, 3, 12);
    public static EnumToolMaterial toolValfram = EnumHelper.addToolMaterial("VALFRAM", 3, 1680, 17.0F, 3, 20);

    // Tab
    public void setTabIcons()
    {
        /**
         * Creating the custom tabs using the API class "SimpleTab" and setting their icon.
         */
        tabAkkamaddiTungsten.setIcon(new ItemStack(SimpleTungstenCore.oreTungsten));
    }

    @EventHandler // used in 1.6.2
    public void preInit(FMLPreInitializationEvent event)
    {
        // Stub Method
    	
    	MinecraftForge.EVENT_BUS.register(new HandlerArmor());

        config = new Configuration(event.getSuggestedConfigurationFile());
        config.load();
        
        // Tungsten
        tungstenIngotID = config.getItem("01. Tungsten Item", "Tungsten Ingot", 12380).getInt();
        
        tungstenSwordID = config.getItem("02. Tungsten Tool", "Tungsten Sword", 12381).getInt();
        tungstenShovelID = config.getItem("02. Tungsten Tool", "Tungsten Shovel", 12382).getInt();
        tungstenAxeID = config.getItem("02. Tungsten Tool", "Tungsten Axe", 12383).getInt();
        tungstenPickaxeID = config.getItem("02. Tungsten Tool", "Tungsten Pickaxe", 12384).getInt();
        tungstenHoeID = config.getItem("02. Tungsten Tool", "Tungsten Hoe", 12385).getInt();
        
        tungstenHelmID = config.getItem("02. Tungsten Armor", "Tungsten Helm", 12386).getInt();
        tungstenChestID = config.getItem("02. Tungsten Armor", "Tungsten Chestplate", 12387).getInt();
        tungstenLegsID = config.getItem("02. Tungsten Armor", "Tungsten Leggings", 12388).getInt();
        tungstenBootsID = config.getItem("02. Tungsten Armor", "Tungsten Boots", 12389).getInt();
        
        blockTungstenID = config.getBlock("03. Tungsten Block", "Tungsten Block", 1332).getInt();
        oreTungstenID = config.getBlock("03. Tungsten Ore", "Tungsten Ore", 1333).getInt();
        
        // Tungsten Carbide
        
        tungstenCarbideIngotID = config.getItem("04. Tungsten Carbide Item", "Tungsten Carbide Ingot", 12390).getInt();
        smallTungstenCarbideChunkItemID = config.getItem("04. Tungsten Carbide Item", "Tungsten Carbide Small Chunk", 12391).getInt();
        mediumTungstenCarbideChunkItemID = config.getItem("04. Tungsten Carbide Item", "Tungsten Carbide Medium Chunk", 12392).getInt();
        largeTungstenCarbideChunkItemID = config.getItem("04. Tungsten Carbide Item", "Tungsten Carbide Large Chunk", 12393).getInt();
        
        tungstenCarbideSwordID = config.getItem("05. Tungsten Carbide Tool", "Tungsten Carbide Sword", 12394).getInt();
        tungstenCarbideShovelID = config.getItem("05. Tungsten Carbide Tool", "Tungsten Carbide Shovel", 12395).getInt();
        tungstenCarbideAxeID = config.getItem("05. Tungsten Carbide Tool", "Tungsten Carbide Axe", 12396).getInt();
        tungstenCarbidePickaxeID = config.getItem("05. Tungsten Carbide Tool", "Tungsten Carbide Pickaxe", 12397).getInt();
        tungstenCarbideHoeID = config.getItem("05. Tungsten Carbide Tool", "Tungsten Carbide Hoe", 12398).getInt();
        
        tungstenCarbideHelmID = config.getItem("05. Tungsten Carbide Armor", "Tungsten Carbide Helm", 12399).getInt();
        tungstenCarbideChestID = config.getItem("05. Tungsten Carbide Armor", "Tungsten Carbide Chestplate", 12400).getInt();
        tungstenCarbideLegsID = config.getItem("05. Tungsten Carbide Armor", "Tungsten Carbide Leggings", 12401).getInt();
        tungstenCarbideBootsID = config.getItem("05. Tungsten Carbide Armor", "Tungsten Carbide Boots", 12402).getInt();
        
        blockTungstenCarbideID = config.getBlock("06. Tungsten Carbide Block", "Tungsten Carbide Block", 1334).getInt();
        
        // Valfram
        
        valframIngotID = config.getItem("07. Valfram Item", "Valfram Ingot", 12403).getInt();
        smallValframChunkItemID = config.getItem("07. Valfram Item", "Valfram Small Chunk", 12404).getInt();
        mediumValframChunkItemID = config.getItem("07. Valfram Item", "Valfram Medium Chunk", 12405).getInt();
        largeValframChunkItemID = config.getItem("07. Valfram Item", "Valfram Large Chunk", 12406).getInt();
        
        valframSwordID = config.getItem("08. Valfram Tool", "Valfram Sword", 12407).getInt();
        valframShovelID = config.getItem("08. Valfram Tool", "Valfram Shovel", 12408).getInt();
        valframAxeID = config.getItem("08. Valfram Tool", "Valfram Axe", 12409).getInt();
        valframPickaxeID = config.getItem("08. Valfram Tool", "Valfram Pickaxe", 12410).getInt();
        valframHoeID = config.getItem("08. Valfram Tool", "Valfram Hoe", 12411).getInt();
        
        valframHelmID = config.getItem("09. Valfram Armor", "Valfram Helm", 12412).getInt();
        valframChestID = config.getItem("09. Valfram Armor", "Valfram Chestplate", 12413).getInt();
        valframLegsID = config.getItem("09. Valfram Armor", "Valfram Leggings", 12414).getInt();
        valframBootsID = config.getItem("09. Valfram Armor", "Valfram Boots", 12415).getInt();
        
        blockValframID = config.getBlock("10. Valfram Block", "Valfram Block", 1335).getInt();
        
        //Adjustable Ore Spawn Rates
        
        tungstenSpawnRate = config.get("11. Tungsten Ore Worldgen", "Tungsten Spawn Rate", 5).getInt();
        tungstenVeinSize = config.get("11. Tungsten Ore Worldgen", "Tungsten Vein Size", 5).getInt();
        tungstenSpawnHeight = config.get("11. Tungsten Ore Worldgen", "Tungsten Maximum Spawn Height", 18).getInt();
        tungstenMinSpawnHeight = config.get("11. Tungsten Ore Worldgen", "Tungsten Minimum Spawn Height", 0).getInt();
        
        // recycle 
    	enableRecycling= config.get("12. Enable Recycling", "Enable Tungsten & alloy recycling recipes: false or true?", false).getBoolean(false);
        
        //higher dimension
        
        enableHigherDimensionGen = config.get("13. Higher World Gen", "Spawn Tungsten in higher dimensions? (Advanced)", false).getBoolean(enableHigherDimensionGen);

        //Higher Dimensions
        
        if (enableHigherDimensionGen)
        {
            dimensionIDsArray = config.get("Higher Dimensions", "Higher Dimensions ID List", new int[] {}).getIntList();
            System.out.println("Number of dimension ID's in the array = " + dimensionIDsArray.length);

            try
            {
                for (int i = 0; i < dimensionIDsArray.length; i++)
                {
                    config.get("Higher Dimension ID: " + dimensionIDsArray[i], "Tungsten Spawn Rate", 6).getInt();
                    config.get("Higher Dimension ID: " + dimensionIDsArray[i], "Tungsten Maximum Spawn Height", 32).getInt();
                    config.get("Higher Dimension ID: " + dimensionIDsArray[i], "Tungsten Minimum Spawn Height", 0).getInt();
                    config.get("Higher Dimension ID: " + dimensionIDsArray[i], "Tungsten Vein Size", 6).getInt();
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

        // define items
        
        // Tungsten
        
        tungstenIngot = new SimpleIngot(tungstenIngotID, "simpletungsten", SimpleTungstenCore.tabAkkamaddiTungsten).setUnlocalizedName("tungstenIngot");

        tungstenSword = new SimpleSword(tungstenSwordID, toolTungsten, "simpletungsten", SimpleTungstenCore.tabAkkamaddiTungsten).setUnlocalizedName("tungstenSword");

        tungstenShovel = new SimpleShovel(tungstenShovelID, toolTungsten, "simpletungsten", SimpleTungstenCore.tabAkkamaddiTungsten).setUnlocalizedName("tungstenShovel");

        tungstenAxe = new SimpleAxe(tungstenAxeID, toolTungsten, "simpletungsten", SimpleTungstenCore.tabAkkamaddiTungsten).setUnlocalizedName("tungstenAxe");

        tungstenPickaxe = new SimplePickaxe(tungstenPickaxeID, toolTungsten, "simpletungsten", SimpleTungstenCore.tabAkkamaddiTungsten).setUnlocalizedName("tungstenPickaxe");

        tungstenHoe = new SimpleHoe(tungstenHoeID, toolTungsten, "simpletungsten", SimpleTungstenCore.tabAkkamaddiTungsten).setUnlocalizedName("tungstenHoe");

        tungstenHelm = new SimpleArmor(tungstenHelmID, armorTungsten, rendererTungsten, 0, "tungsten", "simpletungsten", SimpleTungstenCore.tabAkkamaddiTungsten).setUnlocalizedName("tungstenHelm");

        tungstenChest = new SimpleArmor(tungstenChestID, armorTungsten, rendererTungsten, 1, "tungsten", "simpletungsten", SimpleTungstenCore.tabAkkamaddiTungsten).setUnlocalizedName("tungstenChest");

        tungstenLegs = new SimpleArmor(tungstenLegsID, armorTungsten, rendererTungsten, 2, "tungsten", "simpletungsten", SimpleTungstenCore.tabAkkamaddiTungsten).setUnlocalizedName("tungstenLegs");

        tungstenBoots = new SimpleArmor(tungstenBootsID, armorTungsten, rendererTungsten, 3, "tungsten", "simpletungsten", SimpleTungstenCore.tabAkkamaddiTungsten).setUnlocalizedName("tungstenBoots");

        // Tungsten Carbide
        
        tungstenCarbideIngot = new SimpleIngot(tungstenCarbideIngotID, "simpletungsten", SimpleTungstenCore.tabAkkamaddiTungsten).setUnlocalizedName("tungstenCarbideIngot");

        smallTungstenCarbideChunkItem = new SimpleIngot(smallTungstenCarbideChunkItemID, "simpletungsten", SimpleTungstenCore.tabAkkamaddiTungsten).setUnlocalizedName("smallTungstenCarbideChunkItem");

        mediumTungstenCarbideChunkItem = new SimpleIngot(mediumTungstenCarbideChunkItemID, "simpletungsten", SimpleTungstenCore.tabAkkamaddiTungsten).setUnlocalizedName("mediumTungstenCarbideChunkItem");

        largeTungstenCarbideChunkItem = new SimpleIngot(largeTungstenCarbideChunkItemID, "simpletungsten", SimpleTungstenCore.tabAkkamaddiTungsten).setUnlocalizedName("largeTungstenCarbideChunkItem");

        tungstenCarbideSword = new SimpleSword(tungstenCarbideSwordID, toolTungstenCarbide, "simpletungsten", SimpleTungstenCore.tabAkkamaddiTungsten).setUnlocalizedName("tungstenCarbideSword");

        tungstenCarbideShovel = new SimpleShovel(tungstenCarbideShovelID, toolTungstenCarbide, "simpletungsten", SimpleTungstenCore.tabAkkamaddiTungsten).setUnlocalizedName("tungstenCarbideShovel");

        tungstenCarbideAxe = new SimpleAxe(tungstenCarbideAxeID, toolTungstenCarbide, "simpletungsten", SimpleTungstenCore.tabAkkamaddiTungsten).setUnlocalizedName("tungstenCarbideAxe");

        tungstenCarbidePickaxe = new SimplePickaxe(tungstenCarbidePickaxeID, toolTungstenCarbide, "simpletungsten", SimpleTungstenCore.tabAkkamaddiTungsten).setUnlocalizedName("tungstenCarbidePickaxe");

        tungstenCarbideHoe = new SimpleHoe(tungstenCarbideHoeID, toolTungstenCarbide, "simpletungsten", SimpleTungstenCore.tabAkkamaddiTungsten).setUnlocalizedName("tungstenCarbideHoe");

        tungstenCarbideHelm = new SimpleArmor(tungstenCarbideHelmID, armorTungstenCarbide, rendererTungsten, 0, "tungstencarbide", "simpletungsten", SimpleTungstenCore.tabAkkamaddiTungsten).setUnlocalizedName("tungstenCarbideHelm");

        tungstenCarbideChest = new SimpleArmor(tungstenCarbideChestID, armorTungstenCarbide, rendererTungsten, 1, "tungstencarbide", "simpletungsten", SimpleTungstenCore.tabAkkamaddiTungsten).setUnlocalizedName("tungstenCarbideChest");

        tungstenCarbideLegs = new SimpleArmor(tungstenCarbideLegsID, armorTungstenCarbide, rendererTungsten, 2, "tungstencarbide", "simpletungsten", SimpleTungstenCore.tabAkkamaddiTungsten).setUnlocalizedName("tungstenCarbideLegs");

        tungstenCarbideBoots = new SimpleArmor(tungstenCarbideBootsID, armorTungstenCarbide, rendererTungsten, 3, "tungstencarbide", "simpletungsten", SimpleTungstenCore.tabAkkamaddiTungsten).setUnlocalizedName("tungstenCarbideBoots");

        // Valfram
        
        valframIngot = new SimpleIngot(valframIngotID, "simpletungsten", SimpleTungstenCore.tabAkkamaddiTungsten).setUnlocalizedName("valframIngot");

        smallValframChunkItem = new SimpleIngot(smallValframChunkItemID, "simpletungsten", SimpleTungstenCore.tabAkkamaddiTungsten).setUnlocalizedName("smallValframChunkItem");

        mediumValframChunkItem = new SimpleIngot(mediumValframChunkItemID, "simpletungsten", SimpleTungstenCore.tabAkkamaddiTungsten).setUnlocalizedName("mediumValframChunkItem");

        largeValframChunkItem = new SimpleIngot(largeValframChunkItemID, "simpletungsten", SimpleTungstenCore.tabAkkamaddiTungsten).setUnlocalizedName("largeValframChunkItem");

        valframSword = new SimpleSword(valframSwordID, toolValfram, "simpletungsten", SimpleTungstenCore.tabAkkamaddiTungsten).setUnlocalizedName("valframSword");

        valframShovel = new SimpleShovel(valframShovelID, toolValfram, "simpletungsten", SimpleTungstenCore.tabAkkamaddiTungsten).setUnlocalizedName("valframShovel");

        valframAxe = new SimpleAxe(valframAxeID, toolValfram, "simpletungsten", SimpleTungstenCore.tabAkkamaddiTungsten).setUnlocalizedName("valframAxe");

        valframPickaxe = new SimplePickaxe(valframPickaxeID, toolValfram, "simpletungsten", SimpleTungstenCore.tabAkkamaddiTungsten).setUnlocalizedName("valframPickaxe");

        valframHoe = new SimpleHoe(valframHoeID, toolValfram, "simpletungsten", SimpleTungstenCore.tabAkkamaddiTungsten).setUnlocalizedName("valframHoe");

        valframHelm = new SimpleArmor(valframHelmID, armorValfram, rendererTungsten, 0, "valfram", "simpletungsten", SimpleTungstenCore.tabAkkamaddiTungsten).setUnlocalizedName("valframHelm");

        valframChest = new SimpleArmor(valframChestID, armorValfram, rendererTungsten, 1, "valfram", "simpletungsten", SimpleTungstenCore.tabAkkamaddiTungsten).setUnlocalizedName("valframChest");

        valframLegs = new SimpleArmor(valframLegsID, armorValfram, rendererTungsten, 2, "valfram", "simpletungsten", SimpleTungstenCore.tabAkkamaddiTungsten).setUnlocalizedName("valframLegs");

        valframBoots = new SimpleArmor(valframBootsID, armorValfram, rendererTungsten, 3, "valfram", "simpletungsten", SimpleTungstenCore.tabAkkamaddiTungsten).setUnlocalizedName("valframBoots");

        // define blocks
        
        blockTungsten = new SimpleOre(blockTungstenID, Material.iron, "simpletungsten", SimpleTungstenCore.tabAkkamaddiTungsten)
        .setHardness(10.0F).setResistance(22.0F).setStepSound(Block.soundMetalFootstep)
        .setUnlocalizedName("blockTungsten");

        oreTungsten = new SimpleOre(oreTungstenID, Material.iron, "simpletungsten", SimpleTungstenCore.tabAkkamaddiTungsten)
        .setHardness(4.0F).setResistance(10.0F).setStepSound(Block.soundMetalFootstep)
        .setUnlocalizedName("oreTungsten");

        blockTungstenCarbide = new SimpleOre(blockTungstenCarbideID, Material.iron, "simpletungsten", SimpleTungstenCore.tabAkkamaddiTungsten)
        .setHardness(10.0F).setResistance(22.0F).setStepSound(Block.soundMetalFootstep)
        .setUnlocalizedName("blockTungstenCarbide");

        blockValfram = new SimpleOre(blockValframID, Material.iron, "simpletungsten", SimpleTungstenCore.tabAkkamaddiTungsten)
        .setHardness(10.0F).setResistance(22.0F).setStepSound(Block.soundMetalFootstep)
        .setUnlocalizedName("blockValfram");
        
        // Game Registries
        
        GameRegistry.registerItem(tungstenIngot, "tungstenIngot");
        GameRegistry.registerItem(tungstenSword, "tungstenSword");
        GameRegistry.registerItem(tungstenShovel, "tungstenShovel");
        GameRegistry.registerItem(tungstenAxe, "tungstenAxe");
        GameRegistry.registerItem(tungstenPickaxe, "tungstenPickaxe");
        GameRegistry.registerItem(tungstenHoe, "tungstenHoe");
        GameRegistry.registerItem(tungstenHelm, "tungstenHelm");
        GameRegistry.registerItem(tungstenChest, "tungstenChest");
        GameRegistry.registerItem(tungstenLegs, "tungstenLegs");
        GameRegistry.registerItem(tungstenBoots, "tungstenBoots");

        GameRegistry.registerItem(tungstenCarbideIngot, "tungstenCarbideIngot");
        GameRegistry.registerItem(smallTungstenCarbideChunkItem, "smallTungstenCarbideChunkItem");
        GameRegistry.registerItem(mediumTungstenCarbideChunkItem, "mediumTungstenCarbideChunkItem");
        GameRegistry.registerItem(largeTungstenCarbideChunkItem, "largeTungstenCarbideChunkItem");
        GameRegistry.registerItem(tungstenCarbideSword, "tungstenCarbideSword");
        GameRegistry.registerItem(tungstenCarbideShovel, "tungstenCarbideShovel");
        GameRegistry.registerItem(tungstenCarbideAxe, "tungstenCarbideAxe");
        GameRegistry.registerItem(tungstenCarbidePickaxe, "tungstenCarbidePickaxe");
        GameRegistry.registerItem(tungstenCarbideHoe, "tungstenCarbideHoe");
        GameRegistry.registerItem(tungstenCarbideHelm, "tungstenCarbideHelm");
        GameRegistry.registerItem(tungstenCarbideChest, "tungstenCarbideChest");
        GameRegistry.registerItem(tungstenCarbideLegs, "tungstenCarbideLegs");
        GameRegistry.registerItem(tungstenCarbideBoots, "tungstenCarbideBoots");

        GameRegistry.registerItem(valframIngot, "valframIngot");
        GameRegistry.registerItem(smallValframChunkItem, "smallValframChunkItem");
        GameRegistry.registerItem(mediumValframChunkItem, "mediumValframChunkItem");
        GameRegistry.registerItem(largeValframChunkItem, "largeValframChunkItem");
        GameRegistry.registerItem(valframSword, "valframSword");
        GameRegistry.registerItem(valframShovel, "valframShovel");
        GameRegistry.registerItem(valframAxe, "valframAxe");
        GameRegistry.registerItem(valframPickaxe, "valframPickaxe");
        GameRegistry.registerItem(valframHoe, "valframHoe");
        GameRegistry.registerItem(valframHelm, "valframHelm");
        GameRegistry.registerItem(valframChest, "valframChest");
        GameRegistry.registerItem(valframLegs, "valframLegs");
        GameRegistry.registerItem(valframBoots, "valframBoots");
        
        GameRegistry.registerBlock(blockTungsten, "blockTungsten");
        GameRegistry.registerBlock(oreTungsten, "oreTungsten");
        GameRegistry.registerBlock(blockTungstenCarbide, "blockTungstenCarbide");
        GameRegistry.registerBlock(blockValfram, "blockValfram");
		

        // loot
        
        HandlerLoot.lootHandler().addLoot("villageBlacksmith", tungstenIngot, 1, 2, 2);
        HandlerLoot.lootHandler().addLoot("villageBlacksmith", tungstenSword, 1, 1, 1);
        HandlerLoot.lootHandler().addLoot("villageBlacksmith", tungstenPickaxe, 1, 1, 1);
        HandlerLoot.lootHandler().addLoot("villageBlacksmith", tungstenAxe, 1, 1, 1);
        HandlerLoot.lootHandler().addLoot("villageBlacksmith", tungstenShovel, 1, 1, 1);
        HandlerLoot.lootHandler().addLoot("villageBlacksmith", tungstenCarbideIngot, 1, 2, 4);
        HandlerLoot.lootHandler().addLoot("villageBlacksmith", tungstenCarbideSword, 1, 1, 1);
        HandlerLoot.lootHandler().addLoot("villageBlacksmith", tungstenCarbidePickaxe, 1, 1, 1);
        HandlerLoot.lootHandler().addLoot("villageBlacksmith", valframIngot, 1, 1, 2);
        HandlerLoot.lootHandler().addLoot("villageBlacksmith", valframSword, 1, 1, 1);
        HandlerLoot.lootHandler().addLoot("villageBlacksmith", valframPickaxe, 1, 1, 1);

        HandlerLoot.lootHandler().addLoot("dungeonChest", tungstenIngot, 1, 1, 1);
        HandlerLoot.lootHandler().addLoot("dungeonChest", tungstenPickaxe, 1, 3, 1);
        HandlerLoot.lootHandler().addLoot("dungeonChest", tungstenSword, 1, 7, 1);
        HandlerLoot.lootHandler().addLoot("dungeonChest", tungstenCarbideSword, 1, 1, 1);
        HandlerLoot.lootHandler().addLoot("dungeonChest", tungstenCarbidePickaxe, 1, 1, 1);
        HandlerLoot.lootHandler().addLoot("dungeonChest", valframSword, 1, 1, 1);

        HandlerLoot.lootHandler().addLoot("mineshaftCorridor", tungstenIngot, 1, 1, 1);
        HandlerLoot.lootHandler().addLoot("mineshaftCorridor", tungstenPickaxe, 1, 4, 1);
        HandlerLoot.lootHandler().addLoot("mineshaftCorridor", tungstenShovel, 1, 3, 1);
        HandlerLoot.lootHandler().addLoot("mineshaftCorridor", tungstenCarbideIngot, 1, 1, 1);
        HandlerLoot.lootHandler().addLoot("mineshaftCorridor", tungstenCarbidePickaxe, 1, 2, 1);
        HandlerLoot.lootHandler().addLoot("mineshaftCorridor", tungstenCarbideShovel, 1, 2, 1);
        HandlerLoot.lootHandler().addLoot("mineshaftCorridor", valframPickaxe, 1, 1, 1);
        
        HandlerLoot.lootHandler().addLoot("pyramidDesertyChest", valframSword, 1, 4, 1);
        HandlerLoot.lootHandler().addLoot("pyramidDesertyChest", valframHelm, 1, 3, 1);
        HandlerLoot.lootHandler().addLoot("pyramidDesertyChest", valframChest, 1, 3, 1);
        HandlerLoot.lootHandler().addLoot("pyramidDesertyChest", valframLegs, 1, 3, 1);
        HandlerLoot.lootHandler().addLoot("pyramidDesertyChest", valframBoots, 1, 3, 1);
        HandlerLoot.lootHandler().addLoot("pyramidDesertyChest", valframPickaxe, 1, 3, 1);
        HandlerLoot.lootHandler().addLoot("pyramidDesertyChest", valframShovel, 1, 5, 1);
        HandlerLoot.lootHandler().addLoot("pyramidDesertyChest", valframIngot, 3, 5, 3);
        HandlerLoot.lootHandler().addLoot("pyramidDesertyChest", tungstenIngot, 3, 7, 5);

        HandlerLoot.lootHandler().addLoot("pyramidJungleChest", tungstenCarbideSword, 1, 4, 1);
        HandlerLoot.lootHandler().addLoot("pyramidJungleChest", tungstenCarbideHelm, 1, 3, 1);
        HandlerLoot.lootHandler().addLoot("pyramidJungleChest", tungstenCarbideChest, 1, 3, 1);
        HandlerLoot.lootHandler().addLoot("pyramidJungleChest", tungstenCarbideLegs, 1, 3, 1);
        HandlerLoot.lootHandler().addLoot("pyramidJungleChest", tungstenCarbideBoots, 1, 3, 1);
        HandlerLoot.lootHandler().addLoot("pyramidJungleChest", tungstenCarbidePickaxe, 1, 3, 1);
        HandlerLoot.lootHandler().addLoot("pyramidJungleChest", tungstenCarbideShovel, 1, 5, 1);
        HandlerLoot.lootHandler().addLoot("pyramidJungleChest", tungstenCarbideIngot, 3, 5, 3);

        //recipes
        TungstenRecipes.doTungstenRecipes();
        
        // run tab icon call
        setTabIcons();
    }

    @EventHandler // used in 1.6.2
    public void load(FMLInitializationEvent event)
    {
        
    	proxy.registerRenderers();
        
    	GameRegistry.registerWorldGenerator(new SimpleTungstenGenerator());
        
    	MinecraftForge.EVENT_BUS.register(new HandlerJoinWorld());
        
    	
    	//Armor Renderers
        rendererTungsten = proxy.addArmor("tungsten");
        rendererTungstenCarbide = proxy.addArmor("tungstencarbide");
        rendererValfram = proxy.addArmor("valfram");
        
        // name stuff
        
        // name Tungsten
        
        LanguageRegistry.addName(tungstenIngot, "Tungsten Ingot");
        LanguageRegistry.addName(tungstenSword, "Tungsten Sword");
        LanguageRegistry.addName(tungstenShovel, "Tungsten Shovel");
        LanguageRegistry.addName(tungstenAxe, "Tungsten Axe");
        LanguageRegistry.addName(tungstenPickaxe, "Tungsten Pickaxe");
        LanguageRegistry.addName(tungstenHoe, "Tungsten Hoe");
        LanguageRegistry.addName(tungstenHelm, "Tungsten Helm");
        LanguageRegistry.addName(tungstenChest, "Tungsten Chestplate");
        LanguageRegistry.addName(tungstenLegs, "Tungsten Leggings");
        LanguageRegistry.addName(tungstenBoots, "Tungsten Boots");
        
        // name Tungsten Carbide
        
        LanguageRegistry.addName(tungstenCarbideIngot, "Tungsten Carbide Ingot");
        LanguageRegistry.addName(smallTungstenCarbideChunkItem, "Small Tungsten Carbide Chunk");
        LanguageRegistry.addName(mediumTungstenCarbideChunkItem, "Medium Tungsten Carbide Chunk");
        LanguageRegistry.addName(largeTungstenCarbideChunkItem, "Large Tungsten Carbide Chunk");
        LanguageRegistry.addName(tungstenCarbideSword, "Tungsten Carbide Sword");
        LanguageRegistry.addName(tungstenCarbideShovel, "Tungsten Carbide Shovel");
        LanguageRegistry.addName(tungstenCarbideAxe, "Tungsten Carbide Axe");
        LanguageRegistry.addName(tungstenCarbidePickaxe, "Tungsten Carbide Pickaxe");
        LanguageRegistry.addName(tungstenCarbideHoe, "Tungsten Carbide Hoe");
        LanguageRegistry.addName(tungstenCarbideHelm, "Tungsten Carbide Helm");
        LanguageRegistry.addName(tungstenCarbideChest, "Tungsten Carbide Chestplate");
        LanguageRegistry.addName(tungstenCarbideLegs, "Tungsten Carbide Leggings");
        LanguageRegistry.addName(tungstenCarbideBoots, "Tungsten Carbide Boots");
        
        // name Valfram
        
        LanguageRegistry.addName(valframIngot, "Valfram Ingot");
        LanguageRegistry.addName(smallValframChunkItem, "Small Valfram Chunk");
        LanguageRegistry.addName(mediumValframChunkItem, "Medium Valfram Chunk");
        LanguageRegistry.addName(largeValframChunkItem, "Large Valfram Chunk");
        LanguageRegistry.addName(valframSword, "Valfram Sword");
        LanguageRegistry.addName(valframShovel, "Valfram Shovel");
        LanguageRegistry.addName(valframAxe, "Valfram Axe");
        LanguageRegistry.addName(valframPickaxe, "Valfram Pickaxe");
        LanguageRegistry.addName(valframHoe, "Valfram Hoe");
        LanguageRegistry.addName(valframHelm, "Valfram Helm");
        LanguageRegistry.addName(valframChest, "Valfram Chestplate");
        LanguageRegistry.addName(valframLegs, "Valfram Leggings");
        LanguageRegistry.addName(valframBoots, "Valfram Boots");
        
        //blocks
        
        LanguageRegistry.addName(blockTungsten, "Tungsten Block");
        MinecraftForge.setBlockHarvestLevel(blockTungsten, "pickaxe", 0);
        
        LanguageRegistry.addName(oreTungsten, "Tungsten Ore");
        MinecraftForge.setBlockHarvestLevel(oreTungsten, "pickaxe", 2);

        LanguageRegistry.addName(blockTungstenCarbide, "Tungsten Carbide Block");
        MinecraftForge.setBlockHarvestLevel(blockTungstenCarbide, "pickaxe", 0);
        
        LanguageRegistry.addName(blockValfram, "Valfram Block");
        MinecraftForge.setBlockHarvestLevel(blockValfram, "pickaxe", 0);
        
        //tools registry
        
        MinecraftForge.setToolClass(tungstenPickaxe, "pickaxe", 2);
        MinecraftForge.setToolClass(tungstenShovel, "shovel", 2);
        MinecraftForge.setToolClass(tungstenAxe, "axe", 2);
        
        MinecraftForge.setToolClass(tungstenCarbidePickaxe, "pickaxe", 2);
        MinecraftForge.setToolClass(tungstenCarbideShovel, "shovel", 2);
        MinecraftForge.setToolClass(tungstenCarbideAxe, "axe", 2);
        
        MinecraftForge.setToolClass(valframPickaxe, "pickaxe", 3);
        MinecraftForge.setToolClass(valframShovel, "shovel", 3);
        MinecraftForge.setToolClass(valframAxe, "axe", 3);
        
        LanguageRegistry.instance().addStringLocalization("itemGroup.tabAkkamaddiTungsten", "en_US", "akkamaddi's Simple Tungsten");
        
        
        armorTungsten.customCraftingMaterial = SimpleTungstenCore.tungstenIngot;
        armorTungstenCarbide.customCraftingMaterial = SimpleTungstenCore.tungstenCarbideIngot;
        armorValfram.customCraftingMaterial = SimpleTungstenCore.valframIngot;
        
        
        toolTungsten.customCraftingMaterial = SimpleTungstenCore.tungstenIngot;
        toolTungstenCarbide.customCraftingMaterial = SimpleTungstenCore.tungstenCarbideIngot;
        toolValfram.customCraftingMaterial = SimpleTungstenCore.valframIngot;
        
        
    }

    @EventHandler // used in 1.6.2
    public void postInit(FMLPostInitializationEvent event)
    {
        // Stub Method
    }
}

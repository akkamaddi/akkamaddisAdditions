package akkamaddi.simpletungsten.code;

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
import alexndr.SimpleOres.api.helpers.LootHelper;;

@Mod(modid = "simpletungsten", name = "Simple Tungsten, and Tungsten alloys", version = "1.2.0", dependencies = "required-after:simpleores ; required-after:simpleoresfusion")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)

public class SimpleTungstenCore
{
    // The instance of your mod that Forge uses.
    @Instance("simpletungsten")
    public static SimpleTungstenCore instance;

    // Says where the client and server 'proxy' code is loaded.
    @SidedProxy(clientSide = "akkamaddi.simpletungsten.code.ClientProxy", serverSide = "akkamaddi.simpletungsten.code.CommonProxy")
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

    //Tungsten Steel
    public static int tungstenSteelIngotID;
    public static int largeTungstenSteelChunkItemID;

    public static int tungstenSteelSwordID;
    public static int tungstenSteelShovelID;
    public static int tungstenSteelAxeID;
    public static int tungstenSteelPickaxeID;
    public static int tungstenSteelHoeID;

    public static int tungstenSteelHelmID;
    public static int tungstenSteelChestID;
    public static int tungstenSteelLegsID;
    public static int tungstenSteelBootsID;

    public static int blockTungstenSteelID;

    // Prasinos
    public static int prasinosIngotID;
    public static int smallPrasinosChunkItemID;
    public static int mediumPrasinosChunkItemID;
    public static int largePrasinosChunkItemID;

    public static int prasinosSwordID;
    public static int prasinosShovelID;
    public static int prasinosAxeID;
    public static int prasinosPickaxeID;
    public static int prasinosHoeID;

    public static int prasinosHelmID;
    public static int prasinosChestID;
    public static int prasinosLegsID;
    public static int prasinosBootsID;

    public static int blockPrasinosID;

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

    // Tungsten Steel
    public static Item tungstenSteelIngot;
    public static Item largeTungstenSteelChunkItem;

    public static Item tungstenSteelSword;
    public static Item tungstenSteelShovel;
    public static Item tungstenSteelAxe;
    public static Item tungstenSteelPickaxe;
    public static Item tungstenSteelHoe;

    public static Item tungstenSteelHelm;
    public static Item tungstenSteelChest;
    public static Item tungstenSteelLegs;
    public static Item tungstenSteelBoots;

    public static Block blockTungstenSteel;

    // Prasinos
    public static Item prasinosIngot;
    public static Item smallPrasinosChunkItem;
    public static Item mediumPrasinosChunkItem;
    public static Item largePrasinosChunkItem;

    public static Item prasinosSword;
    public static Item prasinosShovel;
    public static Item prasinosAxe;
    public static Item prasinosPickaxe;
    public static Item prasinosHoe;

    public static Item prasinosHelm;
    public static Item prasinosChest;
    public static Item prasinosLegs;
    public static Item prasinosBoots;

    public static Block blockPrasinos;

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
    public static EnumArmorMaterial armorTungstenCarbide = EnumHelper.addArmorMaterial("TUNGSTENCARBIDE", 26, new int[] {4, 6, 5, 4}, 12);
    public static EnumArmorMaterial armorValfram = EnumHelper.addArmorMaterial("VALFRAM", 28, new int[] {4, 7, 6, 4}, 20);
    public static EnumArmorMaterial armorTungstenSteel = EnumHelper.addArmorMaterial("TUNGSTENSTEEL", 30, new int[] {4, 7, 6, 4}, 7);
    public static EnumArmorMaterial armorPrasinos = EnumHelper.addArmorMaterial("PRASINOS", 45, new int[] {5, 9, 7, 5}, 11);
	
    /**
     * Creating the Armor Renderers. This is simply so you can see the armor texture when you wear it.
     */
    public static int rendererTungsten;
    public static int rendererTungstenCarbide;
    public static int rendererValfram;
    public static int rendererTungstenSteel;
    public static int rendererPrasinos;

    // set tool properties
    // EnumToolMaterial. In form ("NAME", mining level, max uses, speed, damage to entity, enchantability)
    public static EnumToolMaterial toolTungsten = EnumHelper.addToolMaterial("TUNGSTEN", 2, 1320, 4.5F, 2, 6);
    public static EnumToolMaterial toolTungstenCarbide = EnumHelper.addToolMaterial("TUNGSTENCARBIDE", 2, 1360, 15.0F, 3, 12);
    public static EnumToolMaterial toolValfram = EnumHelper.addToolMaterial("VALFRAM", 3, 1420, 17.0F, 3, 20);
    public static EnumToolMaterial toolTungstenSteel = EnumHelper.addToolMaterial("TUNGSTENSTEEL", 2, 1680, 10.0F, 3, 7);
    public static EnumToolMaterial toolPrasinos = EnumHelper.addToolMaterial("PRASINOS", 4, 2640, 13.0F, 5, 9);

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

        // Tungsten Steel
        
        tungstenSteelIngotID = config.getItem("14. Tungsten Steel Item", "Tungsten Steel Ingot", 12416).getInt();
        largeTungstenSteelChunkItemID = config.getItem("14. Tungsten Steel Item", "Tungsten Steel Large Chunk", 12417).getInt();
        
        tungstenSteelSwordID = config.getItem("15. Tungsten Steel Tool", "Tungsten Steel Sword", 12418).getInt();
        tungstenSteelShovelID = config.getItem("15. Tungsten Steel Tool", "Tungsten Steel Shovel", 12419).getInt();
        tungstenSteelAxeID = config.getItem("15. Tungsten Steel Tool", "Tungsten Steel Axe", 12420).getInt();
        tungstenSteelPickaxeID = config.getItem("15. Tungsten Steel Tool", "Tungsten Steel Pickaxe", 12421).getInt();
        tungstenSteelHoeID = config.getItem("15. Tungsten Steel Tool", "Tungsten Steel Hoe", 12422).getInt();
        
        tungstenSteelHelmID = config.getItem("15. Tungsten Steel Armor", "Tungsten Steel Helm", 12423).getInt();
        tungstenSteelChestID = config.getItem("15. Tungsten Steel Armor", "Tungsten Steel Chestplate", 12424).getInt();
        tungstenSteelLegsID = config.getItem("15. Tungsten Steel Armor", "Tungsten Steel Leggings", 12425).getInt();
        tungstenSteelBootsID = config.getItem("15. Tungsten Steel Armor", "Tungsten Steel Boots", 12426).getInt();
        
        blockTungstenSteelID = config.getBlock("16. Tungsten Steel Block", "Tungsten Steel Block", 1336).getInt();
        
        // Prasinos
        
        prasinosIngotID = config.getItem("17. Prasinos Item", "Prasinos Ingot", 12427).getInt();
        smallPrasinosChunkItemID = config.getItem("17. Prasinos Item", "Prasinos Small Chunk", 12428).getInt();
        mediumPrasinosChunkItemID = config.getItem("17. Prasinos Item", "Prasinos Medium Chunk", 12429).getInt();
        largePrasinosChunkItemID = config.getItem("17. Prasinos Item", "Prasinos Large Chunk", 12430).getInt();
        
        prasinosSwordID = config.getItem("18. Prasinos Tool", "Prasinos Sword", 12431).getInt();
        prasinosShovelID = config.getItem("18. Prasinos Tool", "Prasinos Shovel", 12432).getInt();
        prasinosAxeID = config.getItem("18. Prasinos Tool", "Prasinos Axe", 12433).getInt();
        prasinosPickaxeID = config.getItem("18. Prasinos Tool", "Prasinos Pickaxe", 12434).getInt();
        prasinosHoeID = config.getItem("18. Prasinos Tool", "Prasinos Hoe", 12435).getInt();
        
        prasinosHelmID = config.getItem("18. Prasinos Armor", "Prasinos Helm", 12436).getInt();
        prasinosChestID = config.getItem("18. Prasinos Armor", "Prasinos Chestplate", 12437).getInt();
        prasinosLegsID = config.getItem("18. Prasinos Armor", "Prasinos Leggings", 12438).getInt();
        prasinosBootsID = config.getItem("18. Prasinos Armor", "Prasinos Boots", 12439).getInt();
        
        blockPrasinosID = config.getBlock("19. Prasinos Block", "Prasinos Block", 1337).getInt();
        
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
        
        tungstenIngot = new SimpleIngot(tungstenIngotID).modId("simpletungsten").setCreativeTab(SimpleTungstenCore.tabAkkamaddiTungsten).setUnlocalizedName("tungstenIngot");

        tungstenSword = new SimpleSword(tungstenSwordID, toolTungsten).modId("simpletungsten").setCreativeTab(SimpleTungstenCore.tabAkkamaddiTungsten).setUnlocalizedName("tungstenSword");

        tungstenShovel = new SimpleShovel(tungstenShovelID, toolTungsten).modId("simpletungsten").setCreativeTab(SimpleTungstenCore.tabAkkamaddiTungsten).setUnlocalizedName("tungstenShovel");

        tungstenAxe = new SimpleAxe(tungstenAxeID, toolTungsten).modId("simpletungsten").setCreativeTab(SimpleTungstenCore.tabAkkamaddiTungsten).setUnlocalizedName("tungstenAxe");

        tungstenPickaxe = new SimplePickaxe(tungstenPickaxeID, toolTungsten).modId("simpletungsten").setCreativeTab(SimpleTungstenCore.tabAkkamaddiTungsten).setUnlocalizedName("tungstenPickaxe");

        tungstenHoe = new SimpleHoe(tungstenHoeID, toolTungsten).modId("simpletungsten").setCreativeTab(SimpleTungstenCore.tabAkkamaddiTungsten).setUnlocalizedName("tungstenHoe");

        tungstenHelm = new SimpleArmor(tungstenHelmID, armorTungsten, rendererTungsten, 0).modId("simpletungsten").setType("tungsten").setCreativeTab(SimpleTungstenCore.tabAkkamaddiTungsten).setUnlocalizedName("tungstenHelm");

        tungstenChest = new SimpleArmor(tungstenChestID, armorTungsten, rendererTungsten, 1).modId("simpletungsten").setType("tungsten").setCreativeTab(SimpleTungstenCore.tabAkkamaddiTungsten).setUnlocalizedName("tungstenChest");

        tungstenLegs = new SimpleArmor(tungstenLegsID, armorTungsten, rendererTungsten, 2).modId("simpletungsten").setType("tungsten").setCreativeTab(SimpleTungstenCore.tabAkkamaddiTungsten).setUnlocalizedName("tungstenLegs");

        tungstenBoots = new SimpleArmor(tungstenBootsID, armorTungsten, rendererTungsten, 3).modId("simpletungsten").setType("tungsten").setCreativeTab(SimpleTungstenCore.tabAkkamaddiTungsten).setUnlocalizedName("tungstenBoots");

        // Tungsten Carbide
        
        tungstenCarbideIngot = new SimpleIngot(tungstenCarbideIngotID).modId("simpletungsten").setCreativeTab(SimpleTungstenCore.tabAkkamaddiTungsten).setUnlocalizedName("tungstenCarbideIngot");

        smallTungstenCarbideChunkItem = new SimpleIngot(smallTungstenCarbideChunkItemID).modId("simpletungsten").setCreativeTab(SimpleTungstenCore.tabAkkamaddiTungsten).setUnlocalizedName("smallTungstenCarbideChunkItem");

        mediumTungstenCarbideChunkItem = new SimpleIngot(mediumTungstenCarbideChunkItemID).modId("simpletungsten").setCreativeTab(SimpleTungstenCore.tabAkkamaddiTungsten).setUnlocalizedName("mediumTungstenCarbideChunkItem");

        largeTungstenCarbideChunkItem = new SimpleIngot(largeTungstenCarbideChunkItemID).modId("simpletungsten").setCreativeTab(SimpleTungstenCore.tabAkkamaddiTungsten).setUnlocalizedName("largeTungstenCarbideChunkItem");

        tungstenCarbideSword = new SimpleSword(tungstenCarbideSwordID, toolTungstenCarbide).modId("simpletungsten").setCreativeTab(SimpleTungstenCore.tabAkkamaddiTungsten).setUnlocalizedName("tungstenCarbideSword");

        tungstenCarbideShovel = new SimpleShovel(tungstenCarbideShovelID, toolTungstenCarbide).modId("simpletungsten").setCreativeTab(SimpleTungstenCore.tabAkkamaddiTungsten).setUnlocalizedName("tungstenCarbideShovel");

        tungstenCarbideAxe = new SimpleAxe(tungstenCarbideAxeID, toolTungstenCarbide).modId("simpletungsten").setCreativeTab(SimpleTungstenCore.tabAkkamaddiTungsten).setUnlocalizedName("tungstenCarbideAxe");

        tungstenCarbidePickaxe = new SimplePickaxe(tungstenCarbidePickaxeID, toolTungstenCarbide).modId("simpletungsten").setCreativeTab(SimpleTungstenCore.tabAkkamaddiTungsten).setUnlocalizedName("tungstenCarbidePickaxe");

        tungstenCarbideHoe = new SimpleHoe(tungstenCarbideHoeID, toolTungstenCarbide).modId("simpletungsten").setCreativeTab(SimpleTungstenCore.tabAkkamaddiTungsten).setUnlocalizedName("tungstenCarbideHoe");

        tungstenCarbideHelm = new SimpleArmor(tungstenCarbideHelmID, armorTungstenCarbide, rendererTungsten, 0).modId("simpletungsten").setType("tungstencarbide").setCreativeTab(SimpleTungstenCore.tabAkkamaddiTungsten).setUnlocalizedName("tungstenCarbideHelm");

        tungstenCarbideChest = new SimpleArmor(tungstenCarbideChestID, armorTungstenCarbide, rendererTungsten, 1).modId("simpletungsten").setType("tungstencarbide").setCreativeTab(SimpleTungstenCore.tabAkkamaddiTungsten).setUnlocalizedName("tungstenCarbideChest");

        tungstenCarbideLegs = new SimpleArmor(tungstenCarbideLegsID, armorTungstenCarbide, rendererTungsten, 2).modId("simpletungsten").setType("tungstencarbide").setCreativeTab(SimpleTungstenCore.tabAkkamaddiTungsten).setUnlocalizedName("tungstenCarbideLegs");

        tungstenCarbideBoots = new SimpleArmor(tungstenCarbideBootsID, armorTungstenCarbide, rendererTungsten, 3).modId("simpletungsten").setType("tungstencarbide").setCreativeTab(SimpleTungstenCore.tabAkkamaddiTungsten).setUnlocalizedName("tungstenCarbideBoots");

        // Valfram
        
        valframIngot = new SimpleIngot(valframIngotID).modId("simpletungsten").setCreativeTab(SimpleTungstenCore.tabAkkamaddiTungsten).setUnlocalizedName("valframIngot");

        smallValframChunkItem = new SimpleIngot(smallValframChunkItemID).modId("simpletungsten").setCreativeTab(SimpleTungstenCore.tabAkkamaddiTungsten).setUnlocalizedName("smallValframChunkItem");

        mediumValframChunkItem = new SimpleIngot(mediumValframChunkItemID).modId("simpletungsten").setCreativeTab(SimpleTungstenCore.tabAkkamaddiTungsten).setUnlocalizedName("mediumValframChunkItem");

        largeValframChunkItem = new SimpleIngot(largeValframChunkItemID).modId("simpletungsten").setCreativeTab(SimpleTungstenCore.tabAkkamaddiTungsten).setUnlocalizedName("largeValframChunkItem");

        valframSword = new SimpleSword(valframSwordID, toolValfram).modId("simpletungsten").setCreativeTab(SimpleTungstenCore.tabAkkamaddiTungsten).setUnlocalizedName("valframSword");

        valframShovel = new SimpleShovel(valframShovelID, toolValfram).modId("simpletungsten").setCreativeTab(SimpleTungstenCore.tabAkkamaddiTungsten).setUnlocalizedName("valframShovel");

        valframAxe = new SimpleAxe(valframAxeID, toolValfram).modId("simpletungsten").setCreativeTab(SimpleTungstenCore.tabAkkamaddiTungsten).setUnlocalizedName("valframAxe");

        valframPickaxe = new SimplePickaxe(valframPickaxeID, toolValfram).modId("simpletungsten").setCreativeTab(SimpleTungstenCore.tabAkkamaddiTungsten).setUnlocalizedName("valframPickaxe");

        valframHoe = new SimpleHoe(valframHoeID, toolValfram).modId("simpletungsten").setCreativeTab(SimpleTungstenCore.tabAkkamaddiTungsten).setUnlocalizedName("valframHoe");

        valframHelm = new SimpleArmor(valframHelmID, armorValfram, rendererValfram, 0).modId("simpletungsten").setType("valfram").setCreativeTab(SimpleTungstenCore.tabAkkamaddiTungsten).setUnlocalizedName("valframHelm");

        valframChest = new SimpleArmor(valframChestID, armorValfram, rendererValfram, 1).modId("simpletungsten").setType("valfram").setCreativeTab(SimpleTungstenCore.tabAkkamaddiTungsten).setUnlocalizedName("valframChest");

        valframLegs = new SimpleArmor(valframLegsID, armorValfram, rendererValfram, 2).modId("simpletungsten").setType("valfram").setCreativeTab(SimpleTungstenCore.tabAkkamaddiTungsten).setUnlocalizedName("valframLegs");

        valframBoots = new SimpleArmor(valframBootsID, armorValfram, rendererValfram, 3).modId("simpletungsten").setType("valfram").setCreativeTab(SimpleTungstenCore.tabAkkamaddiTungsten).setUnlocalizedName("valframBoots");

        // Tungsten Steel
        
        tungstenSteelIngot = new SimpleIngot(tungstenSteelIngotID).modId("simpletungsten").setCreativeTab(SimpleTungstenCore.tabAkkamaddiTungsten).setUnlocalizedName("tungstenSteelIngot");

        largeTungstenSteelChunkItem = new SimpleIngot(largeTungstenSteelChunkItemID).modId("simpletungsten").setCreativeTab(SimpleTungstenCore.tabAkkamaddiTungsten).setUnlocalizedName("largeTungstenSteelChunkItem");

        tungstenSteelSword = new SimpleSword(tungstenSteelSwordID, toolTungstenSteel).modId("simpletungsten").setCreativeTab(SimpleTungstenCore.tabAkkamaddiTungsten).setUnlocalizedName("tungstenSteelSword");

        tungstenSteelShovel = new SimpleShovel(tungstenSteelShovelID, toolTungstenSteel).modId("simpletungsten").setCreativeTab(SimpleTungstenCore.tabAkkamaddiTungsten).setUnlocalizedName("tungstenSteelShovel");

        tungstenSteelAxe = new SimpleAxe(tungstenSteelAxeID, toolTungstenSteel).modId("simpletungsten").setCreativeTab(SimpleTungstenCore.tabAkkamaddiTungsten).setUnlocalizedName("tungstenSteelAxe");

        tungstenSteelPickaxe = new SimplePickaxe(tungstenSteelPickaxeID, toolTungstenSteel).modId("simpletungsten").setCreativeTab(SimpleTungstenCore.tabAkkamaddiTungsten).setUnlocalizedName("tungstenSteelPickaxe");

        tungstenSteelHoe = new SimpleHoe(tungstenSteelHoeID, toolTungstenSteel).modId("simpletungsten").setCreativeTab(SimpleTungstenCore.tabAkkamaddiTungsten).setUnlocalizedName("tungstenSteelHoe");

        tungstenSteelHelm = new SimpleArmor(tungstenSteelHelmID, armorTungstenSteel, rendererTungstenSteel, 0).modId("simpletungsten").setType("tungstensteel").setCreativeTab(SimpleTungstenCore.tabAkkamaddiTungsten).setUnlocalizedName("tungstenSteelHelm");

        tungstenSteelChest = new SimpleArmor(tungstenSteelChestID, armorTungstenSteel, rendererTungstenSteel, 1).modId("simpletungsten").setType("tungstensteel").setCreativeTab(SimpleTungstenCore.tabAkkamaddiTungsten).setUnlocalizedName("tungstenSteelChest");

        tungstenSteelLegs = new SimpleArmor(tungstenSteelLegsID, armorTungstenSteel, rendererTungstenSteel, 2).modId("simpletungsten").setType("tungstensteel").setCreativeTab(SimpleTungstenCore.tabAkkamaddiTungsten).setUnlocalizedName("tungstenSteelLegs");

        tungstenSteelBoots = new SimpleArmor(tungstenSteelBootsID, armorTungstenSteel, rendererTungstenSteel, 3).modId("simpletungsten").setType("tungstensteel").setCreativeTab(SimpleTungstenCore.tabAkkamaddiTungsten).setUnlocalizedName("tungstenSteelBoots");

        // Prasinos
        
        prasinosIngot = new SimpleIngot(prasinosIngotID).modId("simpletungsten").setCreativeTab(SimpleTungstenCore.tabAkkamaddiTungsten).setUnlocalizedName("prasinosIngot");

        smallPrasinosChunkItem = new SimpleIngot(smallPrasinosChunkItemID).modId("simpletungsten").setCreativeTab(SimpleTungstenCore.tabAkkamaddiTungsten).setUnlocalizedName("smallPrasinosChunkItem");

        mediumPrasinosChunkItem = new SimpleIngot(mediumPrasinosChunkItemID).modId("simpletungsten").setCreativeTab(SimpleTungstenCore.tabAkkamaddiTungsten).setUnlocalizedName("mediumPrasinosChunkItem");

        largePrasinosChunkItem = new SimpleIngot(largePrasinosChunkItemID).modId("simpletungsten").setCreativeTab(SimpleTungstenCore.tabAkkamaddiTungsten).setUnlocalizedName("largePrasinosChunkItem");

        prasinosSword = new SimpleSword(prasinosSwordID, toolPrasinos).modId("simpletungsten").setCreativeTab(SimpleTungstenCore.tabAkkamaddiTungsten).setUnlocalizedName("prasinosSword");

        prasinosShovel = new SimpleShovel(prasinosShovelID, toolPrasinos).modId("simpletungsten").setCreativeTab(SimpleTungstenCore.tabAkkamaddiTungsten).setUnlocalizedName("prasinosShovel");

        prasinosAxe = new SimpleAxe(prasinosAxeID, toolPrasinos).modId("simpletungsten").setCreativeTab(SimpleTungstenCore.tabAkkamaddiTungsten).setUnlocalizedName("prasinosAxe");

        prasinosPickaxe = new SimplePickaxe(prasinosPickaxeID, toolPrasinos).modId("simpletungsten").setCreativeTab(SimpleTungstenCore.tabAkkamaddiTungsten).setUnlocalizedName("prasinosPickaxe");

        prasinosHoe = new SimpleHoe(prasinosHoeID, toolPrasinos).modId("simpletungsten").setCreativeTab(SimpleTungstenCore.tabAkkamaddiTungsten).setUnlocalizedName("prasinosHoe");

        prasinosHelm = new SimpleArmor(prasinosHelmID, armorPrasinos, rendererPrasinos, 0).modId("simpletungsten").setType("prasinos").setCreativeTab(SimpleTungstenCore.tabAkkamaddiTungsten).setUnlocalizedName("prasinosHelm");

        prasinosChest = new SimpleArmor(prasinosChestID, armorPrasinos, rendererPrasinos, 1).modId("simpletungsten").setType("prasinos").setCreativeTab(SimpleTungstenCore.tabAkkamaddiTungsten).setUnlocalizedName("prasinosChest");

        prasinosLegs = new SimpleArmor(prasinosLegsID, armorPrasinos, rendererPrasinos, 2).modId("simpletungsten").setType("prasinos").setCreativeTab(SimpleTungstenCore.tabAkkamaddiTungsten).setUnlocalizedName("prasinosLegs");

        prasinosBoots = new SimpleArmor(prasinosBootsID, armorPrasinos, rendererPrasinos, 3).modId("simpletungsten").setType("prasinos").setCreativeTab(SimpleTungstenCore.tabAkkamaddiTungsten).setUnlocalizedName("prasinosBoots");

        // define blocks
        
        blockTungsten = new SimpleOre(blockTungstenID, Material.iron)
        .modId("simpletungsten").setCreativeTab(SimpleTungstenCore.tabAkkamaddiTungsten)
        .setHardness(10.0F).setResistance(22.0F).setStepSound(Block.soundMetalFootstep)
        .setUnlocalizedName("blockTungsten");

        oreTungsten = new SimpleOre(oreTungstenID, Material.iron)
        .modId("simpletungsten").setCreativeTab(SimpleTungstenCore.tabAkkamaddiTungsten)
        .setHardness(4.0F).setResistance(10.0F).setStepSound(Block.soundMetalFootstep)
        .setUnlocalizedName("oreTungsten");

        blockTungstenCarbide = new SimpleOre(blockTungstenCarbideID, Material.iron)
        .modId("simpletungsten").setCreativeTab(SimpleTungstenCore.tabAkkamaddiTungsten)
        .setHardness(10.0F).setResistance(22.0F).setStepSound(Block.soundMetalFootstep)
        .setUnlocalizedName("blockTungstenCarbide");

        blockValfram = new SimpleOre(blockValframID, Material.iron)
        .modId("simpletungsten").setCreativeTab(SimpleTungstenCore.tabAkkamaddiTungsten)
        .setHardness(10.0F).setResistance(22.0F).setStepSound(Block.soundMetalFootstep)
        .setUnlocalizedName("blockValfram");
        
        blockTungstenSteel = new SimpleOre(blockTungstenSteelID, Material.iron)
        .modId("simpletungsten").setCreativeTab(SimpleTungstenCore.tabAkkamaddiTungsten)
        .setHardness(15.0F).setResistance(25.0F).setStepSound(Block.soundMetalFootstep)
        .setUnlocalizedName("blockTungstenSteel");

        blockPrasinos = new SimpleOre(blockPrasinosID, Material.iron)
        .modId("simpletungsten").setCreativeTab(SimpleTungstenCore.tabAkkamaddiTungsten)
        .setHardness(18.0F).setResistance(32.0F).setStepSound(Block.soundMetalFootstep)
        .setUnlocalizedName("blockPrasinos");
      
        
        /*
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
		*/

        // loot

        LootHelper.addLoot("villageBlacksmith", new ItemStack(tungstenIngot), 1, 2, 2);
        LootHelper.addLoot("villageBlacksmith", new ItemStack(tungstenSword), 1, 1, 1);
        LootHelper.addLoot("villageBlacksmith", new ItemStack(tungstenPickaxe), 1, 1, 1);
        LootHelper.addLoot("villageBlacksmith", new ItemStack(tungstenAxe), 1, 1, 1);
        LootHelper.addLoot("villageBlacksmith", new ItemStack(tungstenShovel), 1, 1, 1);
        LootHelper.addLoot("villageBlacksmith", new ItemStack(tungstenCarbideIngot), 1, 2, 4);
        LootHelper.addLoot("villageBlacksmith", new ItemStack(tungstenCarbideSword), 1, 1, 1);
        LootHelper.addLoot("villageBlacksmith", new ItemStack(tungstenCarbidePickaxe), 1, 1, 1);
        LootHelper.addLoot("villageBlacksmith", new ItemStack(valframIngot), 1, 1, 2);
        LootHelper.addLoot("villageBlacksmith", new ItemStack(valframSword), 1, 1, 1);
        LootHelper.addLoot("villageBlacksmith", new ItemStack(valframPickaxe), 1, 1, 1);
        LootHelper.addLoot("villageBlacksmith", new ItemStack(tungstenSteelIngot), 1, 2, 4);
        LootHelper.addLoot("villageBlacksmith", new ItemStack(tungstenSteelSword), 1, 2, 1);
        LootHelper.addLoot("villageBlacksmith", new ItemStack(tungstenSteelPickaxe), 1, 2, 1);
        LootHelper.addLoot("villageBlacksmith", new ItemStack(prasinosIngot), 1, 1, 2);
        LootHelper.addLoot("villageBlacksmith", new ItemStack(prasinosSword), 1, 1, 1);
        LootHelper.addLoot("villageBlacksmith", new ItemStack(prasinosPickaxe), 1, 1, 1);

        LootHelper.addLoot("dungeonChest", new ItemStack(tungstenIngot), 1, 1, 1);
        LootHelper.addLoot("dungeonChest", new ItemStack(tungstenPickaxe), 1, 3, 1);
        LootHelper.addLoot("dungeonChest", new ItemStack(tungstenSword), 1, 7, 1);
        LootHelper.addLoot("dungeonChest", new ItemStack(tungstenCarbideSword), 1, 1, 1);
        LootHelper.addLoot("dungeonChest", new ItemStack(tungstenCarbidePickaxe), 1, 1, 1);
        LootHelper.addLoot("dungeonChest", new ItemStack(valframSword), 1, 1, 1);
        LootHelper.addLoot("dungeonChest", new ItemStack(tungstenSteelSword), 2, 3, 1);
        LootHelper.addLoot("dungeonChest", new ItemStack(tungstenSteelPickaxe), 1, 1, 1);
        LootHelper.addLoot("dungeonChest", new ItemStack(prasinosSword), 1, 1, 1);

        LootHelper.addLoot("mineshaftCorridor", new ItemStack(tungstenIngot), 1, 1, 1);
        LootHelper.addLoot("mineshaftCorridor", new ItemStack(tungstenPickaxe), 1, 4, 1);
        LootHelper.addLoot("mineshaftCorridor", new ItemStack(tungstenShovel), 1, 3, 1);
        LootHelper.addLoot("mineshaftCorridor", new ItemStack(tungstenCarbideIngot), 1, 1, 1);
        LootHelper.addLoot("mineshaftCorridor", new ItemStack(tungstenCarbidePickaxe), 1, 2, 1);
        LootHelper.addLoot("mineshaftCorridor", new ItemStack(tungstenCarbideShovel), 1, 2, 1);
        LootHelper.addLoot("mineshaftCorridor", new ItemStack(valframPickaxe), 1, 1, 1);
        LootHelper.addLoot("mineshaftCorridor", new ItemStack(tungstenSteelIngot), 1, 1, 1);
        LootHelper.addLoot("mineshaftCorridor", new ItemStack(tungstenSteelPickaxe), 1, 2, 1);
        LootHelper.addLoot("mineshaftCorridor", new ItemStack(tungstenSteelShovel), 1, 2, 1);
        LootHelper.addLoot("mineshaftCorridor", new ItemStack(prasinosPickaxe), 1, 1, 1);
        
        LootHelper.addLoot("pyramidDesertyChest", new ItemStack(valframSword), 1, 4, 1);
        LootHelper.addLoot("pyramidDesertyChest", new ItemStack(valframHelm), 1, 3, 1);
        LootHelper.addLoot("pyramidDesertyChest", new ItemStack(valframChest), 1, 3, 1);
        LootHelper.addLoot("pyramidDesertyChest", new ItemStack(valframLegs), 1, 3, 1);
        LootHelper.addLoot("pyramidDesertyChest", new ItemStack(valframBoots), 1, 3, 1);
        LootHelper.addLoot("pyramidDesertyChest", new ItemStack(valframPickaxe), 1, 3, 1);
        LootHelper.addLoot("pyramidDesertyChest", new ItemStack(valframShovel), 1, 5, 1);
        LootHelper.addLoot("pyramidDesertyChest", new ItemStack(valframIngot), 3, 5, 3);
        LootHelper.addLoot("pyramidDesertyChest", new ItemStack(tungstenIngot), 3, 7, 5);
        LootHelper.addLoot("pyramidDesertyChest", new ItemStack(tungstenSteelSword), 1, 4, 1);
        LootHelper.addLoot("pyramidDesertyChest", new ItemStack(tungstenSteelHelm), 1, 3, 1);
        LootHelper.addLoot("pyramidDesertyChest", new ItemStack(tungstenSteelChest), 1, 3, 1);
        LootHelper.addLoot("pyramidDesertyChest", new ItemStack(tungstenSteelLegs), 1, 3, 1);
        LootHelper.addLoot("pyramidDesertyChest", new ItemStack(tungstenSteelBoots), 1, 3, 1);
        LootHelper.addLoot("pyramidDesertyChest", new ItemStack(tungstenSteelPickaxe), 1, 3, 1);
        LootHelper.addLoot("pyramidDesertyChest", new ItemStack(tungstenSteelShovel), 1, 5, 1);
        LootHelper.addLoot("pyramidDesertyChest", new ItemStack(tungstenSteelIngot), 3, 5, 4);

        LootHelper.addLoot("pyramidJungleChest", new ItemStack(tungstenCarbideSword), 1, 4, 1);
        LootHelper.addLoot("pyramidJungleChest", new ItemStack(tungstenCarbideHelm), 1, 3, 1);
        LootHelper.addLoot("pyramidJungleChest", new ItemStack(tungstenCarbideChest), 1, 3, 1);
        LootHelper.addLoot("pyramidJungleChest", new ItemStack(tungstenCarbideLegs), 1, 3, 1);
        LootHelper.addLoot("pyramidJungleChest", new ItemStack(tungstenCarbideBoots), 1, 3, 1);
        LootHelper.addLoot("pyramidJungleChest", new ItemStack(tungstenCarbidePickaxe), 1, 3, 1);
        LootHelper.addLoot("pyramidJungleChest", new ItemStack(tungstenCarbideShovel), 1, 5, 1);
        LootHelper.addLoot("pyramidJungleChest", new ItemStack(tungstenCarbideIngot), 3, 5, 3);
        LootHelper.addLoot("pyramidJungleChest", new ItemStack(prasinosSword), 1, 4, 1);
        LootHelper.addLoot("pyramidJungleChest", new ItemStack(prasinosHelm), 1, 3, 1);
        LootHelper.addLoot("pyramidJungleChest", new ItemStack(prasinosChest), 1, 3, 1);
        LootHelper.addLoot("pyramidJungleChest", new ItemStack(prasinosLegs), 1, 3, 1);
        LootHelper.addLoot("pyramidJungleChest", new ItemStack(prasinosBoots), 1, 3, 1);
        LootHelper.addLoot("pyramidJungleChest", new ItemStack(prasinosPickaxe), 1, 3, 1);
        LootHelper.addLoot("pyramidJungleChest", new ItemStack(prasinosAxe), 2, 8, 1);
        LootHelper.addLoot("pyramidJungleChest", new ItemStack(prasinosIngot), 3, 5, 4);
        
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
        rendererValfram = proxy.addArmor("valfram");
        rendererTungstenSteel = proxy.addArmor("tungstensteel");
        rendererPrasinos = proxy.addArmor("prasinos");
        
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
        
        // name Tungsten Steel
        
        LanguageRegistry.addName(tungstenSteelIngot, "Tungsten Steel Ingot");
        LanguageRegistry.addName(largeTungstenSteelChunkItem, "Large Tungsten Steel Chunk");
        LanguageRegistry.addName(tungstenSteelSword, "Tungsten Steel Sword");
        LanguageRegistry.addName(tungstenSteelShovel, "Tungsten Steel Shovel");
        LanguageRegistry.addName(tungstenSteelAxe, "Tungsten Steel Axe");
        LanguageRegistry.addName(tungstenSteelPickaxe, "Tungsten Steel Pickaxe");
        LanguageRegistry.addName(tungstenSteelHoe, "Tungsten Steel Hoe");
        LanguageRegistry.addName(tungstenSteelHelm, "Tungsten Steel Helm");
        LanguageRegistry.addName(tungstenSteelChest, "Tungsten Steel Chestplate");
        LanguageRegistry.addName(tungstenSteelLegs, "Tungsten Steel Leggings");
        LanguageRegistry.addName(tungstenSteelBoots, "Tungsten Steel Boots");
        
        // name Prasinos
        
        LanguageRegistry.addName(prasinosIngot, "Prasinos Ingot");
        LanguageRegistry.addName(smallPrasinosChunkItem, "Small Prasinos Chunk");
        LanguageRegistry.addName(mediumPrasinosChunkItem, "Medium Prasinos Chunk");
        LanguageRegistry.addName(largePrasinosChunkItem, "Large Prasinos Chunk");
        LanguageRegistry.addName(prasinosSword, "Prasinos Sword");
        LanguageRegistry.addName(prasinosShovel, "Prasinos Shovel");
        LanguageRegistry.addName(prasinosAxe, "Prasinos Axe");
        LanguageRegistry.addName(prasinosPickaxe, "Prasinos Pickaxe");
        LanguageRegistry.addName(prasinosHoe, "Prasinos Hoe");
        LanguageRegistry.addName(prasinosHelm, "Prasinos Helm");
        LanguageRegistry.addName(prasinosChest, "Prasinos Chestplate");
        LanguageRegistry.addName(prasinosLegs, "Prasinos Leggings");
        LanguageRegistry.addName(prasinosBoots, "Prasinos Boots");
        
        //blocks
        
        LanguageRegistry.addName(blockTungsten, "Tungsten Block");
        MinecraftForge.setBlockHarvestLevel(blockTungsten, "pickaxe", 0);
        
        LanguageRegistry.addName(oreTungsten, "Tungsten Ore");
        MinecraftForge.setBlockHarvestLevel(oreTungsten, "pickaxe", 2);

        LanguageRegistry.addName(blockTungstenCarbide, "Tungsten Carbide Block");
        MinecraftForge.setBlockHarvestLevel(blockTungstenCarbide, "pickaxe", 0);
        
        LanguageRegistry.addName(blockValfram, "Valfram Block");
        MinecraftForge.setBlockHarvestLevel(blockValfram, "pickaxe", 0);
        
        LanguageRegistry.addName(blockTungstenSteel, "Tungsten Steel Block");
        MinecraftForge.setBlockHarvestLevel(blockTungstenSteel, "pickaxe", 0);
        
        LanguageRegistry.addName(blockPrasinos, "Prasinos Block");
        MinecraftForge.setBlockHarvestLevel(blockPrasinos, "pickaxe", 0);
        
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
        
        MinecraftForge.setToolClass(tungstenSteelPickaxe, "pickaxe", 2);
        MinecraftForge.setToolClass(tungstenSteelShovel, "shovel", 2);
        MinecraftForge.setToolClass(tungstenSteelAxe, "axe", 2);
        
        MinecraftForge.setToolClass(prasinosPickaxe, "pickaxe", 3);
        MinecraftForge.setToolClass(prasinosShovel, "shovel", 3);
        MinecraftForge.setToolClass(prasinosAxe, "axe", 3);
        
        LanguageRegistry.instance().addStringLocalization("itemGroup.tabAkkamaddiTungsten", "en_US", "akkamaddi's Simple Tungsten");
        
        
        armorTungsten.customCraftingMaterial = SimpleTungstenCore.tungstenIngot;
        armorTungstenCarbide.customCraftingMaterial = SimpleTungstenCore.tungstenCarbideIngot;
        armorValfram.customCraftingMaterial = SimpleTungstenCore.valframIngot;
        armorTungstenSteel.customCraftingMaterial = SimpleTungstenCore.tungstenSteelIngot;
        armorPrasinos.customCraftingMaterial = SimpleTungstenCore.prasinosIngot;
        
        
        toolTungsten.customCraftingMaterial = SimpleTungstenCore.tungstenIngot;
        toolTungstenCarbide.customCraftingMaterial = SimpleTungstenCore.tungstenCarbideIngot;
        toolValfram.customCraftingMaterial = SimpleTungstenCore.valframIngot;
        toolTungstenSteel.customCraftingMaterial = SimpleTungstenCore.tungstenSteelIngot;
        toolPrasinos.customCraftingMaterial = SimpleTungstenCore.prasinosIngot;
        
        
    }

    @EventHandler // used in 1.6.2
    public void postInit(FMLPostInitializationEvent event)
    {
        // Stub Method
    }
}

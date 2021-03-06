package SimpleOres.plugins.akkamaddi.arsenic.code;

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
import net.minecraft.block.EnumMobType;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.common.EnumHelper;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.Configuration;
import SimpleOres.plugins.fusion.FusionRecipes;
import SimpleOres.core.api.SimpleSword;
import SimpleOres.core.api.SimpleShovel;
import SimpleOres.core.api.SimpleAxe;
import SimpleOres.core.api.SimplePickaxe;
import SimpleOres.core.api.SimpleHoe;
import SimpleOres.core.api.SimpleArmor;
import SimpleOres.core.Armor;
import SimpleOres.core.api.HandlerLoot;
import SimpleOres.core.api.SimpleTab;

@Mod(modid = "SimpleArsenic", name = "Simple Arsenic, and Old Lace", version = "1.2.5", dependencies = "required-after:simpleoresfusion ; after:MoCreatures")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)

public class ArsenicAndLace
{
    // The instance of your mod that Forge uses.
    @Instance("SimpleArsenic")
    public static ArsenicAndLace instance;

    // Says where the client and server 'proxy' code is loaded.
    @SidedProxy(clientSide = "SimpleOres.plugins.akkamaddi.arsenic.code.ClientProxy", serverSide = "SimpleOres.plugins.akkamaddi.arsenic.code.CommonProxy")
    public static CommonProxy proxy;

    // set simple items class paths
    //public static SimpleOres.core.Items soItems;
    //public static SimpleOres.core.Armor soArmor;

    // set item ID, to-from config file
    public static int arsenicIngotID;
    public static int realgarItemID;
    public static int orpimentItemID;
    public static int arsenideSaltItemID;
    public static int smallArsenicChunkItemID;
    public static int mediumArsenicChunkItemID;
    public static int largeArsenicChunkItemID;
    public static int blockArsenicID;
    public static int arsenideBronzeIngotID;
    public static int smallArsenideBronzeChunkItemID;
    public static int mediumArsenideBronzeChunkItemID;
    public static int largeArsenideBronzeChunkItemID;
    public static int blockArsenideBronzeID;
    public static int arsenideGoldIngotID;
    public static int smallArsenideGoldChunkItemID;
    public static int mediumArsenideGoldChunkItemID;
    public static int largeArsenideGoldChunkItemID;
    public static int blockArsenideGoldID;
    public static int plateArsenicID;

    public static int arsenicSwordID;
    public static int arsenicShovelID;
    public static int arsenicAxeID;
    public static int arsenicPickaxeID;
    public static int arsenicHoeID;

    public static int arsenideBronzeSwordID;
    public static int arsenideBronzeShovelID;
    public static int arsenideBronzeAxeID;
    public static int arsenideBronzePickaxeID;
    public static int arsenideBronzeHoeID;

    public static int arsenideBronzeHelmID;
    public static int arsenideBronzeChestID;
    public static int arsenideBronzeLegsID;
    public static int arsenideBronzeBootsID;

    public static int arsenideGoldSwordID;
    public static int arsenideGoldShovelID;
    public static int arsenideGoldAxeID;
    public static int arsenideGoldPickaxeID;
    public static int arsenideGoldHoeID;

    public static int arsenideGoldHelmID;
    public static int arsenideGoldChestID;
    public static int arsenideGoldLegsID;
    public static int arsenideGoldBootsID;

    public static int oldLaceChestID;

    public static int tenebriumIngotID;
    public static int smallTenebriumChunkItemID;
    public static int mediumTenebriumChunkItemID;
    public static int largeTenebriumChunkItemID;
    public static int blockTenebriumID;

    public static int tenebriumSwordID;
    public static int tenebriumShovelID;
    public static int tenebriumAxeID;
    public static int tenebriumPickaxeID;
    public static int tenebriumHoeID;

    public static int tenebriumHelmID;
    public static int tenebriumChestID;
    public static int tenebriumLegsID;
    public static int tenebriumBootsID;

    // set actual item names
    public static Item arsenicIngot;
    public static Item realgarItem;
    public static Item orpimentItem;
    public static Item arsenideSaltItem;
    public static Item smallArsenicChunkItem;
    public static Item mediumArsenicChunkItem;
    public static Item largeArsenicChunkItem;
    public static Item arsenideBronzeIngot;
    public static Item smallArsenideBronzeChunkItem;
    public static Item mediumArsenideBronzeChunkItem;
    public static Item largeArsenideBronzeChunkItem;
    public static Item arsenideGoldIngot;
    public static Item smallArsenideGoldChunkItem;
    public static Item mediumArsenideGoldChunkItem;
    public static Item largeArsenideGoldChunkItem;

    public static Item arsenicSword;
    public static Item arsenicShovel;
    public static Item arsenicAxe;
    public static Item arsenicPickaxe;
    public static Item arsenicHoe;

    public static Item arsenideBronzeSword;
    public static Item arsenideBronzeShovel;
    public static Item arsenideBronzeAxe;
    public static Item arsenideBronzePickaxe;
    public static Item arsenideBronzeHoe;

    public static Item arsenideBronzeHelm;
    public static Item arsenideBronzeChest;
    public static Item arsenideBronzeLegs;
    public static Item arsenideBronzeBoots;

    public static Item arsenideGoldSword;
    public static Item arsenideGoldShovel;
    public static Item arsenideGoldAxe;
    public static Item arsenideGoldPickaxe;
    public static Item arsenideGoldHoe;

    public static Item arsenideGoldHelm;
    public static Item arsenideGoldChest;
    public static Item arsenideGoldLegs;
    public static Item arsenideGoldBoots;

    public static Item oldLaceChest;

    public static Item tenebriumIngot;
    public static Item smallTenebriumChunkItem;
    public static Item mediumTenebriumChunkItem;
    public static Item largeTenebriumChunkItem;

    public static Item tenebriumSword;
    public static Item tenebriumShovel;
    public static Item tenebriumAxe;
    public static Item tenebriumPickaxe;
    public static Item tenebriumHoe;

    public static Item tenebriumHelm;
    public static Item tenebriumChest;
    public static Item tenebriumLegs;
    public static Item tenebriumBoots;

    // set block names
    public static Block blockArsenic;
    public static Block blockArsenideBronze;
    public static Block blockArsenideGold;
    public static Block plateArsenic;
    public static Block blockTenebrium;

    // booleans
    public static boolean werewolfEffectiveness;
    public static boolean enableRecycling;

    // tab
    public static SimpleTab tabAkkamaddiArsenic = new SimpleTab("tabAkkamaddiArsenic");

    /**
     * EnumArmorMaterial. In form ("NAME", max damage (like uses, multiply by pieces for their max damage), new int[] {helmet defense, chestplate defense, leggings defense, boots defense}, enchantability)
     */
    // public static EnumArmorMaterial armorArsenic = EnumHelper.addArmorMaterial("ARSENIC", 6, new int[] {1, 3, 2, 1}, 10);
    public static EnumArmorMaterial armorArsenideBronze = EnumHelper.addArmorMaterial("ARSENIDEBRONZE", 16, new int[] {3, 5, 3, 1}, 9);
    public static EnumArmorMaterial armorArsenideGold = EnumHelper.addArmorMaterial("ARSENIDEGOLD", 12, new int[] {2, 6, 3, 1}, 22);
    public static EnumArmorMaterial armorOldLace = EnumHelper.addArmorMaterial("OLDLACE", 4, new int[] {1, 1, 1, 1}, 24);
    public static EnumArmorMaterial armorTenebrium = EnumHelper.addArmorMaterial("TENEBRIUM", 52, new int[] {4, 8, 8, 4}, 17);

    /**
     * Creating the Armor Renderers. This is simply so you can see the armor texture when you wear it.
     */
    // public static int rendererArsenic;
    public static int rendererArsenideBronze;
    public static int rendererArsenideGold;
    public static int rendererOldLace;
    public static int rendererTenebrium;

    // set tool properties
    // EnumToolMaterial. In form ("NAME", mining level, max uses, speed, damage to entity, enchantability)
    public static EnumToolMaterial toolArsenic = EnumHelper.addToolMaterial("ARSENIC", 1, 62, 2.0F, 2, 10);
    public static EnumToolMaterial toolArsenideBronze = EnumHelper.addToolMaterial("ARSENIDEBRONZE", 2, 430, 7.0F, 2, 9);
    public static EnumToolMaterial toolArsenideGold = EnumHelper.addToolMaterial("ARSENIDEGOLD", 1, 56, 12.0F, 2, 20);
    public static EnumToolMaterial toolTenebrium = EnumHelper.addToolMaterial("TENEBRIUM", 4, 3820, 9.0F, 3, 17);

    // Tab
    public void setTabIcons()
    {
        /**
         * Creating the custom tabs using the API class "SimpleTab" and setting their icon.
         */
        tabAkkamaddiArsenic.setIcon(new ItemStack(ArsenicAndLace.blockArsenic));
    }

    @EventHandler // used in 1.6.2
    public void preInit(FMLPreInitializationEvent event)
    {
        // Stub Method
        Configuration config = new Configuration(event.getSuggestedConfigurationFile());
        config.load();
        arsenicIngotID = config.getItem("ArsenicItem", "Arsenic Ingot", 12130).getInt();
        realgarItemID = config.getItem("ArsenicItem", "Mineral Realgar", 12131).getInt();
        orpimentItemID = config.getItem("ArsenicItem", "Mineral Orpiment", 12132).getInt();
        arsenideSaltItemID = config.getItem("ArsenicItem", "Arsenide Salts", 12133).getInt();
        smallArsenicChunkItemID = config.getItem("ArsenicItem", "Small Arsenic Chunk", 12134).getInt();
        mediumArsenicChunkItemID = config.getItem("ArsenicItem", "Medium Arsenic Chunk", 12135).getInt();
        largeArsenicChunkItemID = config.getItem("ArsenicItem", "Large Arsenic Chunk", 12136).getInt();
        arsenideBronzeIngotID = config.getItem("ArsenicItem", "Arsenide Bronze Ingot", 12137).getInt();
        smallArsenideBronzeChunkItemID = config.getItem("ArsenicItem", "Small Arsenide Bronze Chunk", 12138).getInt();
        mediumArsenideBronzeChunkItemID = config.getItem("ArsenicItem", "Medium Arsenide Bronze Chunk", 12139).getInt();
        largeArsenideBronzeChunkItemID = config.getItem("ArsenicItem", "Large Arsenide Bronze Chunk", 12140).getInt();
        arsenideGoldIngotID = config.getItem("ArsenicItem", "Arsenide Gold Ingot", 12141).getInt();
        smallArsenideGoldChunkItemID = config.getItem("ArsenicItem", "Small Arsenide Gold Chunk", 12142).getInt();
        mediumArsenideGoldChunkItemID = config.getItem("ArsenicItem", "Medium Arsenide Gold Chunk", 12143).getInt();
        largeArsenideGoldChunkItemID = config.getItem("ArsenicItem", "Large Arsenide Gold Chunk", 12144).getInt();
        blockArsenicID = config.getBlock("ArsenicBlock", "Arsenic Block", 1300).getInt();
        blockArsenideBronzeID = config.getBlock("ArsenicBlock", "Arsenide Bronze Block", 1301).getInt();
        blockArsenideGoldID = config.getBlock("ArsenicBlock", "Arsenide Gold Block", 1302).getInt();
        blockTenebriumID = config.getBlock("ArsenicBlock", "Tenebrium Block", 1304).getInt();
        arsenicSwordID = config.getItem("ArsenicItem", "Arsenic Sword", 12145).getInt();
        arsenicShovelID = config.getItem("ArsenicItem", "Arsenic Shovel", 12146).getInt();
        arsenicAxeID = config.getItem("ArsenicItem", "Arsenic Axe", 12147).getInt();
        arsenicPickaxeID = config.getItem("ArsenicItem", "Arsenic Pickaxe", 12148).getInt();
        arsenicHoeID = config.getItem("ArsenicItem", "Arsenic Hoe", 12149).getInt();
        arsenideBronzeSwordID = config.getItem("ArsenicItem", "Arsenide Bronze Sword", 12150).getInt();
        arsenideBronzeShovelID = config.getItem("ArsenicItem", "Arsenide Bronze Shovel", 12151).getInt();
        arsenideBronzeAxeID = config.getItem("ArsenicItem", "Arsenide Bronze Axe", 12152).getInt();
        arsenideBronzePickaxeID = config.getItem("ArsenicItem", "Arsenide Bronze Pickaxe", 12153).getInt();
        arsenideBronzeHoeID = config.getItem("ArsenicItem", "Arsenide Bronze Hoe", 12154).getInt();
        arsenideBronzeHelmID = config.getItem("ArsenicItem", "Arsenide Bronze Helm", 12155).getInt();
        arsenideBronzeChestID = config.getItem("ArsenicItem", "Arsenide Bronze Chest", 12156).getInt();
        arsenideBronzeLegsID = config.getItem("ArsenicItem", "Arsenide Bronze Legs", 12157).getInt();
        arsenideBronzeBootsID = config.getItem("ArsenicItem", "Arsenide Bronze Boots", 12158).getInt();
        arsenideGoldSwordID = config.getItem("ArsenicItem", "Arsenide Gold Sword", 12159).getInt();
        arsenideGoldShovelID = config.getItem("ArsenicItem", "Arsenide Gold Shovel", 12160).getInt();
        arsenideGoldAxeID = config.getItem("ArsenicItem", "Arsenide Gold Axe", 12161).getInt();
        arsenideGoldPickaxeID = config.getItem("ArsenicItem", "Arsenide Gold Pickaxe", 12162).getInt();
        arsenideGoldHoeID = config.getItem("ArsenicItem", "Arsenide Gold Hoe", 12163).getInt();
        arsenideGoldHelmID = config.getItem("ArsenicItem", "Arsenide Gold Helm", 12164).getInt();
        arsenideGoldChestID = config.getItem("ArsenicItem", "Arsenide Gold Chest", 12165).getInt();
        arsenideGoldLegsID = config.getItem("ArsenicItem", "Arsenide Gold Legs", 12166).getInt();
        arsenideGoldBootsID = config.getItem("ArsenicItem", "Arsenide Gold Boots", 12167).getInt();
        oldLaceChestID = config.getItem("ArsenicItem", "Old Lace Shroud", 12168).getInt();
        plateArsenicID = config.getBlock("ArsenicPlate", "Arsenic Plate", 1303).getInt();
        tenebriumIngotID = config.getItem("ArsenicItem", "Tenebrium Ingot", 12169).getInt();
        smallTenebriumChunkItemID = config.getItem("ArsenicItem", "Small Tenebrium Chunk", 12170).getInt();
        mediumTenebriumChunkItemID = config.getItem("ArsenicItem", "Medium Tenebrium Chunk", 12171).getInt();
        largeTenebriumChunkItemID = config.getItem("ArsenicItem", "Large Tenebrium Chunk", 12172).getInt();
        tenebriumSwordID = config.getItem("ArsenicItem", "Tenebrium Sword", 12173).getInt();
        tenebriumShovelID = config.getItem("ArsenicItem", "Tenebrium Shovel", 12174).getInt();
        tenebriumAxeID = config.getItem("ArsenicItem", "Tenebrium Axe", 12175).getInt();
        tenebriumPickaxeID = config.getItem("ArsenicItem", "Tenebrium Pickaxe", 12176).getInt();
        tenebriumHoeID = config.getItem("ArsenicItem", "Tenebrium Hoe", 12177).getInt();
        tenebriumHelmID = config.getItem("ArsenicItem", "Tenebrium Helm", 12178).getInt();
        tenebriumChestID = config.getItem("ArsenicItem", "Tenebrium Chest", 12179).getInt();
        tenebriumLegsID = config.getItem("ArsenicItem", "Tenebrium Legs", 12180).getInt();
        tenebriumBootsID = config.getItem("ArsenicItem", "Tenebrium Boots", 12181).getInt();
        werewolfEffectiveness = config.get(Configuration.CATEGORY_GENERAL, "Works on Mo'Creatures lycanthropes, true or false", true).getBoolean(true);
        enableRecycling = config.get(Configuration.CATEGORY_GENERAL, "Enable arsenide recycling recipes, false or true", false).getBoolean(false);
        config.save();
        // define items
        arsenicIngot = new ArsenicItem(arsenicIngotID).setUnlocalizedName("arsenicIngot").setCreativeTab(ArsenicAndLace.tabAkkamaddiArsenic);
        realgarItem = new ArsenicItem(realgarItemID).setUnlocalizedName("realgarItem").setCreativeTab(ArsenicAndLace.tabAkkamaddiArsenic);
        orpimentItem = new ArsenicItem(orpimentItemID).setUnlocalizedName("orpimentItem").setCreativeTab(ArsenicAndLace.tabAkkamaddiArsenic);
        arsenideSaltItem = new ArsenicItem(arsenideSaltItemID).setUnlocalizedName("arsenideSaltItem").setCreativeTab(ArsenicAndLace.tabAkkamaddiArsenic);
        smallArsenicChunkItem = new ArsenicItem(smallArsenicChunkItemID).setUnlocalizedName("smallArsenicChunkItem").setCreativeTab(ArsenicAndLace.tabAkkamaddiArsenic);
        mediumArsenicChunkItem = new ArsenicItem(mediumArsenicChunkItemID).setUnlocalizedName("mediumArsenicChunkItem").setCreativeTab(ArsenicAndLace.tabAkkamaddiArsenic);
        largeArsenicChunkItem = new ArsenicItem(largeArsenicChunkItemID).setUnlocalizedName("largeArsenicChunkItem").setCreativeTab(ArsenicAndLace.tabAkkamaddiArsenic);
        arsenideBronzeIngot = new ArsenicItem(arsenideBronzeIngotID).setUnlocalizedName("arsenideBronzeIngot").setCreativeTab(ArsenicAndLace.tabAkkamaddiArsenic);
        smallArsenideBronzeChunkItem = new ArsenicItem(smallArsenideBronzeChunkItemID).setUnlocalizedName("smallArsenideBronzeChunkItem").setCreativeTab(ArsenicAndLace.tabAkkamaddiArsenic);
        mediumArsenideBronzeChunkItem = new ArsenicItem(mediumArsenideBronzeChunkItemID).setUnlocalizedName("mediumArsenideBronzeChunkItem").setCreativeTab(ArsenicAndLace.tabAkkamaddiArsenic);
        largeArsenideBronzeChunkItem = new ArsenicItem(largeArsenideBronzeChunkItemID).setUnlocalizedName("largeArsenideBronzeChunkItem").setCreativeTab(ArsenicAndLace.tabAkkamaddiArsenic);
        arsenideGoldIngot = new ArsenicItem(arsenideGoldIngotID).setUnlocalizedName("arsenideGoldIngot").setCreativeTab(ArsenicAndLace.tabAkkamaddiArsenic);
        smallArsenideGoldChunkItem = new ArsenicItem(smallArsenideGoldChunkItemID).setUnlocalizedName("smallArsenideGoldChunkItem").setCreativeTab(ArsenicAndLace.tabAkkamaddiArsenic);
        mediumArsenideGoldChunkItem = new ArsenicItem(mediumArsenideGoldChunkItemID).setUnlocalizedName("mediumArsenideGoldChunkItem").setCreativeTab(ArsenicAndLace.tabAkkamaddiArsenic);
        largeArsenideGoldChunkItem = new ArsenicItem(largeArsenideGoldChunkItemID).setUnlocalizedName("largeArsenideGoldChunkItem").setCreativeTab(ArsenicAndLace.tabAkkamaddiArsenic);
        arsenicSword = new ArsenicSwords(ArsenicAndLace.arsenicSwordID, ArsenicAndLace.toolArsenic, "arsenic", ArsenicAndLace.tabAkkamaddiArsenic).setUnlocalizedName("arsenicSword");
        arsenicShovel = new SimpleShovel(ArsenicAndLace.arsenicShovelID, ArsenicAndLace.toolArsenic, "arsenic", ArsenicAndLace.tabAkkamaddiArsenic).setUnlocalizedName("arsenicShovel");
        arsenicAxe = new SimpleAxe(ArsenicAndLace.arsenicAxeID, ArsenicAndLace.toolArsenic, "arsenic", ArsenicAndLace.tabAkkamaddiArsenic).setUnlocalizedName("arsenicAxe");
        arsenicPickaxe = new SimplePickaxe(ArsenicAndLace.arsenicPickaxeID, ArsenicAndLace.toolArsenic, "arsenic", ArsenicAndLace.tabAkkamaddiArsenic).setUnlocalizedName("arsenicPickaxe");
        arsenicHoe = new SimpleHoe(ArsenicAndLace.arsenicHoeID, ArsenicAndLace.toolArsenic, "arsenic", ArsenicAndLace.tabAkkamaddiArsenic).setUnlocalizedName("arsenicHoe");
        arsenideBronzeSword = new ArsenicSwords(ArsenicAndLace.arsenideBronzeSwordID, ArsenicAndLace.toolArsenideBronze, "arsenic", ArsenicAndLace.tabAkkamaddiArsenic).setUnlocalizedName("arsenideBronzeSword");
        arsenideBronzeShovel = new SimpleShovel(ArsenicAndLace.arsenideBronzeShovelID, ArsenicAndLace.toolArsenideBronze, "arsenic", ArsenicAndLace.tabAkkamaddiArsenic).setUnlocalizedName("arsenideBronzeShovel");
        arsenideBronzeAxe = new SimpleAxe(ArsenicAndLace.arsenideBronzeAxeID, ArsenicAndLace.toolArsenideBronze, "arsenic", ArsenicAndLace.tabAkkamaddiArsenic).setUnlocalizedName("arsenideBronzeAxe");
        arsenideBronzePickaxe = new SimplePickaxe(ArsenicAndLace.arsenideBronzePickaxeID, ArsenicAndLace.toolArsenideBronze, "arsenic", ArsenicAndLace.tabAkkamaddiArsenic).setUnlocalizedName("arsenideBronzePickaxe");
        arsenideBronzeHoe = new SimpleHoe(ArsenicAndLace.arsenideBronzeHoeID, ArsenicAndLace.toolArsenideBronze, "arsenic", ArsenicAndLace.tabAkkamaddiArsenic).setUnlocalizedName("arsenideBronzeHoe");
        arsenideBronzeHelm = new SimpleArmor(ArsenicAndLace.arsenideBronzeHelmID, ArsenicAndLace.armorArsenideBronze, ArsenicAndLace.rendererArsenideBronze, 0, "arsenideBronze", "arsenic", ArsenicAndLace.tabAkkamaddiArsenic).setUnlocalizedName("arsenideBronzeHelm");
        arsenideBronzeChest = new SimpleArmor(ArsenicAndLace.arsenideBronzeChestID, ArsenicAndLace.armorArsenideBronze, ArsenicAndLace.rendererArsenideBronze, 1, "arsenideBronze", "arsenic", ArsenicAndLace.tabAkkamaddiArsenic).setUnlocalizedName("arsenideBronzeChest");
        arsenideBronzeLegs = new SimpleArmor(ArsenicAndLace.arsenideBronzeLegsID, ArsenicAndLace.armorArsenideBronze, ArsenicAndLace.rendererArsenideBronze, 2, "arsenideBronze", "arsenic", ArsenicAndLace.tabAkkamaddiArsenic).setUnlocalizedName("arsenideBronzeLegs");
        arsenideBronzeBoots = new SimpleArmor(ArsenicAndLace.arsenideBronzeBootsID, ArsenicAndLace.armorArsenideBronze, ArsenicAndLace.rendererArsenideBronze, 3, "arsenideBronze", "arsenic", ArsenicAndLace.tabAkkamaddiArsenic).setUnlocalizedName("arsenideBronzeBoots");
        arsenideGoldSword = new ArsenicSwords(ArsenicAndLace.arsenideGoldSwordID, ArsenicAndLace.toolArsenideGold, "arsenic", ArsenicAndLace.tabAkkamaddiArsenic).setUnlocalizedName("arsenideGoldSword");
        arsenideGoldShovel = new SimpleShovel(ArsenicAndLace.arsenideGoldShovelID, ArsenicAndLace.toolArsenideGold, "arsenic", ArsenicAndLace.tabAkkamaddiArsenic).setUnlocalizedName("arsenideGoldShovel");
        arsenideGoldAxe = new SimpleAxe(ArsenicAndLace.arsenideGoldAxeID, ArsenicAndLace.toolArsenideGold, "arsenic", ArsenicAndLace.tabAkkamaddiArsenic).setUnlocalizedName("arsenideGoldAxe");
        arsenideGoldPickaxe = new SimplePickaxe(ArsenicAndLace.arsenideGoldPickaxeID, ArsenicAndLace.toolArsenideGold, "arsenic", ArsenicAndLace.tabAkkamaddiArsenic).setUnlocalizedName("arsenideGoldPickaxe");
        arsenideGoldHoe = new SimpleHoe(ArsenicAndLace.arsenideGoldHoeID, ArsenicAndLace.toolArsenideGold, "arsenic", ArsenicAndLace.tabAkkamaddiArsenic).setUnlocalizedName("arsenideGoldHoe");
        arsenideGoldHelm = new SimpleArmor(ArsenicAndLace.arsenideGoldHelmID, ArsenicAndLace.armorArsenideGold, ArsenicAndLace.rendererArsenideGold, 0, "arsenideGold", "arsenic", ArsenicAndLace.tabAkkamaddiArsenic).setUnlocalizedName("arsenideGoldHelm");
        arsenideGoldChest = new SimpleArmor(ArsenicAndLace.arsenideGoldChestID, ArsenicAndLace.armorArsenideGold, ArsenicAndLace.rendererArsenideGold, 1, "arsenideGold", "arsenic", ArsenicAndLace.tabAkkamaddiArsenic).setUnlocalizedName("arsenideGoldChest");
        arsenideGoldLegs = new SimpleArmor(ArsenicAndLace.arsenideGoldLegsID, ArsenicAndLace.armorArsenideGold, ArsenicAndLace.rendererArsenideGold, 2, "arsenideGold", "arsenic", ArsenicAndLace.tabAkkamaddiArsenic).setUnlocalizedName("arsenideGoldLegs");
        arsenideGoldBoots = new SimpleArmor(ArsenicAndLace.arsenideGoldBootsID, ArsenicAndLace.armorArsenideGold, ArsenicAndLace.rendererArsenideGold, 3, "arsenideGold", "arsenic", ArsenicAndLace.tabAkkamaddiArsenic).setUnlocalizedName("arsenideGoldBoots");
        oldLaceChest = new SimpleArmor(ArsenicAndLace.oldLaceChestID, ArsenicAndLace.armorOldLace, ArsenicAndLace.rendererOldLace, 1, "oldLace", "arsenic", ArsenicAndLace.tabAkkamaddiArsenic).setUnlocalizedName("oldLaceChest");
        tenebriumIngot = new ArsenicItem(tenebriumIngotID).setUnlocalizedName("tenebriumIngot").setCreativeTab(ArsenicAndLace.tabAkkamaddiArsenic);
        smallTenebriumChunkItem = new ArsenicItem(smallTenebriumChunkItemID).setUnlocalizedName("smallTenebriumChunkItem").setCreativeTab(ArsenicAndLace.tabAkkamaddiArsenic);
        mediumTenebriumChunkItem = new ArsenicItem(mediumTenebriumChunkItemID).setUnlocalizedName("mediumTenebriumChunkItem").setCreativeTab(ArsenicAndLace.tabAkkamaddiArsenic);
        largeTenebriumChunkItem = new ArsenicItem(largeTenebriumChunkItemID).setUnlocalizedName("largeTenebriumChunkItem").setCreativeTab(ArsenicAndLace.tabAkkamaddiArsenic);
        tenebriumSword = new SimpleSword(ArsenicAndLace.tenebriumSwordID, ArsenicAndLace.toolTenebrium, "arsenic", ArsenicAndLace.tabAkkamaddiArsenic).setUnlocalizedName("tenebriumSword");
        tenebriumShovel = new SimpleShovel(ArsenicAndLace.tenebriumShovelID, ArsenicAndLace.toolTenebrium, "arsenic", ArsenicAndLace.tabAkkamaddiArsenic).setUnlocalizedName("tenebriumShovel");
        tenebriumAxe = new SimpleAxe(ArsenicAndLace.tenebriumAxeID, ArsenicAndLace.toolTenebrium, "arsenic", ArsenicAndLace.tabAkkamaddiArsenic).setUnlocalizedName("tenebriumAxe");
        tenebriumPickaxe = new SimplePickaxe(ArsenicAndLace.tenebriumPickaxeID, ArsenicAndLace.toolTenebrium, "arsenic", ArsenicAndLace.tabAkkamaddiArsenic).setUnlocalizedName("tenebriumPickaxe");
        tenebriumHoe = new SimpleHoe(ArsenicAndLace.tenebriumHoeID, ArsenicAndLace.toolTenebrium, "arsenic", ArsenicAndLace.tabAkkamaddiArsenic).setUnlocalizedName("tenebriumHoe");
        tenebriumHelm = new SimpleArmor(ArsenicAndLace.tenebriumHelmID, ArsenicAndLace.armorTenebrium, ArsenicAndLace.rendererTenebrium, 0, "tenebrium", "arsenic", ArsenicAndLace.tabAkkamaddiArsenic).setUnlocalizedName("tenebriumHelm");
        tenebriumChest = new SimpleArmor(ArsenicAndLace.tenebriumChestID, ArsenicAndLace.armorTenebrium, ArsenicAndLace.rendererTenebrium, 1, "tenebrium", "arsenic", ArsenicAndLace.tabAkkamaddiArsenic).setUnlocalizedName("tenebriumChest");
        tenebriumLegs = new SimpleArmor(ArsenicAndLace.tenebriumLegsID, ArsenicAndLace.armorTenebrium, ArsenicAndLace.rendererTenebrium, 2, "tenebrium", "arsenic", ArsenicAndLace.tabAkkamaddiArsenic).setUnlocalizedName("tenebriumLegs");
        tenebriumBoots = new SimpleArmor(ArsenicAndLace.tenebriumBootsID, ArsenicAndLace.armorTenebrium, ArsenicAndLace.rendererTenebrium, 3, "tenebrium", "arsenic", ArsenicAndLace.tabAkkamaddiArsenic).setUnlocalizedName("tenebriumBoots");
        // define blocks
        blockArsenic = new ArsenicBlock(blockArsenicID, Material.iron)
        .setHardness(3.0F).setResistance(10.0F).setStepSound(Block.soundMetalFootstep)
        .setUnlocalizedName("blockArsenic").setCreativeTab(ArsenicAndLace.tabAkkamaddiArsenic);
        blockArsenideBronze = new ArsenicBlock(blockArsenideBronzeID, Material.iron)
        .setHardness(5.0F).setResistance(20.0F).setStepSound(Block.soundMetalFootstep)
        .setUnlocalizedName("blockArsenideBronze").setCreativeTab(ArsenicAndLace.tabAkkamaddiArsenic);
        blockArsenideGold = new ArsenicBlock(blockArsenideGoldID, Material.iron)
        .setHardness(4.0F).setResistance(16.0F).setStepSound(Block.soundMetalFootstep)
        .setUnlocalizedName("blockArsenideGold").setCreativeTab(ArsenicAndLace.tabAkkamaddiArsenic);
        plateArsenic = (new ArsenicPlate(plateArsenicID, "plateArsenic", Material.wood,
                EnumMobType.everything)).setHardness(0.5F).setStepSound(Block.soundMetalFootstep)
                .setUnlocalizedName("plateArsenic").setCreativeTab(ArsenicAndLace.tabAkkamaddiArsenic);
        blockTenebrium = new ArsenicBlock(blockTenebriumID, Material.iron)
        .setHardness(12.0F).setResistance(55.0F).setStepSound(Block.soundMetalFootstep)
        .setUnlocalizedName("blockTenebrium").setCreativeTab(ArsenicAndLace.tabAkkamaddiArsenic);
        
        //registration
        //items
        GameRegistry.registerItem(arsenicIngot,"arsenicIngot");
        GameRegistry.registerItem(realgarItem,"realgarItem");
        GameRegistry.registerItem(orpimentItem,"orpimentItem");
        GameRegistry.registerItem(arsenideSaltItem,"arsenideSaltItem");
        GameRegistry.registerItem(smallArsenicChunkItem,"smallArsenicChunkItem");
        GameRegistry.registerItem(mediumArsenicChunkItem,"mediumArsenicChunkItem");
        GameRegistry.registerItem(largeArsenicChunkItem,"largeArsenicChunkItem");
        GameRegistry.registerItem(arsenideBronzeIngot,"arsenideBronzeIngot");
        GameRegistry.registerItem(smallArsenideBronzeChunkItem,"smallArsenideBronzeChunkItem");
        GameRegistry.registerItem(mediumArsenideBronzeChunkItem,"mediumArsenideBronzeChunkItem");
        GameRegistry.registerItem(largeArsenideBronzeChunkItem,"largeArsenideBronzeChunkItem");
        GameRegistry.registerItem(arsenideGoldIngot,"arsenideGoldIngot");
        GameRegistry.registerItem(smallArsenideGoldChunkItem,"smallArsenideGoldChunkItem");
        GameRegistry.registerItem(mediumArsenideGoldChunkItem,"mediumArsenideGoldChunkItem");
        GameRegistry.registerItem(largeArsenideGoldChunkItem,"largeArsenideGoldChunkItem");
        //arsenic
        GameRegistry.registerItem(arsenicSword,"arsenicSword");
        GameRegistry.registerItem(arsenicShovel,"arsenicShovel");
        GameRegistry.registerItem(arsenicAxe,"arsenicAxe");
        GameRegistry.registerItem(arsenicPickaxe,"arsenicPickaxe");
        GameRegistry.registerItem(arsenicHoe,"arsenicHoe");
        //arsenide bronze
        GameRegistry.registerItem(arsenideBronzeSword,"arsenideBronzeSword");
        GameRegistry.registerItem(arsenideBronzeShovel,"arsenideBronzeShovel");
        GameRegistry.registerItem(arsenideBronzeAxe,"arsenideBronzeAxe");
        GameRegistry.registerItem(arsenideBronzePickaxe,"arsenideBronzePickaxe");
        GameRegistry.registerItem(arsenideBronzeHoe,"arsenideBronzeHoe");
        GameRegistry.registerItem(arsenideBronzeHelm,"arsenideBronzeHelm");
        GameRegistry.registerItem(arsenideBronzeChest,"arsenideBronzeChest");
        GameRegistry.registerItem(arsenideBronzeLegs,"arsenideBronzeLegs");
        GameRegistry.registerItem(arsenideBronzeBoots,"arsenideBronzeBoots");
        //arsenide gold
        GameRegistry.registerItem(arsenideGoldSword,"arsenideGoldSword");
        GameRegistry.registerItem(arsenideGoldShovel,"arsenideGoldShovel");
        GameRegistry.registerItem(arsenideGoldAxe,"arsenideGoldAxe");
        GameRegistry.registerItem(arsenideGoldPickaxe,"arsenideGoldPickaxe");
        GameRegistry.registerItem(arsenideGoldHoe,"arsenideGoldHoe");
        GameRegistry.registerItem(arsenideGoldHelm,"arsenideGoldHelm");
        GameRegistry.registerItem(arsenideGoldChest,"arsenideGoldChest");
        GameRegistry.registerItem(arsenideGoldLegs,"arsenideGoldLegs");
        GameRegistry.registerItem(arsenideGoldBoots,"arsenideGoldBoots");
        //old lace shroud
        GameRegistry.registerItem(oldLaceChest,"oldLaceChest");
        //tenebrium
        GameRegistry.registerItem(tenebriumIngot,"tenebriumIngot");
        GameRegistry.registerItem(smallTenebriumChunkItem,"smallTenebriumChunkItem");
        GameRegistry.registerItem(mediumTenebriumChunkItem,"mediumTenebriumChunkItem");
        GameRegistry.registerItem(largeTenebriumChunkItem,"largeTenebriumChunkItem");
        GameRegistry.registerItem(tenebriumSword,"tenebriumSword");
        GameRegistry.registerItem(tenebriumShovel,"tenebriumShovel");
        GameRegistry.registerItem(tenebriumAxe,"tenebriumAxe");
        GameRegistry.registerItem(tenebriumPickaxe,"tenebriumPickaxe");
        GameRegistry.registerItem(tenebriumHoe,"tenebriumHoe");
        GameRegistry.registerItem(tenebriumHelm,"tenebriumHelm");
        GameRegistry.registerItem(tenebriumChest,"tenebriumChest");
        GameRegistry.registerItem(tenebriumLegs,"tenebriumLegs");
        GameRegistry.registerItem(tenebriumBoots,"tenebriumBoots");
        
        GameRegistry.registerBlock(blockArsenic, "blockArsenic");
        GameRegistry.registerBlock(blockArsenideBronze, "blockArsenideBronze");
        GameRegistry.registerBlock(blockArsenideGold, "blockArsenideGold");
        GameRegistry.registerBlock(blockTenebrium, "blockTenebrium");
        GameRegistry.registerBlock(plateArsenic, "plateArsenic");
        
        //Loot
        HandlerLoot.lootHandler().addLoot("villageBlacksmith", arsenicIngot, 1, 2, 2);
        HandlerLoot.lootHandler().addLoot("villageBlacksmith", arsenideBronzeIngot, 1, 2, 5);
        HandlerLoot.lootHandler().addLoot("villageBlacksmith", arsenideGoldIngot, 1, 2, 4);
        HandlerLoot.lootHandler().addLoot("villageBlacksmith", arsenicSword, 1, 2, 1);
        HandlerLoot.lootHandler().addLoot("villageBlacksmith", arsenideBronzeSword, 2, 6, 1);
        HandlerLoot.lootHandler().addLoot("villageBlacksmith", arsenideGoldSword, 2, 4, 1);
        HandlerLoot.lootHandler().addLoot("villageBlacksmith", arsenicPickaxe, 1, 2, 1);
        HandlerLoot.lootHandler().addLoot("villageBlacksmith", arsenideBronzePickaxe, 2, 6, 1);
        HandlerLoot.lootHandler().addLoot("villageBlacksmith", arsenideGoldPickaxe, 2, 4, 1);
        HandlerLoot.lootHandler().addLoot("villageBlacksmith", arsenicAxe, 1, 1, 1);
        HandlerLoot.lootHandler().addLoot("villageBlacksmith", arsenideBronzeAxe, 1, 5, 1);
        HandlerLoot.lootHandler().addLoot("villageBlacksmith", arsenideGoldAxe, 1, 2, 1);
        HandlerLoot.lootHandler().addLoot("villageBlacksmith", arsenicShovel, 1, 1, 1);
        HandlerLoot.lootHandler().addLoot("villageBlacksmith", arsenideBronzeShovel, 1, 2, 1);
        HandlerLoot.lootHandler().addLoot("villageBlacksmith", arsenideGoldShovel, 1, 1, 1);
        HandlerLoot.lootHandler().addLoot("villageBlacksmith", tenebriumPickaxe, 1, 1, 1);
        HandlerLoot.lootHandler().addLoot("villageBlacksmith", tenebriumShovel, 1, 1, 1);
        HandlerLoot.lootHandler().addLoot("dungeonChest", arsenicIngot, 1, 2, 4);
        HandlerLoot.lootHandler().addLoot("dungeonChest", arsenideBronzeIngot, 1, 2, 5);
        HandlerLoot.lootHandler().addLoot("dungeonChest", arsenideGoldIngot, 1, 2, 4);
        HandlerLoot.lootHandler().addLoot("dungeonChest", arsenicSword, 3, 5, 1);
        HandlerLoot.lootHandler().addLoot("dungeonChest", arsenideBronzeSword, 2, 6, 1);
        HandlerLoot.lootHandler().addLoot("dungeonChest", arsenideGoldSword, 2, 4, 1);
        HandlerLoot.lootHandler().addLoot("dungeonChest", arsenicPickaxe, 1, 1, 1);
        HandlerLoot.lootHandler().addLoot("dungeonChest", arsenideBronzePickaxe, 1, 3, 1);
        HandlerLoot.lootHandler().addLoot("dungeonChest", arsenideGoldPickaxe, 1, 2, 1);
        HandlerLoot.lootHandler().addLoot("dungeonChest", oldLaceChest, 4, 8, 4);
        HandlerLoot.lootHandler().addLoot("strongholdCorridor", arsenicIngot, 1, 1, 1);
        HandlerLoot.lootHandler().addLoot("strongholdCorridor", arsenideBronzeIngot, 1, 1, 2);
        HandlerLoot.lootHandler().addLoot("strongholdCorridor", arsenideGoldIngot, 1, 1, 2);
        HandlerLoot.lootHandler().addLoot("strongholdCrossing", arsenicIngot, 1, 1, 4);
        HandlerLoot.lootHandler().addLoot("strongholdCrossing", arsenideBronzeIngot, 1, 1, 6);
        HandlerLoot.lootHandler().addLoot("strongholdCrossing", arsenideGoldIngot, 1, 1, 5);
        HandlerLoot.lootHandler().addLoot("strongholdLibrary", oldLaceChest, 1, 1, 2);
        HandlerLoot.lootHandler().addLoot("strongholdLibrary", tenebriumHelm, 1, 1, 1);
        HandlerLoot.lootHandler().addLoot("strongholdLibrary", tenebriumChest, 1, 1, 1);
        HandlerLoot.lootHandler().addLoot("strongholdLibrary", tenebriumLegs, 1, 1, 1);
        HandlerLoot.lootHandler().addLoot("strongholdLibrary", tenebriumBoots, 1, 1, 1);
        HandlerLoot.lootHandler().addLoot("mineshaftCorridor", oldLaceChest, 1, 2, 2);
        HandlerLoot.lootHandler().addLoot("mineshaftCorridor", arsenideBronzeSword, 1, 1, 1);
        HandlerLoot.lootHandler().addLoot("mineshaftCorridor", arsenideGoldSword, 1, 3, 1);
        HandlerLoot.lootHandler().addLoot("mineshaftCorridor", arsenicPickaxe, 1, 1, 1);
        HandlerLoot.lootHandler().addLoot("mineshaftCorridor", arsenideBronzePickaxe, 1, 3, 1);
        HandlerLoot.lootHandler().addLoot("mineshaftCorridor", arsenideGoldPickaxe, 1, 2, 1);
        HandlerLoot.lootHandler().addLoot("mineshaftCorridor", arsenicShovel, 1, 1, 1);
        HandlerLoot.lootHandler().addLoot("mineshaftCorridor", arsenideBronzeShovel, 1, 3, 1);
        HandlerLoot.lootHandler().addLoot("mineshaftCorridor", arsenideGoldShovel, 1, 2, 1);
        HandlerLoot.lootHandler().addLoot("pyramidDesertyChest", oldLaceChest, 3, 9, 3);
        HandlerLoot.lootHandler().addLoot("pyramidDesertyChest", arsenicShovel, 1, 2, 2);
        HandlerLoot.lootHandler().addLoot("pyramidDesertyChest", tenebriumSword, 1, 2, 1);
        HandlerLoot.lootHandler().addLoot("pyramidDesertyChest", tenebriumShovel, 1, 1, 1);
        HandlerLoot.lootHandler().addLoot("pyramidDesertyChest", arsenideGoldHelm, 1, 3, 1);
        HandlerLoot.lootHandler().addLoot("pyramidDesertyChest", arsenideGoldChest, 1, 3, 1);
        HandlerLoot.lootHandler().addLoot("pyramidDesertyChest", arsenideGoldLegs, 1, 3, 1);
        HandlerLoot.lootHandler().addLoot("pyramidDesertyChest", arsenideGoldBoots, 1, 3, 1);
        HandlerLoot.lootHandler().addLoot("pyramidDesertyChest", arsenideGoldSword, 2, 4, 1);
        HandlerLoot.lootHandler().addLoot("pyramidJungleChest", arsenideSaltItem, 2, 4, 6);
        HandlerLoot.lootHandler().addLoot("pyramidJungleChest", oldLaceChest, 1, 1, 2);
        HandlerLoot.lootHandler().addLoot("pyramidJungleChest", tenebriumSword, 1, 2, 1);
        HandlerLoot.lootHandler().addLoot("pyramidJungleChest", arsenicSword, 3, 5, 2);

        if (ArsenicAndLace.werewolfEffectiveness)
            try
            {
                MinecraftForge.EVENT_BUS.register(new WerewolfHandler());
            }
            catch (ClassNotFoundException ignored) {}

        // run tab icon call
        setTabIcons();
        
        // recipes
        ArsenicRecipes.doArsenicRecipes();
        
    }

    @EventHandler // used in 1.6.2
    public void load(FMLInitializationEvent event)
    {
        proxy.registerRenderers();
        MinecraftForge.EVENT_BUS.register(new HandlerJoinWorld());
        //Armor Renderers
        // rendererArsenic = proxy.addArmor("arsenic");
        rendererArsenideBronze = proxy.addArmor("arsenideBronze");
        rendererArsenideGold = proxy.addArmor("arsenideGold");
        rendererOldLace = proxy.addArmor("oldLace");
        rendererTenebrium = proxy.addArmor("tenebrium");
        // name stuff
        LanguageRegistry.addName(arsenicIngot, "Arsenic Ingot");
        LanguageRegistry.addName(realgarItem, "Mineral Realgar");
        LanguageRegistry.addName(orpimentItem, "Mineral Orpiment");
        LanguageRegistry.addName(arsenideSaltItem, "Arsenide Salts");
        LanguageRegistry.addName(smallArsenicChunkItem, "Small Arsenic Chunk");
        LanguageRegistry.addName(mediumArsenicChunkItem, "Medium Arsenic Chunk");
        LanguageRegistry.addName(largeArsenicChunkItem, "Large Arsenic Chunk");
        LanguageRegistry.addName(arsenideBronzeIngot, "Arsenide Bronze Ingot");
        LanguageRegistry.addName(smallArsenideBronzeChunkItem, "Small Arsenide Bronze Chunk");
        LanguageRegistry.addName(mediumArsenideBronzeChunkItem, "Medium Arsenide Bronze Chunk");
        LanguageRegistry.addName(largeArsenideBronzeChunkItem, "Large Arsenide Bronze Chunk");
        LanguageRegistry.addName(arsenideGoldIngot, "Arsenide Gold Ingot");
        LanguageRegistry.addName(smallArsenideGoldChunkItem, "Small Arsenide Gold Chunk");
        LanguageRegistry.addName(mediumArsenideGoldChunkItem, "Medium Arsenide Gold Chunk");
        LanguageRegistry.addName(largeArsenideGoldChunkItem, "Large Arsenide Gold Chunk");
        LanguageRegistry.addName(arsenicSword, "Arsenic Sword");
        LanguageRegistry.addName(arsenicShovel, "Arsenic Shovel");
        LanguageRegistry.addName(arsenicAxe, "Arsenic Axe");
        LanguageRegistry.addName(arsenicPickaxe, "Arsenic Pickaxe");
        LanguageRegistry.addName(arsenicHoe, "Arsenic Hoe");
        LanguageRegistry.addName(arsenideBronzeSword, "Arsenide Bronze Sword");
        LanguageRegistry.addName(arsenideBronzeShovel, "Arsenide Bronze Shovel");
        LanguageRegistry.addName(arsenideBronzeAxe, "Arsenide Bronze Axe");
        LanguageRegistry.addName(arsenideBronzePickaxe, "Arsenide Bronze Pickaxe");
        LanguageRegistry.addName(arsenideBronzeHoe, "Arsenide Bronze Hoe");
        LanguageRegistry.addName(arsenideBronzeHelm, "Arsenide Bronze Helm");
        LanguageRegistry.addName(arsenideBronzeChest, "Arsenide Bronze Chestplate");
        LanguageRegistry.addName(arsenideBronzeLegs, "Arsenide Bronze Leggings");
        LanguageRegistry.addName(arsenideBronzeBoots, "Arsenide Bronze Boots");
        LanguageRegistry.addName(arsenideGoldSword, "Arsenide Gold Sword");
        LanguageRegistry.addName(arsenideGoldShovel, "Arsenide Gold Shovel");
        LanguageRegistry.addName(arsenideGoldAxe, "Arsenide Gold Axe");
        LanguageRegistry.addName(arsenideGoldPickaxe, "Arsenide Gold Pickaxe");
        LanguageRegistry.addName(arsenideGoldHoe, "Arsenide Gold Hoe");
        LanguageRegistry.addName(arsenideGoldHelm, "Arsenide Gold Helm");
        LanguageRegistry.addName(arsenideGoldChest, "Arsenide Gold Chestplate");
        LanguageRegistry.addName(arsenideGoldLegs, "Arsenide Gold Leggings");
        LanguageRegistry.addName(arsenideGoldBoots, "Arsenide Gold Boots");
        LanguageRegistry.addName(oldLaceChest, "Old Lace Shroud");
        LanguageRegistry.addName(tenebriumIngot, "Tenebrium Ingot");
        LanguageRegistry.addName(smallTenebriumChunkItem, "Small Tenebrium Chunk");
        LanguageRegistry.addName(mediumTenebriumChunkItem, "Medium Tenebrium Chunk");
        LanguageRegistry.addName(largeTenebriumChunkItem, "Large Tenebrium Chunk");
        LanguageRegistry.addName(tenebriumSword, "Tenebrium Sword");
        LanguageRegistry.addName(tenebriumShovel, "Tenebrium Shovel");
        LanguageRegistry.addName(tenebriumAxe, "Tenebrium Axe");
        LanguageRegistry.addName(tenebriumPickaxe, "Tenebrium Pickaxe");
        LanguageRegistry.addName(tenebriumHoe, "Tenebrium Hoe");
        LanguageRegistry.addName(tenebriumHelm, "Tenebrium Helm");
        LanguageRegistry.addName(tenebriumChest, "Tenebrium Chestplate");
        LanguageRegistry.addName(tenebriumLegs, "Tenebrium Leggings");
        LanguageRegistry.addName(tenebriumBoots, "Tenebrium Boots");
        
        LanguageRegistry.addName(blockArsenic, "Arsenic Block");
        MinecraftForge.setBlockHarvestLevel(blockArsenic, "pickaxe", 0);
        
        LanguageRegistry.addName(blockArsenideBronze, "Arsenide Bronze Block");
        MinecraftForge.setBlockHarvestLevel(blockArsenideBronze, "pickaxe", 0);
        
        LanguageRegistry.addName(blockArsenideGold, "Arsenide Gold Block");
        MinecraftForge.setBlockHarvestLevel(blockArsenideGold, "pickaxe", 0);
        
        LanguageRegistry.addName(plateArsenic, "Arsenic Pressure Plate");
        MinecraftForge.setBlockHarvestLevel(plateArsenic, "pickaxe", 0);
        
        LanguageRegistry.addName(blockTenebrium, "Tenebrium Block");
        MinecraftForge.setBlockHarvestLevel(blockTenebrium, "pickaxe", 0);
        
        MinecraftForge.setToolClass(arsenicPickaxe, "pickaxe", 1);
        MinecraftForge.setToolClass(arsenicShovel, "shovel", 1);
        MinecraftForge.setToolClass(arsenicAxe, "axe", 1);
        MinecraftForge.setToolClass(arsenideBronzePickaxe, "pickaxe", 2);
        MinecraftForge.setToolClass(arsenideBronzeShovel, "shovel", 2);
        MinecraftForge.setToolClass(arsenideBronzeAxe, "axe", 2);
        MinecraftForge.setToolClass(arsenideGoldPickaxe, "pickaxe", 1);
        MinecraftForge.setToolClass(arsenideGoldShovel, "shovel", 1);
        MinecraftForge.setToolClass(arsenideGoldAxe, "axe", 1);
        MinecraftForge.setToolClass(tenebriumPickaxe, "pickaxe", 4);
        MinecraftForge.setToolClass(tenebriumShovel, "shovel", 4);
        MinecraftForge.setToolClass(tenebriumAxe, "axe", 4);
        
        LanguageRegistry.instance().addStringLocalization("itemGroup.tabAkkamaddiArsenic", "en_US", "akkamaddi's Simple Arsenic");
        
        toolArsenic.customCraftingMaterial = ArsenicAndLace.arsenicIngot;
        toolArsenideBronze.customCraftingMaterial = ArsenicAndLace.arsenideBronzeIngot;
        toolArsenideGold.customCraftingMaterial = ArsenicAndLace.arsenideGoldIngot;
        toolTenebrium.customCraftingMaterial = ArsenicAndLace.tenebriumIngot;
        
        armorArsenideBronze.customCraftingMaterial = ArsenicAndLace.arsenideBronzeIngot;
        armorArsenideGold.customCraftingMaterial = ArsenicAndLace.arsenideGoldIngot;
        armorOldLace.customCraftingMaterial = Item.silk;
        armorTenebrium.customCraftingMaterial = ArsenicAndLace.tenebriumIngot;
        
    }

    @EventHandler // used in 1.6.2
    public void postInit(FMLPostInitializationEvent event)
    {
        // Stub Method
    }
}

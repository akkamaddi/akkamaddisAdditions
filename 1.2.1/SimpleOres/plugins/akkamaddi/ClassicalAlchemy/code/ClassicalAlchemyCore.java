package SimpleOres.plugins.akkamaddi.ClassicalAlchemy.code;

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

@Mod(modid = "classicalalchemy", name = "Classical Alchemy", version = "1.0.1", dependencies = "required-after:simpleores ; required-after:simpleoresfusion ; after:SimpleArsenic")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)

public class ClassicalAlchemyCore
{
    // The instance of your mod that Forge uses.
    @Instance("classicalalchemy")
    public static ClassicalAlchemyCore instance;

    // Says where the client and server 'proxy' code is loaded.
    @SidedProxy(clientSide = "SimpleOres.plugins.akkamaddi.ClassicalAlchemy.code.ClientProxy", serverSide = "SimpleOres.plugins.akkamaddi.ClassicalAlchemy.code.CommonProxy")
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
    
    public static int cuprumIngotID;
    public static int smallCuprumChunkItemID;
    public static int mediumCuprumChunkItemID;
    public static int largeCuprumChunkItemID;

    public static int cuprumSwordID;
    public static int cuprumShovelID;
    public static int cuprumAxeID;
    public static int cuprumPickaxeID;
    public static int cuprumHoeID;

    public static int cuprumHelmID;
    public static int cuprumChestID;
    public static int cuprumLegsID;
    public static int cuprumBootsID;

    public static int blockCuprumID;
	
	public static int pyropusBronzeIngotID;
    public static int smallPyropusBronzeChunkItemID;
    public static int mediumPyropusBronzeChunkItemID;
    public static int largePyropusBronzeChunkItemID;

    public static int pyropusBronzeSwordID;
    public static int pyropusBronzeShovelID;
    public static int pyropusBronzeAxeID;
    public static int pyropusBronzePickaxeID;
    public static int pyropusBronzeHoeID;

    public static int pyropusBronzeHelmID;
    public static int pyropusBronzeChestID;
    public static int pyropusBronzeLegsID;
    public static int pyropusBronzeBootsID;

    public static int blockPyropusBronzeID;
	
	public static int pulchrumBronzeIngotID;
    public static int largePulchrumBronzeChunkItemID;

    public static int pulchrumBronzeSwordID;
    public static int pulchrumBronzeShovelID;
    public static int pulchrumBronzeAxeID;
    public static int pulchrumBronzePickaxeID;

    public static int blockPulchrumBronzeID;

	public static int tombBronzeIngotID;
    public static int smallTombBronzeChunkItemID;
    public static int mediumTombBronzeChunkItemID;
    public static int largeTombBronzeChunkItemID;

    public static int tombBronzeSwordID;
    public static int tombBronzeShovelID;
    public static int tombBronzeAxeID;
    public static int tombBronzePickaxeID;

    public static int tombBronzeHelmID;
    public static int tombBronzeChestID;
    public static int tombBronzeLegsID;
    public static int tombBronzeBootsID;

    public static int blockTombBronzeID;
	
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
    
    public static Item cuprumIngot;
    public static Item smallCuprumChunkItem;
    public static Item mediumCuprumChunkItem;
    public static Item largeCuprumChunkItem;

    public static Item cuprumSword;
    public static Item cuprumShovel;
    public static Item cuprumAxe;
    public static Item cuprumPickaxe;
    public static Item cuprumHoe;

    public static Item cuprumHelm;
    public static Item cuprumChest;
    public static Item cuprumLegs;
    public static Item cuprumBoots;

    public static Item pyropusBronzeIngot;
    public static Item smallPyropusBronzeChunkItem;
    public static Item mediumPyropusBronzeChunkItem;
    public static Item largePyropusBronzeChunkItem;

    public static Item pyropusBronzeSword;
    public static Item pyropusBronzeShovel;
    public static Item pyropusBronzeAxe;
    public static Item pyropusBronzePickaxe;
    public static Item pyropusBronzeHoe;

    public static Item pyropusBronzeHelm;
    public static Item pyropusBronzeChest;
    public static Item pyropusBronzeLegs;
    public static Item pyropusBronzeBoots;

    public static Item pulchrumBronzeIngot;
    public static Item largePulchrumBronzeChunkItem;

    public static Item pulchrumBronzeSword;
    public static Item pulchrumBronzeShovel;
    public static Item pulchrumBronzeAxe;
    public static Item pulchrumBronzePickaxe;

    public static Item tombBronzeIngot;
    public static Item smallTombBronzeChunkItem;
    public static Item mediumTombBronzeChunkItem;
    public static Item largeTombBronzeChunkItem;

    public static Item tombBronzeSword;
    public static Item tombBronzeShovel;
    public static Item tombBronzeAxe;
    public static Item tombBronzePickaxe;

    public static Item tombBronzeHelm;
    public static Item tombBronzeChest;
    public static Item tombBronzeLegs;
    public static Item tombBronzeBoots;

    
    // set block names
    public static Block blockStannum;
    public static Block blockCuprum;
    public static Block blockPyropusBronze;
    public static Block blockPulchrumBronze;
    public static Block blockTombBronze;
    
    
    // booleans
    
    public static boolean enableRecycling;

    // tab
    public static SimpleTab tabAkkamaddiClassicalAlchemy = new SimpleTab("tabAkkamaddiClassicalAlchemy");

    // set tool properties
    // EnumToolMaterial. In form ("NAME", mining level, max uses, speed, damage to entity, enchantability)
    public static EnumToolMaterial toolStannum = EnumHelper.addToolMaterial("STANNUM", 2, 380, 8.5F, 2, 10);
    public static EnumToolMaterial toolCuprum = EnumHelper.addToolMaterial("CUPRUM", 2, 345, 9.0F, 2, 10);
    public static EnumToolMaterial toolPyropusBronze = EnumHelper.addToolMaterial("PYROPUSBRONZE", 2, 770, 9.5F, 3, 18);
    public static EnumToolMaterial toolPulchrumBronze = EnumHelper.addToolMaterial("PULCHRUMBRONZE", 3, 336, 12.0F, 3, 22);
    public static EnumToolMaterial toolTombBronze = EnumHelper.addToolMaterial("TOMBBRONZE", 3, 890, 13.5F, 3, 28);
    
    /**
     * EnumArmorMaterial. In form ("NAME", max damage (like uses, multiply by pieces for their max damage), new int[] {helmet defense, chestplate defense, leggings defense, boots defense}, enchantability)
     */
    public static EnumArmorMaterial armorStannum = EnumHelper.addArmorMaterial("STANNUM", 14, new int[] {2, 4, 3, 2}, 10);
    public static EnumArmorMaterial armorCuprum = EnumHelper.addArmorMaterial("CUPRUM", 13, new int[] {2, 4, 3, 2}, 9);
    public static EnumArmorMaterial armorPyropusBronze = EnumHelper.addArmorMaterial("PYROPUSBRONZE", 20, new int[] {4, 5, 4, 2}, 18);
    public static EnumArmorMaterial armorTombBronze = EnumHelper.addArmorMaterial("TOMBBRONZE", 24, new int[] {4, 6, 5, 4}, 28);

    // Armor
    public static int rendererStannum;
    public static int rendererCuprum;
    public static int rendererPyropusBronze;
    public static int rendererTombBronze;

// Tab
    public void setTabIcons()
    {
        /**
         * Creating the custom tabs using the API class "SimpleTab" and setting their icon.
         */
        tabAkkamaddiClassicalAlchemy.setIcon(new ItemStack(ClassicalAlchemyCore.blockPyropusBronze));
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

		cuprumIngotID = config.getItem("021. Cuprum Item", "Cuprum Ingot", 12463).getInt();
        smallCuprumChunkItemID = config.getItem("021. Cuprum Item", "Small Cuprum Chunk", 12464).getInt();
        mediumCuprumChunkItemID = config.getItem("021. Cuprum Item", "Medium Cuprum Chunk", 12465).getInt();
        largeCuprumChunkItemID = config.getItem("021. Cuprum Item", "Large Cuprum Chunk", 12466).getInt();
		
        cuprumSwordID = config.getItem("022. Cuprum Tool", "Cuprum Sword", 12467).getInt();
        cuprumShovelID = config.getItem("022. Cuprum Tool", "Cuprum Shovel", 12468).getInt();
        cuprumAxeID = config.getItem("022. Cuprum Tool", "Cuprum Axe", 12469).getInt();
        cuprumPickaxeID = config.getItem("022. Cuprum Tool", "Cuprum Pickaxe", 12470).getInt();
        cuprumHoeID = config.getItem("022. Cuprum Tool", "Cuprum Hoe", 12471).getInt();
		
        cuprumHelmID = config.getItem("023. Cuprum Armor", "Cuprum Helm", 12472).getInt();
        cuprumChestID = config.getItem("023. Cuprum Armor", "Cuprum Chest Plate", 12473).getInt();
        cuprumLegsID = config.getItem("023. Cuprum Armor", "Cuprum Leggings", 12474).getInt();
        cuprumBootsID = config.getItem("023. Cuprum Armor", "Cuprum Boots", 12475).getInt();
		
        blockCuprumID = config.getBlock("024. Cuprum Block", "Cuprum Storage Block", 1341).getInt();
        
		pyropusBronzeIngotID = config.getItem("031. Pyropus Bronze Item", "Pyropus Bronze Ingot", 12476).getInt();
        smallPyropusBronzeChunkItemID = config.getItem("031. Pyropus Bronze Item", "Small Pyropus Bronze Chunk", 12477).getInt();
        mediumPyropusBronzeChunkItemID = config.getItem("031. Pyropus Bronze Item", "Medium Pyropus Bronze Chunk", 12478).getInt();
        largePyropusBronzeChunkItemID = config.getItem("031. Pyropus Bronze Item", "Large Pyropus Bronze Chunk", 12479).getInt();
		
        pyropusBronzeSwordID = config.getItem("032. Pyropus Bronze Tool", "Pyropus Bronze Sword", 12480).getInt();
        pyropusBronzeShovelID = config.getItem("032. Pyropus Bronze Tool", "Pyropus Bronze Shovel", 12481).getInt();
        pyropusBronzeAxeID = config.getItem("032. Pyropus Bronze Tool", "Pyropus Bronze Axe", 12482).getInt();
        pyropusBronzePickaxeID = config.getItem("032. Pyropus Bronze Tool", "Pyropus Bronze Pickaxe", 12483).getInt();
        pyropusBronzeHoeID = config.getItem("032. Pyropus Bronze Tool", "Pyropus Bronze Hoe", 12484).getInt();
		
        pyropusBronzeHelmID = config.getItem("033. Pyropus Bronze Armor", "Pyropus Bronze Helm", 12485).getInt();
        pyropusBronzeChestID = config.getItem("033. Pyropus Bronze Armor", "Pyropus Bronze Chest Plate", 12486).getInt();
        pyropusBronzeLegsID = config.getItem("033. Pyropus Bronze Armor", "Pyropus Bronze Leggings", 12487).getInt();
        pyropusBronzeBootsID = config.getItem("033. Pyropus Bronze Armor", "Pyropus Bronze Boots", 12488).getInt();
		
        blockPyropusBronzeID = config.getBlock("034. Pyropus Bronze Block", "Pyropus Bronze Storage Block", 1342).getInt();
        
		pulchrumBronzeIngotID = config.getItem("041. Pulchrum Bronze Item", "Pulchrum Bronze Ingot", 12489).getInt();
        largePulchrumBronzeChunkItemID = config.getItem("041. Pulchrum Bronze Item", "Large Pulchrum Bronze Chunk", 12490).getInt();
		
        pulchrumBronzeSwordID = config.getItem("042. Pulchrum Bronze Tool", "Pulchrum Bronze Sword", 12491).getInt();
        pulchrumBronzeShovelID = config.getItem("042. Pulchrum Bronze Tool", "Pulchrum Bronze Shovel", 12492).getInt();
        pulchrumBronzeAxeID = config.getItem("042. Pulchrum Bronze Tool", "Pulchrum Bronze Axe", 12493).getInt();
        pulchrumBronzePickaxeID = config.getItem("042. Pulchrum Bronze Tool", "Pulchrum Bronze Pickaxe", 12494).getInt();
		
        blockPulchrumBronzeID = config.getBlock("044. Pulchrum Bronze Block", "Pulchrum Bronze Storage Block", 1343).getInt();

		tombBronzeIngotID = config.getItem("051. Tomb Bronze Item", "Tomb Bronze Ingot", 12495).getInt();
        smallTombBronzeChunkItemID = config.getItem("051. Tomb Bronze Item", "Small Tomb Bronze Chunk", 12496).getInt();
        mediumTombBronzeChunkItemID = config.getItem("051. Tomb Bronze Item", "Medium Tomb Bronze Chunk", 12497).getInt();
        largeTombBronzeChunkItemID = config.getItem("051. Tomb Bronze Item", "Large Tomb Bronze Chunk", 12498).getInt();
		
        tombBronzeSwordID = config.getItem("052. Tomb Bronze Tool", "Pyropu sBronze Sword", 12499).getInt();
        tombBronzeShovelID = config.getItem("052. Tomb Bronze Tool", "Tomb Bronze Shovel", 12500).getInt();
        tombBronzeAxeID = config.getItem("052. Tomb Bronze Tool", "Tomb Bronze Axe", 12501).getInt();
        tombBronzePickaxeID = config.getItem("052. Tomb Bronze Tool", "Tomb Bronze Pickaxe", 12502).getInt();
		
        tombBronzeHelmID = config.getItem("053. Tomb Bronze Armor", "Tomb Bronze Helm", 12503).getInt();
        tombBronzeChestID = config.getItem("053. Tomb Bronze Armor", "Tomb Bronze Chest Plate", 12504).getInt();
        tombBronzeLegsID = config.getItem("053. Tomb Bronze Armor", "Tomb Bronze Leggings", 12505).getInt();
        tombBronzeBootsID = config.getItem("053. Tomb Bronze Armor", "Tomb Bronze Boots", 12506).getInt();
		
        blockTombBronzeID = config.getBlock("054. Tomb Bronze Block", "Tomb Bronze Storage Block", 1344).getInt();
        
        enableRecycling= config.get(Configuration.CATEGORY_GENERAL, "Enable Classical Alchemy item recycling recipes: false or true?", false).getBoolean(false);
		
        config.save();
        
		// define items
		
        // Stannum
        
		stannumIngot = new SimpleIngot(stannumIngotID, "classicalalchemy", ClassicalAlchemyCore.tabAkkamaddiClassicalAlchemy).setUnlocalizedName("stannumIngot");
        smallStannumChunkItem = new SimpleIngot(smallStannumChunkItemID, "classicalalchemy", ClassicalAlchemyCore.tabAkkamaddiClassicalAlchemy).setUnlocalizedName("smallStannumChunkItem");
        mediumStannumChunkItem = new SimpleIngot(mediumStannumChunkItemID, "classicalalchemy", ClassicalAlchemyCore.tabAkkamaddiClassicalAlchemy).setUnlocalizedName("mediumStannumChunkItem");
        largeStannumChunkItem = new SimpleIngot(largeStannumChunkItemID, "classicalalchemy", ClassicalAlchemyCore.tabAkkamaddiClassicalAlchemy).setUnlocalizedName("largeStannumChunkItem");
        
		stannumSword = new SimpleSword(stannumSwordID, toolStannum, "classicalalchemy", ClassicalAlchemyCore.tabAkkamaddiClassicalAlchemy).setUnlocalizedName("stannumSword");
        stannumShovel = new SimpleShovel(stannumShovelID, toolStannum, "classicalalchemy", ClassicalAlchemyCore.tabAkkamaddiClassicalAlchemy).setUnlocalizedName("stannumShovel");
        stannumAxe = new SimpleAxe(stannumAxeID, toolStannum, "classicalalchemy", ClassicalAlchemyCore.tabAkkamaddiClassicalAlchemy).setUnlocalizedName("stannumAxe");
        stannumPickaxe = new SimplePickaxe(stannumPickaxeID, toolStannum, "classicalalchemy", ClassicalAlchemyCore.tabAkkamaddiClassicalAlchemy).setUnlocalizedName("stannumPickaxe");
        stannumHoe = new SimpleHoe(stannumHoeID, toolStannum, "classicalalchemy", ClassicalAlchemyCore.tabAkkamaddiClassicalAlchemy).setUnlocalizedName("stannumHoe");
        
		stannumHelm = new SimpleArmor(stannumHelmID, armorStannum, rendererStannum, 0, "stannum", "classicalalchemy", ClassicalAlchemyCore.tabAkkamaddiClassicalAlchemy).setUnlocalizedName("stannumHelm");
        stannumChest = new SimpleArmor(stannumChestID, armorStannum, rendererStannum, 1, "stannum", "classicalalchemy", ClassicalAlchemyCore.tabAkkamaddiClassicalAlchemy).setUnlocalizedName("stannumChest");
        stannumLegs = new SimpleArmor(stannumLegsID, armorStannum, rendererStannum, 2, "stannum", "classicalalchemy", ClassicalAlchemyCore.tabAkkamaddiClassicalAlchemy).setUnlocalizedName("stannumLegs");
        stannumBoots = new SimpleArmor(stannumBootsID, armorStannum, rendererStannum, 3, "stannum", "classicalalchemy", ClassicalAlchemyCore.tabAkkamaddiClassicalAlchemy).setUnlocalizedName("stannumBoots");

		cuprumIngot = new SimpleIngot(cuprumIngotID, "classicalalchemy", ClassicalAlchemyCore.tabAkkamaddiClassicalAlchemy).setUnlocalizedName("cuprumIngot");
        smallCuprumChunkItem = new SimpleIngot(smallCuprumChunkItemID, "classicalalchemy", ClassicalAlchemyCore.tabAkkamaddiClassicalAlchemy).setUnlocalizedName("smallCuprumChunkItem");
        mediumCuprumChunkItem = new SimpleIngot(mediumCuprumChunkItemID, "classicalalchemy", ClassicalAlchemyCore.tabAkkamaddiClassicalAlchemy).setUnlocalizedName("mediumCuprumChunkItem");
        largeCuprumChunkItem = new SimpleIngot(largeCuprumChunkItemID, "classicalalchemy", ClassicalAlchemyCore.tabAkkamaddiClassicalAlchemy).setUnlocalizedName("largeCuprumChunkItem");
        
		cuprumSword = new SimpleSword(cuprumSwordID, toolCuprum, "classicalalchemy", ClassicalAlchemyCore.tabAkkamaddiClassicalAlchemy).setUnlocalizedName("cuprumSword");
        cuprumShovel = new SimpleShovel(cuprumShovelID, toolCuprum, "classicalalchemy", ClassicalAlchemyCore.tabAkkamaddiClassicalAlchemy).setUnlocalizedName("cuprumShovel");
        cuprumAxe = new SimpleAxe(cuprumAxeID, toolCuprum, "classicalalchemy", ClassicalAlchemyCore.tabAkkamaddiClassicalAlchemy).setUnlocalizedName("cuprumAxe");
        cuprumPickaxe = new SimplePickaxe(cuprumPickaxeID, toolCuprum, "classicalalchemy", ClassicalAlchemyCore.tabAkkamaddiClassicalAlchemy).setUnlocalizedName("cuprumPickaxe");
        cuprumHoe = new SimpleHoe(cuprumHoeID, toolCuprum, "classicalalchemy", ClassicalAlchemyCore.tabAkkamaddiClassicalAlchemy).setUnlocalizedName("cuprumHoe");
        
		cuprumHelm = new SimpleArmor(cuprumHelmID, armorCuprum, rendererCuprum, 0, "cuprum", "classicalalchemy", ClassicalAlchemyCore.tabAkkamaddiClassicalAlchemy).setUnlocalizedName("cuprumHelm");
        cuprumChest = new SimpleArmor(cuprumChestID, armorCuprum, rendererCuprum, 1, "cuprum", "classicalalchemy", ClassicalAlchemyCore.tabAkkamaddiClassicalAlchemy).setUnlocalizedName("cuprumChest");
        cuprumLegs = new SimpleArmor(cuprumLegsID, armorCuprum, rendererCuprum, 2, "cuprum", "classicalalchemy", ClassicalAlchemyCore.tabAkkamaddiClassicalAlchemy).setUnlocalizedName("cuprumLegs");
        cuprumBoots = new SimpleArmor(cuprumBootsID, armorCuprum, rendererCuprum, 3, "cuprum", "classicalalchemy", ClassicalAlchemyCore.tabAkkamaddiClassicalAlchemy).setUnlocalizedName("cuprumBoots");
        
		pyropusBronzeIngot = new SimpleIngot(pyropusBronzeIngotID, "classicalalchemy", ClassicalAlchemyCore.tabAkkamaddiClassicalAlchemy).setUnlocalizedName("pyropusBronzeIngot");
        smallPyropusBronzeChunkItem = new SimpleIngot(smallPyropusBronzeChunkItemID, "classicalalchemy", ClassicalAlchemyCore.tabAkkamaddiClassicalAlchemy).setUnlocalizedName("smallPyropusBronzeChunkItem");
        mediumPyropusBronzeChunkItem = new SimpleIngot(mediumPyropusBronzeChunkItemID, "classicalalchemy", ClassicalAlchemyCore.tabAkkamaddiClassicalAlchemy).setUnlocalizedName("mediumPyropusBronzeChunkItem");
        largePyropusBronzeChunkItem = new SimpleIngot(largePyropusBronzeChunkItemID, "classicalalchemy", ClassicalAlchemyCore.tabAkkamaddiClassicalAlchemy).setUnlocalizedName("largePyropusBronzeChunkItem");
        
		pyropusBronzeSword = new SimpleSword(pyropusBronzeSwordID, toolPyropusBronze, "classicalalchemy", ClassicalAlchemyCore.tabAkkamaddiClassicalAlchemy).setUnlocalizedName("pyropusBronzeSword");
        pyropusBronzeShovel = new SimpleShovel(pyropusBronzeShovelID, toolPyropusBronze, "classicalalchemy", ClassicalAlchemyCore.tabAkkamaddiClassicalAlchemy).setUnlocalizedName("pyropusBronzeShovel");
        pyropusBronzeAxe = new SimpleAxe(pyropusBronzeAxeID, toolPyropusBronze, "classicalalchemy", ClassicalAlchemyCore.tabAkkamaddiClassicalAlchemy).setUnlocalizedName("pyropusBronzeAxe");
        pyropusBronzePickaxe = new SimplePickaxe(pyropusBronzePickaxeID, toolPyropusBronze, "classicalalchemy", ClassicalAlchemyCore.tabAkkamaddiClassicalAlchemy).setUnlocalizedName("pyropusBronzePickaxe");
        pyropusBronzeHoe = new SimpleHoe(pyropusBronzeHoeID, toolPyropusBronze, "classicalalchemy", ClassicalAlchemyCore.tabAkkamaddiClassicalAlchemy).setUnlocalizedName("pyropusBronzeHoe");
        
		pyropusBronzeHelm = new SimpleArmor(pyropusBronzeHelmID, armorPyropusBronze, rendererPyropusBronze, 0, "pyropusBronze", "classicalalchemy", ClassicalAlchemyCore.tabAkkamaddiClassicalAlchemy).setUnlocalizedName("pyropusBronzeHelm");
        pyropusBronzeChest = new SimpleArmor(pyropusBronzeChestID, armorPyropusBronze, rendererPyropusBronze, 1, "pyropusBronze", "classicalalchemy", ClassicalAlchemyCore.tabAkkamaddiClassicalAlchemy).setUnlocalizedName("pyropusBronzeChest");
        pyropusBronzeLegs = new SimpleArmor(pyropusBronzeLegsID, armorPyropusBronze, rendererPyropusBronze, 2, "pyropusBronze", "classicalalchemy", ClassicalAlchemyCore.tabAkkamaddiClassicalAlchemy).setUnlocalizedName("pyropusBronzeLegs");
        pyropusBronzeBoots = new SimpleArmor(pyropusBronzeBootsID, armorPyropusBronze, rendererPyropusBronze, 3, "pyropusBronze", "classicalalchemy", ClassicalAlchemyCore.tabAkkamaddiClassicalAlchemy).setUnlocalizedName("pyropusBronzeBoots");
        
		pulchrumBronzeIngot = new SimpleIngot(pulchrumBronzeIngotID, "classicalalchemy", ClassicalAlchemyCore.tabAkkamaddiClassicalAlchemy).setUnlocalizedName("pulchrumBronzeIngot");
        largePulchrumBronzeChunkItem = new SimpleIngot(largePulchrumBronzeChunkItemID, "classicalalchemy", ClassicalAlchemyCore.tabAkkamaddiClassicalAlchemy).setUnlocalizedName("largePulchrumBronzeChunkItem");
        
		pulchrumBronzeSword = new SimpleSword(pulchrumBronzeSwordID, toolPulchrumBronze, "classicalalchemy", ClassicalAlchemyCore.tabAkkamaddiClassicalAlchemy).setUnlocalizedName("pulchrumBronzeSword");
        pulchrumBronzeShovel = new SimpleShovel(pulchrumBronzeShovelID, toolPulchrumBronze, "classicalalchemy", ClassicalAlchemyCore.tabAkkamaddiClassicalAlchemy).setUnlocalizedName("pulchrumBronzeShovel");
        pulchrumBronzeAxe = new SimpleAxe(pulchrumBronzeAxeID, toolPulchrumBronze, "classicalalchemy", ClassicalAlchemyCore.tabAkkamaddiClassicalAlchemy).setUnlocalizedName("pulchrumBronzeAxe");
        pulchrumBronzePickaxe = new SimplePickaxe(pulchrumBronzePickaxeID, toolPulchrumBronze, "classicalalchemy", ClassicalAlchemyCore.tabAkkamaddiClassicalAlchemy).setUnlocalizedName("pulchrumBronzePickaxe");

		tombBronzeIngot = new SimpleIngot(tombBronzeIngotID, "classicalalchemy", ClassicalAlchemyCore.tabAkkamaddiClassicalAlchemy).setUnlocalizedName("tombBronzeIngot");
        smallTombBronzeChunkItem = new SimpleIngot(smallTombBronzeChunkItemID, "classicalalchemy", ClassicalAlchemyCore.tabAkkamaddiClassicalAlchemy).setUnlocalizedName("smallTombBronzeChunkItem");
        mediumTombBronzeChunkItem = new SimpleIngot(mediumTombBronzeChunkItemID, "classicalalchemy", ClassicalAlchemyCore.tabAkkamaddiClassicalAlchemy).setUnlocalizedName("mediumTombBronzeChunkItem");
        largeTombBronzeChunkItem = new SimpleIngot(largeTombBronzeChunkItemID, "classicalalchemy", ClassicalAlchemyCore.tabAkkamaddiClassicalAlchemy).setUnlocalizedName("largeTombBronzeChunkItem");
        
		tombBronzeSword = new SimpleSword(tombBronzeSwordID, toolTombBronze, "classicalalchemy", ClassicalAlchemyCore.tabAkkamaddiClassicalAlchemy).setUnlocalizedName("tombBronzeSword");
        tombBronzeShovel = new SimpleShovel(tombBronzeShovelID, toolTombBronze, "classicalalchemy", ClassicalAlchemyCore.tabAkkamaddiClassicalAlchemy).setUnlocalizedName("tombBronzeShovel");
        tombBronzeAxe = new SimpleAxe(tombBronzeAxeID, toolTombBronze, "classicalalchemy", ClassicalAlchemyCore.tabAkkamaddiClassicalAlchemy).setUnlocalizedName("tombBronzeAxe");
        tombBronzePickaxe = new SimplePickaxe(tombBronzePickaxeID, toolTombBronze, "classicalalchemy", ClassicalAlchemyCore.tabAkkamaddiClassicalAlchemy).setUnlocalizedName("tombBronzePickaxe");
        
		tombBronzeHelm = new SimpleArmor(tombBronzeHelmID, armorTombBronze, rendererTombBronze, 0, "tombBronze", "classicalalchemy", ClassicalAlchemyCore.tabAkkamaddiClassicalAlchemy).setUnlocalizedName("tombBronzeHelm");
        tombBronzeChest = new SimpleArmor(tombBronzeChestID, armorTombBronze, rendererTombBronze, 1, "tombBronze", "classicalalchemy", ClassicalAlchemyCore.tabAkkamaddiClassicalAlchemy).setUnlocalizedName("tombBronzeChest");
        tombBronzeLegs = new SimpleArmor(tombBronzeLegsID, armorTombBronze, rendererTombBronze, 2, "tombBronze", "classicalalchemy", ClassicalAlchemyCore.tabAkkamaddiClassicalAlchemy).setUnlocalizedName("tombBronzeLegs");
        tombBronzeBoots = new SimpleArmor(tombBronzeBootsID, armorTombBronze, rendererTombBronze, 3, "tombBronze", "classicalalchemy", ClassicalAlchemyCore.tabAkkamaddiClassicalAlchemy).setUnlocalizedName("tombBronzeBoots");
        
		// define blocks
        
		blockStannum = new SimpleOre(blockStannumID, Material.iron, "classicalalchemy", ClassicalAlchemyCore.tabAkkamaddiClassicalAlchemy)
        .setHardness(8.0F).setResistance(15.0F).setStepSound(Block.soundMetalFootstep)
        .setUnlocalizedName("blockStannum");

		blockCuprum = new SimpleOre(blockCuprumID, Material.iron, "classicalalchemy", ClassicalAlchemyCore.tabAkkamaddiClassicalAlchemy)
        .setHardness(8.0F).setResistance(16.0F).setStepSound(Block.soundMetalFootstep)
        .setUnlocalizedName("blockCuprum");
		
		blockPyropusBronze = new SimpleOre(blockPyropusBronzeID, Material.iron, "classicalalchemy", ClassicalAlchemyCore.tabAkkamaddiClassicalAlchemy)
        .setHardness(10.0F).setResistance(18.0F).setStepSound(Block.soundMetalFootstep)
        .setUnlocalizedName("blockPyropusBronze");
		
		blockPulchrumBronze = new SimpleOre(blockPulchrumBronzeID, Material.iron, "classicalalchemy", ClassicalAlchemyCore.tabAkkamaddiClassicalAlchemy)
        .setHardness(8.0F).setResistance(20.0F).setStepSound(Block.soundMetalFootstep)
        .setUnlocalizedName("blockPulchrumBronze");

		blockTombBronze = new SimpleOre(blockTombBronzeID, Material.iron, "classicalalchemy", ClassicalAlchemyCore.tabAkkamaddiClassicalAlchemy)
        .setHardness(12.0F).setResistance(24.0F).setStepSound(Block.soundMetalFootstep)
        .setUnlocalizedName("blockTombBronze");
		
		// Item Registry
		
        GameRegistry.registerBlock(blockStannum, "blockStannum");
		GameRegistry.registerBlock(blockCuprum, "blockCuprum");
		GameRegistry.registerBlock(blockPyropusBronze, "blockPyropusBronze");
		GameRegistry.registerBlock(blockPulchrumBronze, "blockPulchrumBronze");
		GameRegistry.registerBlock(blockTombBronze, "blockTombBronze");
		
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
        
        GameRegistry.registerItem(cuprumIngot, "cuprumIngot");
        GameRegistry.registerItem(smallCuprumChunkItem,"smallCuprumChunkItem");
        GameRegistry.registerItem(mediumCuprumChunkItem,"mediumCuprumChunkItem");
        GameRegistry.registerItem(largeCuprumChunkItem,"largeCuprumChunkItem");

        GameRegistry.registerItem(cuprumSword,"cuprumSword");
        GameRegistry.registerItem(cuprumShovel,"cuprumShovel");
        GameRegistry.registerItem(cuprumAxe,"cuprumAxe");
        GameRegistry.registerItem(cuprumPickaxe,"cuprumPickaxe");
        GameRegistry.registerItem(cuprumHoe,"cuprumHoe");

        GameRegistry.registerItem(cuprumHelm,"cuprumHelm");
        GameRegistry.registerItem(cuprumChest,"cuprumChest");
        GameRegistry.registerItem(cuprumLegs,"cuprumLegs");
        GameRegistry.registerItem(cuprumBoots,"cuprumBoots");
        
        GameRegistry.registerItem(pyropusBronzeIngot, "pyropusBronzeIngot");
        GameRegistry.registerItem(smallPyropusBronzeChunkItem,"smallPyropusBronzeChunkItem");
        GameRegistry.registerItem(mediumPyropusBronzeChunkItem,"mediumPyropusBronzeChunkItem");
        GameRegistry.registerItem(largePyropusBronzeChunkItem,"largePyropusBronzeChunkItem");

        GameRegistry.registerItem(pyropusBronzeSword,"pyropusBronzeSword");
        GameRegistry.registerItem(pyropusBronzeShovel,"pyropusBronzeShovel");
        GameRegistry.registerItem(pyropusBronzeAxe,"pyropusBronzeAxe");
        GameRegistry.registerItem(pyropusBronzePickaxe,"pyropusBronzePickaxe");
        GameRegistry.registerItem(pyropusBronzeHoe,"pyropusBronzeHoe");

        GameRegistry.registerItem(pyropusBronzeHelm,"pyropusBronzeHelm");
        GameRegistry.registerItem(pyropusBronzeChest,"pyropusBronzeChest");
        GameRegistry.registerItem(pyropusBronzeLegs,"pyropusBronzeLegs");
        GameRegistry.registerItem(pyropusBronzeBoots,"pyropusBronzeBoots");
        
        GameRegistry.registerItem(pulchrumBronzeIngot, "pulchrumBronzeIngot");
        GameRegistry.registerItem(largePulchrumBronzeChunkItem,"largePulchrumBronzeChunkItem");

        GameRegistry.registerItem(pulchrumBronzeSword,"pulchrumBronzeSword");
        GameRegistry.registerItem(pulchrumBronzeShovel,"pulchrumBronzeShovel");
        GameRegistry.registerItem(pulchrumBronzeAxe,"pulchrumBronzeAxe");
        GameRegistry.registerItem(pulchrumBronzePickaxe,"pulchrumBronzePickaxe");

        GameRegistry.registerItem(tombBronzeIngot, "tombBronzeIngot");
        GameRegistry.registerItem(smallTombBronzeChunkItem,"smallTombBronzeChunkItem");
        GameRegistry.registerItem(mediumTombBronzeChunkItem,"mediumTombBronzeChunkItem");
        GameRegistry.registerItem(largeTombBronzeChunkItem,"largeTombBronzeChunkItem");

        GameRegistry.registerItem(tombBronzeSword,"tombBronzeSword");
        GameRegistry.registerItem(tombBronzeShovel,"tombBronzeShovel");
        GameRegistry.registerItem(tombBronzeAxe,"tombBronzeAxe");
        GameRegistry.registerItem(tombBronzePickaxe,"tombBronzePickaxe");

        GameRegistry.registerItem(tombBronzeHelm,"tombBronzeHelm");
        GameRegistry.registerItem(tombBronzeChest,"tombBronzeChest");
        GameRegistry.registerItem(tombBronzeLegs,"tombBronzeLegs");
        GameRegistry.registerItem(tombBronzeBoots,"tombBronzeBoots");
        


        // loot
        HandlerLoot.lootHandler().addLoot("mineshaftCorridor", stannumIngot, 2, 4, 2);
        HandlerLoot.lootHandler().addLoot("mineshaftCorridor", stannumSword, 1, 2, 1);
        HandlerLoot.lootHandler().addLoot("mineshaftCorridor", stannumPickaxe, 1, 5, 1);
        HandlerLoot.lootHandler().addLoot("mineshaftCorridor", stannumShovel, 2, 4, 1);
        HandlerLoot.lootHandler().addLoot("mineshaftCorridor", stannumAxe, 1, 3, 1);
        HandlerLoot.lootHandler().addLoot("villageBlacksmith", stannumIngot, 3, 6, 2);
        HandlerLoot.lootHandler().addLoot("villageBlacksmith", stannumSword, 3, 5, 1);
        HandlerLoot.lootHandler().addLoot("villageBlacksmith", stannumPickaxe, 2, 4, 1);
        HandlerLoot.lootHandler().addLoot("villageBlacksmith", stannumAxe, 2, 4, 1);
        HandlerLoot.lootHandler().addLoot("villageBlacksmith", stannumHoe, 1, 2, 1);
        HandlerLoot.lootHandler().addLoot("villageBlacksmith", stannumHelm, 2, 3, 1);
        HandlerLoot.lootHandler().addLoot("villageBlacksmith", stannumChest, 2, 4, 1);
        HandlerLoot.lootHandler().addLoot("villageBlacksmith", stannumLegs, 2, 3, 1);
        HandlerLoot.lootHandler().addLoot("villageBlacksmith", stannumBoots, 2, 3, 1);
        HandlerLoot.lootHandler().addLoot("dungeonChest", stannumIngot, 3, 5, 2);
        HandlerLoot.lootHandler().addLoot("dungeonChest", stannumSword, 2, 3, 1);
        HandlerLoot.lootHandler().addLoot("dungeonChest", stannumPickaxe, 2, 3, 1);
        HandlerLoot.lootHandler().addLoot("dungeonChest", stannumShovel, 1, 1, 1);
        
        HandlerLoot.lootHandler().addLoot("mineshaftCorridor", cuprumIngot, 2, 4, 2);
        HandlerLoot.lootHandler().addLoot("mineshaftCorridor", cuprumSword, 1, 2, 1);
        HandlerLoot.lootHandler().addLoot("mineshaftCorridor", cuprumPickaxe, 1, 5, 1);
        HandlerLoot.lootHandler().addLoot("mineshaftCorridor", cuprumShovel, 2, 4, 1);
        HandlerLoot.lootHandler().addLoot("mineshaftCorridor", cuprumAxe, 1, 2, 1);
        HandlerLoot.lootHandler().addLoot("villageBlacksmith", cuprumIngot, 3, 6, 2);
        HandlerLoot.lootHandler().addLoot("villageBlacksmith", cuprumSword, 3, 5, 1);
        HandlerLoot.lootHandler().addLoot("villageBlacksmith", cuprumPickaxe, 2, 4, 1);
        HandlerLoot.lootHandler().addLoot("villageBlacksmith", cuprumAxe, 2, 4, 1);
        HandlerLoot.lootHandler().addLoot("villageBlacksmith", cuprumHoe, 1, 2, 1);
        HandlerLoot.lootHandler().addLoot("villageBlacksmith", cuprumHelm, 2, 3, 1);
        HandlerLoot.lootHandler().addLoot("villageBlacksmith", cuprumChest, 2, 4, 1);
        HandlerLoot.lootHandler().addLoot("villageBlacksmith", cuprumLegs, 2, 3, 1);
        HandlerLoot.lootHandler().addLoot("villageBlacksmith", cuprumBoots, 2, 3, 1);
        HandlerLoot.lootHandler().addLoot("dungeonChest", cuprumIngot, 3, 5, 2);
        HandlerLoot.lootHandler().addLoot("dungeonChest", cuprumSword, 2, 3, 1);
        HandlerLoot.lootHandler().addLoot("dungeonChest", cuprumPickaxe, 2, 3, 1);
        HandlerLoot.lootHandler().addLoot("dungeonChest", cuprumShovel, 1, 1, 1);
        
        HandlerLoot.lootHandler().addLoot("mineshaftCorridor", pyropusBronzePickaxe, 3, 5, 1);
        HandlerLoot.lootHandler().addLoot("mineshaftCorridor", pyropusBronzeShovel, 2, 3, 1);
        HandlerLoot.lootHandler().addLoot("mineshaftCorridor", pyropusBronzeAxe, 1, 1, 1);
        HandlerLoot.lootHandler().addLoot("villageBlacksmith", pyropusBronzeIngot, 2, 3, 2);
        HandlerLoot.lootHandler().addLoot("villageBlacksmith", pyropusBronzeSword, 1, 3, 1);
        HandlerLoot.lootHandler().addLoot("villageBlacksmith", pyropusBronzePickaxe, 2, 4, 1);
        HandlerLoot.lootHandler().addLoot("villageBlacksmith", pyropusBronzeAxe, 2, 4, 1);
        HandlerLoot.lootHandler().addLoot("villageBlacksmith", pyropusBronzeHoe, 1, 2, 1);
        HandlerLoot.lootHandler().addLoot("villageBlacksmith", pyropusBronzeHelm, 1, 2, 1);
        HandlerLoot.lootHandler().addLoot("villageBlacksmith", pyropusBronzeChest, 1, 2, 1);
        HandlerLoot.lootHandler().addLoot("villageBlacksmith", pyropusBronzeLegs, 1, 2, 1);
        HandlerLoot.lootHandler().addLoot("villageBlacksmith", pyropusBronzeBoots, 1, 2, 1);
        HandlerLoot.lootHandler().addLoot("dungeonChest", pyropusBronzeIngot, 3, 4, 3);
        HandlerLoot.lootHandler().addLoot("dungeonChest", pyropusBronzeSword, 1, 3, 1);
        HandlerLoot.lootHandler().addLoot("dungeonChest", pyropusBronzePickaxe, 1, 3, 1);
        HandlerLoot.lootHandler().addLoot("dungeonChest", pyropusBronzeShovel, 1, 1, 1);
        
        HandlerLoot.lootHandler().addLoot("mineshaftCorridor", pulchrumBronzePickaxe, 1, 3, 1);
        HandlerLoot.lootHandler().addLoot("mineshaftCorridor", pulchrumBronzeShovel, 1, 2, 1);
        HandlerLoot.lootHandler().addLoot("mineshaftCorridor", pulchrumBronzeAxe, 1, 1, 1);
        HandlerLoot.lootHandler().addLoot("villageBlacksmith", pulchrumBronzeIngot, 1, 3, 2);
        HandlerLoot.lootHandler().addLoot("villageBlacksmith", pulchrumBronzeSword, 1, 3, 1);
        HandlerLoot.lootHandler().addLoot("villageBlacksmith", pulchrumBronzePickaxe, 1, 3, 1);
        HandlerLoot.lootHandler().addLoot("villageBlacksmith", pulchrumBronzeAxe, 1, 2, 1);
        HandlerLoot.lootHandler().addLoot("dungeonChest", pulchrumBronzeIngot, 1, 2, 2);
        HandlerLoot.lootHandler().addLoot("dungeonChest", pulchrumBronzeSword, 1, 1, 1);
        HandlerLoot.lootHandler().addLoot("dungeonChest", pulchrumBronzePickaxe, 1, 2, 1);
        HandlerLoot.lootHandler().addLoot("dungeonChest", pulchrumBronzeShovel, 1, 1, 1);
        HandlerLoot.lootHandler().addLoot("pyramidDesertyChest", pulchrumBronzeIngot, 3, 9, 3);
        HandlerLoot.lootHandler().addLoot("pyramidDesertyChest", pulchrumBronzeSword, 1, 2, 2);
        HandlerLoot.lootHandler().addLoot("pyramidDesertyChest", pulchrumBronzePickaxe, 1, 2, 1);
        HandlerLoot.lootHandler().addLoot("pyramidDesertyChest", pulchrumBronzeShovel, 6, 9, 1);
        HandlerLoot.lootHandler().addLoot("pyramidJungleChest", pulchrumBronzeIngot, 2, 4, 6);
        HandlerLoot.lootHandler().addLoot("pyramidJungleChest", pulchrumBronzeSword, 1, 1, 2);
        HandlerLoot.lootHandler().addLoot("pyramidJungleChest", pulchrumBronzePickaxe, 1, 2, 1);
        HandlerLoot.lootHandler().addLoot("pyramidJungleChest", pulchrumBronzeAxe, 4, 7, 2);
        
        HandlerLoot.lootHandler().addLoot("dungeonChest", tombBronzeIngot, 1, 2, 4);
        HandlerLoot.lootHandler().addLoot("dungeonChest", tombBronzeHelm, 1, 3, 1);
        HandlerLoot.lootHandler().addLoot("dungeonChest", tombBronzeChest, 1, 3, 1);
        HandlerLoot.lootHandler().addLoot("dungeonChest", tombBronzeLegs, 1, 3, 1);
        HandlerLoot.lootHandler().addLoot("dungeonChest", tombBronzeBoots, 1, 3, 1);
        HandlerLoot.lootHandler().addLoot("dungeonChest", tombBronzeSword, 1, 2, 1);
        HandlerLoot.lootHandler().addLoot("dungeonChest", tombBronzePickaxe, 1, 2, 1);
        HandlerLoot.lootHandler().addLoot("dungeonChest", tombBronzeShovel, 1, 2, 1);
        HandlerLoot.lootHandler().addLoot("dungeonChest", tombBronzeAxe, 1, 2, 1);
        HandlerLoot.lootHandler().addLoot("strongholdCorridor", tombBronzeShovel, 1, 1, 1);
        HandlerLoot.lootHandler().addLoot("strongholdCorridor", tombBronzePickaxe, 1, 1, 1);
        HandlerLoot.lootHandler().addLoot("strongholdCorridor", tombBronzeSword, 1, 1, 1);
        HandlerLoot.lootHandler().addLoot("strongholdCrossing", tombBronzeShovel, 1, 1, 1);
        HandlerLoot.lootHandler().addLoot("strongholdCrossing", tombBronzePickaxe, 1, 1, 1);
        HandlerLoot.lootHandler().addLoot("strongholdLibrary", tombBronzeSword, 2, 4, 1);
        HandlerLoot.lootHandler().addLoot("strongholdLibrary", tombBronzeHelm, 4, 5, 1);
        HandlerLoot.lootHandler().addLoot("strongholdLibrary", tombBronzeChest, 4, 5, 1);
        HandlerLoot.lootHandler().addLoot("strongholdLibrary", tombBronzeLegs, 4, 5, 1);
        HandlerLoot.lootHandler().addLoot("strongholdLibrary", tombBronzeBoots, 4, 5, 1);
        HandlerLoot.lootHandler().addLoot("mineshaftCorridor", tombBronzeSword, 1, 1, 1);
        HandlerLoot.lootHandler().addLoot("mineshaftCorridor", tombBronzePickaxe, 1, 2, 1);
        HandlerLoot.lootHandler().addLoot("mineshaftCorridor", tombBronzeShovel, 1, 1, 1);
        HandlerLoot.lootHandler().addLoot("pyramidDesertyChest", tombBronzeIngot, 3, 9, 3);
        HandlerLoot.lootHandler().addLoot("pyramidDesertyChest", tombBronzeSword, 1, 3, 2);
        HandlerLoot.lootHandler().addLoot("pyramidDesertyChest", tombBronzePickaxe, 1, 7, 1);
        HandlerLoot.lootHandler().addLoot("pyramidDesertyChest", tombBronzeAxe, 1, 1, 1);
        HandlerLoot.lootHandler().addLoot("pyramidDesertyChest", tombBronzeShovel, 5, 8, 1);
        HandlerLoot.lootHandler().addLoot("pyramidDesertyChest", tombBronzeHelm, 1, 3, 1);
        HandlerLoot.lootHandler().addLoot("pyramidDesertyChest", tombBronzeChest, 1, 3, 1);
        HandlerLoot.lootHandler().addLoot("pyramidDesertyChest", tombBronzeLegs, 1, 3, 1);
        HandlerLoot.lootHandler().addLoot("pyramidDesertyChest", tombBronzeBoots, 1, 3, 1);
        HandlerLoot.lootHandler().addLoot("pyramidJungleChest", tombBronzeIngot, 2, 4, 6);
        HandlerLoot.lootHandler().addLoot("pyramidJungleChest", tombBronzeSword, 1, 1, 2);
        HandlerLoot.lootHandler().addLoot("pyramidJungleChest", tombBronzePickaxe, 1, 2, 1);
        HandlerLoot.lootHandler().addLoot("pyramidJungleChest", tombBronzeAxe, 3, 5, 2);
        
        
        // run tab icon call
        setTabIcons();
        
        // recipes
        ClassicalAlchemyRecipes.doCARecipes();
        
		
    }

    @EventHandler // used in 1.6.2
    public void load(FMLInitializationEvent event)
    {
        
		proxy.registerRenderers();
        
        MinecraftForge.EVENT_BUS.register(new HandlerJoinWorld());
        
        ClassicalAlchemyRecipes.craftTombBronze();
        
		//Armor Renderers
        rendererStannum = proxy.addArmor("stannum");
        rendererCuprum = proxy.addArmor("cuprum");
        rendererPyropusBronze = proxy.addArmor("pyropusBronze");
        rendererTombBronze = proxy.addArmor("tombBronze");
        
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

        LanguageRegistry.addName(cuprumIngot, "Cuprum Ingot");
        LanguageRegistry.addName(smallCuprumChunkItem, "Small Cuprum Chunk");
        LanguageRegistry.addName(mediumCuprumChunkItem, "Medium Cuprum Chunk");
        LanguageRegistry.addName(largeCuprumChunkItem, "Large Cuprum Chunk");

        LanguageRegistry.addName(cuprumSword, "Cuprum Sword");
        LanguageRegistry.addName(cuprumShovel, "Cuprum Shovel");
        LanguageRegistry.addName(cuprumAxe, "Cuprum Axe");
        LanguageRegistry.addName(cuprumPickaxe, "Cuprum Pickaxe");
        LanguageRegistry.addName(cuprumHoe, "Cuprum Hoe");
        LanguageRegistry.addName(cuprumHelm, "Cuprum Helm");
        LanguageRegistry.addName(cuprumChest, "Cuprum Chestplate");
        LanguageRegistry.addName(cuprumLegs, "Cuprum Leggings");
        LanguageRegistry.addName(cuprumBoots, "Cuprum Boots");
		
        LanguageRegistry.addName(pyropusBronzeIngot, "Pyropus Bronze Ingot");
        LanguageRegistry.addName(smallPyropusBronzeChunkItem, "Small Pyropus Bronze Chunk");
        LanguageRegistry.addName(mediumPyropusBronzeChunkItem, "Medium Pyropus Bronze Chunk");
        LanguageRegistry.addName(largePyropusBronzeChunkItem, "Large Pyropus Bronze Chunk");

        LanguageRegistry.addName(pyropusBronzeSword, "Pyropus Bronze Sword");
        LanguageRegistry.addName(pyropusBronzeShovel, "Pyropus Bronze Shovel");
        LanguageRegistry.addName(pyropusBronzeAxe, "Pyropus Bronze Axe");
        LanguageRegistry.addName(pyropusBronzePickaxe, "Pyropus Bronze Pickaxe");
        LanguageRegistry.addName(pyropusBronzeHoe, "Pyropus Bronze Hoe");
        LanguageRegistry.addName(pyropusBronzeHelm, "Pyropus Bronze Helm");
        LanguageRegistry.addName(pyropusBronzeChest, "Pyropus Bronze Chestplate");
        LanguageRegistry.addName(pyropusBronzeLegs, "Pyropus Bronze Leggings");
        LanguageRegistry.addName(pyropusBronzeBoots, "Pyropus Bronze Boots");

        LanguageRegistry.addName(tombBronzeIngot, "Tomb Bronze Ingot");
        LanguageRegistry.addName(smallTombBronzeChunkItem, "Small Tomb Bronze Chunk");
        LanguageRegistry.addName(mediumTombBronzeChunkItem, "Medium Tomb Bronze Chunk");
        LanguageRegistry.addName(largeTombBronzeChunkItem, "Large Tomb Bronze Chunk");

        LanguageRegistry.addName(tombBronzeSword, "Tomb Bronze Sword");
        LanguageRegistry.addName(tombBronzeShovel, "Tomb Bronze Shovel");
        LanguageRegistry.addName(tombBronzeAxe, "Tomb Bronze Axe");
        LanguageRegistry.addName(tombBronzePickaxe, "Tomb Bronze Pickaxe");
        LanguageRegistry.addName(tombBronzeHelm, "Tomb Bronze Helm");
        LanguageRegistry.addName(tombBronzeChest, "Tomb Bronze Chestplate");
        LanguageRegistry.addName(tombBronzeLegs, "Tomb Bronze Leggings");
        LanguageRegistry.addName(tombBronzeBoots, "Tomb Bronze Boots");

        LanguageRegistry.addName(pulchrumBronzeIngot, "Pulchrum Bronze Ingot");
        LanguageRegistry.addName(largePulchrumBronzeChunkItem, "Large Pulchrum Bronze Chunk");

        LanguageRegistry.addName(pulchrumBronzeSword, "Pulchrum Bronze Sword");
        LanguageRegistry.addName(pulchrumBronzeShovel, "Pulchrum Bronze Shovel");
        LanguageRegistry.addName(pulchrumBronzeAxe, "Pulchrum Bronze Axe");
        LanguageRegistry.addName(pulchrumBronzePickaxe, "Pulchrum Bronze Pickaxe");
        
        LanguageRegistry.addName(blockStannum, "Stannum Block");		
        MinecraftForge.setBlockHarvestLevel(blockStannum, "pickaxe", 0);
		
        LanguageRegistry.addName(blockCuprum, "Cuprum Block");		
        MinecraftForge.setBlockHarvestLevel(blockCuprum, "pickaxe", 0);
		
        LanguageRegistry.addName(blockPyropusBronze, "Pyropus Bronze Block");		
        MinecraftForge.setBlockHarvestLevel(blockPyropusBronze, "pickaxe", 0);
        
        LanguageRegistry.addName(blockPulchrumBronze, "Pulchrum Bronze Block");		
        MinecraftForge.setBlockHarvestLevel(blockPulchrumBronze, "pickaxe", 0);

        LanguageRegistry.addName(blockTombBronze, "Tomb Bronze Block");		
        MinecraftForge.setBlockHarvestLevel(blockTombBronze, "pickaxe", 0);
        
        MinecraftForge.setToolClass(stannumPickaxe, "pickaxe", 2);
        MinecraftForge.setToolClass(stannumShovel, "shovel", 2);
        MinecraftForge.setToolClass(stannumAxe, "axe", 2);
      
        MinecraftForge.setToolClass(cuprumPickaxe, "pickaxe", 2);
        MinecraftForge.setToolClass(cuprumShovel, "shovel", 2);
        MinecraftForge.setToolClass(cuprumAxe, "axe", 2);
		
		MinecraftForge.setToolClass(pyropusBronzePickaxe, "pickaxe", 2);
        MinecraftForge.setToolClass(pyropusBronzeShovel, "shovel", 2);
        MinecraftForge.setToolClass(pyropusBronzeAxe, "axe", 2);
		
		MinecraftForge.setToolClass(pulchrumBronzePickaxe, "pickaxe", 3);
        MinecraftForge.setToolClass(pulchrumBronzeShovel, "shovel", 3);
        MinecraftForge.setToolClass(pulchrumBronzeAxe, "axe", 3);

		MinecraftForge.setToolClass(tombBronzePickaxe, "pickaxe", 3);
        MinecraftForge.setToolClass(tombBronzeShovel, "shovel", 3);
        MinecraftForge.setToolClass(tombBronzeAxe, "axe", 3);
		
        LanguageRegistry.instance().addStringLocalization("itemGroup.tabAkkamaddiClassicalAlchemy", "en_US", "akkamaddi's Classical Alchemy");
        
		toolStannum.customCraftingMaterial = ClassicalAlchemyCore.stannumIngot;
        toolCuprum.customCraftingMaterial = ClassicalAlchemyCore.cuprumIngot;
        toolPyropusBronze.customCraftingMaterial = ClassicalAlchemyCore.pyropusBronzeIngot;
        toolPulchrumBronze.customCraftingMaterial = ClassicalAlchemyCore.pulchrumBronzeIngot;
        toolTombBronze.customCraftingMaterial = ClassicalAlchemyCore.tombBronzeIngot;
        
		armorStannum.customCraftingMaterial = ClassicalAlchemyCore.stannumIngot;
		armorCuprum.customCraftingMaterial = ClassicalAlchemyCore.cuprumIngot;
        armorPyropusBronze.customCraftingMaterial = ClassicalAlchemyCore.pyropusBronzeIngot;
        armorTombBronze.customCraftingMaterial = ClassicalAlchemyCore.tombBronzeIngot;
		
		
    }

    @EventHandler // used in 1.6.2
    public void postInit(FMLPostInitializationEvent event)
    {
        // Stub Method
    }
    

    
}


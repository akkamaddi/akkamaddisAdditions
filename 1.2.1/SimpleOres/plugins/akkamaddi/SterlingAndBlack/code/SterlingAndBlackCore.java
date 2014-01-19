package SimpleOres.plugins.akkamaddi.SterlingAndBlack.code;

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
import OnlySilver.code.api.OnlySilverAPI;
import SimpleOres.core.api.HandlerLoot;
import SimpleOres.core.api.SimpleTab;

@Mod(modid = "sterlingandblack", name = "Sterling & Black", version = "1.2.0", dependencies = "required-after:simpleores ; required-after:simpleoresfusion ; required-after:onlysilver")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)

public class SterlingAndBlackCore
{
    // The instance of your mod that Forge uses.
    @Instance("sterlingandblack")
    public static SterlingAndBlackCore instance;

    // Says where the client and server 'proxy' code is loaded.
    @SidedProxy(clientSide = "SimpleOres.plugins.akkamaddi.SterlingAndBlack.code.ClientProxy", serverSide = "SimpleOres.plugins.akkamaddi.SterlingAndBlack.code.CommonProxy")
    public static CommonProxy proxy;

    // set item ID, to-from config file
    public static int sterlingSteelIngotID;
    public static int smallSterlingSteelChunkItemID;
    public static int mediumSterlingSteelChunkItemID;
    public static int largeSterlingSteelChunkItemID;
    public static int blockSterlingSteelID;

    public static int sterlingSteelSwordID;
    public static int sterlingSteelShovelID;
    public static int sterlingSteelAxeID;
    public static int sterlingSteelPickaxeID;
    public static int sterlingSteelHoeID;

    public static int sterlingSteelHelmID;
    public static int sterlingSteelChestID;
    public static int sterlingSteelLegsID;
    public static int sterlingSteelBootsID;

    public static int blackSilverIngotID;
    public static int smallBlackSilverChunkItemID;
    public static int mediumBlackSilverChunkItemID;
    public static int largeBlackSilverChunkItemID;
    public static int blockBlackSilverID;

    public static int blackSilverSwordID;
    public static int blackSilverShovelID;
    public static int blackSilverAxeID;
    public static int blackSilverPickaxeID;
    public static int blackSilverHoeID;

    public static int blackSilverHelmID;
    public static int blackSilverChestID;
    public static int blackSilverLegsID;
    public static int blackSilverBootsID;

    // set actual item names
    public static Item sterlingSteelIngot;
    public static Item smallSterlingSteelChunkItem;
    public static Item mediumSterlingSteelChunkItem;
    public static Item largeSterlingSteelChunkItem;

    public static Item sterlingSteelSword;
    public static Item sterlingSteelShovel;
    public static Item sterlingSteelAxe;
    public static Item sterlingSteelPickaxe;
    public static Item sterlingSteelHoe;

    public static Item sterlingSteelHelm;
    public static Item sterlingSteelChest;
    public static Item sterlingSteelLegs;
    public static Item sterlingSteelBoots;

    public static Item blackSilverIngot;
    public static Item smallBlackSilverChunkItem;
    public static Item mediumBlackSilverChunkItem;
    public static Item largeBlackSilverChunkItem;

    public static Item blackSilverSword;
    public static Item blackSilverShovel;
    public static Item blackSilverAxe;
    public static Item blackSilverPickaxe;
    public static Item blackSilverHoe;

    public static Item blackSilverHelm;
    public static Item blackSilverChest;
    public static Item blackSilverLegs;
    public static Item blackSilverBoots;

    // set block names
    public static Block blockSterlingSteel;
    public static Block blockBlackSilver;

    public static boolean MakeMeSparkle;

    public static boolean werewolfEffectiveness;
    
    public static boolean enableRecycling;

    // tab
    public static SimpleTab tabAkkamaddiSterling = new SimpleTab("tabAkkamaddiSterling");

    /**
     * EnumArmorMaterial. In form ("NAME", max damage (like uses, multiply by pieces for their max damage), new int[] {helmet defense, chestplate defense, leggings defense, boots defense}, enchantability)
     */
    public static EnumArmorMaterial armorSterlingSteel = EnumHelper.addArmorMaterial("STERLINGSTEEL", 16, new int[] {3, 6, 5, 3}, 28);
    public static EnumArmorMaterial armorBlackSilver = EnumHelper.addArmorMaterial("BLACKSILVER", 48, new int[] {5, 9, 7, 5}, 24);

    /**
     * Creating the Armor Renderers. This is simply so you can see the armor texture when you wear it.
     */
    public static int rendererSterlingSteel;
    public static int rendererBlackSilver;

    // set tool properties
    // EnumToolMaterial. In form ("NAME", mining level, max uses, speed, damage to entity, enchantability)
    public static EnumToolMaterial toolSterlingSteel = EnumHelper.addToolMaterial("STERLINGSTEEL", 3, 570, 9.0F, 2, 26);
    public static EnumToolMaterial toolBlackSilver = EnumHelper.addToolMaterial("BLACKSILVER", 5, 3460, 16.0F, 6, 22);

    // Tab
    public void setTabIcons()
    {
        /**
         * Creating the custom tabs using the API class "SimpleTab" and setting their icon.
         */
        tabAkkamaddiSterling.setIcon(new ItemStack(SterlingAndBlackCore.blockSterlingSteel));
    }

    @EventHandler // used in 1.6.2
    public void preInit(FMLPreInitializationEvent event)
    {
        // Stub Method
        proxy.registerTickHandler();
        // MinecraftForge.EVENT_BUS.register(new HandlerArmor());
        Configuration config = new Configuration(event.getSuggestedConfigurationFile());
        config.load();
        sterlingSteelIngotID = config.getItem("1. Sterling Steel Item", "Sterling Steel Ingot", 12190).getInt();
        smallSterlingSteelChunkItemID = config.getItem("1. Sterling Steel Item", "Small Sterling Steel Chunk", 12191).getInt();
        mediumSterlingSteelChunkItemID = config.getItem("1. Sterling Steel Item", "Medium Sterling Steel Chunk", 12192).getInt();
        largeSterlingSteelChunkItemID = config.getItem("1. Sterling Steel Item", "Large Sterling Steel Chunk", 12193).getInt();
        sterlingSteelSwordID = config.getItem("2. Sterling Steel Tool", "Sterling Steel Sword", 12194).getInt();
        sterlingSteelShovelID = config.getItem("2. Sterling Steel Tool", "Sterling Steel Shovel", 12195).getInt();
        sterlingSteelAxeID = config.getItem("2. Sterling Steel Tool", "Sterling Steel Axe", 12196).getInt();
        sterlingSteelPickaxeID = config.getItem("2. Sterling Steel Tool", "Sterling Steel Pickaxe", 12197).getInt();
        sterlingSteelHoeID = config.getItem("2. Sterling Steel Tool", "Sterling Steel Hoe", 12198).getInt();
        sterlingSteelHelmID = config.getItem("3. Sterling Steel Armor", "Sterling Steel Helm", 12199).getInt();
        sterlingSteelChestID = config.getItem("3. Sterling Steel Armor", "Sterling Steel Chest", 12200).getInt();
        sterlingSteelLegsID = config.getItem("3. Sterling Steel Armor", "Sterling Steel Legs", 12201).getInt();
        sterlingSteelBootsID = config.getItem("3. Sterling Steel Armor", "Sterling Steel Boots", 12202).getInt();
        blockSterlingSteelID = config.getBlock("4. Sterling Steel Block", "Sterling Steel Block", 1310).getInt();
        blackSilverIngotID = config.getItem("5. Black Silver Item", "Black Silver Ingot", 12203).getInt();
        smallBlackSilverChunkItemID = config.getItem("5. Black Silver Item", "Small Black Silver Chunk", 12204).getInt();
        mediumBlackSilverChunkItemID = config.getItem("5. Black Silver Item", "Medium Black Silver Chunk", 12205).getInt();
        largeBlackSilverChunkItemID = config.getItem("5. Black Silver Item", "Large Black Silver Chunk", 12206).getInt();
        blackSilverSwordID = config.getItem("6. Black Silver Tool", "Black Silver Sword", 12207).getInt();
        blackSilverShovelID = config.getItem("6. Black Silver Tool", "Black Silver Shovel", 12208).getInt();
        blackSilverAxeID = config.getItem("6. Black Silver Tool", "Black Silver Axe", 12209).getInt();
        blackSilverPickaxeID = config.getItem("6. Black Silver Tool", "Black Silver Pickaxe", 12210).getInt();
        blackSilverHoeID = config.getItem("6. Black Silver Tool", "Black Silver Hoe", 12211).getInt();
        blackSilverHelmID = config.getItem("7. Black Silver Armor", "Black Silver Helm", 12212).getInt();
        blackSilverChestID = config.getItem("7. Black Silver Armor", "Black Silver Chest", 12213).getInt();
        blackSilverLegsID = config.getItem("7. Black Silver Armor", "Black Silver Legs", 12214).getInt();
        blackSilverBootsID = config.getItem("7. Black Silver Armor", "Black Silver Boots", 12215).getInt();
        blockBlackSilverID = config.getBlock("8. Black Silver Block", "Black Silver Block", 1311).getInt();
        MakeMeSparkle = config.get(Configuration.CATEGORY_GENERAL, "Make Me Sparkle, false or true", false).getBoolean(false);
        werewolfEffectiveness = config.get(Configuration.CATEGORY_GENERAL, "Works on Mo'Creatures lycanthropes, true or false", true).getBoolean(true);
        enableRecycling= config.get(Configuration.CATEGORY_GENERAL, "Enable Sterling & Black item recycling recipes: false or true?", false).getBoolean(false);
        
        config.save();
        
        // define items
        sterlingSteelIngot = new SimpleIngot(sterlingSteelIngotID, "sterlingandblack", SterlingAndBlackCore.tabAkkamaddiSterling).setUnlocalizedName("sterlingSteelIngot");
        smallSterlingSteelChunkItem = new SimpleIngot(smallSterlingSteelChunkItemID, "sterlingandblack", SterlingAndBlackCore.tabAkkamaddiSterling).setUnlocalizedName("smallSterlingSteelChunkItem");
        mediumSterlingSteelChunkItem = new SimpleIngot(mediumSterlingSteelChunkItemID, "sterlingandblack", SterlingAndBlackCore.tabAkkamaddiSterling).setUnlocalizedName("mediumSterlingSteelChunkItem");
        largeSterlingSteelChunkItem = new SimpleIngot(largeSterlingSteelChunkItemID, "sterlingandblack", SterlingAndBlackCore.tabAkkamaddiSterling).setUnlocalizedName("largeSterlingSteelChunkItem");
        sterlingSteelSword = new SimpleSword(sterlingSteelSwordID, toolSterlingSteel, "sterlingandblack", SterlingAndBlackCore.tabAkkamaddiSterling).setUnlocalizedName("sterlingSteelSword");
        sterlingSteelShovel = new SimpleShovel(sterlingSteelShovelID, toolSterlingSteel, "sterlingandblack", SterlingAndBlackCore.tabAkkamaddiSterling).setUnlocalizedName("sterlingSteelShovel");
        sterlingSteelAxe = new SimpleAxe(sterlingSteelAxeID, toolSterlingSteel, "sterlingandblack", SterlingAndBlackCore.tabAkkamaddiSterling).setUnlocalizedName("sterlingSteelAxe");
        sterlingSteelPickaxe = new SimplePickaxe(sterlingSteelPickaxeID, toolSterlingSteel, "sterlingandblack", SterlingAndBlackCore.tabAkkamaddiSterling).setUnlocalizedName("sterlingSteelPickaxe");
        sterlingSteelHoe = new SimpleHoe(sterlingSteelHoeID, toolSterlingSteel, "sterlingandblack", SterlingAndBlackCore.tabAkkamaddiSterling).setUnlocalizedName("sterlingSteelHoe");
        sterlingSteelHelm = new SimpleArmor(sterlingSteelHelmID, armorSterlingSteel, rendererSterlingSteel, 0, "sterlingSteel", "sterlingandblack", SterlingAndBlackCore.tabAkkamaddiSterling).setUnlocalizedName("sterlingSteelHelm");
        sterlingSteelChest = new SimpleArmor(sterlingSteelChestID, armorSterlingSteel, rendererSterlingSteel, 1, "sterlingSteel", "sterlingandblack", SterlingAndBlackCore.tabAkkamaddiSterling).setUnlocalizedName("sterlingSteelChest");
        sterlingSteelLegs = new SimpleArmor(sterlingSteelLegsID, armorSterlingSteel, rendererSterlingSteel, 2, "sterlingSteel", "sterlingandblack", SterlingAndBlackCore.tabAkkamaddiSterling).setUnlocalizedName("sterlingSteelLegs");
        sterlingSteelBoots = new SimpleArmor(sterlingSteelBootsID, armorSterlingSteel, rendererSterlingSteel, 3, "sterlingSteel", "sterlingandblack", SterlingAndBlackCore.tabAkkamaddiSterling).setUnlocalizedName("sterlingSteelBoots");
        blackSilverIngot = new SimpleIngot(blackSilverIngotID, "sterlingandblack", SterlingAndBlackCore.tabAkkamaddiSterling).setUnlocalizedName("blackSilverIngot");
        smallBlackSilverChunkItem = new SimpleIngot(smallBlackSilverChunkItemID, "sterlingandblack", SterlingAndBlackCore.tabAkkamaddiSterling).setUnlocalizedName("smallBlackSilverChunkItem");
        mediumBlackSilverChunkItem = new SimpleIngot(mediumBlackSilverChunkItemID, "sterlingandblack", SterlingAndBlackCore.tabAkkamaddiSterling).setUnlocalizedName("mediumBlackSilverChunkItem");
        largeBlackSilverChunkItem = new SimpleIngot(largeBlackSilverChunkItemID, "sterlingandblack", SterlingAndBlackCore.tabAkkamaddiSterling).setUnlocalizedName("largeBlackSilverChunkItem");
        blackSilverSword = new SimpleSword(blackSilverSwordID, toolBlackSilver, "sterlingandblack", SterlingAndBlackCore.tabAkkamaddiSterling).setUnlocalizedName("blackSilverSword");
        blackSilverShovel = new SimpleShovel(blackSilverShovelID, toolBlackSilver, "sterlingandblack", SterlingAndBlackCore.tabAkkamaddiSterling).setUnlocalizedName("blackSilverShovel");
        blackSilverAxe = new SimpleAxe(blackSilverAxeID, toolBlackSilver, "sterlingandblack", SterlingAndBlackCore.tabAkkamaddiSterling).setUnlocalizedName("blackSilverAxe");
        blackSilverPickaxe = new SimplePickaxe(blackSilverPickaxeID, toolBlackSilver, "sterlingandblack", SterlingAndBlackCore.tabAkkamaddiSterling).setUnlocalizedName("blackSilverPickaxe");
        blackSilverHoe = new SimpleHoe(blackSilverHoeID, toolBlackSilver, "sterlingandblack", SterlingAndBlackCore.tabAkkamaddiSterling).setUnlocalizedName("blackSilverHoe");
        blackSilverHelm = new SimpleArmor(blackSilverHelmID, armorBlackSilver, rendererBlackSilver, 0, "blackSilver", "sterlingandblack", SterlingAndBlackCore.tabAkkamaddiSterling).setUnlocalizedName("blackSilverHelm");
        blackSilverChest = new SimpleArmor(blackSilverChestID, armorBlackSilver, rendererBlackSilver, 1, "blackSilver", "sterlingandblack", SterlingAndBlackCore.tabAkkamaddiSterling).setUnlocalizedName("blackSilverChest");
        blackSilverLegs = new SimpleArmor(blackSilverLegsID, armorBlackSilver, rendererBlackSilver, 2, "blackSilver", "sterlingandblack", SterlingAndBlackCore.tabAkkamaddiSterling).setUnlocalizedName("blackSilverLegs");
        blackSilverBoots = new SimpleArmor(blackSilverBootsID, armorBlackSilver, rendererBlackSilver, 3, "blackSilver", "sterlingandblack", SterlingAndBlackCore.tabAkkamaddiSterling).setUnlocalizedName("blackSilverBoots");
        // define blocks
        blockSterlingSteel = new SterlingStorageBlock(blockSterlingSteelID, Material.iron, "sterlingandblack")
        .setHardness(7.0F).setResistance(12.0F).setStepSound(Block.soundMetalFootstep)
        .setUnlocalizedName("blockSterlingSteel").setCreativeTab(SterlingAndBlackCore.tabAkkamaddiSterling)
        .setLightValue(0.8F);
        blockBlackSilver = new BlackStorageBlock(blockBlackSilverID, Material.iron, "sterlingandblack")
        .setHardness(12.0F).setResistance(26.0F).setStepSound(Block.soundMetalFootstep)
        .setUnlocalizedName("blockBlackSilver").setCreativeTab(SterlingAndBlackCore.tabAkkamaddiSterling);
        
        
        // Registry
        
        GameRegistry.registerItem(sterlingSteelIngot,"sterlingSteelIngot");
        GameRegistry.registerItem(smallSterlingSteelChunkItem,"smallSterlingSteelChunkItem");
        GameRegistry.registerItem(mediumSterlingSteelChunkItem,"mediumSterlingSteelChunkItem");
        GameRegistry.registerItem(largeSterlingSteelChunkItem,"largeSterlingSteelChunkItem");
        GameRegistry.registerItem(sterlingSteelSword,"sterlingSteelSword");
        GameRegistry.registerItem(sterlingSteelShovel,"sterlingSteelShovel");
        GameRegistry.registerItem(sterlingSteelAxe,"sterlingSteelAxe");
        GameRegistry.registerItem(sterlingSteelPickaxe,"sterlingSteelPickaxe");
        GameRegistry.registerItem(sterlingSteelHoe,"sterlingSteelHoe");
        GameRegistry.registerItem(sterlingSteelHelm,"sterlingSteelHelm");
        GameRegistry.registerItem(sterlingSteelChest,"sterlingSteelChest");
        GameRegistry.registerItem(sterlingSteelLegs,"sterlingSteelLegs");
        GameRegistry.registerItem(sterlingSteelBoots,"sterlingSteelBoots");

        GameRegistry.registerItem(blackSilverIngot,"blackSilverIngot");
        GameRegistry.registerItem(smallBlackSilverChunkItem,"smallBlackSilverChunkItem");
        GameRegistry.registerItem(mediumBlackSilverChunkItem,"mediumBlackSilverChunkItem");
        GameRegistry.registerItem(largeBlackSilverChunkItem,"largeBlackSilverChunkItem");
        GameRegistry.registerItem(blackSilverSword,"blackSilverSword");
        GameRegistry.registerItem(blackSilverShovel,"blackSilverShovel");
        GameRegistry.registerItem(blackSilverAxe,"blackSilverAxe");
        GameRegistry.registerItem(blackSilverPickaxe,"blackSilverPickaxe");
        GameRegistry.registerItem(blackSilverHoe,"blackSilverHoe");
        GameRegistry.registerItem(blackSilverHelm,"blackSilverHelm");
        GameRegistry.registerItem(blackSilverChest,"blackSilverChest");
        GameRegistry.registerItem(blackSilverLegs,"blackSilverLegs");
        GameRegistry.registerItem(blackSilverBoots,"blackSilverBoots");
        
        GameRegistry.registerBlock(blockSterlingSteel, "blockSterlingSteel");
        GameRegistry.registerBlock(blockBlackSilver, "blockBlackSilver");
        
        // loot
        HandlerLoot.lootHandler().addLoot("villageBlacksmith", sterlingSteelIngot, 1, 2, 2);
        HandlerLoot.lootHandler().addLoot("villageBlacksmith", largeSterlingSteelChunkItem, 1, 2, 3);
        HandlerLoot.lootHandler().addLoot("villageBlacksmith", sterlingSteelSword, 1, 2, 1);
        HandlerLoot.lootHandler().addLoot("villageBlacksmith", sterlingSteelPickaxe, 2, 3, 1);
        HandlerLoot.lootHandler().addLoot("villageBlacksmith", sterlingSteelAxe, 1, 1, 1);
        HandlerLoot.lootHandler().addLoot("villageBlacksmith", sterlingSteelShovel, 1, 1, 1);
        HandlerLoot.lootHandler().addLoot("villageBlacksmith", sterlingSteelHoe, 1, 1, 1);
        HandlerLoot.lootHandler().addLoot("villageBlacksmith", largeBlackSilverChunkItem, 1, 2, 2);
        HandlerLoot.lootHandler().addLoot("villageBlacksmith", blackSilverIngot, 1, 2, 2);
        HandlerLoot.lootHandler().addLoot("villageBlacksmith", blackSilverSword, 1, 1, 1);
        HandlerLoot.lootHandler().addLoot("villageBlacksmith", blackSilverPickaxe, 1, 2, 1);
        HandlerLoot.lootHandler().addLoot("mineshaftCorridor", sterlingSteelPickaxe, 2, 3, 1);
        HandlerLoot.lootHandler().addLoot("mineshaftCorridor", blackSilverPickaxe, 1, 2, 1);
        HandlerLoot.lootHandler().addLoot("mineshaftCorridor", sterlingSteelShovel, 2, 3, 1);
        HandlerLoot.lootHandler().addLoot("mineshaftCorridor", blackSilverShovel, 1, 2, 1);
        HandlerLoot.lootHandler().addLoot("dungeonChest", sterlingSteelIngot, 1, 2, 2);
        HandlerLoot.lootHandler().addLoot("dungeonChest", blackSilverIngot, 1, 2, 2);
        HandlerLoot.lootHandler().addLoot("dungeonChest", sterlingSteelSword, 1, 1, 1);
        HandlerLoot.lootHandler().addLoot("dungeonChest", blackSilverSword, 1, 1, 1);
        HandlerLoot.lootHandler().addLoot("dungeonChest", sterlingSteelAxe, 1, 1, 1);
        HandlerLoot.lootHandler().addLoot("dungeonChest", blackSilverAxe, 1, 1, 1);
        HandlerLoot.lootHandler().addLoot("strongholdLibrary", sterlingSteelIngot, 1, 2, 2);
        HandlerLoot.lootHandler().addLoot("strongholdLibrary", sterlingSteelSword, 2, 4, 1);
        HandlerLoot.lootHandler().addLoot("strongholdLibrary", blackSilverChest, 1, 4, 1);
        HandlerLoot.lootHandler().addLoot("strongholdLibrary", blackSilverHelm, 1, 4, 1);
        HandlerLoot.lootHandler().addLoot("strongholdLibrary", blackSilverLegs, 1, 4, 1);
        HandlerLoot.lootHandler().addLoot("strongholdLibrary", blackSilverBoots, 1, 4, 1);
        HandlerLoot.lootHandler().addLoot("pyramidDesertyChest", sterlingSteelSword, 1, 1, 1);
        HandlerLoot.lootHandler().addLoot("pyramidJungleChest", blackSilverSword, 1, 1, 1);

        //werewolves
        if (SterlingAndBlackCore.werewolfEffectiveness)
            try
            {
                MinecraftForge.EVENT_BUS.register(new WerewolfHandler());
            }
            catch (ClassNotFoundException ignored) {}
        
        //recipes
        SterlingRecipes.doSterlingRecipes();

        // run tab icon call
        setTabIcons();
        
    }

    @EventHandler // used in 1.6.2
    public void load(FMLInitializationEvent event)
    {
        proxy.registerRenderers();
        MinecraftForge.EVENT_BUS.register(new HandlerJoinWorld());
        //Armor Renderers
        rendererSterlingSteel = proxy.addArmor("sterlingSteel");
        rendererBlackSilver = proxy.addArmor("blackSilver");
        // name stuff
        LanguageRegistry.addName(sterlingSteelIngot, "Sterling Steel Ingot");
        LanguageRegistry.addName(smallSterlingSteelChunkItem, "Small Sterling Steel Chunk");
        LanguageRegistry.addName(mediumSterlingSteelChunkItem, "Medium Sterling Steel Chunk");
        LanguageRegistry.addName(largeSterlingSteelChunkItem, "Large Sterling Steel Chunk");
        LanguageRegistry.addName(sterlingSteelSword, "Sterling Steel Sword");
        LanguageRegistry.addName(sterlingSteelShovel, "Sterling Steel Shovel");
        LanguageRegistry.addName(sterlingSteelAxe, "Sterling Steel Axe");
        LanguageRegistry.addName(sterlingSteelPickaxe, "Sterling Steel Pickaxe");
        LanguageRegistry.addName(sterlingSteelHoe, "Sterling Steel Hoe");
        LanguageRegistry.addName(sterlingSteelHelm, "Sterling Steel Helm");
        LanguageRegistry.addName(sterlingSteelChest, "Sterling Steel Chestplate");
        LanguageRegistry.addName(sterlingSteelLegs, "Sterling Steel Leggings");
        LanguageRegistry.addName(sterlingSteelBoots, "Sterling Steel Boots");
        LanguageRegistry.addName(blackSilverIngot, "Black Silver Ingot");
        LanguageRegistry.addName(smallBlackSilverChunkItem, "Small Black Silver Chunk");
        LanguageRegistry.addName(mediumBlackSilverChunkItem, "Medium Black Silver Chunk");
        LanguageRegistry.addName(largeBlackSilverChunkItem, "Large Black Silver Chunk");
        LanguageRegistry.addName(blackSilverSword, "Black Silver Sword");
        LanguageRegistry.addName(blackSilverShovel, "Black Silver Shovel");
        LanguageRegistry.addName(blackSilverAxe, "Black Silver Axe");
        LanguageRegistry.addName(blackSilverPickaxe, "Black Silver Pickaxe");
        LanguageRegistry.addName(blackSilverHoe, "Black Silver Hoe");
        LanguageRegistry.addName(blackSilverHelm, "Black Silver Helm");
        LanguageRegistry.addName(blackSilverChest, "Black Silver Chestplate");
        LanguageRegistry.addName(blackSilverLegs, "Black Silver Leggings");
        LanguageRegistry.addName(blackSilverBoots, "Black Silver Boots");
        
        LanguageRegistry.addName(blockSterlingSteel, "Sterling Steel Block");
        MinecraftForge.setBlockHarvestLevel(blockSterlingSteel, "pickaxe", 0);
        
        LanguageRegistry.addName(blockBlackSilver, "Black Silver Block");
        MinecraftForge.setBlockHarvestLevel(blockBlackSilver, "pickaxe", 0);
        
        LanguageRegistry.instance().addStringLocalization("itemGroup.tabAkkamaddiSterling", "en_US", "akkamaddi's Sterling & Black");
        
        MinecraftForge.setToolClass(sterlingSteelPickaxe, "pickaxe", 3);
        MinecraftForge.setToolClass(sterlingSteelShovel, "shovel", 3);
        MinecraftForge.setToolClass(sterlingSteelAxe, "axe", 3);
        MinecraftForge.setToolClass(blackSilverPickaxe, "pickaxe", 5);
        MinecraftForge.setToolClass(blackSilverShovel, "shovel", 5);
        MinecraftForge.setToolClass(blackSilverAxe, "axe", 5);
        toolSterlingSteel.customCraftingMaterial = SterlingAndBlackCore.sterlingSteelIngot;
        toolBlackSilver.customCraftingMaterial = SterlingAndBlackCore.blackSilverIngot;
        armorSterlingSteel.customCraftingMaterial = SterlingAndBlackCore.sterlingSteelIngot;
        armorBlackSilver.customCraftingMaterial = SterlingAndBlackCore.blackSilverIngot;
    }

    @EventHandler // used in 1.6.2
    public void postInit(FMLPostInitializationEvent event)
    {
        // Stub Method
    }
}

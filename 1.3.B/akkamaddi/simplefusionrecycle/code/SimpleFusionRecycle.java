package akkamaddi.simplefusionrecycle.code;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import net.minecraft.creativetab.CreativeTabs;
import alexndr.SimpleOres.api.helpers.CoreHelper;
import alexndr.SimpleOres.plugins.fusion.FusionHelper;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.block.Block;
import net.minecraftforge.oredict.OreDictionary;

@Mod(modid = "FusionRecycle", name = "Simple Fusion Recycle", version = "1.0.2", dependencies = "required-after:simpleoresfusion")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class SimpleFusionRecycle
{
    // The instance of your mod that Forge uses.
    @Instance("FusionRecycle")
    public static SimpleFusionRecycle instance;

    // Says where the client and server 'proxy' code is loaded.
    @SidedProxy(clientSide = "akkamaddi.simplefusionrecycle.code.ClientProxy", serverSide = "akkamaddi.simplefusionrecycle.code.CommonProxy")
    public static CommonProxy proxy;

    // wildcard
    private static final int WILDCARD_VALUE = OreDictionary.WILDCARD_VALUE;

    @EventHandler // used in 1.6.2
    public void preInit(FMLPreInitializationEvent event)
    {
        // Stub Method
    }

    @EventHandler // used in 1.6.2
    public void load(FMLInitializationEvent event)
    {
        proxy.registerRenderers();
        // The mass of recipes
        // Primary: helmet, chest, leggings, boots, sword, shovel, pickaxe, axe, hoe, ?horsearmor?, ?bow?
        // Secondary: Item.alpha, Block.alpha,
        //
        // recycle your Gold
        FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(ItemArmor.helmetGold, 1, WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, WILDCARD_VALUE), new ItemStack(Block.oreGold), 15.0F);
        FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(ItemArmor.plateGold, 1, WILDCARD_VALUE), new ItemStack(Block.gravel, 2, 0), new ItemStack(Item.coal, 2, WILDCARD_VALUE), new ItemStack(Block.oreGold, 2, 0), 30.0F);
        FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(ItemArmor.legsGold, 1, WILDCARD_VALUE), new ItemStack(Block.gravel, 2, 0), new ItemStack(Item.coal, 2, WILDCARD_VALUE), new ItemStack(Block.oreGold, 2, 0), 30.0F);
        FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(ItemArmor.bootsGold, 1, WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, WILDCARD_VALUE), new ItemStack(Block.oreGold), 15.0F);
        FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(Item.swordGold, 1, WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, WILDCARD_VALUE), new ItemStack(Block.oreGold), 15.0F);
        FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(Item.shovelGold, 1, WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, WILDCARD_VALUE), new ItemStack(Block.oreGold), 15.0F);
        FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(Item.pickaxeGold, 1, WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, WILDCARD_VALUE), new ItemStack(Block.oreGold), 15.0F);
        FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(Item.axeGold, 1, WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, WILDCARD_VALUE), new ItemStack(Block.oreGold), 15.0F);
        FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(Item.hoeGold, 1, WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, WILDCARD_VALUE), new ItemStack(Block.oreGold), 15.0F);
        FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(Item.horseArmorGold, 1, WILDCARD_VALUE), new ItemStack(Block.gravel, 2, 0), new ItemStack(Item.coal, 2, WILDCARD_VALUE), new ItemStack(Block.oreGold, 2, 0), 30.0F);
        // extra Gold recycling
        FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(Item.pocketSundial), new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, 1), new ItemStack(Block.oreGold), 15.0F);
        //
        // recycle your Leather
        FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(ItemArmor.helmetLeather, 1, WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, WILDCARD_VALUE), new ItemStack(Block.oreCoal), 5.0F);
        FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(ItemArmor.plateLeather, 1, WILDCARD_VALUE), new ItemStack(Block.gravel, 2, 0), new ItemStack(Item.coal, 2, WILDCARD_VALUE), new ItemStack(Block.oreCoal, 2, 0), 10.0F);
        FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(ItemArmor.legsLeather, 1, WILDCARD_VALUE), new ItemStack(Block.gravel, 2, 0), new ItemStack(Item.coal, 2, WILDCARD_VALUE), new ItemStack(Block.oreCoal, 2, 0), 10.0F);
        FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(ItemArmor.bootsLeather, 1, WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, WILDCARD_VALUE), new ItemStack(Block.oreCoal), 5.0F);
        //
        // recycle your Wood
        FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(Item.swordWood, 1, WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, WILDCARD_VALUE), new ItemStack(Block.oreCoal), 5.0F);
        FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(Item.shovelWood, 1, WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, WILDCARD_VALUE), new ItemStack(Block.oreCoal), 5.0F);
        FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(Item.pickaxeWood, 1, WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, WILDCARD_VALUE), new ItemStack(Block.oreCoal), 5.0F);
        FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(Item.axeWood, 1, WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, WILDCARD_VALUE), new ItemStack(Block.oreCoal), 5.0F);
        FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(Item.hoeWood, 1, WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, WILDCARD_VALUE), new ItemStack(Block.oreCoal), 5.0F);
        FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(Item.bow, 1, WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, WILDCARD_VALUE), new ItemStack(Block.oreCoal), 5.0F);
        // extra Wood recycling
        FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(Item.boat), new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, WILDCARD_VALUE), new ItemStack(Block.oreCoal), 5.0F);
        FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(Item.bed), new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, WILDCARD_VALUE), new ItemStack(Block.oreCoal), 5.0F);
        FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(Item.doorWood), new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, WILDCARD_VALUE), new ItemStack(Block.oreCoal), 5.0F);
        FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(Item.fishingRod, 1, WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, WILDCARD_VALUE), new ItemStack(Block.oreCoal), 3.0F);
        FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(Block.bookShelf), new ItemStack(Block.gravel, 2, 0), new ItemStack(Item.coal, 2, WILDCARD_VALUE), new ItemStack(Block.oreCoal, 2, 0), 10.0F);
        FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(Block.chest), new ItemStack(Block.gravel, 2, 0), new ItemStack(Item.coal, 2, WILDCARD_VALUE), new ItemStack(Block.oreCoal, 2, 0), 10.0F);
        FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(Block.chestTrapped), new ItemStack(Block.gravel, 2, 0), new ItemStack(Item.coal, 2, WILDCARD_VALUE), new ItemStack(Block.oreCoal, 2, 0), 10.0F);
        FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(Block.hay), new ItemStack(Block.gravel, 2, 0), new ItemStack(Item.coal, 2, WILDCARD_VALUE), new ItemStack(Block.oreCoal, 2, 0), 10.0F);
        FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(Block.workbench), new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, WILDCARD_VALUE), new ItemStack(Block.oreCoal), 3.0F);
        //
        // recycle your Stone
        FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(Item.swordStone, 1, WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, WILDCARD_VALUE), new ItemStack(Block.stone), 5.0F);
        FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(Item.shovelStone, 1, WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, WILDCARD_VALUE), new ItemStack(Block.stone), 5.0F);
        FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(Item.pickaxeStone, 1, WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, WILDCARD_VALUE), new ItemStack(Block.stone), 5.0F);
        FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(Item.axeStone, 1, WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, WILDCARD_VALUE), new ItemStack(Block.stone), 5.0F);
        FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(Item.hoeStone, 1, WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, WILDCARD_VALUE), new ItemStack(Block.stone), 5.0F);
        // extra Stone recycling
        FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(Block.furnaceIdle), new ItemStack(Block.gravel, 2, 0), new ItemStack(Item.coal, 2, WILDCARD_VALUE), new ItemStack(Block.stone, 2, 0), 10.0F);
        //
        // recycle your Iron
        FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(ItemArmor.helmetIron, 1, WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, WILDCARD_VALUE), new ItemStack(Block.oreIron), 10.0F);
        FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(ItemArmor.plateIron, 1, WILDCARD_VALUE), new ItemStack(Block.gravel, 2, 0), new ItemStack(Item.coal, 2, WILDCARD_VALUE), new ItemStack(Block.oreIron, 2, 0), 20.0F);
        FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(ItemArmor.legsIron, 1, WILDCARD_VALUE), new ItemStack(Block.gravel, 2, 0), new ItemStack(Item.coal, 2, WILDCARD_VALUE), new ItemStack(Block.oreIron, 2, 0), 20.0F);
        FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(ItemArmor.bootsIron, 1, WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, WILDCARD_VALUE), new ItemStack(Block.oreIron), 10.0F);
        FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(Item.swordIron, 1, WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, WILDCARD_VALUE), new ItemStack(Block.oreIron), 10.0F);
        FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(Item.shovelIron, 1, WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, WILDCARD_VALUE), new ItemStack(Block.oreIron), 10.0F);
        FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(Item.pickaxeIron, 1, WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, WILDCARD_VALUE), new ItemStack(Block.oreIron), 10.0F);
        FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(Item.axeIron, 1, WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, WILDCARD_VALUE), new ItemStack(Block.oreIron), 10.0F);
        FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(Item.hoeIron, 1, WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, WILDCARD_VALUE), new ItemStack(Block.oreIron), 10.0F);
        FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(Item.horseArmorIron, 1, WILDCARD_VALUE), new ItemStack(Block.gravel, 2, 0), new ItemStack(Item.coal, 2, WILDCARD_VALUE), new ItemStack(Block.oreIron, 2, 0), 20.0F);
        // extra Iron recycling
        FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(ItemArmor.helmetChain, 1, WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, WILDCARD_VALUE), new ItemStack(Block.oreIron), 10.0F);
        FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(ItemArmor.plateChain, 1, WILDCARD_VALUE), new ItemStack(Block.gravel, 2, 0), new ItemStack(Item.coal, 2, WILDCARD_VALUE), new ItemStack(Block.oreIron, 2, 0), 20.0F);
        FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(ItemArmor.legsChain, 1, WILDCARD_VALUE), new ItemStack(Block.gravel, 2, 0), new ItemStack(Item.coal, 2, WILDCARD_VALUE), new ItemStack(Block.oreIron, 2, 0), 20.0F);
        FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(ItemArmor.bootsChain, 1, WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, WILDCARD_VALUE), new ItemStack(Block.oreIron), 10.0F);
        FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(Item.bucketEmpty), new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, WILDCARD_VALUE), new ItemStack(Block.oreIron), 10.0F);
        FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(Item.cauldron), new ItemStack(Block.gravel, 2, 0), new ItemStack(Item.coal, 2, WILDCARD_VALUE), new ItemStack(Block.oreIron, 2, 0), 20.0F);
        FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(Item.compass), new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, WILDCARD_VALUE), new ItemStack(Block.oreIron), 10.0F);
        FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(Item.doorIron), new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, WILDCARD_VALUE), new ItemStack(Block.oreIron), 10.0F);
        FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(Item.flintAndSteel, 1, WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, WILDCARD_VALUE), new ItemStack(Block.oreIron), 10.0F);
        FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(Item.minecartEmpty), new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, WILDCARD_VALUE), new ItemStack(Block.oreIron), 10.0F);
        FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(Item.minecartHopper), new ItemStack(Block.gravel, 2, 0), new ItemStack(Item.coal, 2, WILDCARD_VALUE), new ItemStack(Block.oreIron, 2, 0), 20.0F);
        FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(Item.shears, 1, WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, WILDCARD_VALUE), new ItemStack(Block.oreIron), 10.0F);
        FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(Block.anvil, 1, WILDCARD_VALUE), new ItemStack(Block.gravel, 4, 0), new ItemStack(Item.coal, 4, WILDCARD_VALUE), new ItemStack(Block.oreIron, 4, 0), 40.0F);
        FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(Block.hopperBlock), new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, WILDCARD_VALUE), new ItemStack(Block.oreIron), 10.0F);
        //
        // recycle your Diamond
        FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(ItemArmor.helmetDiamond, 1, WILDCARD_VALUE), new ItemStack(Block.oreCoal), new ItemStack(Item.bucketLava), new ItemStack(Item.diamond), 20.0F);
        FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(ItemArmor.plateDiamond, 1, WILDCARD_VALUE), new ItemStack(Block.oreCoal, 2, 0), new ItemStack(Item.bucketLava), new ItemStack(Item.diamond, 2, 0), 40.0F);
        FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(ItemArmor.legsDiamond, 1, WILDCARD_VALUE), new ItemStack(Block.oreCoal, 2, 0), new ItemStack(Item.bucketLava), new ItemStack(Item.diamond, 2, 0), 40.0F);
        FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(ItemArmor.bootsDiamond, 1, WILDCARD_VALUE), new ItemStack(Block.oreCoal), new ItemStack(Item.bucketLava), new ItemStack(Item.diamond), 20.0F);
        FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(Item.swordDiamond, 1, WILDCARD_VALUE), new ItemStack(Block.oreCoal), new ItemStack(Item.bucketLava), new ItemStack(Item.diamond), 20.0F);
        FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(Item.shovelDiamond, 1, WILDCARD_VALUE), new ItemStack(Block.oreCoal), new ItemStack(Item.bucketLava), new ItemStack(Item.diamond), 20.0F);
        FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(Item.pickaxeDiamond, 1, WILDCARD_VALUE), new ItemStack(Block.oreCoal), new ItemStack(Item.bucketLava), new ItemStack(Item.diamond), 20.0F);
        FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(Item.axeDiamond, 1, WILDCARD_VALUE), new ItemStack(Block.oreCoal), new ItemStack(Item.bucketLava), new ItemStack(Item.diamond), 20.0F);
        FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(Item.hoeDiamond, 1, WILDCARD_VALUE), new ItemStack(Block.oreCoal), new ItemStack(Item.bucketLava), new ItemStack(Item.diamond), 20.0F);
        FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(Item.horseArmorDiamond, 1, WILDCARD_VALUE), new ItemStack(Block.oreCoal, 2, 0), new ItemStack(Item.bucketLava), new ItemStack(Item.diamond, 2, 0), 20.0F);
        //
        // recycle your Copper
        FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(CoreHelper.coreContent.copperHelm, 1, WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, WILDCARD_VALUE), new ItemStack(CoreHelper.coreContent.copperOre), 10.0F);
        FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(CoreHelper.coreContent.copperChest, 1, WILDCARD_VALUE), new ItemStack(Block.gravel, 2, 0), new ItemStack(Item.coal, 2, WILDCARD_VALUE), new ItemStack(CoreHelper.coreContent.copperOre, 2, 0), 10.0F);
        FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(CoreHelper.coreContent.copperLegs, 1, WILDCARD_VALUE), new ItemStack(Block.gravel, 2, 0), new ItemStack(Item.coal, 2, WILDCARD_VALUE), new ItemStack(CoreHelper.coreContent.copperOre, 2, 0), 10.0F);
        FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(CoreHelper.coreContent.copperBoots, 1, WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, WILDCARD_VALUE), new ItemStack(CoreHelper.coreContent.copperOre), 10.0F);
        FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(CoreHelper.coreContent.copperSword, 1, WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, WILDCARD_VALUE), new ItemStack(CoreHelper.coreContent.copperOre), 10.0F);
        FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(CoreHelper.coreContent.copperShovel, 1, WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, WILDCARD_VALUE), new ItemStack(CoreHelper.coreContent.copperOre), 10.0F);
        FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(CoreHelper.coreContent.copperPick, 1, WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, WILDCARD_VALUE), new ItemStack(CoreHelper.coreContent.copperOre), 10.0F);
        FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(CoreHelper.coreContent.copperAxe, 1, WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, WILDCARD_VALUE), new ItemStack(CoreHelper.coreContent.copperOre), 10.0F);
        FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(CoreHelper.coreContent.copperHoe, 1, WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, WILDCARD_VALUE), new ItemStack(CoreHelper.coreContent.copperOre), 10.0F);
        // extra Copper recycling
        FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(CoreHelper.coreContent.copperBucket), new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, WILDCARD_VALUE), new ItemStack(CoreHelper.coreContent.copperOre), 10.0F);
        FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(CoreHelper.coreContent.copperDoorItem), new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, WILDCARD_VALUE), new ItemStack(CoreHelper.coreContent.copperOre), 10.0F);
        //
        // recycle your Tin
        FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(CoreHelper.coreContent.tinHelm, 1, WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, WILDCARD_VALUE), new ItemStack(CoreHelper.coreContent.tinOre), 10.0F);
        FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(CoreHelper.coreContent.tinChest, 1, WILDCARD_VALUE), new ItemStack(Block.gravel, 2, 0), new ItemStack(Item.coal, 2, WILDCARD_VALUE), new ItemStack(CoreHelper.coreContent.tinOre, 2, 0), 20.0F);
        FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(CoreHelper.coreContent.tinLegs, 1, WILDCARD_VALUE), new ItemStack(Block.gravel, 2, 0), new ItemStack(Item.coal, 2, WILDCARD_VALUE), new ItemStack(CoreHelper.coreContent.tinOre, 2, 0), 20.0F);
        FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(CoreHelper.coreContent.tinBoots, 1, WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, WILDCARD_VALUE), new ItemStack(CoreHelper.coreContent.tinOre), 10.0F);
        FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(CoreHelper.coreContent.tinSword, 1, WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, WILDCARD_VALUE), new ItemStack(CoreHelper.coreContent.tinOre), 10.0F);
        FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(CoreHelper.coreContent.tinShovel, 1, WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, WILDCARD_VALUE), new ItemStack(CoreHelper.coreContent.tinOre), 10.0F);
        FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(CoreHelper.coreContent.tinPick, 1, WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, WILDCARD_VALUE), new ItemStack(CoreHelper.coreContent.tinOre), 10.0F);
        FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(CoreHelper.coreContent.tinAxe, 1, WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, WILDCARD_VALUE), new ItemStack(CoreHelper.coreContent.tinOre), 10.0F);
        FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(CoreHelper.coreContent.tinHoe, 1, WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, WILDCARD_VALUE), new ItemStack(CoreHelper.coreContent.tinOre), 10.0F);
        // extra Tin recycling
        FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(CoreHelper.coreContent.tinShears, 1, WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, WILDCARD_VALUE), new ItemStack(CoreHelper.coreContent.tinOre), 10.0F);
        //
        // recycle your Mythril
        FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(CoreHelper.coreContent.mythrilHelm, 1, WILDCARD_VALUE), new ItemStack(Block.gravel),  new ItemStack(Item.coal, 1, WILDCARD_VALUE), new ItemStack(CoreHelper.coreContent.mythrilOre), 15.0F);
        FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(CoreHelper.coreContent.mythrilChest, 1, WILDCARD_VALUE), new ItemStack(Block.gravel, 2, 0),  new ItemStack(Item.coal, 2, WILDCARD_VALUE), new ItemStack(CoreHelper.coreContent.mythrilOre, 2, 0), 15.0F);
        FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(CoreHelper.coreContent.mythrilLegs, 1, WILDCARD_VALUE), new ItemStack(Block.gravel, 2, 0),  new ItemStack(Item.coal, 2, WILDCARD_VALUE), new ItemStack(CoreHelper.coreContent.mythrilOre, 2, 0), 15.0F);
        FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(CoreHelper.coreContent.mythrilBoots, 1, WILDCARD_VALUE), new ItemStack(Block.gravel),  new ItemStack(Item.coal, 1, WILDCARD_VALUE), new ItemStack(CoreHelper.coreContent.mythrilOre), 15.0F);
        FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(CoreHelper.coreContent.mythrilSword, 1, WILDCARD_VALUE), new ItemStack(Block.gravel),  new ItemStack(Item.coal, 1, WILDCARD_VALUE), new ItemStack(CoreHelper.coreContent.mythrilOre), 15.0F);
        FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(CoreHelper.coreContent.mythrilShovel, 1, WILDCARD_VALUE), new ItemStack(Block.gravel),  new ItemStack(Item.coal, 1, WILDCARD_VALUE), new ItemStack(CoreHelper.coreContent.mythrilOre), 15.0F);
        FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(CoreHelper.coreContent.mythrilPick, 1, WILDCARD_VALUE), new ItemStack(Block.gravel),  new ItemStack(Item.coal, 1, WILDCARD_VALUE), new ItemStack(CoreHelper.coreContent.mythrilOre), 15.0F);
        FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(CoreHelper.coreContent.mythrilAxe, 1, WILDCARD_VALUE), new ItemStack(Block.gravel),  new ItemStack(Item.coal, 1, WILDCARD_VALUE), new ItemStack(CoreHelper.coreContent.mythrilOre), 15.0F);
        FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(CoreHelper.coreContent.mythrilHoe, 1, WILDCARD_VALUE), new ItemStack(Block.gravel),  new ItemStack(Item.coal, 1, WILDCARD_VALUE), new ItemStack(CoreHelper.coreContent.mythrilOre), 15.0F);
        FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(CoreHelper.coreContent.mythrilBow, 1, WILDCARD_VALUE), new ItemStack(Block.gravel),  new ItemStack(Item.coal, 1, WILDCARD_VALUE), new ItemStack(CoreHelper.coreContent.mythrilOre), 15.0F);
        // extra Mythril recycling
        FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(CoreHelper.coreContent.mythrilRod), new ItemStack(Block.gravel),  new ItemStack(Item.coal, 1, WILDCARD_VALUE), new ItemStack(CoreHelper.coreContent.mythrilOre), 15.0F);
        FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(CoreHelper.coreContent.mythrilFurnace), new ItemStack(Block.gravel, 2, 0),  new ItemStack(Item.coal, 2, WILDCARD_VALUE), new ItemStack(CoreHelper.coreContent.mythrilOre, 2, 0), 15.0F);
        //
        // recycle your Adamantium
        FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(CoreHelper.coreContent.adamantiumHelm, 1, WILDCARD_VALUE), new ItemStack(Block.gravel),  new ItemStack(Item.coal, 1, WILDCARD_VALUE), new ItemStack(CoreHelper.coreContent.adamantiumOre), 15.0F);
        FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(CoreHelper.coreContent.adamantiumChest, 1, WILDCARD_VALUE), new ItemStack(Block.gravel, 2, 0),  new ItemStack(Item.coal, 2, WILDCARD_VALUE), new ItemStack(CoreHelper.coreContent.adamantiumOre, 2, 0), 30.0F);
        FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(CoreHelper.coreContent.adamantiumLegs, 1, WILDCARD_VALUE), new ItemStack(Block.gravel, 2, 0),  new ItemStack(Item.coal, 2, WILDCARD_VALUE), new ItemStack(CoreHelper.coreContent.adamantiumOre, 2, 0), 30.0F);
        FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(CoreHelper.coreContent.adamantiumBoots, 1, WILDCARD_VALUE), new ItemStack(Block.gravel),  new ItemStack(Item.coal, 1, WILDCARD_VALUE), new ItemStack(CoreHelper.coreContent.adamantiumOre), 15.0F);
        FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(CoreHelper.coreContent.adamantiumSword, 1, WILDCARD_VALUE), new ItemStack(Block.gravel),  new ItemStack(Item.coal, 1, WILDCARD_VALUE), new ItemStack(CoreHelper.coreContent.adamantiumOre), 15.0F);
        FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(CoreHelper.coreContent.adamantiumShovel, 1, WILDCARD_VALUE), new ItemStack(Block.gravel),  new ItemStack(Item.coal, 1, WILDCARD_VALUE), new ItemStack(CoreHelper.coreContent.adamantiumOre), 15.0F);
        FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(CoreHelper.coreContent.adamantiumPick, 1, WILDCARD_VALUE), new ItemStack(Block.gravel),  new ItemStack(Item.coal, 1, WILDCARD_VALUE), new ItemStack(CoreHelper.coreContent.adamantiumOre), 15.0F);
        FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(CoreHelper.coreContent.adamantiumAxe, 1, WILDCARD_VALUE), new ItemStack(Block.gravel),  new ItemStack(Item.coal, 1, WILDCARD_VALUE), new ItemStack(CoreHelper.coreContent.adamantiumOre), 15.0F);
        FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(CoreHelper.coreContent.adamantiumHoe, 1, WILDCARD_VALUE), new ItemStack(Block.gravel),  new ItemStack(Item.coal, 1, WILDCARD_VALUE), new ItemStack(CoreHelper.coreContent.adamantiumOre), 15.0F);
        // extra Adamantium recycling
        FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(CoreHelper.coreContent.adamantiumShears, 1, WILDCARD_VALUE), new ItemStack(Block.gravel),  new ItemStack(Item.coal, 1, WILDCARD_VALUE), new ItemStack(CoreHelper.coreContent.adamantiumOre), 15.0F);
        //
        // recycle your Onyx
        FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(CoreHelper.coreContent.onyxHelm, 1, WILDCARD_VALUE), new ItemStack(Block.netherrack), new ItemStack(Item.bucketLava), new ItemStack(CoreHelper.coreContent.onyxGem), 20.0F);
        FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(CoreHelper.coreContent.onyxChest, 1, WILDCARD_VALUE), new ItemStack(Block.netherrack, 2, 0), new ItemStack(Item.bucketLava), new ItemStack(CoreHelper.coreContent.onyxGem, 2, 0), 40.0F);
        FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(CoreHelper.coreContent.onyxLegs, 1, WILDCARD_VALUE), new ItemStack(Block.netherrack, 2, 0), new ItemStack(Item.bucketLava), new ItemStack(CoreHelper.coreContent.onyxGem, 2, 0), 40.0F);
        FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(CoreHelper.coreContent.onyxBoots, 1, WILDCARD_VALUE), new ItemStack(Block.netherrack), new ItemStack(Item.bucketLava), new ItemStack(CoreHelper.coreContent.onyxGem), 20.0F);
        FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(CoreHelper.coreContent.onyxSword, 1, WILDCARD_VALUE), new ItemStack(Block.netherrack), new ItemStack(Item.bucketLava), new ItemStack(CoreHelper.coreContent.onyxGem), 20.0F);
        FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(CoreHelper.coreContent.onyxShovel, 1, WILDCARD_VALUE), new ItemStack(Block.netherrack), new ItemStack(Item.bucketLava), new ItemStack(CoreHelper.coreContent.onyxGem), 20.0F);
        FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(CoreHelper.coreContent.onyxPick, 1, WILDCARD_VALUE), new ItemStack(Block.netherrack), new ItemStack(Item.bucketLava), new ItemStack(CoreHelper.coreContent.onyxGem), 20.0F);
        FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(CoreHelper.coreContent.onyxAxe, 1, WILDCARD_VALUE), new ItemStack(Block.netherrack), new ItemStack(Item.bucketLava), new ItemStack(CoreHelper.coreContent.onyxGem), 20.0F);
        FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(CoreHelper.coreContent.onyxHoe, 1, WILDCARD_VALUE), new ItemStack(Block.netherrack), new ItemStack(Item.bucketLava), new ItemStack(CoreHelper.coreContent.onyxGem), 20.0F);
        FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(CoreHelper.coreContent.onyxBow, 1, WILDCARD_VALUE), new ItemStack(Block.netherrack), new ItemStack(Item.bucketLava), new ItemStack(CoreHelper.coreContent.onyxGem), 20.0F);
        // extra Onyx recycling
        FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(CoreHelper.coreContent.onyxDoorItem), new ItemStack(Block.netherrack), new ItemStack(Item.bucketLava), new ItemStack(CoreHelper.coreContent.onyxGem), 20.0F);
        FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(CoreHelper.coreContent.onyxRod), new ItemStack(Block.netherrack), new ItemStack(Item.bucketLava), new ItemStack(CoreHelper.coreContent.onyxGem), 20.0F);
        FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(CoreHelper.coreContent.onyxShears, 1, WILDCARD_VALUE), new ItemStack(Block.netherrack), new ItemStack(Item.bucketLava), new ItemStack(CoreHelper.coreContent.onyxGem), 20.0F);
        FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(CoreHelper.coreContent.onyxFurnace), new ItemStack(Block.netherrack, 2, 0), new ItemStack(Item.bucketLava), new ItemStack(CoreHelper.coreContent.onyxGem, 2, 0), 40.0F);
        //
        // recycle your Bronze
        FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(FusionHelper.fusionContent.bronzeHelm, 1, WILDCARD_VALUE), new ItemStack(Block.gravel),  new ItemStack(Item.coal, 1, WILDCARD_VALUE), new ItemStack(FusionHelper.fusionContent.largeBronzeChunk), 10.0F);
        FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(FusionHelper.fusionContent.bronzeChest, 1, WILDCARD_VALUE), new ItemStack(Block.gravel, 2, 0),  new ItemStack(Item.coal, 2, WILDCARD_VALUE), new ItemStack(FusionHelper.fusionContent.largeBronzeChunk, 2, 0), 20.0F);
        FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(FusionHelper.fusionContent.bronzeLegs, 1, WILDCARD_VALUE), new ItemStack(Block.gravel, 2, 0),  new ItemStack(Item.coal, 2, WILDCARD_VALUE), new ItemStack(FusionHelper.fusionContent.largeBronzeChunk, 2, 0), 20.0F);
        FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(FusionHelper.fusionContent.bronzeBoots, 1, WILDCARD_VALUE), new ItemStack(Block.gravel),  new ItemStack(Item.coal, 1, WILDCARD_VALUE), new ItemStack(FusionHelper.fusionContent.largeBronzeChunk), 10.0F);
        FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(FusionHelper.fusionContent.bronzeSword, 1, WILDCARD_VALUE), new ItemStack(Block.gravel),  new ItemStack(Item.coal, 1, WILDCARD_VALUE), new ItemStack(FusionHelper.fusionContent.largeBronzeChunk), 10.0F);
        FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(FusionHelper.fusionContent.bronzeShovel, 1, WILDCARD_VALUE), new ItemStack(Block.gravel),  new ItemStack(Item.coal, 1, WILDCARD_VALUE), new ItemStack(FusionHelper.fusionContent.largeBronzeChunk), 10.0F);
        FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(FusionHelper.fusionContent.bronzePick, 1, WILDCARD_VALUE), new ItemStack(Block.gravel),  new ItemStack(Item.coal, 1, WILDCARD_VALUE), new ItemStack(FusionHelper.fusionContent.largeBronzeChunk), 10.0F);
        FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(FusionHelper.fusionContent.bronzePick, 1, WILDCARD_VALUE), new ItemStack(Block.gravel),  new ItemStack(Item.coal, 1, WILDCARD_VALUE), new ItemStack(FusionHelper.fusionContent.largeBronzeChunk), 10.0F);
        FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(FusionHelper.fusionContent.bronzeAxe, 1, WILDCARD_VALUE), new ItemStack(Block.gravel),  new ItemStack(Item.coal, 1, WILDCARD_VALUE), new ItemStack(FusionHelper.fusionContent.largeBronzeChunk), 10.0F);
        FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(FusionHelper.fusionContent.bronzeHoe, 1, WILDCARD_VALUE), new ItemStack(Block.gravel),  new ItemStack(Item.coal, 1, WILDCARD_VALUE), new ItemStack(FusionHelper.fusionContent.largeBronzeChunk), 10.0F);
        //
        // recycle your Thyrium
        FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(FusionHelper.fusionContent.thyriumHelm, 1, WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.bucketLava), new ItemStack(FusionHelper.fusionContent.largeThyriumChunk), 15.0F);
        FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(FusionHelper.fusionContent.thyriumChest, 1, WILDCARD_VALUE), new ItemStack(Block.gravel, 2, 0), new ItemStack(Item.bucketLava), new ItemStack(FusionHelper.fusionContent.largeThyriumChunk, 2, 0), 15.0F);
        FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(FusionHelper.fusionContent.thyriumLegs, 1, WILDCARD_VALUE), new ItemStack(Block.gravel, 2, 0), new ItemStack(Item.bucketLava), new ItemStack(FusionHelper.fusionContent.largeThyriumChunk, 2, 0), 15.0F);
        FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(FusionHelper.fusionContent.thyriumBoots, 1, WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.bucketLava), new ItemStack(FusionHelper.fusionContent.largeThyriumChunk), 15.0F);
        FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(FusionHelper.fusionContent.thyriumSword, 1, WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.bucketLava), new ItemStack(FusionHelper.fusionContent.largeThyriumChunk), 15.0F);
        FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(FusionHelper.fusionContent.thyriumShovel, 1, WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.bucketLava), new ItemStack(FusionHelper.fusionContent.largeThyriumChunk), 15.0F);
        FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(FusionHelper.fusionContent.thyriumPick, 1, WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.bucketLava), new ItemStack(FusionHelper.fusionContent.largeThyriumChunk), 15.0F);
        FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(FusionHelper.fusionContent.thyriumPick, 1, WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.bucketLava), new ItemStack(FusionHelper.fusionContent.largeThyriumChunk), 15.0F);
        FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(FusionHelper.fusionContent.thyriumAxe, 1, WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.bucketLava), new ItemStack(FusionHelper.fusionContent.largeThyriumChunk), 15.0F);
        FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(FusionHelper.fusionContent.thyriumHoe, 1, WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.bucketLava), new ItemStack(FusionHelper.fusionContent.largeThyriumChunk), 15.0F);
        FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(FusionHelper.fusionContent.thyriumBow, 1, WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.bucketLava), new ItemStack(FusionHelper.fusionContent.largeThyriumChunk), 15.0F);
        // extra Thyrium recycling
        FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(FusionHelper.fusionContent.thyriumRod), new ItemStack(Block.gravel), new ItemStack(Item.bucketLava), new ItemStack(FusionHelper.fusionContent.largeThyriumChunk), 15.0F);
        //
        // recycle your Sinisite
        FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(FusionHelper.fusionContent.sinisiteHelm, 1, WILDCARD_VALUE), new ItemStack(Block.netherrack), new ItemStack(Item.bucketLava), new ItemStack(FusionHelper.fusionContent.largeSinisiteChunk), 20.0F);
        FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(FusionHelper.fusionContent.sinisiteChest, 1, WILDCARD_VALUE), new ItemStack(Block.netherrack, 2, 0), new ItemStack(Item.bucketLava), new ItemStack(FusionHelper.fusionContent.largeSinisiteChunk, 2, 0), 20.0F);
        FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(FusionHelper.fusionContent.sinisiteLegs, 1, WILDCARD_VALUE), new ItemStack(Block.netherrack, 2, 0), new ItemStack(Item.bucketLava), new ItemStack(FusionHelper.fusionContent.largeSinisiteChunk, 2, 0), 20.0F);
        FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(FusionHelper.fusionContent.sinisiteBoots, 1, WILDCARD_VALUE), new ItemStack(Block.netherrack), new ItemStack(Item.bucketLava), new ItemStack(FusionHelper.fusionContent.largeSinisiteChunk), 20.0F);
        FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(FusionHelper.fusionContent.sinisiteSword, 1, WILDCARD_VALUE), new ItemStack(Block.netherrack), new ItemStack(Item.bucketLava), new ItemStack(FusionHelper.fusionContent.largeSinisiteChunk), 20.0F);
        FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(FusionHelper.fusionContent.sinisiteShovel, 1, WILDCARD_VALUE), new ItemStack(Block.netherrack), new ItemStack(Item.bucketLava), new ItemStack(FusionHelper.fusionContent.largeSinisiteChunk), 20.0F);
        FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(FusionHelper.fusionContent.sinisitePick, 1, WILDCARD_VALUE), new ItemStack(Block.netherrack), new ItemStack(Item.bucketLava), new ItemStack(FusionHelper.fusionContent.largeSinisiteChunk), 20.0F);
        FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(FusionHelper.fusionContent.sinisiteAxe, 1, WILDCARD_VALUE), new ItemStack(Block.netherrack), new ItemStack(Item.bucketLava), new ItemStack(FusionHelper.fusionContent.largeSinisiteChunk), 20.0F);
        FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(FusionHelper.fusionContent.sinisiteHoe, 1, WILDCARD_VALUE), new ItemStack(Block.netherrack), new ItemStack(Item.bucketLava), new ItemStack(FusionHelper.fusionContent.largeSinisiteChunk), 20.0F);
        FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(FusionHelper.fusionContent.sinisiteBow, 1, WILDCARD_VALUE), new ItemStack(Block.netherrack), new ItemStack(Item.bucketLava), new ItemStack(FusionHelper.fusionContent.largeSinisiteChunk), 20.0F);
        // extra Sinisite recycling
        FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(FusionHelper.fusionContent.sinisiteRod), new ItemStack(Block.netherrack), new ItemStack(Item.bucketLava), new ItemStack(FusionHelper.fusionContent.largeSinisiteChunk), 20.0F);
    }

    @EventHandler // used in 1.6.2
    public void postInit(FMLPostInitializationEvent event)
    {
        // Stub Method
    }
}

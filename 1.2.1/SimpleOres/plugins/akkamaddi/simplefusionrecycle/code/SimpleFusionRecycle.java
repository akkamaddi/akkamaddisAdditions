package SimpleOres.plugins.akkamaddi.simplefusionrecycle.code;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import net.minecraft.creativetab.CreativeTabs;
import SimpleOres.plugins.fusion.Content;
import SimpleOres.plugins.fusion.FusionRecipes;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.block.Block;
import net.minecraftforge.oredict.OreDictionary;
import SimpleOres.core.Armor;
import SimpleOres.core.Tools;
import SimpleOres.core.Items;
import SimpleOres.core.Blocks;

@Mod(modid = "FusionRecycle", name = "Simple Fusion Recycle", version = "1.0.2", dependencies = "required-after:simpleoresfusion")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class SimpleFusionRecycle
{
    // The instance of your mod that Forge uses.
    @Instance("FusionRecycle")
    public static SimpleFusionRecycle instance;

    // Says where the client and server 'proxy' code is loaded.
    @SidedProxy(clientSide = "SimpleOres.plugins.akkamaddi.simplefusionrecycle.code.ClientProxy", serverSide = "SimpleOres.plugins.akkamaddi.simplefusionrecycle.code.CommonProxy")
    public static CommonProxy proxy;

    public static SimpleOres.core.Blocks soBlocks;
    public static SimpleOres.core.Tools soTools;
    public static SimpleOres.core.Armor soArmor;
    public static SimpleOres.core.Items soItems;
    public static SimpleOres.plugins.fusion.Content soAlloy;

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
        FusionRecipes.smelting().addSmelting(new ItemStack(ItemArmor.helmetGold, 1, WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, WILDCARD_VALUE), new ItemStack(Block.oreGold), 15.0F);
        FusionRecipes.smelting().addSmelting(new ItemStack(ItemArmor.plateGold, 1, WILDCARD_VALUE), new ItemStack(Block.gravel, 2, 0), new ItemStack(Item.coal, 2, WILDCARD_VALUE), new ItemStack(Block.oreGold, 2, 0), 30.0F);
        FusionRecipes.smelting().addSmelting(new ItemStack(ItemArmor.legsGold, 1, WILDCARD_VALUE), new ItemStack(Block.gravel, 2, 0), new ItemStack(Item.coal, 2, WILDCARD_VALUE), new ItemStack(Block.oreGold, 2, 0), 30.0F);
        FusionRecipes.smelting().addSmelting(new ItemStack(ItemArmor.bootsGold, 1, WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, WILDCARD_VALUE), new ItemStack(Block.oreGold), 15.0F);
        FusionRecipes.smelting().addSmelting(new ItemStack(Item.swordGold, 1, WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, WILDCARD_VALUE), new ItemStack(Block.oreGold), 15.0F);
        FusionRecipes.smelting().addSmelting(new ItemStack(Item.shovelGold, 1, WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, WILDCARD_VALUE), new ItemStack(Block.oreGold), 15.0F);
        FusionRecipes.smelting().addSmelting(new ItemStack(Item.pickaxeGold, 1, WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, WILDCARD_VALUE), new ItemStack(Block.oreGold), 15.0F);
        FusionRecipes.smelting().addSmelting(new ItemStack(Item.axeGold, 1, WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, WILDCARD_VALUE), new ItemStack(Block.oreGold), 15.0F);
        FusionRecipes.smelting().addSmelting(new ItemStack(Item.hoeGold, 1, WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, WILDCARD_VALUE), new ItemStack(Block.oreGold), 15.0F);
        FusionRecipes.smelting().addSmelting(new ItemStack(Item.horseArmorGold, 1, WILDCARD_VALUE), new ItemStack(Block.gravel, 2, 0), new ItemStack(Item.coal, 2, WILDCARD_VALUE), new ItemStack(Block.oreGold, 2, 0), 30.0F);
        // extra Gold recycling
        FusionRecipes.smelting().addSmelting(new ItemStack(Item.pocketSundial), new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, 1), new ItemStack(Block.oreGold), 15.0F);
        //
        // recycle your Leather
        FusionRecipes.smelting().addSmelting(new ItemStack(ItemArmor.helmetLeather, 1, WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, WILDCARD_VALUE), new ItemStack(Block.oreCoal), 5.0F);
        FusionRecipes.smelting().addSmelting(new ItemStack(ItemArmor.plateLeather, 1, WILDCARD_VALUE), new ItemStack(Block.gravel, 2, 0), new ItemStack(Item.coal, 2, WILDCARD_VALUE), new ItemStack(Block.oreCoal, 2, 0), 10.0F);
        FusionRecipes.smelting().addSmelting(new ItemStack(ItemArmor.legsLeather, 1, WILDCARD_VALUE), new ItemStack(Block.gravel, 2, 0), new ItemStack(Item.coal, 2, WILDCARD_VALUE), new ItemStack(Block.oreCoal, 2, 0), 10.0F);
        FusionRecipes.smelting().addSmelting(new ItemStack(ItemArmor.bootsLeather, 1, WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, WILDCARD_VALUE), new ItemStack(Block.oreCoal), 5.0F);
        //
        // recycle your Wood
        FusionRecipes.smelting().addSmelting(new ItemStack(Item.swordWood, 1, WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, WILDCARD_VALUE), new ItemStack(Block.oreCoal), 5.0F);
        FusionRecipes.smelting().addSmelting(new ItemStack(Item.shovelWood, 1, WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, WILDCARD_VALUE), new ItemStack(Block.oreCoal), 5.0F);
        FusionRecipes.smelting().addSmelting(new ItemStack(Item.pickaxeWood, 1, WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, WILDCARD_VALUE), new ItemStack(Block.oreCoal), 5.0F);
        FusionRecipes.smelting().addSmelting(new ItemStack(Item.axeWood, 1, WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, WILDCARD_VALUE), new ItemStack(Block.oreCoal), 5.0F);
        FusionRecipes.smelting().addSmelting(new ItemStack(Item.hoeWood, 1, WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, WILDCARD_VALUE), new ItemStack(Block.oreCoal), 5.0F);
        FusionRecipes.smelting().addSmelting(new ItemStack(Item.bow, 1, WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, WILDCARD_VALUE), new ItemStack(Block.oreCoal), 5.0F);
        // extra Wood recycling
        FusionRecipes.smelting().addSmelting(new ItemStack(Item.boat), new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, WILDCARD_VALUE), new ItemStack(Block.oreCoal), 5.0F);
        FusionRecipes.smelting().addSmelting(new ItemStack(Item.bed), new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, WILDCARD_VALUE), new ItemStack(Block.oreCoal), 5.0F);
        FusionRecipes.smelting().addSmelting(new ItemStack(Item.doorWood), new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, WILDCARD_VALUE), new ItemStack(Block.oreCoal), 5.0F);
        FusionRecipes.smelting().addSmelting(new ItemStack(Item.fishingRod, 1, WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, WILDCARD_VALUE), new ItemStack(Block.oreCoal), 3.0F);
        FusionRecipes.smelting().addSmelting(new ItemStack(Block.bookShelf), new ItemStack(Block.gravel, 2, 0), new ItemStack(Item.coal, 2, WILDCARD_VALUE), new ItemStack(Block.oreCoal, 2, 0), 10.0F);
        FusionRecipes.smelting().addSmelting(new ItemStack(Block.chest), new ItemStack(Block.gravel, 2, 0), new ItemStack(Item.coal, 2, WILDCARD_VALUE), new ItemStack(Block.oreCoal, 2, 0), 10.0F);
        FusionRecipes.smelting().addSmelting(new ItemStack(Block.chestTrapped), new ItemStack(Block.gravel, 2, 0), new ItemStack(Item.coal, 2, WILDCARD_VALUE), new ItemStack(Block.oreCoal, 2, 0), 10.0F);
        FusionRecipes.smelting().addSmelting(new ItemStack(Block.hay), new ItemStack(Block.gravel, 2, 0), new ItemStack(Item.coal, 2, WILDCARD_VALUE), new ItemStack(Block.oreCoal, 2, 0), 10.0F);
        FusionRecipes.smelting().addSmelting(new ItemStack(Block.workbench), new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, WILDCARD_VALUE), new ItemStack(Block.oreCoal), 3.0F);
        //
        // recycle your Stone
        FusionRecipes.smelting().addSmelting(new ItemStack(Item.swordStone, 1, WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, WILDCARD_VALUE), new ItemStack(Block.stone), 5.0F);
        FusionRecipes.smelting().addSmelting(new ItemStack(Item.shovelStone, 1, WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, WILDCARD_VALUE), new ItemStack(Block.stone), 5.0F);
        FusionRecipes.smelting().addSmelting(new ItemStack(Item.pickaxeStone, 1, WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, WILDCARD_VALUE), new ItemStack(Block.stone), 5.0F);
        FusionRecipes.smelting().addSmelting(new ItemStack(Item.axeStone, 1, WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, WILDCARD_VALUE), new ItemStack(Block.stone), 5.0F);
        FusionRecipes.smelting().addSmelting(new ItemStack(Item.hoeStone, 1, WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, WILDCARD_VALUE), new ItemStack(Block.stone), 5.0F);
        // extra Stone recycling
        FusionRecipes.smelting().addSmelting(new ItemStack(Block.furnaceIdle), new ItemStack(Block.gravel, 2, 0), new ItemStack(Item.coal, 2, WILDCARD_VALUE), new ItemStack(Block.stone, 2, 0), 10.0F);
        //
        // recycle your Iron
        FusionRecipes.smelting().addSmelting(new ItemStack(ItemArmor.helmetIron, 1, WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, WILDCARD_VALUE), new ItemStack(Block.oreIron), 10.0F);
        FusionRecipes.smelting().addSmelting(new ItemStack(ItemArmor.plateIron, 1, WILDCARD_VALUE), new ItemStack(Block.gravel, 2, 0), new ItemStack(Item.coal, 2, WILDCARD_VALUE), new ItemStack(Block.oreIron, 2, 0), 20.0F);
        FusionRecipes.smelting().addSmelting(new ItemStack(ItemArmor.legsIron, 1, WILDCARD_VALUE), new ItemStack(Block.gravel, 2, 0), new ItemStack(Item.coal, 2, WILDCARD_VALUE), new ItemStack(Block.oreIron, 2, 0), 20.0F);
        FusionRecipes.smelting().addSmelting(new ItemStack(ItemArmor.bootsIron, 1, WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, WILDCARD_VALUE), new ItemStack(Block.oreIron), 10.0F);
        FusionRecipes.smelting().addSmelting(new ItemStack(Item.swordIron, 1, WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, WILDCARD_VALUE), new ItemStack(Block.oreIron), 10.0F);
        FusionRecipes.smelting().addSmelting(new ItemStack(Item.shovelIron, 1, WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, WILDCARD_VALUE), new ItemStack(Block.oreIron), 10.0F);
        FusionRecipes.smelting().addSmelting(new ItemStack(Item.pickaxeIron, 1, WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, WILDCARD_VALUE), new ItemStack(Block.oreIron), 10.0F);
        FusionRecipes.smelting().addSmelting(new ItemStack(Item.axeIron, 1, WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, WILDCARD_VALUE), new ItemStack(Block.oreIron), 10.0F);
        FusionRecipes.smelting().addSmelting(new ItemStack(Item.hoeIron, 1, WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, WILDCARD_VALUE), new ItemStack(Block.oreIron), 10.0F);
        FusionRecipes.smelting().addSmelting(new ItemStack(Item.horseArmorIron, 1, WILDCARD_VALUE), new ItemStack(Block.gravel, 2, 0), new ItemStack(Item.coal, 2, WILDCARD_VALUE), new ItemStack(Block.oreIron, 2, 0), 20.0F);
        // extra Iron recycling
        FusionRecipes.smelting().addSmelting(new ItemStack(ItemArmor.helmetChain, 1, WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, WILDCARD_VALUE), new ItemStack(Block.oreIron), 10.0F);
        FusionRecipes.smelting().addSmelting(new ItemStack(ItemArmor.plateChain, 1, WILDCARD_VALUE), new ItemStack(Block.gravel, 2, 0), new ItemStack(Item.coal, 2, WILDCARD_VALUE), new ItemStack(Block.oreIron, 2, 0), 20.0F);
        FusionRecipes.smelting().addSmelting(new ItemStack(ItemArmor.legsChain, 1, WILDCARD_VALUE), new ItemStack(Block.gravel, 2, 0), new ItemStack(Item.coal, 2, WILDCARD_VALUE), new ItemStack(Block.oreIron, 2, 0), 20.0F);
        FusionRecipes.smelting().addSmelting(new ItemStack(ItemArmor.bootsChain, 1, WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, WILDCARD_VALUE), new ItemStack(Block.oreIron), 10.0F);
        FusionRecipes.smelting().addSmelting(new ItemStack(Item.bucketEmpty), new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, WILDCARD_VALUE), new ItemStack(Block.oreIron), 10.0F);
        FusionRecipes.smelting().addSmelting(new ItemStack(Item.cauldron), new ItemStack(Block.gravel, 2, 0), new ItemStack(Item.coal, 2, WILDCARD_VALUE), new ItemStack(Block.oreIron, 2, 0), 20.0F);
        FusionRecipes.smelting().addSmelting(new ItemStack(Item.compass), new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, WILDCARD_VALUE), new ItemStack(Block.oreIron), 10.0F);
        FusionRecipes.smelting().addSmelting(new ItemStack(Item.doorIron), new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, WILDCARD_VALUE), new ItemStack(Block.oreIron), 10.0F);
        FusionRecipes.smelting().addSmelting(new ItemStack(Item.flintAndSteel, 1, WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, WILDCARD_VALUE), new ItemStack(Block.oreIron), 10.0F);
        FusionRecipes.smelting().addSmelting(new ItemStack(Item.minecartEmpty), new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, WILDCARD_VALUE), new ItemStack(Block.oreIron), 10.0F);
        FusionRecipes.smelting().addSmelting(new ItemStack(Item.minecartHopper), new ItemStack(Block.gravel, 2, 0), new ItemStack(Item.coal, 2, WILDCARD_VALUE), new ItemStack(Block.oreIron, 2, 0), 20.0F);
        FusionRecipes.smelting().addSmelting(new ItemStack(Item.shears, 1, WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, WILDCARD_VALUE), new ItemStack(Block.oreIron), 10.0F);
        FusionRecipes.smelting().addSmelting(new ItemStack(Block.anvil, 1, WILDCARD_VALUE), new ItemStack(Block.gravel, 4, 0), new ItemStack(Item.coal, 4, WILDCARD_VALUE), new ItemStack(Block.oreIron, 4, 0), 40.0F);
        FusionRecipes.smelting().addSmelting(new ItemStack(Block.hopperBlock), new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, WILDCARD_VALUE), new ItemStack(Block.oreIron), 10.0F);
        //
        // recycle your Diamond
        FusionRecipes.smelting().addSmelting(new ItemStack(ItemArmor.helmetDiamond, 1, WILDCARD_VALUE), new ItemStack(Block.oreCoal), new ItemStack(Item.bucketLava), new ItemStack(Item.diamond), 20.0F);
        FusionRecipes.smelting().addSmelting(new ItemStack(ItemArmor.plateDiamond, 1, WILDCARD_VALUE), new ItemStack(Block.oreCoal, 2, 0), new ItemStack(Item.bucketLava), new ItemStack(Item.diamond, 2, 0), 40.0F);
        FusionRecipes.smelting().addSmelting(new ItemStack(ItemArmor.legsDiamond, 1, WILDCARD_VALUE), new ItemStack(Block.oreCoal, 2, 0), new ItemStack(Item.bucketLava), new ItemStack(Item.diamond, 2, 0), 40.0F);
        FusionRecipes.smelting().addSmelting(new ItemStack(ItemArmor.bootsDiamond, 1, WILDCARD_VALUE), new ItemStack(Block.oreCoal), new ItemStack(Item.bucketLava), new ItemStack(Item.diamond), 20.0F);
        FusionRecipes.smelting().addSmelting(new ItemStack(Item.swordDiamond, 1, WILDCARD_VALUE), new ItemStack(Block.oreCoal), new ItemStack(Item.bucketLava), new ItemStack(Item.diamond), 20.0F);
        FusionRecipes.smelting().addSmelting(new ItemStack(Item.shovelDiamond, 1, WILDCARD_VALUE), new ItemStack(Block.oreCoal), new ItemStack(Item.bucketLava), new ItemStack(Item.diamond), 20.0F);
        FusionRecipes.smelting().addSmelting(new ItemStack(Item.pickaxeDiamond, 1, WILDCARD_VALUE), new ItemStack(Block.oreCoal), new ItemStack(Item.bucketLava), new ItemStack(Item.diamond), 20.0F);
        FusionRecipes.smelting().addSmelting(new ItemStack(Item.axeDiamond, 1, WILDCARD_VALUE), new ItemStack(Block.oreCoal), new ItemStack(Item.bucketLava), new ItemStack(Item.diamond), 20.0F);
        FusionRecipes.smelting().addSmelting(new ItemStack(Item.hoeDiamond, 1, WILDCARD_VALUE), new ItemStack(Block.oreCoal), new ItemStack(Item.bucketLava), new ItemStack(Item.diamond), 20.0F);
        FusionRecipes.smelting().addSmelting(new ItemStack(Item.horseArmorDiamond, 1, WILDCARD_VALUE), new ItemStack(Block.oreCoal, 2, 0), new ItemStack(Item.bucketLava), new ItemStack(Item.diamond, 2, 0), 20.0F);
        //
        // recycle your Copper
        FusionRecipes.smelting().addSmelting(new ItemStack(soArmor.copperHelm, 1, WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, WILDCARD_VALUE), new ItemStack(soBlocks.copperOre), 10.0F);
        FusionRecipes.smelting().addSmelting(new ItemStack(soArmor.copperChest, 1, WILDCARD_VALUE), new ItemStack(Block.gravel, 2, 0), new ItemStack(Item.coal, 2, WILDCARD_VALUE), new ItemStack(soBlocks.copperOre, 2, 0), 10.0F);
        FusionRecipes.smelting().addSmelting(new ItemStack(soArmor.copperLegs, 1, WILDCARD_VALUE), new ItemStack(Block.gravel, 2, 0), new ItemStack(Item.coal, 2, WILDCARD_VALUE), new ItemStack(soBlocks.copperOre, 2, 0), 10.0F);
        FusionRecipes.smelting().addSmelting(new ItemStack(soArmor.copperBoots, 1, WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, WILDCARD_VALUE), new ItemStack(soBlocks.copperOre), 10.0F);
        FusionRecipes.smelting().addSmelting(new ItemStack(soTools.copperSword, 1, WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, WILDCARD_VALUE), new ItemStack(soBlocks.copperOre), 10.0F);
        FusionRecipes.smelting().addSmelting(new ItemStack(soTools.copperShovel, 1, WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, WILDCARD_VALUE), new ItemStack(soBlocks.copperOre), 10.0F);
        FusionRecipes.smelting().addSmelting(new ItemStack(soTools.copperPick, 1, WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, WILDCARD_VALUE), new ItemStack(soBlocks.copperOre), 10.0F);
        FusionRecipes.smelting().addSmelting(new ItemStack(soTools.copperAxe, 1, WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, WILDCARD_VALUE), new ItemStack(soBlocks.copperOre), 10.0F);
        FusionRecipes.smelting().addSmelting(new ItemStack(soTools.copperHoe, 1, WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, WILDCARD_VALUE), new ItemStack(soBlocks.copperOre), 10.0F);
        // extra Copper recycling
        FusionRecipes.smelting().addSmelting(new ItemStack(soItems.copperBucket), new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, WILDCARD_VALUE), new ItemStack(soBlocks.copperOre), 10.0F);
        FusionRecipes.smelting().addSmelting(new ItemStack(soItems.copperDoorItem), new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, WILDCARD_VALUE), new ItemStack(soBlocks.copperOre), 10.0F);
        //
        // recycle your Tin
        FusionRecipes.smelting().addSmelting(new ItemStack(soArmor.tinHelm, 1, WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, WILDCARD_VALUE), new ItemStack(soBlocks.tinOre), 10.0F);
        FusionRecipes.smelting().addSmelting(new ItemStack(soArmor.tinChest, 1, WILDCARD_VALUE), new ItemStack(Block.gravel, 2, 0), new ItemStack(Item.coal, 2, WILDCARD_VALUE), new ItemStack(soBlocks.tinOre, 2, 0), 20.0F);
        FusionRecipes.smelting().addSmelting(new ItemStack(soArmor.tinLegs, 1, WILDCARD_VALUE), new ItemStack(Block.gravel, 2, 0), new ItemStack(Item.coal, 2, WILDCARD_VALUE), new ItemStack(soBlocks.tinOre, 2, 0), 20.0F);
        FusionRecipes.smelting().addSmelting(new ItemStack(soArmor.tinBoots, 1, WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, WILDCARD_VALUE), new ItemStack(soBlocks.tinOre), 10.0F);
        FusionRecipes.smelting().addSmelting(new ItemStack(soTools.tinSword, 1, WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, WILDCARD_VALUE), new ItemStack(soBlocks.tinOre), 10.0F);
        FusionRecipes.smelting().addSmelting(new ItemStack(soTools.tinShovel, 1, WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, WILDCARD_VALUE), new ItemStack(soBlocks.tinOre), 10.0F);
        FusionRecipes.smelting().addSmelting(new ItemStack(soTools.tinPick, 1, WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, WILDCARD_VALUE), new ItemStack(soBlocks.tinOre), 10.0F);
        FusionRecipes.smelting().addSmelting(new ItemStack(soTools.tinAxe, 1, WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, WILDCARD_VALUE), new ItemStack(soBlocks.tinOre), 10.0F);
        FusionRecipes.smelting().addSmelting(new ItemStack(soTools.tinHoe, 1, WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, WILDCARD_VALUE), new ItemStack(soBlocks.tinOre), 10.0F);
        // extra Tin recycling
        FusionRecipes.smelting().addSmelting(new ItemStack(soTools.tinShears, 1, WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, WILDCARD_VALUE), new ItemStack(soBlocks.tinOre), 10.0F);
        //
        // recycle your Mythril
        FusionRecipes.smelting().addSmelting(new ItemStack(soArmor.mythrilHelm, 1, WILDCARD_VALUE), new ItemStack(Block.gravel),  new ItemStack(Item.coal, 1, WILDCARD_VALUE), new ItemStack(soBlocks.mythrilOre), 15.0F);
        FusionRecipes.smelting().addSmelting(new ItemStack(soArmor.mythrilChest, 1, WILDCARD_VALUE), new ItemStack(Block.gravel, 2, 0),  new ItemStack(Item.coal, 2, WILDCARD_VALUE), new ItemStack(soBlocks.mythrilOre, 2, 0), 15.0F);
        FusionRecipes.smelting().addSmelting(new ItemStack(soArmor.mythrilLegs, 1, WILDCARD_VALUE), new ItemStack(Block.gravel, 2, 0),  new ItemStack(Item.coal, 2, WILDCARD_VALUE), new ItemStack(soBlocks.mythrilOre, 2, 0), 15.0F);
        FusionRecipes.smelting().addSmelting(new ItemStack(soArmor.mythrilBoots, 1, WILDCARD_VALUE), new ItemStack(Block.gravel),  new ItemStack(Item.coal, 1, WILDCARD_VALUE), new ItemStack(soBlocks.mythrilOre), 15.0F);
        FusionRecipes.smelting().addSmelting(new ItemStack(soTools.mythrilSword, 1, WILDCARD_VALUE), new ItemStack(Block.gravel),  new ItemStack(Item.coal, 1, WILDCARD_VALUE), new ItemStack(soBlocks.mythrilOre), 15.0F);
        FusionRecipes.smelting().addSmelting(new ItemStack(soTools.mythrilShovel, 1, WILDCARD_VALUE), new ItemStack(Block.gravel),  new ItemStack(Item.coal, 1, WILDCARD_VALUE), new ItemStack(soBlocks.mythrilOre), 15.0F);
        FusionRecipes.smelting().addSmelting(new ItemStack(soTools.mythrilPick, 1, WILDCARD_VALUE), new ItemStack(Block.gravel),  new ItemStack(Item.coal, 1, WILDCARD_VALUE), new ItemStack(soBlocks.mythrilOre), 15.0F);
        FusionRecipes.smelting().addSmelting(new ItemStack(soTools.mythrilAxe, 1, WILDCARD_VALUE), new ItemStack(Block.gravel),  new ItemStack(Item.coal, 1, WILDCARD_VALUE), new ItemStack(soBlocks.mythrilOre), 15.0F);
        FusionRecipes.smelting().addSmelting(new ItemStack(soTools.mythrilHoe, 1, WILDCARD_VALUE), new ItemStack(Block.gravel),  new ItemStack(Item.coal, 1, WILDCARD_VALUE), new ItemStack(soBlocks.mythrilOre), 15.0F);
        FusionRecipes.smelting().addSmelting(new ItemStack(soTools.mythrilBow, 1, WILDCARD_VALUE), new ItemStack(Block.gravel),  new ItemStack(Item.coal, 1, WILDCARD_VALUE), new ItemStack(soBlocks.mythrilOre), 15.0F);
        // extra Mythril recycling
        FusionRecipes.smelting().addSmelting(new ItemStack(soItems.mythrilRod), new ItemStack(Block.gravel),  new ItemStack(Item.coal, 1, WILDCARD_VALUE), new ItemStack(soBlocks.mythrilOre), 15.0F);
        FusionRecipes.smelting().addSmelting(new ItemStack(soBlocks.mythrilFurnace), new ItemStack(Block.gravel, 2, 0),  new ItemStack(Item.coal, 2, WILDCARD_VALUE), new ItemStack(soBlocks.mythrilOre, 2, 0), 15.0F);
        //
        // recycle your Adamantium
        FusionRecipes.smelting().addSmelting(new ItemStack(soArmor.adamantiumHelm, 1, WILDCARD_VALUE), new ItemStack(Block.gravel),  new ItemStack(Item.coal, 1, WILDCARD_VALUE), new ItemStack(soBlocks.adamantiumOre), 15.0F);
        FusionRecipes.smelting().addSmelting(new ItemStack(soArmor.adamantiumChest, 1, WILDCARD_VALUE), new ItemStack(Block.gravel, 2, 0),  new ItemStack(Item.coal, 2, WILDCARD_VALUE), new ItemStack(soBlocks.adamantiumOre, 2, 0), 30.0F);
        FusionRecipes.smelting().addSmelting(new ItemStack(soArmor.adamantiumLegs, 1, WILDCARD_VALUE), new ItemStack(Block.gravel, 2, 0),  new ItemStack(Item.coal, 2, WILDCARD_VALUE), new ItemStack(soBlocks.adamantiumOre, 2, 0), 30.0F);
        FusionRecipes.smelting().addSmelting(new ItemStack(soArmor.adamantiumBoots, 1, WILDCARD_VALUE), new ItemStack(Block.gravel),  new ItemStack(Item.coal, 1, WILDCARD_VALUE), new ItemStack(soBlocks.adamantiumOre), 15.0F);
        FusionRecipes.smelting().addSmelting(new ItemStack(soTools.adamantiumSword, 1, WILDCARD_VALUE), new ItemStack(Block.gravel),  new ItemStack(Item.coal, 1, WILDCARD_VALUE), new ItemStack(soBlocks.adamantiumOre), 15.0F);
        FusionRecipes.smelting().addSmelting(new ItemStack(soTools.adamantiumShovel, 1, WILDCARD_VALUE), new ItemStack(Block.gravel),  new ItemStack(Item.coal, 1, WILDCARD_VALUE), new ItemStack(soBlocks.adamantiumOre), 15.0F);
        FusionRecipes.smelting().addSmelting(new ItemStack(soTools.adamantiumPick, 1, WILDCARD_VALUE), new ItemStack(Block.gravel),  new ItemStack(Item.coal, 1, WILDCARD_VALUE), new ItemStack(soBlocks.adamantiumOre), 15.0F);
        FusionRecipes.smelting().addSmelting(new ItemStack(soTools.adamantiumAxe, 1, WILDCARD_VALUE), new ItemStack(Block.gravel),  new ItemStack(Item.coal, 1, WILDCARD_VALUE), new ItemStack(soBlocks.adamantiumOre), 15.0F);
        FusionRecipes.smelting().addSmelting(new ItemStack(soTools.adamantiumHoe, 1, WILDCARD_VALUE), new ItemStack(Block.gravel),  new ItemStack(Item.coal, 1, WILDCARD_VALUE), new ItemStack(soBlocks.adamantiumOre), 15.0F);
        // extra Adamantium recycling
        FusionRecipes.smelting().addSmelting(new ItemStack(soTools.adamantiumShears, 1, WILDCARD_VALUE), new ItemStack(Block.gravel),  new ItemStack(Item.coal, 1, WILDCARD_VALUE), new ItemStack(soBlocks.adamantiumOre), 15.0F);
        //
        // recycle your Onyx
        FusionRecipes.smelting().addSmelting(new ItemStack(soArmor.onyxHelm, 1, WILDCARD_VALUE), new ItemStack(Block.netherrack), new ItemStack(Item.bucketLava), new ItemStack(soItems.onyxGem), 20.0F);
        FusionRecipes.smelting().addSmelting(new ItemStack(soArmor.onyxChest, 1, WILDCARD_VALUE), new ItemStack(Block.netherrack, 2, 0), new ItemStack(Item.bucketLava), new ItemStack(soItems.onyxGem, 2, 0), 40.0F);
        FusionRecipes.smelting().addSmelting(new ItemStack(soArmor.onyxLegs, 1, WILDCARD_VALUE), new ItemStack(Block.netherrack, 2, 0), new ItemStack(Item.bucketLava), new ItemStack(soItems.onyxGem, 2, 0), 40.0F);
        FusionRecipes.smelting().addSmelting(new ItemStack(soArmor.onyxBoots, 1, WILDCARD_VALUE), new ItemStack(Block.netherrack), new ItemStack(Item.bucketLava), new ItemStack(soItems.onyxGem), 20.0F);
        FusionRecipes.smelting().addSmelting(new ItemStack(soTools.onyxSword, 1, WILDCARD_VALUE), new ItemStack(Block.netherrack), new ItemStack(Item.bucketLava), new ItemStack(soItems.onyxGem), 20.0F);
        FusionRecipes.smelting().addSmelting(new ItemStack(soTools.onyxShovel, 1, WILDCARD_VALUE), new ItemStack(Block.netherrack), new ItemStack(Item.bucketLava), new ItemStack(soItems.onyxGem), 20.0F);
        FusionRecipes.smelting().addSmelting(new ItemStack(soTools.onyxPick, 1, WILDCARD_VALUE), new ItemStack(Block.netherrack), new ItemStack(Item.bucketLava), new ItemStack(soItems.onyxGem), 20.0F);
        FusionRecipes.smelting().addSmelting(new ItemStack(soTools.onyxAxe, 1, WILDCARD_VALUE), new ItemStack(Block.netherrack), new ItemStack(Item.bucketLava), new ItemStack(soItems.onyxGem), 20.0F);
        FusionRecipes.smelting().addSmelting(new ItemStack(soTools.onyxHoe, 1, WILDCARD_VALUE), new ItemStack(Block.netherrack), new ItemStack(Item.bucketLava), new ItemStack(soItems.onyxGem), 20.0F);
        FusionRecipes.smelting().addSmelting(new ItemStack(soTools.onyxBow, 1, WILDCARD_VALUE), new ItemStack(Block.netherrack), new ItemStack(Item.bucketLava), new ItemStack(soItems.onyxGem), 20.0F);
        // extra Onyx recycling
        FusionRecipes.smelting().addSmelting(new ItemStack(soItems.onyxDoorItem), new ItemStack(Block.netherrack), new ItemStack(Item.bucketLava), new ItemStack(soItems.onyxGem), 20.0F);
        FusionRecipes.smelting().addSmelting(new ItemStack(soItems.onyxRod), new ItemStack(Block.netherrack), new ItemStack(Item.bucketLava), new ItemStack(soItems.onyxGem), 20.0F);
        FusionRecipes.smelting().addSmelting(new ItemStack(soTools.onyxShears, 1, WILDCARD_VALUE), new ItemStack(Block.netherrack), new ItemStack(Item.bucketLava), new ItemStack(soItems.onyxGem), 20.0F);
        FusionRecipes.smelting().addSmelting(new ItemStack(soBlocks.onyxFurnace), new ItemStack(Block.netherrack, 2, 0), new ItemStack(Item.bucketLava), new ItemStack(soItems.onyxGem, 2, 0), 40.0F);
        //
        // recycle your Bronze
        FusionRecipes.smelting().addSmelting(new ItemStack(soAlloy.bronzeHelm, 1, WILDCARD_VALUE), new ItemStack(Block.gravel),  new ItemStack(Item.coal, 1, WILDCARD_VALUE), new ItemStack(soAlloy.largeBronzeChunk), 10.0F);
        FusionRecipes.smelting().addSmelting(new ItemStack(soAlloy.bronzeChest, 1, WILDCARD_VALUE), new ItemStack(Block.gravel, 2, 0),  new ItemStack(Item.coal, 2, WILDCARD_VALUE), new ItemStack(soAlloy.largeBronzeChunk, 2, 0), 20.0F);
        FusionRecipes.smelting().addSmelting(new ItemStack(soAlloy.bronzeLegs, 1, WILDCARD_VALUE), new ItemStack(Block.gravel, 2, 0),  new ItemStack(Item.coal, 2, WILDCARD_VALUE), new ItemStack(soAlloy.largeBronzeChunk, 2, 0), 20.0F);
        FusionRecipes.smelting().addSmelting(new ItemStack(soAlloy.bronzeBoots, 1, WILDCARD_VALUE), new ItemStack(Block.gravel),  new ItemStack(Item.coal, 1, WILDCARD_VALUE), new ItemStack(soAlloy.largeBronzeChunk), 10.0F);
        FusionRecipes.smelting().addSmelting(new ItemStack(soAlloy.bronzeSword, 1, WILDCARD_VALUE), new ItemStack(Block.gravel),  new ItemStack(Item.coal, 1, WILDCARD_VALUE), new ItemStack(soAlloy.largeBronzeChunk), 10.0F);
        FusionRecipes.smelting().addSmelting(new ItemStack(soAlloy.bronzeShovel, 1, WILDCARD_VALUE), new ItemStack(Block.gravel),  new ItemStack(Item.coal, 1, WILDCARD_VALUE), new ItemStack(soAlloy.largeBronzeChunk), 10.0F);
        FusionRecipes.smelting().addSmelting(new ItemStack(soAlloy.bronzePick, 1, WILDCARD_VALUE), new ItemStack(Block.gravel),  new ItemStack(Item.coal, 1, WILDCARD_VALUE), new ItemStack(soAlloy.largeBronzeChunk), 10.0F);
        FusionRecipes.smelting().addSmelting(new ItemStack(soAlloy.bronzePick, 1, WILDCARD_VALUE), new ItemStack(Block.gravel),  new ItemStack(Item.coal, 1, WILDCARD_VALUE), new ItemStack(soAlloy.largeBronzeChunk), 10.0F);
        FusionRecipes.smelting().addSmelting(new ItemStack(soAlloy.bronzeAxe, 1, WILDCARD_VALUE), new ItemStack(Block.gravel),  new ItemStack(Item.coal, 1, WILDCARD_VALUE), new ItemStack(soAlloy.largeBronzeChunk), 10.0F);
        FusionRecipes.smelting().addSmelting(new ItemStack(soAlloy.bronzeHoe, 1, WILDCARD_VALUE), new ItemStack(Block.gravel),  new ItemStack(Item.coal, 1, WILDCARD_VALUE), new ItemStack(soAlloy.largeBronzeChunk), 10.0F);
        //
        // recycle your Thyrium
        FusionRecipes.smelting().addSmelting(new ItemStack(soAlloy.thyriumHelm, 1, WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.bucketLava), new ItemStack(soAlloy.largeThyriumChunk), 15.0F);
        FusionRecipes.smelting().addSmelting(new ItemStack(soAlloy.thyriumChest, 1, WILDCARD_VALUE), new ItemStack(Block.gravel, 2, 0), new ItemStack(Item.bucketLava), new ItemStack(soAlloy.largeThyriumChunk, 2, 0), 15.0F);
        FusionRecipes.smelting().addSmelting(new ItemStack(soAlloy.thyriumLegs, 1, WILDCARD_VALUE), new ItemStack(Block.gravel, 2, 0), new ItemStack(Item.bucketLava), new ItemStack(soAlloy.largeThyriumChunk, 2, 0), 15.0F);
        FusionRecipes.smelting().addSmelting(new ItemStack(soAlloy.thyriumBoots, 1, WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.bucketLava), new ItemStack(soAlloy.largeThyriumChunk), 15.0F);
        FusionRecipes.smelting().addSmelting(new ItemStack(soAlloy.thyriumSword, 1, WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.bucketLava), new ItemStack(soAlloy.largeThyriumChunk), 15.0F);
        FusionRecipes.smelting().addSmelting(new ItemStack(soAlloy.thyriumShovel, 1, WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.bucketLava), new ItemStack(soAlloy.largeThyriumChunk), 15.0F);
        FusionRecipes.smelting().addSmelting(new ItemStack(soAlloy.thyriumPick, 1, WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.bucketLava), new ItemStack(soAlloy.largeThyriumChunk), 15.0F);
        FusionRecipes.smelting().addSmelting(new ItemStack(soAlloy.thyriumPick, 1, WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.bucketLava), new ItemStack(soAlloy.largeThyriumChunk), 15.0F);
        FusionRecipes.smelting().addSmelting(new ItemStack(soAlloy.thyriumAxe, 1, WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.bucketLava), new ItemStack(soAlloy.largeThyriumChunk), 15.0F);
        FusionRecipes.smelting().addSmelting(new ItemStack(soAlloy.thyriumHoe, 1, WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.bucketLava), new ItemStack(soAlloy.largeThyriumChunk), 15.0F);
        FusionRecipes.smelting().addSmelting(new ItemStack(soAlloy.thyriumBow, 1, WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.bucketLava), new ItemStack(soAlloy.largeThyriumChunk), 15.0F);
        // extra Thyrium recycling
        FusionRecipes.smelting().addSmelting(new ItemStack(soAlloy.thyriumRod), new ItemStack(Block.gravel), new ItemStack(Item.bucketLava), new ItemStack(soAlloy.largeThyriumChunk), 15.0F);
        //
        // recycle your Sinisite
        FusionRecipes.smelting().addSmelting(new ItemStack(soAlloy.sinisiteHelm, 1, WILDCARD_VALUE), new ItemStack(Block.netherrack), new ItemStack(Item.bucketLava), new ItemStack(soAlloy.largeSinisiteChunk), 20.0F);
        FusionRecipes.smelting().addSmelting(new ItemStack(soAlloy.sinisiteChest, 1, WILDCARD_VALUE), new ItemStack(Block.netherrack, 2, 0), new ItemStack(Item.bucketLava), new ItemStack(soAlloy.largeSinisiteChunk, 2, 0), 20.0F);
        FusionRecipes.smelting().addSmelting(new ItemStack(soAlloy.sinisiteLegs, 1, WILDCARD_VALUE), new ItemStack(Block.netherrack, 2, 0), new ItemStack(Item.bucketLava), new ItemStack(soAlloy.largeSinisiteChunk, 2, 0), 20.0F);
        FusionRecipes.smelting().addSmelting(new ItemStack(soAlloy.sinisiteBoots, 1, WILDCARD_VALUE), new ItemStack(Block.netherrack), new ItemStack(Item.bucketLava), new ItemStack(soAlloy.largeSinisiteChunk), 20.0F);
        FusionRecipes.smelting().addSmelting(new ItemStack(soAlloy.sinisiteSword, 1, WILDCARD_VALUE), new ItemStack(Block.netherrack), new ItemStack(Item.bucketLava), new ItemStack(soAlloy.largeSinisiteChunk), 20.0F);
        FusionRecipes.smelting().addSmelting(new ItemStack(soAlloy.sinisiteShovel, 1, WILDCARD_VALUE), new ItemStack(Block.netherrack), new ItemStack(Item.bucketLava), new ItemStack(soAlloy.largeSinisiteChunk), 20.0F);
        FusionRecipes.smelting().addSmelting(new ItemStack(soAlloy.sinisitePick, 1, WILDCARD_VALUE), new ItemStack(Block.netherrack), new ItemStack(Item.bucketLava), new ItemStack(soAlloy.largeSinisiteChunk), 20.0F);
        FusionRecipes.smelting().addSmelting(new ItemStack(soAlloy.sinisiteAxe, 1, WILDCARD_VALUE), new ItemStack(Block.netherrack), new ItemStack(Item.bucketLava), new ItemStack(soAlloy.largeSinisiteChunk), 20.0F);
        FusionRecipes.smelting().addSmelting(new ItemStack(soAlloy.sinisiteHoe, 1, WILDCARD_VALUE), new ItemStack(Block.netherrack), new ItemStack(Item.bucketLava), new ItemStack(soAlloy.largeSinisiteChunk), 20.0F);
        FusionRecipes.smelting().addSmelting(new ItemStack(soAlloy.sinisiteBow, 1, WILDCARD_VALUE), new ItemStack(Block.netherrack), new ItemStack(Item.bucketLava), new ItemStack(soAlloy.largeSinisiteChunk), 20.0F);
        // extra Sinisite recycling
        FusionRecipes.smelting().addSmelting(new ItemStack(soAlloy.sinisiteRod), new ItemStack(Block.netherrack), new ItemStack(Item.bucketLava), new ItemStack(soAlloy.largeSinisiteChunk), 20.0F);
    }

    @EventHandler // used in 1.6.2
    public void postInit(FMLPostInitializationEvent event)
    {
        // Stub Method
    }
}
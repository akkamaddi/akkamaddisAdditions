package SimpleOres.plugins.akkamaddi.simpleclay.code;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import SimpleOres.plugins.fusion.FusionRecipes;

@Mod(modid = "ClayFusion", name = "Clay and Cobblestone Fusion Recipes", version = "1.0.3", dependencies = "required-after:simpleoresfusion")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class SimpleClay
{
    // The instance of your mod that Forge uses.
    @Instance("ClayFusion")
    public static SimpleClay instance;

    // Says where the client and server 'proxy' code is loaded.
    @SidedProxy(clientSide = "SimpleOres.plugins.akkamaddi.simpleclay.code.ClientProxy", serverSide = "SimpleOres.plugins.akkamaddi.simpleclay.code.CommonProxy")
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
        // Fusion Clay Recipes
        FusionRecipes.smelting().addSmelting(new ItemStack(Block.dirt), new ItemStack(Block.dirt), new ItemStack(Item.clay), new ItemStack(Item.clay, 2, 0), 0.1F);
        FusionRecipes.smelting().addSmelting(new ItemStack(Block.grass), new ItemStack(Block.dirt), new ItemStack(Item.clay), new ItemStack(Item.clay, 2, 0), 0.1F);
        FusionRecipes.smelting().addSmelting(new ItemStack(Block.grass), new ItemStack(Block.grass), new ItemStack(Item.clay), new ItemStack(Item.clay, 2, 0), 0.1F);
        FusionRecipes.smelting().addSmelting(new ItemStack(Block.brick), new ItemStack(Block.brick), new ItemStack(Item.clay), new ItemStack(Block.blockClay), 0.2F);
        FusionRecipes.smelting().addSmelting(new ItemStack(Block.hardenedClay), new ItemStack(Block.brick), new ItemStack(Item.clay), new ItemStack(Block.blockClay), 0.2F);
        FusionRecipes.smelting().addSmelting(new ItemStack(Block.hardenedClay), new ItemStack(Block.hardenedClay), new ItemStack(Item.clay), new ItemStack(Block.blockClay), 0.2F);
        FusionRecipes.smelting().addSmelting(new ItemStack(Block.stainedClay, 1, WILDCARD_VALUE), new ItemStack(Block.hardenedClay), new ItemStack(Item.clay), new ItemStack(Block.blockClay), 0.2F);
        FusionRecipes.smelting().addSmelting(new ItemStack(Block.stainedClay, 1, WILDCARD_VALUE), new ItemStack(Block.brick), new ItemStack(Item.clay), new ItemStack(Block.blockClay), 0.2F);
        FusionRecipes.smelting().addSmelting(new ItemStack(Block.stainedClay, 1, WILDCARD_VALUE), new ItemStack(Block.stainedClay, 1, WILDCARD_VALUE), new ItemStack(Item.clay), new ItemStack(Block.blockClay), 0.2F);
        // from Clay
        FusionRecipes.smelting().addSmelting(new ItemStack(Block.gravel), new ItemStack(Block.gravel), new ItemStack(Item.clay), new ItemStack(Block.cobblestone), 0.1F);
        // Gratuitous
        FusionRecipes.smelting().addSmelting(new ItemStack(Block.cobblestone), new ItemStack(Block.vine), new ItemStack(Item.dyePowder, 1, 15), new ItemStack(Block.cobblestoneMossy), 0.3F);
        FusionRecipes.smelting().addSmelting(new ItemStack(Block.stoneBrick), new ItemStack(Block.vine), new ItemStack(Item.dyePowder, 1, 15), new ItemStack(Block.stoneBrick, 1, 1), 0.3F);
    }

    @EventHandler // used in 1.6.2
    public void postInit(FMLPostInitializationEvent event)
    {
        // Stub Method
    }
}
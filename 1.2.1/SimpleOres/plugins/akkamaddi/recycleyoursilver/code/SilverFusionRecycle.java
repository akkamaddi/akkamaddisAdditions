package SimpleOres.plugins.akkamaddi.recycleyoursilver.code;

import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler; // used in 1.6.2
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;

import com.google.common.base.Optional;

import net.minecraft.creativetab.CreativeTabs;
import OnlySilver.code.api.OnlySilverAPI;
import SimpleOres.plugins.fusion.FusionRecipes;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.block.Block;
import net.minecraftforge.oredict.OreDictionary;

@Mod(modid = "SilverRecycle", name = "Recycle Your Silver Recipes", version = "1.0.2",  dependencies = "required-after:onlysilver; required-after:simpleoresfusion")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)

// dependencies = "required-after:onlysilver" --This is for soft dependencies.

public class SilverFusionRecycle
{
    // The instance of your mod that Forge uses.
    @Instance("SilverRecycle")
    public static SilverFusionRecycle instance;

    // Says where the client and server 'proxy' code is loaded.
    @SidedProxy(clientSide = "SimpleOres.plugins.akkamaddi.recycleyoursilver.code.ClientProxy", serverSide = "SimpleOres.plugins.akkamaddi.recycleyoursilver.code.CommonProxy")
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
        // Primary: helmet, chest, leggings, boots, sword, shovel, pickaxe, axe, hoe, ?horsearmor?, ?bow?
        // Secondary: Item.alpha, Block.alpha,
        // recycle your Silver
        FusionRecipes.smelting().addSmelting(new ItemStack(OnlySilverAPI.silverHelm.get(), 1, WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, WILDCARD_VALUE), new ItemStack(OnlySilverAPI.silverOre.get()), 10.0F);
        FusionRecipes.smelting().addSmelting(new ItemStack(OnlySilverAPI.silverChest.get(), 1, WILDCARD_VALUE), new ItemStack(Block.gravel, 2, 0), new ItemStack(Item.coal, 2, WILDCARD_VALUE), new ItemStack(OnlySilverAPI.silverOre.get(), 2, 0), 20.0F);
        FusionRecipes.smelting().addSmelting(new ItemStack(OnlySilverAPI.silverLegs.get(), 1, WILDCARD_VALUE), new ItemStack(Block.gravel, 2, 0), new ItemStack(Item.coal, 2, WILDCARD_VALUE), new ItemStack(OnlySilverAPI.silverOre.get(), 2, 0), 20.0F);
        FusionRecipes.smelting().addSmelting(new ItemStack(OnlySilverAPI.silverBoots.get(), 1, WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, WILDCARD_VALUE), new ItemStack(OnlySilverAPI.silverOre.get()), 10.0F);
        FusionRecipes.smelting().addSmelting(new ItemStack(OnlySilverAPI.silverSword.get(), 1, WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, WILDCARD_VALUE), new ItemStack(OnlySilverAPI.silverOre.get()), 10.0F);
        FusionRecipes.smelting().addSmelting(new ItemStack(OnlySilverAPI.silverShovel.get(), 1, WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, WILDCARD_VALUE), new ItemStack(OnlySilverAPI.silverOre.get()), 10.0F);
        FusionRecipes.smelting().addSmelting(new ItemStack(OnlySilverAPI.silverPick.get(), 1, WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, WILDCARD_VALUE), new ItemStack(OnlySilverAPI.silverOre.get()), 10.0F);
        FusionRecipes.smelting().addSmelting(new ItemStack(OnlySilverAPI.silverAxe.get(), 1, WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, WILDCARD_VALUE), new ItemStack(OnlySilverAPI.silverOre.get()), 10.0F);
        FusionRecipes.smelting().addSmelting(new ItemStack(OnlySilverAPI.silverHoe.get(), 1, WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, WILDCARD_VALUE), new ItemStack(OnlySilverAPI.silverOre.get()), 10.0F);
        FusionRecipes.smelting().addSmelting(new ItemStack(OnlySilverAPI.silverBow.get(), 1, WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, WILDCARD_VALUE), new ItemStack(OnlySilverAPI.silverOre.get()), 10.0F);
        // extra Silver recycling
        FusionRecipes.smelting().addSmelting(new ItemStack(OnlySilverAPI.silverRod.get(), 1, WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, WILDCARD_VALUE), new ItemStack(OnlySilverAPI.silverOre.get()), 10.0F);
    }

    @EventHandler // used in 1.6.2
    public void postInit(FMLPostInitializationEvent event)
    {
        // Stub Method
    }
}

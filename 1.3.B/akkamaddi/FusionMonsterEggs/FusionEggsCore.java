package akkamaddi.FusionMonsterEggs;

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
import alexndr.SimpleOres.plugins.fusion.FusionHelper;

@Mod(modid = "spawneggfusion", name = "Fusion recipes for spawn eggs of common mobs", version = "1.1.0", dependencies = "required-after:simpleoresfusion")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)

public class FusionEggsCore
{
    // The instance of your mod that Forge uses.
    @Instance("spawneggfusion")
    public static FusionEggsCore instance;

    // Says where the client and server 'proxy' code is loaded.
    @SidedProxy(clientSide = "akkamaddi.FusionMonsterEggs.ClientProxy", serverSide = "akkamaddi.FusionMonsterEggs.CommonProxy")
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
        // The Eggs
        // the bad
        // creeper
        FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(Item.egg), new ItemStack(Item.gunpowder), new ItemStack(Item.dyePowder, 1, 10), new ItemStack(Item.monsterPlacer, 1, 50), 1.0F);
        // skeleton
        FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(Item.egg), new ItemStack(Item.bone), new ItemStack(Item.dyePowder, 1, 15), new ItemStack(Item.monsterPlacer, 1, 51), 1.0F);
        // spider
        FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(Item.egg), new ItemStack(Item.spiderEye), new ItemStack(Item.dyePowder, 1, 0), new ItemStack(Item.monsterPlacer, 1, 52), 1.0F);
        // cave spider
        FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(Item.egg), new ItemStack(Block.web), new ItemStack(Item.dyePowder, 1, 0), new ItemStack(Item.monsterPlacer, 1, 59), 1.0F);
        // zombie
        FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(Item.egg), new ItemStack(Item.rottenFlesh), new ItemStack(Item.dyePowder, 1, 2), new ItemStack(Item.monsterPlacer, 1, 54), 1.0F);
        // slime
        FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(Item.egg), new ItemStack(Item.slimeBall), new ItemStack(Item.dyePowder, 1, 2), new ItemStack(Item.monsterPlacer, 1, 55), 1.0F);
        // the good
        // sheep
        FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(Item.egg), new ItemStack(Block.cloth, 1, WILDCARD_VALUE), new ItemStack(Item.dyePowder, 1, 7), new ItemStack(Item.monsterPlacer, 1, 91), 1.0F);
        // pig
        FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(Item.egg), new ItemStack(Item.porkRaw), new ItemStack(Item.dyePowder, 1, 9), new ItemStack(Item.monsterPlacer, 1, 90), 1.0F);
        // cow
        FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(Item.egg), new ItemStack(Item.beefRaw), new ItemStack(Item.dyePowder, 1, 3), new ItemStack(Item.monsterPlacer, 1, 92), 1.0F);
        // horse
        FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(Item.egg), new ItemStack(Block.hay), new ItemStack(Item.dyePowder, 1, 3), new ItemStack(Item.monsterPlacer, 1, 100), 1.0F);
        // chicken
        FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(Item.egg), new ItemStack(Item.feather), new ItemStack(Item.dyePowder, 1, 15), new ItemStack(Item.monsterPlacer, 1, 93), 1.0F);
        // the neutral
        // wolf
        FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(Item.egg), new ItemStack(Item.bone), new ItemStack(Item.dyePowder, 1, 1), new ItemStack(Item.monsterPlacer, 1, 95), 1.0F);
        // ocelot
        FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(Item.egg), new ItemStack(Item.fishRaw), new ItemStack(Item.dyePowder, 1, 11), new ItemStack(Item.monsterPlacer, 1, 98), 1.0F);
        // squid
        FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(Item.egg), new ItemStack(Item.fishRaw), new ItemStack(Item.dyePowder, 1, 0), new ItemStack(Item.monsterPlacer, 1, 94), 1.0F);
    }

    @EventHandler // used in 1.6.2
    public void postInit(FMLPostInitializationEvent event)
    {
        // Stub Method
    }
}

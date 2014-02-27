package akkamaddi.SimpleSaplings;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler; // used in 1.6.2
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import alexndr.SimpleOres.plugins.fusion.FusionHelper;

@Mod(modid = "simplesaplings", name = "Simple Saplings", version = "1.1.0", dependencies = "required-after:simpleoresfusion")
@NetworkMod(clientSideRequired = true)

public class FuseSaplings
{
    // The instance of your mod that Forge uses.
    @Instance(value = "simplesaplings")
    public static FuseSaplings instance;

    // Says where the client and server 'proxy' code is loaded.
    @SidedProxy(clientSide = "akkamaddi.SimpleSaplings.ClientProxy", serverSide = "akkamaddi.SimpleSaplings.CommonProxy")
    public static CommonProxy proxy;

    // Loop variable
    public static int[] blarg = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};

    @EventHandler // used in 1.6.2
    public void preInit(FMLPreInitializationEvent event)
    {
        // Stub Method
    }

    @EventHandler // used in 1.6.2
    public void load(FMLInitializationEvent event)
    {
        proxy.registerRenderers();

        for (int i : blarg)
            FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(
                new ItemStack(Block.wood, 1, i),
                new ItemStack(Block.leaves, 1, i),
                new ItemStack(Item.dyePowder, 1, 15),
                new ItemStack(Block.sapling, 1, i),
                0.1F);
    }

    @EventHandler // used in 1.6.2
    public void postInit(FMLPostInitializationEvent event)
    {
        // Stub Method
    }
}

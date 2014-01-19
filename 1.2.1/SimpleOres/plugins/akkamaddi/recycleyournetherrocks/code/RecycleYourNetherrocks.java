package SimpleOres.plugins.akkamaddi.recycleyournetherrocks.code;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import net.minecraft.creativetab.CreativeTabs;
import SimpleOres.plugins.fusion.FusionRecipes;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.block.Block;
import net.minecraftforge.oredict.OreDictionary;
import Netherrocks.core.Tools;
import Netherrocks.core.Armor;
import Netherrocks.core.Blocks;
import Netherrocks.core.Items;

@Mod(modid = "recyclenetherrocks", name = "Recycle Your Netherrocks", version = "1.0.0", dependencies = "required-after:simpleoresfusion ; required-after:netherrocks")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)

public class RecycleYourNetherrocks
{
    // The instance of your mod that Forge uses.
    @Instance("recyclenetherrocks")
    public static RecycleYourNetherrocks instance;

    // Says where the client and server 'proxy' code is loaded.
    @SidedProxy(clientSide = "SimpleOres.plugins.akkamaddi.recycleyournetherrocks.code.ClientProxy", serverSide = "SimpleOres.plugins.akkamaddi.recycleyournetherrocks.code.CommonProxy")
    public static CommonProxy proxy;

    // wildcard
    private static final int WILDCARD_VALUE = OreDictionary.WILDCARD_VALUE;
    
    public static Netherrocks.core.Tools nrtools;
    public static Netherrocks.core.Armor nrArmor;
    public static Netherrocks.core.Blocks nrBlocks;
    public static Netherrocks.core.Items nrItems;


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
        //
        // recycle your Malachite
        FusionRecipes.smelting().addSmelting(new ItemStack(nrArmor.malachiteHelm, 1, WILDCARD_VALUE), new ItemStack(Block.netherrack), new ItemStack(Item.netherQuartz), new ItemStack(nrBlocks.malachiteOre), 10.0F);
        FusionRecipes.smelting().addSmelting(new ItemStack(nrArmor.malachiteChest, 1, WILDCARD_VALUE), new ItemStack(Block.netherrack, 2, 0), new ItemStack(Item.netherQuartz, 2), new ItemStack(nrBlocks.malachiteOre, 2, 0), 20.0F);
        FusionRecipes.smelting().addSmelting(new ItemStack(nrArmor.malachiteLegs, 1, WILDCARD_VALUE), new ItemStack(Block.netherrack, 2, 0), new ItemStack(Item.netherQuartz, 2), new ItemStack(nrBlocks.malachiteOre, 2, 0), 20.0F);
        FusionRecipes.smelting().addSmelting(new ItemStack(nrArmor.malachiteBoots, 1, WILDCARD_VALUE), new ItemStack(Block.netherrack), new ItemStack(Item.netherQuartz), new ItemStack(nrBlocks.malachiteOre), 10.0F);
        FusionRecipes.smelting().addSmelting(new ItemStack(nrtools.malachitePick, 1, WILDCARD_VALUE), new ItemStack(Block.netherrack), new ItemStack(Item.netherQuartz), new ItemStack(nrBlocks.malachiteOre), 10.0F);
        FusionRecipes.smelting().addSmelting(new ItemStack(nrtools.malachiteAxe, 1, WILDCARD_VALUE), new ItemStack(Block.netherrack), new ItemStack(Item.netherQuartz), new ItemStack(nrBlocks.malachiteOre), 10.0F);
        FusionRecipes.smelting().addSmelting(new ItemStack(nrtools.malachiteShovel, 1, WILDCARD_VALUE), new ItemStack(Block.netherrack), new ItemStack(Item.netherQuartz), new ItemStack(nrBlocks.malachiteOre), 10.0F);
        FusionRecipes.smelting().addSmelting(new ItemStack(nrtools.malachiteSword, 1, WILDCARD_VALUE), new ItemStack(Block.netherrack), new ItemStack(Item.netherQuartz), new ItemStack(nrBlocks.malachiteOre), 10.0F);
        FusionRecipes.smelting().addSmelting(new ItemStack(nrtools.malachiteHoe, 1, WILDCARD_VALUE), new ItemStack(Block.netherrack), new ItemStack(Item.netherQuartz), new ItemStack(nrBlocks.malachiteOre), 10.0F);
        //
        // recycle your Ashstone
        FusionRecipes.smelting().addSmelting(new ItemStack(nrtools.ashstonePick, 1, WILDCARD_VALUE), new ItemStack(Block.netherrack), new ItemStack(Item.netherQuartz), new ItemStack(nrItems.ashstoneGem), 15.0F);
        FusionRecipes.smelting().addSmelting(new ItemStack(nrtools.ashstoneAxe, 1, WILDCARD_VALUE), new ItemStack(Block.netherrack), new ItemStack(Item.netherQuartz), new ItemStack(nrItems.ashstoneGem), 15.0F);
        FusionRecipes.smelting().addSmelting(new ItemStack(nrtools.ashstoneShovel, 1, WILDCARD_VALUE), new ItemStack(Block.netherrack), new ItemStack(Item.netherQuartz), new ItemStack(nrItems.ashstoneGem), 15.0F);
        FusionRecipes.smelting().addSmelting(new ItemStack(nrtools.ashstoneSword, 1, WILDCARD_VALUE), new ItemStack(Block.netherrack), new ItemStack(Item.netherQuartz), new ItemStack(nrItems.ashstoneGem), 15.0F);
        FusionRecipes.smelting().addSmelting(new ItemStack(nrtools.ashstoneHoe, 1, WILDCARD_VALUE), new ItemStack(Block.netherrack), new ItemStack(Item.netherQuartz), new ItemStack(nrItems.ashstoneGem), 15.0F);
        //
        // recycle your Dragonstone
        FusionRecipes.smelting().addSmelting(new ItemStack(nrArmor.dragonstoneHelm, 1, WILDCARD_VALUE), new ItemStack(Block.netherrack), new ItemStack(Item.bucketLava), new ItemStack(nrItems.dragonstoneGem), 20.0F);
        FusionRecipes.smelting().addSmelting(new ItemStack(nrArmor.dragonstoneChest, 1, WILDCARD_VALUE), new ItemStack(Block.netherrack, 2, 0), new ItemStack(Item.bucketLava), new ItemStack(nrItems.dragonstoneGem, 2, 0), 40.0F);
        FusionRecipes.smelting().addSmelting(new ItemStack(nrArmor.dragonstoneLegs, 1, WILDCARD_VALUE), new ItemStack(Block.netherrack, 2, 0), new ItemStack(Item.bucketLava), new ItemStack(nrItems.dragonstoneGem, 2, 0), 40.0F);
        FusionRecipes.smelting().addSmelting(new ItemStack(nrArmor.dragonstoneBoots, 1, WILDCARD_VALUE), new ItemStack(Block.netherrack), new ItemStack(Item.bucketLava), new ItemStack(nrItems.dragonstoneGem), 20.0F);
        FusionRecipes.smelting().addSmelting(new ItemStack(nrtools.dragonstonePick, 1, WILDCARD_VALUE), new ItemStack(Block.netherrack), new ItemStack(Item.bucketLava), new ItemStack(nrItems.dragonstoneGem), 20.0F);
        FusionRecipes.smelting().addSmelting(new ItemStack(nrtools.dragonstoneAxe, 1, WILDCARD_VALUE), new ItemStack(Block.netherrack), new ItemStack(Item.bucketLava), new ItemStack(nrItems.dragonstoneGem), 20.0F);
        FusionRecipes.smelting().addSmelting(new ItemStack(nrtools.dragonstoneShovel, 1, WILDCARD_VALUE), new ItemStack(Block.netherrack), new ItemStack(Item.bucketLava), new ItemStack(nrItems.dragonstoneGem), 20.0F);
        FusionRecipes.smelting().addSmelting(new ItemStack(nrtools.dragonstoneSword, 1, WILDCARD_VALUE), new ItemStack(Block.netherrack), new ItemStack(Item.bucketLava), new ItemStack(nrItems.dragonstoneGem), 20.0F);
        FusionRecipes.smelting().addSmelting(new ItemStack(nrtools.dragonstoneHoe, 1, WILDCARD_VALUE), new ItemStack(Block.netherrack), new ItemStack(Item.bucketLava), new ItemStack(nrItems.dragonstoneGem), 20.0F);
        //
        // recycle your Argonite
        FusionRecipes.smelting().addSmelting(new ItemStack(nrtools.argonitePick, 1, WILDCARD_VALUE), new ItemStack(Block.netherrack), new ItemStack(Item.netherQuartz), new ItemStack(nrBlocks.argoniteOre), 15.0F);
        FusionRecipes.smelting().addSmelting(new ItemStack(nrtools.argoniteAxe, 1, WILDCARD_VALUE), new ItemStack(Block.netherrack), new ItemStack(Item.netherQuartz), new ItemStack(nrBlocks.argoniteOre), 15.0F);
        FusionRecipes.smelting().addSmelting(new ItemStack(nrtools.argoniteShovel, 1, WILDCARD_VALUE), new ItemStack(Block.netherrack), new ItemStack(Item.netherQuartz), new ItemStack(nrBlocks.argoniteOre), 15.0F);
        FusionRecipes.smelting().addSmelting(new ItemStack(nrtools.argoniteSword, 1, WILDCARD_VALUE), new ItemStack(Block.netherrack), new ItemStack(Item.netherQuartz), new ItemStack(nrBlocks.argoniteOre), 15.0F);
        FusionRecipes.smelting().addSmelting(new ItemStack(nrtools.argoniteHoe, 1, WILDCARD_VALUE), new ItemStack(Block.netherrack), new ItemStack(Item.netherQuartz), new ItemStack(nrBlocks.argoniteOre), 15.0F);
        //
        // recycle your Fyrite
        FusionRecipes.smelting().addSmelting(new ItemStack(nrArmor.fyriteHelm, 1, WILDCARD_VALUE), new ItemStack(Block.netherrack), new ItemStack(Item.netherQuartz), new ItemStack(nrBlocks.fyriteOre), 10.0F);
        FusionRecipes.smelting().addSmelting(new ItemStack(nrArmor.fyriteChest, 1, WILDCARD_VALUE), new ItemStack(Block.netherrack, 2, 0), new ItemStack(Item.netherQuartz, 2), new ItemStack(nrBlocks.fyriteOre, 2, 0), 20.0F);
        FusionRecipes.smelting().addSmelting(new ItemStack(nrArmor.fyriteLegs, 1, WILDCARD_VALUE), new ItemStack(Block.netherrack, 2, 0), new ItemStack(Item.netherQuartz, 2), new ItemStack(nrBlocks.fyriteOre, 2, 0), 20.0F);
        FusionRecipes.smelting().addSmelting(new ItemStack(nrArmor.fyriteBoots, 1, WILDCARD_VALUE), new ItemStack(Block.netherrack), new ItemStack(Item.netherQuartz), new ItemStack(nrBlocks.fyriteOre), 10.0F);
        FusionRecipes.smelting().addSmelting(new ItemStack(nrtools.fyriteSword, 1, WILDCARD_VALUE), new ItemStack(Block.netherrack), new ItemStack(Item.netherQuartz), new ItemStack(nrBlocks.fyriteOre), 10.0F);
        FusionRecipes.smelting().addSmelting(new ItemStack(nrtools.fyritePick, 1, WILDCARD_VALUE), new ItemStack(Block.netherrack), new ItemStack(Item.netherQuartz), new ItemStack(nrBlocks.fyriteOre), 10.0F);
        //
        //recycle your Illumenite
        FusionRecipes.smelting().addSmelting(new ItemStack(nrArmor.illumeniteHelm, 1, WILDCARD_VALUE), new ItemStack(Block.netherrack), new ItemStack(Item.glowstone), new ItemStack(nrBlocks.illumeniteOre), 10.0F);
        FusionRecipes.smelting().addSmelting(new ItemStack(nrArmor.illumeniteChest, 1, WILDCARD_VALUE), new ItemStack(Block.netherrack, 2, 0), new ItemStack(Item.glowstone, 2), new ItemStack(nrBlocks.illumeniteOre, 2, 0), 20.0F);
        FusionRecipes.smelting().addSmelting(new ItemStack(nrArmor.illumeniteLegs, 1, WILDCARD_VALUE), new ItemStack(Block.netherrack, 2, 0), new ItemStack(Item.glowstone, 2), new ItemStack(nrBlocks.illumeniteOre, 2, 0), 20.0F);
        FusionRecipes.smelting().addSmelting(new ItemStack(nrArmor.illumeniteBoots, 1, WILDCARD_VALUE), new ItemStack(Block.netherrack), new ItemStack(Item.glowstone), new ItemStack(nrBlocks.illumeniteOre), 10.0F);
        FusionRecipes.smelting().addSmelting(new ItemStack(nrtools.illumeniteSword, 1, WILDCARD_VALUE), new ItemStack(Block.netherrack), new ItemStack(Item.glowstone), new ItemStack(nrBlocks.illumeniteOre), 10.0F);
         

    }

    @EventHandler // used in 1.6.2
    public void postInit(FMLPostInitializationEvent event)
    {
        // Stub Method
    }
}
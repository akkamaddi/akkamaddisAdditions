package akkamaddi.netherrocksaddenda.code;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import alexndr.SimpleOres.plugins.fusion.FusionHelper;
import alexndr.SimpleOres.plugins.netherrocks.Content;

public class NRRecycleRecipes {
	
	// wildcard
    private static final int WILDCARD_VALUE = OreDictionary.WILDCARD_VALUE;
    
    public static void doRecycleRecipes(){

        // The mass of recipes
        //
        // recycle your Malachite
        FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(Content.malachiteHelm, 1, WILDCARD_VALUE), new ItemStack(Block.netherrack), new ItemStack(Item.netherQuartz), new ItemStack(Content.malachiteOre), 10.0F);
        FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(Content.malachiteChest, 1, WILDCARD_VALUE), new ItemStack(Block.netherrack, 2, 0), new ItemStack(Item.netherQuartz, 2), new ItemStack(Content.malachiteOre, 2, 0), 20.0F);
        FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(Content.malachiteLegs, 1, WILDCARD_VALUE), new ItemStack(Block.netherrack, 2, 0), new ItemStack(Item.netherQuartz, 2), new ItemStack(Content.malachiteOre, 2, 0), 20.0F);
        FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(Content.malachiteBoots, 1, WILDCARD_VALUE), new ItemStack(Block.netherrack), new ItemStack(Item.netherQuartz), new ItemStack(Content.malachiteOre), 10.0F);
        FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(Content.malachitePick, 1, WILDCARD_VALUE), new ItemStack(Block.netherrack), new ItemStack(Item.netherQuartz), new ItemStack(Content.malachiteOre), 10.0F);
        FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(Content.malachiteAxe, 1, WILDCARD_VALUE), new ItemStack(Block.netherrack), new ItemStack(Item.netherQuartz), new ItemStack(Content.malachiteOre), 10.0F);
        FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(Content.malachiteShovel, 1, WILDCARD_VALUE), new ItemStack(Block.netherrack), new ItemStack(Item.netherQuartz), new ItemStack(Content.malachiteOre), 10.0F);
        FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(Content.malachiteSword, 1, WILDCARD_VALUE), new ItemStack(Block.netherrack), new ItemStack(Item.netherQuartz), new ItemStack(Content.malachiteOre), 10.0F);
        FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(Content.malachiteHoe, 1, WILDCARD_VALUE), new ItemStack(Block.netherrack), new ItemStack(Item.netherQuartz), new ItemStack(Content.malachiteOre), 10.0F);
        //
        // recycle your Ashstone
        FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(Content.ashstonePick, 1, WILDCARD_VALUE), new ItemStack(Block.netherrack), new ItemStack(Item.netherQuartz), new ItemStack(Content.ashstoneOre), 15.0F);
        FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(Content.ashstoneAxe, 1, WILDCARD_VALUE), new ItemStack(Block.netherrack), new ItemStack(Item.netherQuartz), new ItemStack(Content.ashstoneOre), 15.0F);
        FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(Content.ashstoneShovel, 1, WILDCARD_VALUE), new ItemStack(Block.netherrack), new ItemStack(Item.netherQuartz), new ItemStack(Content.ashstoneOre), 15.0F);
        FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(Content.ashstoneSword, 1, WILDCARD_VALUE), new ItemStack(Block.netherrack), new ItemStack(Item.netherQuartz), new ItemStack(Content.ashstoneOre), 15.0F);
        FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(Content.ashstoneHoe, 1, WILDCARD_VALUE), new ItemStack(Block.netherrack), new ItemStack(Item.netherQuartz), new ItemStack(Content.ashstoneOre), 15.0F);
        //
        // recycle your Dragonstone
        FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(Content.dragonstoneHelm, 1, WILDCARD_VALUE), new ItemStack(Block.netherrack), new ItemStack(Item.bucketLava), new ItemStack(Content.dragonstoneOre), 20.0F);
        FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(Content.dragonstoneChest, 1, WILDCARD_VALUE), new ItemStack(Block.netherrack, 2, 0), new ItemStack(Item.bucketLava), new ItemStack(Content.dragonstoneOre, 2, 0), 40.0F);
        FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(Content.dragonstoneLegs, 1, WILDCARD_VALUE), new ItemStack(Block.netherrack, 2, 0), new ItemStack(Item.bucketLava), new ItemStack(Content.dragonstoneOre, 2, 0), 40.0F);
        FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(Content.dragonstoneBoots, 1, WILDCARD_VALUE), new ItemStack(Block.netherrack), new ItemStack(Item.bucketLava), new ItemStack(Content.dragonstoneOre), 20.0F);
        FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(Content.dragonstonePick, 1, WILDCARD_VALUE), new ItemStack(Block.netherrack), new ItemStack(Item.bucketLava), new ItemStack(Content.dragonstoneOre), 20.0F);
        FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(Content.dragonstoneAxe, 1, WILDCARD_VALUE), new ItemStack(Block.netherrack), new ItemStack(Item.bucketLava), new ItemStack(Content.dragonstoneOre), 20.0F);
        FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(Content.dragonstoneShovel, 1, WILDCARD_VALUE), new ItemStack(Block.netherrack), new ItemStack(Item.bucketLava), new ItemStack(Content.dragonstoneOre), 20.0F);
        FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(Content.dragonstoneSword, 1, WILDCARD_VALUE), new ItemStack(Block.netherrack), new ItemStack(Item.bucketLava), new ItemStack(Content.dragonstoneOre), 20.0F);
        FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(Content.dragonstoneHoe, 1, WILDCARD_VALUE), new ItemStack(Block.netherrack), new ItemStack(Item.bucketLava), new ItemStack(Content.dragonstoneOre), 20.0F);
        //
        // recycle your Argonite
        FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(Content.argonitePick, 1, WILDCARD_VALUE), new ItemStack(Block.netherrack), new ItemStack(Item.netherQuartz), new ItemStack(Content.argoniteOre), 15.0F);
        FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(Content.argoniteAxe, 1, WILDCARD_VALUE), new ItemStack(Block.netherrack), new ItemStack(Item.netherQuartz), new ItemStack(Content.argoniteOre), 15.0F);
        FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(Content.argoniteShovel, 1, WILDCARD_VALUE), new ItemStack(Block.netherrack), new ItemStack(Item.netherQuartz), new ItemStack(Content.argoniteOre), 15.0F);
        FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(Content.argoniteSword, 1, WILDCARD_VALUE), new ItemStack(Block.netherrack), new ItemStack(Item.netherQuartz), new ItemStack(Content.argoniteOre), 15.0F);
        FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(Content.argoniteHoe, 1, WILDCARD_VALUE), new ItemStack(Block.netherrack), new ItemStack(Item.netherQuartz), new ItemStack(Content.argoniteOre), 15.0F);
        //
        // recycle your Fyrite
        FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(Content.fyriteHelm, 1, WILDCARD_VALUE), new ItemStack(Block.netherrack), new ItemStack(Item.netherQuartz), new ItemStack(Content.fyriteOre), 10.0F);
        FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(Content.fyriteChest, 1, WILDCARD_VALUE), new ItemStack(Block.netherrack, 2, 0), new ItemStack(Item.netherQuartz, 2), new ItemStack(Content.fyriteOre, 2, 0), 20.0F);
        FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(Content.fyriteLegs, 1, WILDCARD_VALUE), new ItemStack(Block.netherrack, 2, 0), new ItemStack(Item.netherQuartz, 2), new ItemStack(Content.fyriteOre, 2, 0), 20.0F);
        FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(Content.fyriteBoots, 1, WILDCARD_VALUE), new ItemStack(Block.netherrack), new ItemStack(Item.netherQuartz), new ItemStack(Content.fyriteOre), 10.0F);
        FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(Content.fyriteSword, 1, WILDCARD_VALUE), new ItemStack(Block.netherrack), new ItemStack(Item.netherQuartz), new ItemStack(Content.fyriteOre), 10.0F);
        FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(Content.fyritePick, 1, WILDCARD_VALUE), new ItemStack(Block.netherrack), new ItemStack(Item.netherQuartz), new ItemStack(Content.fyriteOre), 10.0F);
        //
        //recycle your Illumenite
        FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(Content.illumeniteHelm, 1, WILDCARD_VALUE), new ItemStack(Block.netherrack), new ItemStack(Item.glowstone), new ItemStack(Content.illumeniteOre), 10.0F);
        FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(Content.illumeniteChest, 1, WILDCARD_VALUE), new ItemStack(Block.netherrack, 2, 0), new ItemStack(Item.glowstone, 2), new ItemStack(Content.illumeniteOre, 2, 0), 20.0F);
        FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(Content.illumeniteLegs, 1, WILDCARD_VALUE), new ItemStack(Block.netherrack, 2, 0), new ItemStack(Item.glowstone, 2), new ItemStack(Content.illumeniteOre, 2, 0), 20.0F);
        FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(Content.illumeniteBoots, 1, WILDCARD_VALUE), new ItemStack(Block.netherrack), new ItemStack(Item.glowstone), new ItemStack(Content.illumeniteOre), 10.0F);
        FusionHelper.fusionFurnaceRecipes.smelting().addSmelting(new ItemStack(Content.illumeniteSword, 1, WILDCARD_VALUE), new ItemStack(Block.netherrack), new ItemStack(Item.glowstone), new ItemStack(Content.illumeniteOre), 10.0F);
         

    }

}

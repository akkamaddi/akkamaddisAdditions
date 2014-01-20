package akkamaddi.ClassicalAlchemy.code;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.block.Block;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;
import cpw.mods.fml.common.registry.GameRegistry;
import alexndr.SimpleOres.plugins.fusion.FusionRecipes;
import alexndr.SimpleOres.api.helpers.CoreHelper;

public class ClassicalAlchemyRecipes
{
	
	public static final SimpleArsenicContents SA = new SimpleArsenicContents();
	
    public static void doCARecipes()
    {
        
    	// Ore Dictionary
        
    	OreDictionary.registerOre("ingotStannum", new ItemStack(ClassicalAlchemyCore.stannumIngot));
    	OreDictionary.registerOre("ingotCuprum", new ItemStack(ClassicalAlchemyCore.cuprumIngot));
    	OreDictionary.registerOre("ingotPyropusBronze", new ItemStack(ClassicalAlchemyCore.pyropusBronzeIngot));
    	OreDictionary.registerOre("ingotPulchrumBronze", new ItemStack(ClassicalAlchemyCore.pulchrumBronzeIngot));
    	OreDictionary.registerOre("ingotTombBronze", new ItemStack(ClassicalAlchemyCore.tombBronzeIngot));
        
    	// recipes: Crafting
        
    	//Storage Block
        
    	GameRegistry.addRecipe(new ItemStack(ClassicalAlchemyCore.blockStannum, 1), new Object[] {"AAA", "AAA", "AAA", 'A', ClassicalAlchemyCore.stannumIngot});
    	GameRegistry.addRecipe(new ItemStack(ClassicalAlchemyCore.blockCuprum, 1), new Object[] {"AAA", "AAA", "AAA", 'A', ClassicalAlchemyCore.cuprumIngot});
    	GameRegistry.addRecipe(new ItemStack(ClassicalAlchemyCore.blockPyropusBronze, 1), new Object[] {"AAA", "AAA", "AAA", 'A', ClassicalAlchemyCore.pyropusBronzeIngot});
    	GameRegistry.addRecipe(new ItemStack(ClassicalAlchemyCore.blockPulchrumBronze, 1), new Object[] {"AAA", "AAA", "AAA", 'A', ClassicalAlchemyCore.pulchrumBronzeIngot});
    	GameRegistry.addRecipe(new ItemStack(ClassicalAlchemyCore.blockTombBronze, 1), new Object[] {"AAA", "AAA", "AAA", 'A', ClassicalAlchemyCore.tombBronzeIngot});
    	
    	//Item Recipe
        
    	//Ingot Recipe
        
    	GameRegistry.addShapelessRecipe(new ItemStack(ClassicalAlchemyCore.stannumIngot, 9), new Object[]
            {ClassicalAlchemyCore.blockStannum });
    	GameRegistry.addShapelessRecipe(new ItemStack(ClassicalAlchemyCore.cuprumIngot, 9), new Object[]
                {ClassicalAlchemyCore.blockCuprum });
    	GameRegistry.addShapelessRecipe(new ItemStack(ClassicalAlchemyCore.pyropusBronzeIngot, 9), new Object[]
                {ClassicalAlchemyCore.blockPyropusBronze });
    	GameRegistry.addShapelessRecipe(new ItemStack(ClassicalAlchemyCore.pulchrumBronzeIngot, 9), new Object[]
                {ClassicalAlchemyCore.blockPulchrumBronze });
    	GameRegistry.addShapelessRecipe(new ItemStack(ClassicalAlchemyCore.tombBronzeIngot, 9), new Object[]
                {ClassicalAlchemyCore.blockTombBronze });
        
    	// Tools
        
    	//Stannum Tool Recipes
        
    	CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(ClassicalAlchemyCore.stannumPickaxe, true, new Object[]
                { "XXX", " Y ", " Y ", 'X', "ingotStannum", 'Y', "stickWood" }));
        
    	CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(ClassicalAlchemyCore.stannumAxe, true, new Object[]
                { "XX ", "XY ", " Y ", 'X', "ingotStannum", 'Y', "stickWood" }));
        
    	CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(ClassicalAlchemyCore.stannumShovel, true, new Object[]
                { "X", "Y", "Y", 'X', "ingotStannum", 'Y', "stickWood" }));
        
    	CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(ClassicalAlchemyCore.stannumSword, true, new Object[]
                { "X", "X", "Y", 'X', "ingotStannum", 'Y', "stickWood" }));
        
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(ClassicalAlchemyCore.stannumHoe, true, new Object[]
                { "XX ", " Y ", " Y ", 'X', "ingotStannum", 'Y', "stickWood" }));
        
        //Stannum Armor
        
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(ClassicalAlchemyCore.stannumHelm, true, new Object[]
                { "XXX", "X X", 'X', "ingotStannum" }));
        
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(ClassicalAlchemyCore.stannumChest, true, new Object[]
                { "X X", "XXX", "XXX", 'X', "ingotStannum" }));
        
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(ClassicalAlchemyCore.stannumLegs, true, new Object[]
                { "XXX", "X X", "X X", 'X', "ingotStannum" }));
        
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(ClassicalAlchemyCore.stannumBoots, true, new Object[]
                { "X X", "X X", 'X', "ingotStannum" }));
        
        //Stannum chunks
		
        GameRegistry.addShapelessRecipe(new ItemStack(ClassicalAlchemyCore.largeStannumChunkItem, 1), new Object[]
                { ClassicalAlchemyCore.smallStannumChunkItem, ClassicalAlchemyCore.smallStannumChunkItem, ClassicalAlchemyCore.smallStannumChunkItem, ClassicalAlchemyCore.smallStannumChunkItem, ClassicalAlchemyCore.smallStannumChunkItem });
        
        GameRegistry.addShapelessRecipe(new ItemStack(ClassicalAlchemyCore.largeStannumChunkItem, 1), new Object[]
                { ClassicalAlchemyCore.mediumStannumChunkItem, ClassicalAlchemyCore.mediumStannumChunkItem, ClassicalAlchemyCore.mediumStannumChunkItem });
        
        GameRegistry.addShapelessRecipe(new ItemStack(ClassicalAlchemyCore.largeStannumChunkItem, 1), new Object[]
                { ClassicalAlchemyCore.mediumStannumChunkItem, ClassicalAlchemyCore.mediumStannumChunkItem, ClassicalAlchemyCore.smallStannumChunkItem, ClassicalAlchemyCore.smallStannumChunkItem });
        
        GameRegistry.addShapelessRecipe(new ItemStack(ClassicalAlchemyCore.mediumStannumChunkItem, 1), new Object[]
                { ClassicalAlchemyCore.smallStannumChunkItem, ClassicalAlchemyCore.smallStannumChunkItem, ClassicalAlchemyCore.smallStannumChunkItem });
        
        GameRegistry.addShapelessRecipe(new ItemStack(ClassicalAlchemyCore.mediumStannumChunkItem, 2), new Object[]
                { ClassicalAlchemyCore.largeStannumChunkItem });
        
        GameRegistry.addShapelessRecipe(new ItemStack(ClassicalAlchemyCore.smallStannumChunkItem, 2), new Object[]
                { ClassicalAlchemyCore.mediumStannumChunkItem });
        
    	//Cuprum Tool Recipes
        
    	CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(ClassicalAlchemyCore.cuprumPickaxe, true, new Object[]
                { "XXX", " Y ", " Y ", 'X', "ingotCuprum", 'Y', "stickWood" }));
        
    	CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(ClassicalAlchemyCore.cuprumAxe, true, new Object[]
                { "XX ", "XY ", " Y ", 'X', "ingotCuprum", 'Y', "stickWood" }));
        
    	CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(ClassicalAlchemyCore.cuprumShovel, true, new Object[]
                { "X", "Y", "Y", 'X', "ingotCuprum", 'Y', "stickWood" }));
        
    	CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(ClassicalAlchemyCore.cuprumSword, true, new Object[]
                { "X", "X", "Y", 'X', "ingotCuprum", 'Y', "stickWood" }));
        
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(ClassicalAlchemyCore.cuprumHoe, true, new Object[]
                { "XX ", " Y ", " Y ", 'X', "ingotCuprum", 'Y', "stickWood" }));
        
        //Cuprum Armor
        
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(ClassicalAlchemyCore.cuprumHelm, true, new Object[]
                { "XXX", "X X", 'X', "ingotCuprum" }));
        
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(ClassicalAlchemyCore.cuprumChest, true, new Object[]
                { "X X", "XXX", "XXX", 'X', "ingotCuprum" }));
        
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(ClassicalAlchemyCore.cuprumLegs, true, new Object[]
                { "XXX", "X X", "X X", 'X', "ingotCuprum" }));
        
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(ClassicalAlchemyCore.cuprumBoots, true, new Object[]
                { "X X", "X X", 'X', "ingotCuprum" }));
		
        //Cuprum chunks
		
        GameRegistry.addShapelessRecipe(new ItemStack(ClassicalAlchemyCore.largeCuprumChunkItem, 1), new Object[]
                { ClassicalAlchemyCore.smallCuprumChunkItem, ClassicalAlchemyCore.smallCuprumChunkItem, ClassicalAlchemyCore.smallCuprumChunkItem, ClassicalAlchemyCore.smallCuprumChunkItem, ClassicalAlchemyCore.smallCuprumChunkItem });
        
        GameRegistry.addShapelessRecipe(new ItemStack(ClassicalAlchemyCore.largeCuprumChunkItem, 1), new Object[]
                { ClassicalAlchemyCore.mediumCuprumChunkItem, ClassicalAlchemyCore.mediumCuprumChunkItem, ClassicalAlchemyCore.mediumCuprumChunkItem });
        
        GameRegistry.addShapelessRecipe(new ItemStack(ClassicalAlchemyCore.largeCuprumChunkItem, 1), new Object[]
                { ClassicalAlchemyCore.mediumCuprumChunkItem, ClassicalAlchemyCore.mediumCuprumChunkItem, ClassicalAlchemyCore.smallCuprumChunkItem, ClassicalAlchemyCore.smallCuprumChunkItem });
        
        GameRegistry.addShapelessRecipe(new ItemStack(ClassicalAlchemyCore.mediumCuprumChunkItem, 1), new Object[]
                { ClassicalAlchemyCore.smallCuprumChunkItem, ClassicalAlchemyCore.smallCuprumChunkItem, ClassicalAlchemyCore.smallCuprumChunkItem });
        
        GameRegistry.addShapelessRecipe(new ItemStack(ClassicalAlchemyCore.mediumCuprumChunkItem, 2), new Object[]
                { ClassicalAlchemyCore.largeCuprumChunkItem });
        
        GameRegistry.addShapelessRecipe(new ItemStack(ClassicalAlchemyCore.smallCuprumChunkItem, 2), new Object[]
                { ClassicalAlchemyCore.mediumCuprumChunkItem });
        
    	//Pyropus Bronze Tool Recipes
        
    	CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(ClassicalAlchemyCore.pyropusBronzePickaxe, true, new Object[]
                { "XXX", " Y ", " Y ", 'X', "ingotPyropusBronze", 'Y', "stickWood" }));
        
    	CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(ClassicalAlchemyCore.pyropusBronzeAxe, true, new Object[]
                { "XX ", "XY ", " Y ", 'X', "ingotPyropusBronze", 'Y', "stickWood" }));
        
    	CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(ClassicalAlchemyCore.pyropusBronzeShovel, true, new Object[]
                { "X", "Y", "Y", 'X', "ingotPyropusBronze", 'Y', "stickWood" }));
        
    	CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(ClassicalAlchemyCore.pyropusBronzeSword, true, new Object[]
                { "X", "X", "Y", 'X', "ingotPyropusBronze", 'Y', "stickWood" }));
        
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(ClassicalAlchemyCore.pyropusBronzeHoe, true, new Object[]
                { "XX ", " Y ", " Y ", 'X', "ingotPyropusBronze", 'Y', "stickWood" }));
        
        //PyropusBronze Armor
        
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(ClassicalAlchemyCore.pyropusBronzeHelm, true, new Object[]
                { "XXX", "X X", 'X', "ingotPyropusBronze" }));
        
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(ClassicalAlchemyCore.pyropusBronzeChest, true, new Object[]
                { "X X", "XXX", "XXX", 'X', "ingotPyropusBronze" }));
        
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(ClassicalAlchemyCore.pyropusBronzeLegs, true, new Object[]
                { "XXX", "X X", "X X", 'X', "ingotPyropusBronze" }));
        
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(ClassicalAlchemyCore.pyropusBronzeBoots, true, new Object[]
                { "X X", "X X", 'X', "ingotPyropusBronze" }));
		
        //PyropusBronze chunks
		
        GameRegistry.addShapelessRecipe(new ItemStack(ClassicalAlchemyCore.largePyropusBronzeChunkItem, 1), new Object[]
                { ClassicalAlchemyCore.smallPyropusBronzeChunkItem, ClassicalAlchemyCore.smallPyropusBronzeChunkItem, ClassicalAlchemyCore.smallPyropusBronzeChunkItem, ClassicalAlchemyCore.smallPyropusBronzeChunkItem, ClassicalAlchemyCore.smallPyropusBronzeChunkItem });
        
        GameRegistry.addShapelessRecipe(new ItemStack(ClassicalAlchemyCore.largePyropusBronzeChunkItem, 1), new Object[]
                { ClassicalAlchemyCore.mediumPyropusBronzeChunkItem, ClassicalAlchemyCore.mediumPyropusBronzeChunkItem, ClassicalAlchemyCore.mediumPyropusBronzeChunkItem });
        
        GameRegistry.addShapelessRecipe(new ItemStack(ClassicalAlchemyCore.largePyropusBronzeChunkItem, 1), new Object[]
                { ClassicalAlchemyCore.mediumPyropusBronzeChunkItem, ClassicalAlchemyCore.mediumPyropusBronzeChunkItem, ClassicalAlchemyCore.smallPyropusBronzeChunkItem, ClassicalAlchemyCore.smallPyropusBronzeChunkItem });
        
        GameRegistry.addShapelessRecipe(new ItemStack(ClassicalAlchemyCore.mediumPyropusBronzeChunkItem, 1), new Object[]
                { ClassicalAlchemyCore.smallPyropusBronzeChunkItem, ClassicalAlchemyCore.smallPyropusBronzeChunkItem, ClassicalAlchemyCore.smallPyropusBronzeChunkItem });
        
        GameRegistry.addShapelessRecipe(new ItemStack(ClassicalAlchemyCore.mediumPyropusBronzeChunkItem, 2), new Object[]
                { ClassicalAlchemyCore.largePyropusBronzeChunkItem });
        
        GameRegistry.addShapelessRecipe(new ItemStack(ClassicalAlchemyCore.smallPyropusBronzeChunkItem, 2), new Object[]
                { ClassicalAlchemyCore.mediumPyropusBronzeChunkItem });
        
    	//Pulchrum Bronze Tool Recipes
        
    	CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(ClassicalAlchemyCore.pulchrumBronzePickaxe, true, new Object[]
                { "XXX", " Y ", " Y ", 'X', "ingotPulchrumBronze", 'Y', "stickWood" }));
        
    	CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(ClassicalAlchemyCore.pulchrumBronzeAxe, true, new Object[]
                { "XX ", "XY ", " Y ", 'X', "ingotPulchrumBronze", 'Y', "stickWood" }));
        
    	CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(ClassicalAlchemyCore.pulchrumBronzeShovel, true, new Object[]
                { "X", "Y", "Y", 'X', "ingotPulchrumBronze", 'Y', "stickWood" }));
        
    	CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(ClassicalAlchemyCore.pulchrumBronzeSword, true, new Object[]
                { "X", "X", "Y", 'X', "ingotPulchrumBronze", 'Y', "stickWood" }));
        
    	//Tomb Bronze Tool Recipes
        
    	CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(ClassicalAlchemyCore.tombBronzePickaxe, true, new Object[]
                { "XXX", " Y ", " Y ", 'X', "ingotTombBronze", 'Y', "stickWood" }));
        
    	CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(ClassicalAlchemyCore.tombBronzeAxe, true, new Object[]
                { "XX ", "XY ", " Y ", 'X', "ingotTombBronze", 'Y', "stickWood" }));
        
    	CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(ClassicalAlchemyCore.tombBronzeShovel, true, new Object[]
                { "X", "Y", "Y", 'X', "ingotTombBronze", 'Y', "stickWood" }));
        
    	CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(ClassicalAlchemyCore.tombBronzeSword, true, new Object[]
                { "X", "X", "Y", 'X', "ingotTombBronze", 'Y', "stickWood" }));
    	
        //TombBronze Armor
        
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(ClassicalAlchemyCore.tombBronzeHelm, true, new Object[]
                { "XXX", "X X", 'X', "ingotTombBronze" }));
        
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(ClassicalAlchemyCore.tombBronzeChest, true, new Object[]
                { "X X", "XXX", "XXX", 'X', "ingotTombBronze" }));
        
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(ClassicalAlchemyCore.tombBronzeLegs, true, new Object[]
                { "XXX", "X X", "X X", 'X', "ingotTombBronze" }));
        
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(ClassicalAlchemyCore.tombBronzeBoots, true, new Object[]
                { "X X", "X X", 'X', "ingotTombBronze" }));
		
        //TombBronze chunks
		
        GameRegistry.addShapelessRecipe(new ItemStack(ClassicalAlchemyCore.largeTombBronzeChunkItem, 1), new Object[]
                { ClassicalAlchemyCore.smallTombBronzeChunkItem, ClassicalAlchemyCore.smallTombBronzeChunkItem, ClassicalAlchemyCore.smallTombBronzeChunkItem, ClassicalAlchemyCore.smallTombBronzeChunkItem, ClassicalAlchemyCore.smallTombBronzeChunkItem });
        
        GameRegistry.addShapelessRecipe(new ItemStack(ClassicalAlchemyCore.largeTombBronzeChunkItem, 1), new Object[]
                { ClassicalAlchemyCore.mediumTombBronzeChunkItem, ClassicalAlchemyCore.mediumTombBronzeChunkItem, ClassicalAlchemyCore.mediumTombBronzeChunkItem });
        
        GameRegistry.addShapelessRecipe(new ItemStack(ClassicalAlchemyCore.largeTombBronzeChunkItem, 1), new Object[]
                { ClassicalAlchemyCore.mediumTombBronzeChunkItem, ClassicalAlchemyCore.mediumTombBronzeChunkItem, ClassicalAlchemyCore.smallTombBronzeChunkItem, ClassicalAlchemyCore.smallTombBronzeChunkItem });
        
        GameRegistry.addShapelessRecipe(new ItemStack(ClassicalAlchemyCore.mediumTombBronzeChunkItem, 1), new Object[]
                { ClassicalAlchemyCore.smallTombBronzeChunkItem, ClassicalAlchemyCore.smallTombBronzeChunkItem, ClassicalAlchemyCore.smallTombBronzeChunkItem });
        
        GameRegistry.addShapelessRecipe(new ItemStack(ClassicalAlchemyCore.mediumTombBronzeChunkItem, 2), new Object[]
                { ClassicalAlchemyCore.largeTombBronzeChunkItem });
        
        GameRegistry.addShapelessRecipe(new ItemStack(ClassicalAlchemyCore.smallTombBronzeChunkItem, 2), new Object[]
                { ClassicalAlchemyCore.mediumTombBronzeChunkItem });
  
        // recipes: Smelting
        
        GameRegistry.addSmelting(ClassicalAlchemyCore.largeStannumChunkItem.itemID, new ItemStack(ClassicalAlchemyCore.stannumIngot), 1.0F);
        GameRegistry.addSmelting(ClassicalAlchemyCore.largeCuprumChunkItem.itemID, new ItemStack(ClassicalAlchemyCore.cuprumIngot), 1.0F);
        GameRegistry.addSmelting(ClassicalAlchemyCore.largePyropusBronzeChunkItem.itemID, new ItemStack(ClassicalAlchemyCore.pyropusBronzeIngot), 1.4F);
        GameRegistry.addSmelting(ClassicalAlchemyCore.largePulchrumBronzeChunkItem.itemID, new ItemStack(ClassicalAlchemyCore.pulchrumBronzeIngot), 2.0F);
        GameRegistry.addSmelting(ClassicalAlchemyCore.largeTombBronzeChunkItem.itemID, new ItemStack(ClassicalAlchemyCore.tombBronzeIngot), 3.0F);
        
        // Fusion Furnace

        FusionRecipes.smelting().addSmelting(new ItemStack(CoreHelper.coreContent.tinIngot), new ItemStack(CoreHelper.coreContent.tinIngot), new ItemStack(Item.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(ClassicalAlchemyCore.smallStannumChunkItem), 0.4F);
        FusionRecipes.smelting().addSmelting(new ItemStack(CoreHelper.coreContent.tinIngot), new ItemStack(CoreHelper.coreContent.tinIngot), new ItemStack(Item.dyePowder, 1, 15), new ItemStack(ClassicalAlchemyCore.mediumStannumChunkItem), 0.8F);
        FusionRecipes.smelting().addSmelting(new ItemStack(CoreHelper.coreContent.tinIngot), new ItemStack(CoreHelper.coreContent.tinIngot), new ItemStack(Item.gunpowder), new ItemStack(ClassicalAlchemyCore.largeStannumChunkItem), 1.2F);
        
        FusionRecipes.smelting().addSmelting(new ItemStack(CoreHelper.coreContent.copperIngot), new ItemStack(CoreHelper.coreContent.copperIngot), new ItemStack(Item.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(ClassicalAlchemyCore.smallCuprumChunkItem), 1.0F);
        FusionRecipes.smelting().addSmelting(new ItemStack(CoreHelper.coreContent.copperIngot), new ItemStack(CoreHelper.coreContent.copperIngot), new ItemStack(Item.dyePowder, 1, 15), new ItemStack(ClassicalAlchemyCore.mediumCuprumChunkItem), 2.0F);
        FusionRecipes.smelting().addSmelting(new ItemStack(CoreHelper.coreContent.copperIngot), new ItemStack(CoreHelper.coreContent.copperIngot), new ItemStack(Item.gunpowder), new ItemStack(ClassicalAlchemyCore.largeCuprumChunkItem), 5.0F);

        FusionRecipes.smelting().addSmelting(new ItemStack(ClassicalAlchemyCore.stannumIngot), new ItemStack(ClassicalAlchemyCore.cuprumIngot), new ItemStack(Item.dyePowder, 1, 15), new ItemStack(ClassicalAlchemyCore.smallPyropusBronzeChunkItem), 3.0F);
        FusionRecipes.smelting().addSmelting(new ItemStack(ClassicalAlchemyCore.stannumIngot), new ItemStack(ClassicalAlchemyCore.cuprumIngot), new ItemStack(Item.gunpowder), new ItemStack(ClassicalAlchemyCore.mediumPyropusBronzeChunkItem), 5.0F);
        FusionRecipes.smelting().addSmelting(new ItemStack(ClassicalAlchemyCore.stannumIngot), new ItemStack(ClassicalAlchemyCore.cuprumIngot), new ItemStack(Item.redstone), new ItemStack(ClassicalAlchemyCore.largePyropusBronzeChunkItem), 16.0F);
        
        FusionRecipes.smelting().addSmelting(new ItemStack(ClassicalAlchemyCore.pyropusBronzeIngot), new ItemStack(Item.ingotGold), new ItemStack(Item.redstone), new ItemStack(ClassicalAlchemyCore.largePulchrumBronzeChunkItem), 16.0F);
        
        // Recycling
        
        if (ClassicalAlchemyCore.enableRecycling) {
        	 // Stannum
            FusionRecipes.smelting().addSmelting(new ItemStack(ClassicalAlchemyCore.stannumHelm, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(ClassicalAlchemyCore.largeStannumChunkItem), 7.0F);
            FusionRecipes.smelting().addSmelting(new ItemStack(ClassicalAlchemyCore.stannumChest, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.gravel, 2, 0), new ItemStack(Item.coal, 2, OreDictionary.WILDCARD_VALUE), new ItemStack(ClassicalAlchemyCore.largeStannumChunkItem, 2, 0), 14.0F);
            FusionRecipes.smelting().addSmelting(new ItemStack(ClassicalAlchemyCore.stannumLegs, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.gravel, 2, 0), new ItemStack(Item.coal, 2, OreDictionary.WILDCARD_VALUE), new ItemStack(ClassicalAlchemyCore.largeStannumChunkItem, 2, 0), 14.0F);
            FusionRecipes.smelting().addSmelting(new ItemStack(ClassicalAlchemyCore.stannumBoots, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(ClassicalAlchemyCore.largeStannumChunkItem), 7.0F);
            FusionRecipes.smelting().addSmelting(new ItemStack(ClassicalAlchemyCore.stannumSword, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(ClassicalAlchemyCore.largeStannumChunkItem), 7.0F);
            FusionRecipes.smelting().addSmelting(new ItemStack(ClassicalAlchemyCore.stannumShovel, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(ClassicalAlchemyCore.largeStannumChunkItem), 7.0F);
            FusionRecipes.smelting().addSmelting(new ItemStack(ClassicalAlchemyCore.stannumPickaxe, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(ClassicalAlchemyCore.largeStannumChunkItem), 7.0F);
            FusionRecipes.smelting().addSmelting(new ItemStack(ClassicalAlchemyCore.stannumAxe, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(ClassicalAlchemyCore.largeStannumChunkItem), 7.0F);
            FusionRecipes.smelting().addSmelting(new ItemStack(ClassicalAlchemyCore.stannumHoe, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(ClassicalAlchemyCore.largeStannumChunkItem), 7.0F);
            // Cuprum
            FusionRecipes.smelting().addSmelting(new ItemStack(ClassicalAlchemyCore.cuprumHelm, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(ClassicalAlchemyCore.largeCuprumChunkItem), 7.0F);
            FusionRecipes.smelting().addSmelting(new ItemStack(ClassicalAlchemyCore.cuprumChest, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.gravel, 2, 0), new ItemStack(Item.coal, 2, OreDictionary.WILDCARD_VALUE), new ItemStack(ClassicalAlchemyCore.largeCuprumChunkItem, 2, 0), 14.0F);
            FusionRecipes.smelting().addSmelting(new ItemStack(ClassicalAlchemyCore.cuprumLegs, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.gravel, 2, 0), new ItemStack(Item.coal, 2, OreDictionary.WILDCARD_VALUE), new ItemStack(ClassicalAlchemyCore.largeCuprumChunkItem, 2, 0), 14.0F);
            FusionRecipes.smelting().addSmelting(new ItemStack(ClassicalAlchemyCore.cuprumBoots, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(ClassicalAlchemyCore.largeCuprumChunkItem), 7.0F);
            FusionRecipes.smelting().addSmelting(new ItemStack(ClassicalAlchemyCore.cuprumSword, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(ClassicalAlchemyCore.largeCuprumChunkItem), 7.0F);
            FusionRecipes.smelting().addSmelting(new ItemStack(ClassicalAlchemyCore.cuprumShovel, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(ClassicalAlchemyCore.largeCuprumChunkItem), 7.0F);
            FusionRecipes.smelting().addSmelting(new ItemStack(ClassicalAlchemyCore.cuprumPickaxe, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(ClassicalAlchemyCore.largeCuprumChunkItem), 7.0F);
            FusionRecipes.smelting().addSmelting(new ItemStack(ClassicalAlchemyCore.cuprumAxe, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(ClassicalAlchemyCore.largeCuprumChunkItem), 7.0F);
            FusionRecipes.smelting().addSmelting(new ItemStack(ClassicalAlchemyCore.cuprumHoe, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(ClassicalAlchemyCore.largeCuprumChunkItem), 7.0F);
            // Pyropus Bronze
            FusionRecipes.smelting().addSmelting(new ItemStack(ClassicalAlchemyCore.pyropusBronzeHelm, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(ClassicalAlchemyCore.largePyropusBronzeChunkItem), 10.0F);
            FusionRecipes.smelting().addSmelting(new ItemStack(ClassicalAlchemyCore.pyropusBronzeChest, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.gravel, 2, 0), new ItemStack(Item.coal, 2, OreDictionary.WILDCARD_VALUE), new ItemStack(ClassicalAlchemyCore.largePyropusBronzeChunkItem, 2, 0), 20.0F);
            FusionRecipes.smelting().addSmelting(new ItemStack(ClassicalAlchemyCore.pyropusBronzeLegs, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.gravel, 2, 0), new ItemStack(Item.coal, 2, OreDictionary.WILDCARD_VALUE), new ItemStack(ClassicalAlchemyCore.largePyropusBronzeChunkItem, 2, 0), 20.0F);
            FusionRecipes.smelting().addSmelting(new ItemStack(ClassicalAlchemyCore.pyropusBronzeBoots, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(ClassicalAlchemyCore.largePyropusBronzeChunkItem), 10.0F);
            FusionRecipes.smelting().addSmelting(new ItemStack(ClassicalAlchemyCore.pyropusBronzeSword, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(ClassicalAlchemyCore.largePyropusBronzeChunkItem), 10.0F);
            FusionRecipes.smelting().addSmelting(new ItemStack(ClassicalAlchemyCore.pyropusBronzeShovel, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(ClassicalAlchemyCore.largePyropusBronzeChunkItem), 10.0F);
            FusionRecipes.smelting().addSmelting(new ItemStack(ClassicalAlchemyCore.pyropusBronzePickaxe, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(ClassicalAlchemyCore.largePyropusBronzeChunkItem), 10.0F);
            FusionRecipes.smelting().addSmelting(new ItemStack(ClassicalAlchemyCore.pyropusBronzeAxe, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(ClassicalAlchemyCore.largePyropusBronzeChunkItem), 10.0F);
            FusionRecipes.smelting().addSmelting(new ItemStack(ClassicalAlchemyCore.pyropusBronzeHoe, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(ClassicalAlchemyCore.largePyropusBronzeChunkItem), 10.0F);
            // Pulchrum Bronze
            FusionRecipes.smelting().addSmelting(new ItemStack(ClassicalAlchemyCore.pulchrumBronzeSword, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(ClassicalAlchemyCore.largePulchrumBronzeChunkItem), 15.0F);
            FusionRecipes.smelting().addSmelting(new ItemStack(ClassicalAlchemyCore.pulchrumBronzeShovel, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(ClassicalAlchemyCore.largePulchrumBronzeChunkItem), 15.0F);
            FusionRecipes.smelting().addSmelting(new ItemStack(ClassicalAlchemyCore.pulchrumBronzePickaxe, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(ClassicalAlchemyCore.largePulchrumBronzeChunkItem), 15.0F);
            FusionRecipes.smelting().addSmelting(new ItemStack(ClassicalAlchemyCore.pulchrumBronzeAxe, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.coal, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(ClassicalAlchemyCore.largePulchrumBronzeChunkItem), 15.0F);
            // Tomb Bronze
            FusionRecipes.smelting().addSmelting(new ItemStack(ClassicalAlchemyCore.tombBronzeHelm, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.rottenFlesh), new ItemStack(ClassicalAlchemyCore.largeTombBronzeChunkItem), 15.0F);
            FusionRecipes.smelting().addSmelting(new ItemStack(ClassicalAlchemyCore.tombBronzeChest, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.gravel, 2, 0), new ItemStack(Item.rottenFlesh), new ItemStack(ClassicalAlchemyCore.largeTombBronzeChunkItem, 2, 0), 30.0F);
            FusionRecipes.smelting().addSmelting(new ItemStack(ClassicalAlchemyCore.tombBronzeLegs, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.gravel, 2, 0), new ItemStack(Item.rottenFlesh), new ItemStack(ClassicalAlchemyCore.largeTombBronzeChunkItem, 2, 0), 30.0F);
            FusionRecipes.smelting().addSmelting(new ItemStack(ClassicalAlchemyCore.tombBronzeBoots, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.rottenFlesh), new ItemStack(ClassicalAlchemyCore.largeTombBronzeChunkItem), 15.0F);
            FusionRecipes.smelting().addSmelting(new ItemStack(ClassicalAlchemyCore.tombBronzeSword, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.rottenFlesh), new ItemStack(ClassicalAlchemyCore.largeTombBronzeChunkItem), 15.0F);
            FusionRecipes.smelting().addSmelting(new ItemStack(ClassicalAlchemyCore.tombBronzeShovel, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.rottenFlesh), new ItemStack(ClassicalAlchemyCore.largeTombBronzeChunkItem), 15.0F);
            FusionRecipes.smelting().addSmelting(new ItemStack(ClassicalAlchemyCore.tombBronzePickaxe, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.rottenFlesh), new ItemStack(ClassicalAlchemyCore.largeTombBronzeChunkItem), 15.0F);
            FusionRecipes.smelting().addSmelting(new ItemStack(ClassicalAlchemyCore.tombBronzeAxe, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Block.gravel), new ItemStack(Item.rottenFlesh), new ItemStack(ClassicalAlchemyCore.largeTombBronzeChunkItem), 15.0F);
            
        }
        
        
    }
	
	
    public static void craftTombBronze() {
		if (SA.isModLoaded()) {
			//	new ItemStack(SA.arsenicIngot.get())
			FusionRecipes.smelting().addSmelting(new ItemStack(ClassicalAlchemyCore.pyropusBronzeIngot), new ItemStack(SA.arsenideBronzeIngot.get()), new ItemStack(Item.rottenFlesh), new ItemStack(ClassicalAlchemyCore.smallTombBronzeChunkItem), 6.0F);
			FusionRecipes.smelting().addSmelting(new ItemStack(ClassicalAlchemyCore.pyropusBronzeIngot), new ItemStack(SA.arsenideBronzeIngot.get()), new ItemStack(Item.redstone), new ItemStack(ClassicalAlchemyCore.mediumTombBronzeChunkItem), 12.0F);
			FusionRecipes.smelting().addSmelting(new ItemStack(ClassicalAlchemyCore.pyropusBronzeIngot), new ItemStack(SA.arsenideBronzeIngot.get()), new ItemStack(Item.glowstone), new ItemStack(ClassicalAlchemyCore.largeTombBronzeChunkItem), 20.0F);
			FusionRecipes.smelting().addSmelting(new ItemStack(ClassicalAlchemyCore.pyropusBronzeIngot), new ItemStack(SA.arsenideBronzeIngot.get()), new ItemStack(SA.oldLaceChest.get()), new ItemStack(ClassicalAlchemyCore.largeTombBronzeChunkItem), 20.0F);
	        
		}
    }
		
	
	
}

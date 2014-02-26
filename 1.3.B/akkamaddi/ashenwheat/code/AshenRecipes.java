package akkamaddi.ashenwheat.code;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;
import cpw.mods.fml.common.registry.GameRegistry;

public class AshenRecipes {
	
	public static void doAshenRecipes() 
	{
		OreDictionary.registerOre("cropAshenwheat", new ItemStack(AshenWheat.ashWheatItem));
		OreDictionary.registerOre("seedAshenwheat", new ItemStack(AshenWheat.ashSeeds));
		OreDictionary.registerOre("foodAshenBread", new ItemStack(AshenWheat.ashBread));
		OreDictionary.registerOre("foodAshenCookie", new ItemStack(AshenWheat.ashCookie));
		
		GameRegistry.addRecipe(new ItemStack(AshenWheat.ashBread, 1), new Object[] {"AAA", 'A', AshenWheat.ashWheatItem});
		GameRegistry.addRecipe(new ItemStack(AshenWheat.ashWheatBale, 1), new Object[] {"AAA", "AAA", "AAA", 'A', AshenWheat.ashWheatItem});
		GameRegistry.addRecipe(new ItemStack(AshenWheat.ashCookie, 8), new Object[] {"WCW", 'W', AshenWheat.ashWheatItem, 'C', new ItemStack(Item.dyePowder, 1, 3)});
		
		GameRegistry.addShapelessRecipe(new ItemStack(AshenWheat.ashSeeds, 4), new Object[]
		        { AshenWheat.ashWheatItem });
		GameRegistry.addShapelessRecipe(new ItemStack(AshenWheat.ashWheatItem, 9), new Object[]
	            { AshenWheat.ashWheatBale });
	
		GameRegistry.addSmelting(AshenWheat.ashBread.itemID, new ItemStack(Item.coal, 1, 1), 0.5F);
		
		
	}
	
}

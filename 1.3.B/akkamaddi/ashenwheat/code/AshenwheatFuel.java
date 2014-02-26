package akkamaddi.ashenwheat.code;

import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.IFuelHandler;

public class AshenwheatFuel implements IFuelHandler {

	@Override
	public int getBurnTime(ItemStack fuel) {
        
		if (fuel.itemID == AshenWheat.ashWheatItem.itemID)
        {
            return 100;
        }

        if (fuel.itemID == AshenWheat.ashBread.itemID)
        {
            return 600;
        }
        
        if (fuel.itemID == AshenWheat.ashCookie.itemID)
        {
            return 50;
        }

        if (fuel.itemID == AshenWheat.ashWheatBale.blockID)
        {
            return 2400;
        }
        
		return 0;
		
	}

}

package akkamaddi.ashenwheat.code;

import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.IFuelHandler;

public class AshenwheatFuel implements IFuelHandler
{
    @Override
    public int getBurnTime(ItemStack fuel)
    {
        if (fuel.itemID == AshenWheatCore.ashWheatItem.itemID)
        {
            return 100;
        }

        if (fuel.itemID == AshenWheatCore.ashBread.itemID)
        {
            return 600;
        }

        if (fuel.itemID == AshenWheatCore.ashCookie.itemID)
        {
            return 50;
        }

        if (fuel.itemID == AshenWheatCore.ashWheatBale.blockID)
        {
            return 2400;
        }

        return 0;
    }
}

package akkamaddi.ClassicalAlchemy.code;

import net.minecraft.item.Item;

public class SimpleArsenicContents extends ModContents
{
    public Class
    items;

    public Content<Item>
    arsenideBronzeIngot,
    oldLaceChest;

    public SimpleArsenicContents()
    {
        if (!isModLoaded())
        {
            return;
        }

        try
        {
            items = Class.forName("akkamaddi.arsenic.code.ArsenicAndLace");
        }
        catch (ClassNotFoundException e)
        {
            throw new ModReflectionFailException(e);
        }

        arsenideBronzeIngot = of(items, "arsenideBronzeIngot");
        oldLaceChest = of(items, "oldLaceChest");
    }

    @Override public String getModId()
    {
        return "SimpleArsenic";
    }
}

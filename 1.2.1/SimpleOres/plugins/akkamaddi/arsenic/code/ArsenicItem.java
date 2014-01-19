package SimpleOres.plugins.akkamaddi.arsenic.code;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ArsenicItem extends Item
{
    public ArsenicItem(int par1)
    {
        super(par1);
        // chaining  configuration
        setMaxStackSize(64);
        setCreativeTab(CreativeTabs.tabMisc);
        setUnlocalizedName("arsenicItem");
    }
    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister iconRegister)
    {
        this.itemIcon = iconRegister.registerIcon("arsenic" + ":" + (this.getUnlocalizedName().substring(5)));
    }
}

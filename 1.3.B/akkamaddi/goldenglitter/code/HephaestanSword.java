package akkamaddi.goldenglitter.code;

import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import alexndr.SimpleOres.api.content.SimpleSword;

public class HephaestanSword extends SimpleSword
{
    public HephaestanSword(int i, EnumToolMaterial enumtoolmaterial)
    {
        super(i, enumtoolmaterial);
        // TODO Auto-generated constructor stub
    }

    @Override
    public boolean hitEntity(ItemStack par1ItemStack, EntityLivingBase par2EntityLivingBase, EntityLivingBase par3EntityLivingBase)
    {
        if (itemID == GoldenGlitterCore.hephaestanGoldSword.itemID)
        {
            par1ItemStack.damageItem(1, par3EntityLivingBase);
            par2EntityLivingBase.setFire(50);
        }

        par1ItemStack.damageItem(1, par3EntityLivingBase);
        return true;
    }
}

package akkamaddi.ashenwheat.code;

import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.monster.EntityIronGolem;
import net.minecraft.entity.monster.EntitySnowman;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class OssidRoot  extends BlockDirectional
{
    /** Boolean used to seperate different states of blocks */
    private boolean blockType;
    @SideOnly(Side.CLIENT)
    private Icon field_94474_b;
    @SideOnly(Side.CLIENT)
    private Icon field_94475_c;

    protected OssidRoot(int par1, boolean par2)
    {
        super(par1, Material.pumpkin);
        this.setTickRandomly(true);
        this.blockType = par2;
        this.setTextureName("ossid");
        this.setCreativeTab(CreativeTabs.tabFood);
    }

    @SideOnly(Side.CLIENT)

    /**
     * From the specified side and block metadata retrieves the blocks texture. Args: side, metadata
     */
    public Icon getIcon(int par1, int par2)
    {
        return par1 == 1 ? this.field_94474_b : (par1 == 0 ? this.field_94474_b : (par2 == 2 && par1 == 2 ? this.field_94475_c : (par2 == 3 && par1 == 5 ? this.field_94475_c : (par2 == 0 && par1 == 3 ? this.field_94475_c : (par2 == 1 && par1 == 4 ? this.field_94475_c : this.blockIcon)))));
    }



    /**
     * Checks to see if its valid to put this block at the specified coordinates. Args: world, x, y, z
     */
    public boolean canPlaceBlockAt(World par1World, int par2, int par3, int par4)
    {
        int l = par1World.getBlockId(par2, par3, par4);
        Block block = Block.blocksList[l];
        return (block == null || block.isBlockReplaceable(par1World, par2, par3, par4)) && par1World.doesBlockHaveSolidTopSurface(par2, par3 - 1, par4);
    }

    /**
     * Called when the block is placed in the world.
     */
    public void onBlockPlacedBy(World par1World, int par2, int par3, int par4, EntityLivingBase par5EntityLivingBase, ItemStack par6ItemStack)
    {
        int l = MathHelper.floor_double((double)(par5EntityLivingBase.rotationYaw * 4.0F / 360.0F) + 2.5D) & 3;
        par1World.setBlockMetadataWithNotify(par2, par3, par4, l, 2);
    }

    @SideOnly(Side.CLIENT)

    /**
     * When this method is called, your block should register all the icons it needs with the given IconRegister. This
     * is the only chance you get to register icons.
     */
    public void registerIcons(IconRegister par1IconRegister)
    {
        this.field_94475_c = par1IconRegister.registerIcon("ashenwheat:"+this.getTextureName() + "_face_" + (this.blockType ? "on" : "off"));
        this.field_94474_b = par1IconRegister.registerIcon("ashenwheat:"+this.getTextureName() + "_top");
        this.blockIcon = par1IconRegister.registerIcon("ashenwheat:"+this.getTextureName() + "_side");
    }
    
    @SideOnly(Side.CLIENT)
    public void randomDisplayTick(World world, int x, int y, int z, Random random)
    {
    	if (this.blockType == true) {
    		
        if (AshenWheatCore.MakeOssidLanternGloom == true)
        {
            float f1 = (float)x - 0.5F;
            float f2 = (float)y - 0.5F;
            float f3 = (float)z - 0.5F;
            float f4 = random.nextFloat() * 2.0f;
            float f5 = random.nextFloat() * 2.0f;
            float f6 = random.nextFloat() * 2.0f;
            world.spawnParticle("townaura", (double)(f1 + f4), (double)(f2 + f5) , (double)(f3 + f6), 0.0D, 0.0D, 0.0D);
            world.spawnParticle("depthsuspend", (double)((f1 + 0.3) + (f6 * 0.7)), (double)((f2 + 0.3) + (f4 * 0.7)) , (double)((f3 + 0.3) + (f5 * 0.7)), 0.0D, 0.0D, 0.0D);
        }
        else
        {
            return;
        }
        
    	}
    }
}

package akkamaddi.ashenwheat.code;

import java.util.ArrayList;
import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockCrops;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.Icon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import net.minecraftforge.common.ForgeDirection;
import net.minecraftforge.common.IPlantable;

public class OssidRootCrop extends Block
{
    public static Icon ossidRootIcon_00;
    public static Icon ossidRootIcon_01;
    public static Icon ossidRootIcon_02;
    public static Icon ossidRootIcon_03;
    public static Icon ossidRootIcon_04;
    public static Icon ossidRootIcon_05;
    public static Icon ossidRootIcon_06;
    public static Icon ossidRootIcon_07;

    public OssidRootCrop(int id)
    {
        super(id, Material.plants);
        setTickRandomly(true);
        this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 0.25F, 1.0F);
        this.setCreativeTab((CreativeTabs)null);
        this.setHardness(0.0F);
        this.setStepSound(soundGrassFootstep);
        this.disableStats();
    }

    public AxisAlignedBB getCollisionBoundingBoxFromPool(World world, int x, int y, int z)
    {
        return null;
    }

    public int getRenderType()
    {
        return 6;
    }

    public boolean isOpaqueCube()
    {
        return false;
    }

    public void registerIcons(IconRegister ir)
    {
        ossidRootIcon_00 = ir.registerIcon("ashenwheat:ossidVine_00");
        ossidRootIcon_01 = ir.registerIcon("ashenwheat:ossidVine_01");
        ossidRootIcon_02 = ir.registerIcon("ashenwheat:ossidVine_02");
        ossidRootIcon_03 = ir.registerIcon("ashenwheat:ossidVine_03");
        ossidRootIcon_04 = ir.registerIcon("ashenwheat:ossidVine_04");
        ossidRootIcon_05 = ir.registerIcon("ashenwheat:ossidVine_05");
        ossidRootIcon_06 = ir.registerIcon("ashenwheat:ossidVine_06");
        ossidRootIcon_07 = ir.registerIcon("ashenwheat:ossidVine_07");
    }

    public Icon getIcon(int side, int metadata)
    {
        if (metadata == 0)
        {
            return ossidRootIcon_00;
        }

        if (metadata == 1)
        {
            return ossidRootIcon_01;
        }

        if (metadata == 2)
        {
            return ossidRootIcon_02;
        }

        if (metadata == 3)
        {
            return ossidRootIcon_03;
        }

        if (metadata == 4)
        {
            return ossidRootIcon_04;
        }

        if (metadata == 5)
        {
            return ossidRootIcon_05;
        }

        if (metadata == 6)
        {
            return ossidRootIcon_06;
        }
        else
        {
            return ossidRootIcon_07;
        }
    }

    public void updateTick(World world, int x, int y, int z, Random random)
    {
        if (world.getBlockMetadata(x, y, z) == 7)
        {
            return;
        }

        if (world.getBlockLightValue(x, y + 1, z) < 9)
        {
            return;
        }

        if (random.nextInt(isFertile(world, x, y - 1, z) ? 8 : 12) != 1)
        {
            return;
        }

        // world.setBlockMetadataWithNotify(x, y, z, + 1, 2);

        if (world.getBlockMetadata(x, y, z) == 0)
        {
            world.setBlockMetadataWithNotify(x, y, z, 1, 2);
            return;
        }

        if (world.getBlockMetadata(x, y, z) == 1)
        {
            world.setBlockMetadataWithNotify(x, y, z, 2, 2);
            return;
        }

        if (world.getBlockMetadata(x, y, z) == 2)
        {
            world.setBlockMetadataWithNotify(x, y, z, 3, 2);
            return;
        }

        if (world.getBlockMetadata(x, y, z) == 3)
        {
            world.setBlockMetadataWithNotify(x, y, z, 4, 2);
            return;
        }

        if (world.getBlockMetadata(x, y, z) == 4)
        {
            world.setBlockMetadataWithNotify(x, y, z, 5, 2);
            return;
        }

        if (world.getBlockMetadata(x, y, z) == 5)
        {
            world.setBlockMetadataWithNotify(x, y, z, 6, 2);
            return;
        }

        if (world.getBlockMetadata(x, y, z) == 6)
        {
            world.setBlockMetadataWithNotify(x, y, z, 7, 2);
            return;
        }
    }

    public void fertilize(World par1World, int par2, int par3, int par4)
    {
        int l = par1World.getBlockMetadata(par2, par3, par4) + MathHelper.getRandomIntegerInRange(par1World.rand, 2, 5);

        if (l > 7)
        {
            ++l;
            par1World.setBlockMetadataWithNotify(par2, par3, par4, l, 2);
        }

        par1World.setBlockMetadataWithNotify(par2, par3, par4, l, 2);
    }

    public void onNeighborBlockChange(World world, int x, int y, int z, int neighborID)
    {
        if (!canBlockStay(world, x, y, z))
        {
            dropBlockAsItem(world, x, y, z, world.getBlockMetadata(x, y, z), 0);
            world.setBlockMetadataWithNotify(x, y, z, 0, 2);
        }
    }

    public boolean canBlockStay(World world, int x, int y, int z)
    {
        Block soil = blocksList[world.getBlockId(x, y - 1, z)];
        return(world.getFullBlockLightValue(x, y, z) >= 8 ||
               world.canBlockSeeTheSky(x, y, z)) &&
              (soil != null && soil.canSustainPlant(world, x, y, z, ForgeDirection.UP , (IPlantable)AshenWheatCore.ossidSeeds));
    }

    /**
     * Generate a seed ItemStack for this crop.
     */
    protected int getSeedItem()
    {
        return AshenWheatCore.ossidSeeds.itemID;
    }

    /**
     * Generate a crop produce ItemStack for this crop.
     */
    protected int getCropItem()
    {
        return AshenWheatCore.ossidRoot.blockID;
    }

    /**
     * Drops the block items with a specified chance of dropping the specified items
     */
    public void dropBlockAsItemWithChance(World par1World, int par2, int par3, int par4, int par5, float par6, int par7)
    {
        super.dropBlockAsItemWithChance(par1World, par2, par3, par4, par5, par6, 0);
    }
/*
    @Override
    public ArrayList<ItemStack> getBlockDropped(World world, int x, int y, int z, int metadata, int fortune)
    {
        ArrayList<ItemStack> ret = super.getBlockDropped(world, x, y, z, metadata, fortune);

        if (metadata >= 7)
        {
            for (int n = 0; n < 3 + fortune; n++)
            {
                if (world.rand.nextInt(15) <= metadata)
                {
                    ret.add(new ItemStack(this.getSeedItem(), 1, 0));
                }
            }
        }

        return ret;
    }
    */

    /**
     * Returns the ID of the items to drop on destruction.
     */
    public int idDropped(int par1, Random par2Random, int par3)
    {
        //return par1 == 7 ? this.getCropItem() : this.getSeedItem();
        //return par1 == 7 ?  this.getCropItem() : this.getCropItem() ;
    	return par1 <= 6 ? this.getSeedItem() : this.getCropItem();
    }

    /**
     * Returns the quantity of items to drop on block destruction.
     */
    public int quantityDropped(Random par1Random)
    {
        return 1;
    }

    @SideOnly(Side.CLIENT)

    /**
     * only called by clickMiddleMouseButton , and passed to inventory.setCurrentItem (along with isCreative)
     */
    public int idPicked(World par1World, int par2, int par3, int par4)
    {
        return this.getSeedItem();
    }

    @SideOnly(Side.CLIENT)
    public void randomDisplayTick(World world, int x, int y, int z, Random random)
    {
        if (AshenWheatCore.MakeOssidCropGloom == true)
        {
            float f1 = (float)x + 0.5F;
            float f2 = (float)y + 0.3F;
            float f3 = (float)z + 0.5F;
            float f4 = random.nextFloat() * 0.6F - 0.3F;
            float f5 = random.nextFloat() * -0.6F - -0.3F;
            world.spawnParticle("townaura", (double)(f1 + f4), (double)(f2 + f4 + f5) , (double)(f3 + f5), 0.0D, 0.0D, 0.0D);
            // world.spawnParticle("flame", (double)(f1+f4), (double)(f2+f4+f5) , (double)(f3+f5), 0.0D, 0.0D, 0.0D);
        }
        else
        {
            return;
        }
    }
   
}

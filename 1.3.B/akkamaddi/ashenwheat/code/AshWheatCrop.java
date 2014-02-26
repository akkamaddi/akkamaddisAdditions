package akkamaddi.ashenwheat.code;

import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockCrops;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.Icon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import net.minecraftforge.common.ForgeDirection;
import net.minecraftforge.common.IPlantable;

public class AshWheatCrop extends Block
{
    public static Icon ashenWheatIcon_00;
    public static Icon ashenWheatIcon_01;
    public static Icon ashenWheatIcon_02;
    public static Icon ashenWheatIcon_03;
    public static Icon ashenWheatIcon_04;
    public static Icon ashenWheatIcon_05;
    public static Icon ashenWheatIcon_06;
    public static Icon ashenWheatIcon_07;

    public AshWheatCrop(int id)
    {
        super(id, Material.plants);
        setTickRandomly(true);
        this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 0.25F, 1.0F);
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
        ashenWheatIcon_00 = ir.registerIcon("ashenwheat:ashWheatCrop_00");
        ashenWheatIcon_01 = ir.registerIcon("ashenwheat:ashWheatCrop_01");
        ashenWheatIcon_02 = ir.registerIcon("ashenwheat:ashWheatCrop_02");
        ashenWheatIcon_03 = ir.registerIcon("ashenwheat:ashWheatCrop_03");
        ashenWheatIcon_04 = ir.registerIcon("ashenwheat:ashWheatCrop_04");
        ashenWheatIcon_05 = ir.registerIcon("ashenwheat:ashWheatCrop_05");
        ashenWheatIcon_06 = ir.registerIcon("ashenwheat:ashWheatCrop_06");
        ashenWheatIcon_07 = ir.registerIcon("ashenwheat:ashWheatCrop_07");
    }

    public Icon getIcon(int side, int metadata)
    {
        if (metadata == 0)
        {
            return ashenWheatIcon_00;
        }

        if (metadata == 1)
        {
            return ashenWheatIcon_01;
        }

        if (metadata == 2)
        {
            return ashenWheatIcon_02;
        }

        if (metadata == 3)
        {
            return ashenWheatIcon_03;
        }

        if (metadata == 4)
        {
            return ashenWheatIcon_04;
        }

        if (metadata == 5)
        {
            return ashenWheatIcon_05;
        }

        if (metadata == 6)
        {
            return ashenWheatIcon_06;
        }
        else
        {
            return ashenWheatIcon_07;
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

        
        if (random.nextInt(isFertile(world, x, y - 1, z) ? 4 : 8) != 1)
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
              (soil != null && soil.canSustainPlant(world, x, y, z, ForgeDirection.UP , (IPlantable)AshenWheat.ashSeeds));
    }

    public int idDropped(int metadata, Random random, int par2)
    {
        switch (metadata)
        {
            case 0 :
                return AshenWheat.ashSeeds.itemID;

            case 1 :
                return AshenWheat.ashSeeds.itemID;

            case 2 :
                return AshenWheat.ashSeeds.itemID;

            case 3 :
                return AshenWheat.ashSeeds.itemID;

            case 4 :
                return AshenWheat.ashSeeds.itemID;

            case 5 :
                return AshenWheat.ashSeeds.itemID;

            case 6 :
                return AshenWheat.ashSeeds.itemID;

            case 7 :
                return AshenWheat.ashWheatItem.itemID;

            default:
                // Error case!
                return -1;
        }
    }

    public int idPicked(World world, int x, int y, int z)
    {
        return AshenWheat.ashSeeds.itemID;
    }
    
    @SideOnly(Side.CLIENT)
    public void randomDisplayTick(World world, int x, int y, int z, Random random)
    {
        if (AshenWheat.MakeWheatSmoky == true)
        {
    float f1 = (float)x + 0.5F;
    float f2 = (float)y + 0.6F;
    float f3 = (float)z + 0.5F;
    float f4 = random.nextFloat() * 0.6F -0.3F;
    float f5 = random.nextFloat() * -0.6F - -0.3F;

    world.spawnParticle("smoke", (double)(f1+f4), (double)(f2+f4+f5) , (double)(f3+f5), 0.0D, 0.0D, 0.0D);
    // world.spawnParticle("flame", (double)(f1+f4), (double)(f2+f4+f5) , (double)(f3+f5), 0.0D, 0.0D, 0.0D);
        }
        else
        {
            return;
        }
    }
    
}


// https://www.youtube.com/watch?v=ZCp_aQw894w

/*
 public int idDropped(int metadata, Random random, int par2) {
		if (metadata == 7) return AshenWheat.ashWheatItem.itemID & AshenWheat.ashSeeds.itemID;
		if (metadata == 6) return AshenWheat.ashSeeds.itemID;
		if (metadata == 5) return AshenWheat.ashSeeds.itemID;
		if (metadata == 4) return AshenWheat.ashSeeds.itemID;
		if (metadata == 3) return AshenWheat.ashSeeds.itemID;
		if (metadata == 2) return AshenWheat.ashSeeds.itemID;
		if (metadata == 1) return AshenWheat.ashSeeds.itemID;
 		if (metadata == 0) return AshenWheat.ashSeeds.itemID;
		return -1;
	}
	*/

package akkamaddi.ashenwheat.code;

import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import net.minecraftforge.event.Event.Result;
import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.event.entity.player.BonemealEvent;

public class AshyBonemeal
{
    @ForgeSubscribe
    public void onUseBonemeal(BonemealEvent event)
    {
        if (event.ID == AshenWheatCore.ashWheatCrop.blockID)
        {
            int l = event.world.getBlockMetadata(event.X, event.Y, event.Z) + MathHelper.getRandomIntegerInRange(event.world.rand, 0, 2);

            if (l < 7)
            {
                ++l;
                event.world.setBlockMetadataWithNotify(event.X, event.Y, event.Z, l, 2);
            }

            event.world.setBlockMetadataWithNotify(event.X, event.Y, event.Z, l, 2);
            event.setResult(Result.ALLOW);
            //event.world.setBlockMetadataWithNotify(event.X, event.Y, event.Z, 7, 2);
        }
        
        if (event.ID == AshenWheatCore.ossidRootCrop.blockID)
        {
            int l = event.world.getBlockMetadata(event.X, event.Y, event.Z) + MathHelper.getRandomIntegerInRange(event.world.rand, 0, 1);

            if (l < 7)
            {
                ++l;
                event.world.setBlockMetadataWithNotify(event.X, event.Y, event.Z, l, 2);
            }

            event.world.setBlockMetadataWithNotify(event.X, event.Y, event.Z, l, 2);
            event.setResult(Result.ALLOW);
            //event.world.setBlockMetadataWithNotify(event.X, event.Y, event.Z, 7, 2);
        }

        if (event.ID == AshenWheatCore.thunderGrassCrop.blockID)
        {
            int l = event.world.getBlockMetadata(event.X, event.Y, event.Z) + MathHelper.getRandomIntegerInRange(event.world.rand, 0, 1);

            if (l < 7)
            {
                ++l;
                event.world.setBlockMetadataWithNotify(event.X, event.Y, event.Z, l, 2);
            }

            event.world.setBlockMetadataWithNotify(event.X, event.Y, event.Z, l, 2);
            event.setResult(Result.ALLOW);
            //event.world.setBlockMetadataWithNotify(event.X, event.Y, event.Z, 7, 2);
        }
    }
}

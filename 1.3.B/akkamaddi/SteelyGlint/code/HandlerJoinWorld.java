package akkamaddi.SteelyGlint.code;

import java.util.Random;

import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraft.item.Item;

public class HandlerJoinWorld
{
    public static double rand;
    public static int range;

    public static RandomRange random = new RandomRange();

    /**
     * This class allows zombies and skeletons to spawn holding/wearing SimpleOres items.
     */
    @ForgeSubscribe
    public void EntityJoinWorldEvent(EntityJoinWorldEvent event)
    {
        rand = Math.random();
        range = random.nextInt(1, 36);

        if ((rand <= 0.03D) && ((event.entity instanceof EntityLiving)) && ((event.entity instanceof EntitySkeleton | event.entity instanceof EntityZombie)))
        {
            EntityLiving living = (EntityLiving)event.entity;

            if (range == 1)
            {
                living.setCurrentItemOrArmor(4, new ItemStack(SteelyGlintCore.highSteelHelm));
            }

            if (range == 2)
            {
                living.setCurrentItemOrArmor(3, new ItemStack(SteelyGlintCore.highSteelChest));
            }

            if (range == 3)
            {
                living.setCurrentItemOrArmor(2, new ItemStack(SteelyGlintCore.highSteelLegs));
            }

            if (range == 4)
            {
                living.setCurrentItemOrArmor(1, new ItemStack(SteelyGlintCore.highSteelBoots));
            }

            if (range == 5)
            {
                living.setCurrentItemOrArmor(0, new ItemStack(SteelyGlintCore.highSteelSword));
            }

        } 
    }
}

class RandomRange extends Random
{
	public int nextInt(int min, int max)
	{
		return nextInt(max - min + 1) + min;
	}
}
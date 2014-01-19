package akkamaddi.ClassicalAlchemy.code;

import java.util.Random;

import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;

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
        range = random.nextInt(1, 15);
        

        if ((rand <= 0.04D) && ((event.entity instanceof EntityLiving)) && ((event.entity instanceof EntitySkeleton | event.entity instanceof EntityZombie)))
        {
            EntityLiving living = (EntityLiving)event.entity;

            if (range == 1)
            {
                living.setCurrentItemOrArmor(4, new ItemStack(ClassicalAlchemyCore.stannumHelm));
                living.setCurrentItemOrArmor(3, new ItemStack(ClassicalAlchemyCore.stannumChest));
                living.setCurrentItemOrArmor(2, new ItemStack(ClassicalAlchemyCore.stannumLegs));
                living.setCurrentItemOrArmor(1, new ItemStack(ClassicalAlchemyCore.stannumBoots));
                living.setCurrentItemOrArmor(0, new ItemStack(ClassicalAlchemyCore.stannumSword));
            }

            if (range == 2)
            {
                living.setCurrentItemOrArmor(4, new ItemStack(ClassicalAlchemyCore.stannumHelm));
            }

            if (range == 3)
            {
                living.setCurrentItemOrArmor(3, new ItemStack(ClassicalAlchemyCore.stannumChest));
            }

            if (range == 4)
            {
                living.setCurrentItemOrArmor(2, new ItemStack(ClassicalAlchemyCore.stannumLegs));
            }

            if (range == 5)
            {
                living.setCurrentItemOrArmor(1, new ItemStack(ClassicalAlchemyCore.stannumBoots));
            }

            if (range == 6)
            {
                living.setCurrentItemOrArmor(0, new ItemStack(ClassicalAlchemyCore.stannumSword));
            }

            if (range == 7)
            {
                living.setCurrentItemOrArmor(0, new ItemStack(ClassicalAlchemyCore.stannumShovel));
            }

            if (range == 8)
            {
                living.setCurrentItemOrArmor(0, new ItemStack(ClassicalAlchemyCore.stannumAxe));
            }

            if (range == 9)
            {
                living.setCurrentItemOrArmor(0, new ItemStack(ClassicalAlchemyCore.stannumPickaxe));
            }

            if (range == 10)
            {
                living.setCurrentItemOrArmor(0, new ItemStack(ClassicalAlchemyCore.stannumHoe));
            }
            
            if (range == 11)
            {
                living.setCurrentItemOrArmor(4, new ItemStack(ClassicalAlchemyCore.stannumHelm));
                living.setCurrentItemOrArmor(3, new ItemStack(ClassicalAlchemyCore.stannumChest));
                living.setCurrentItemOrArmor(2, new ItemStack(ClassicalAlchemyCore.stannumLegs));
                living.setCurrentItemOrArmor(1, new ItemStack(ClassicalAlchemyCore.stannumBoots));
                living.setCurrentItemOrArmor(0, new ItemStack(ClassicalAlchemyCore.stannumSword));
            }

            if (range == 12)
            {
                living.setCurrentItemOrArmor(4, new ItemStack(ClassicalAlchemyCore.stannumHelm));
                living.setCurrentItemOrArmor(1, new ItemStack(ClassicalAlchemyCore.stannumBoots));
                living.setCurrentItemOrArmor(0, new ItemStack(ClassicalAlchemyCore.stannumPickaxe));
            }


            if (range == 13)
            {
                living.setCurrentItemOrArmor(4, new ItemStack(ClassicalAlchemyCore.stannumHelm));
                living.setCurrentItemOrArmor(3, new ItemStack(ClassicalAlchemyCore.stannumChest));
                living.setCurrentItemOrArmor(0, new ItemStack(ClassicalAlchemyCore.stannumAxe));
            }


            if (range == 14)
            {
                living.setCurrentItemOrArmor(2, new ItemStack(ClassicalAlchemyCore.stannumLegs));
                living.setCurrentItemOrArmor(1, new ItemStack(ClassicalAlchemyCore.stannumBoots));
                living.setCurrentItemOrArmor(0, new ItemStack(ClassicalAlchemyCore.stannumShovel));
            }


            if (range == 15)
            {
                living.setCurrentItemOrArmor(4, new ItemStack(ClassicalAlchemyCore.stannumHelm));
                living.setCurrentItemOrArmor(1, new ItemStack(ClassicalAlchemyCore.stannumBoots));
                living.setCurrentItemOrArmor(0, new ItemStack(ClassicalAlchemyCore.stannumHoe));
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
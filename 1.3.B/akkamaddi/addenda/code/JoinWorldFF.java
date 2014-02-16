package akkamaddi.addenda.code;

import java.util.Random;

import alexndr.SimpleOres.api.helpers.CoreHelper;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import alexndr.SimpleOres.plugins.fusion.Content;
import net.minecraft.item.Item;

public class JoinWorldFF {
	public static double rand;
	  public static int range;

	  public static RandomRange random = new RandomRange();
	  
	  
	  /**
	   * This class allows zombies and skeletons to spawn holding/wearing SimpleOres items.
	   */
	  @ForgeSubscribe
	  public void EntityJoinWorldEvent(EntityJoinWorldEvent event)
	  {
	    if (event.world.isRemote
	        || !(event.entity instanceof EntitySkeleton || event.entity instanceof EntityZombie))
	      return;
	      
	    rand = Math.random();
	    range = random.nextInt(1, 110);
	    if (rand <= 0.02D)
	    {
	      EntityLiving living = (EntityLiving)event.entity;
	      if (range == 1 || range == 2 || range == 3 || range == 4) {
	        living.setCurrentItemOrArmor(4, new ItemStack(Content.bronzeHelm));
	      }

	      if (range == 5 || range == 6 || range == 7 || range == 8) {
	        living.setCurrentItemOrArmor(3, new ItemStack(Content.bronzeChest));
	      }

	      if (range == 9 || range == 10 || range == 11 || range == 12) {
	        living.setCurrentItemOrArmor(2, new ItemStack(Content.bronzeLegs));
	      }

	      if (range == 13 || range == 14 || range == 15 || range == 16) {
	        living.setCurrentItemOrArmor(1, new ItemStack(Content.bronzeBoots));
	      }
		  
		  if (range == 17 || range == 18 || range == 19 || range == 20) {
	          living.setCurrentItemOrArmor(0, new ItemStack(Content.bronzeSword));
	        }
	      
		  if (range == 21 || range == 22 || range == 23 || range == 24) {
	          living.setCurrentItemOrArmor(0, new ItemStack(Content.bronzeAxe));
	        }
	      
		  if (range == 25 || range == 26 || range == 27 || range == 28) {
	          living.setCurrentItemOrArmor(0, new ItemStack(Content.bronzePick));
	        }
	      
		  if (range == 29 || range == 30 || range == 31 || range == 32) {
	          living.setCurrentItemOrArmor(0, new ItemStack(Content.bronzeShovel));
	        }
	      
		  if (range == 33 || range == 34 || range == 35 || range == 36) {
	          living.setCurrentItemOrArmor(0, new ItemStack(Content.bronzeHoe));
	        }
	      
		  if (range == 37 || range == 38 || range == 39) {
	        living.setCurrentItemOrArmor(4, new ItemStack(Content.thyriumHelm));
	      }

	      if (range == 40 || range == 41 || range == 42) {
	        living.setCurrentItemOrArmor(3, new ItemStack(Content.thyriumChest));
	      }

	      if (range == 43 || range == 44 || range == 45) {
	        living.setCurrentItemOrArmor(2, new ItemStack(Content.thyriumLegs));
	      }

	      if (range == 46 || range == 47 || range == 48) {
	        living.setCurrentItemOrArmor(1, new ItemStack(Content.thyriumBoots));
	      }

		  if (range == 49 || range == 50 || range == 51) {
	          living.setCurrentItemOrArmor(0, new ItemStack(Content.thyriumSword));
	        }
	      
		  if (range == 52 || range == 53 || range == 54) {
	          living.setCurrentItemOrArmor(0, new ItemStack(Content.thyriumAxe));
	        }
	      
		  if (range == 55 || range == 56 || range == 57) {
	          living.setCurrentItemOrArmor(0, new ItemStack(Content.thyriumPick));
	        }
	      
		  if (range == 58 || range == 59 || range == 60) {
	          living.setCurrentItemOrArmor(0, new ItemStack(Content.thyriumShovel));
	        }
	      
		  if (range == 61 || range == 62 || range == 63) {
	          living.setCurrentItemOrArmor(0, new ItemStack(Content.thyriumHoe));
	        }
	      
		  if (range == 64 || range == 65) {
	        living.setCurrentItemOrArmor(4, new ItemStack(Content.sinisiteHelm));
	      }

	      if (range == 66 || range == 67) {
	        living.setCurrentItemOrArmor(3, new ItemStack(Content.sinisiteChest));
	      }

	      if (range == 68 || range == 69) {
	        living.setCurrentItemOrArmor(2, new ItemStack(Content.sinisiteLegs));
	      }

	      if (range == 70 || range == 71) {
	        living.setCurrentItemOrArmor(1, new ItemStack(Content.sinisiteBoots));
	      }
	      
	      if (range == 72 || range == 109) {
	          living.setCurrentItemOrArmor(0, new ItemStack(Content.sinisiteSword));
	        }
		
	      if (range == 110 || range == 73) {
	          living.setCurrentItemOrArmor(0, new ItemStack(Content.sinisiteAxe));
	        }
		
	      if (range == 74 || range == 75) {
	          living.setCurrentItemOrArmor(0, new ItemStack(Content.sinisitePick));
	        }
		
	      if (range == 76 || range == 77) {
	          living.setCurrentItemOrArmor(0, new ItemStack(Content.sinisiteShovel));
	        }
		
	      if (range == 78 || range == 79) {
	          living.setCurrentItemOrArmor(0, new ItemStack(Content.sinisiteHoe));
	        }
		
	      if (range == 80 || range == 81 || range == 82) {
	        living.setCurrentItemOrArmor(4, new ItemStack(Content.bronzeHelm));
	        living.setCurrentItemOrArmor(3, new ItemStack(Content.bronzeChest));
	        living.setCurrentItemOrArmor(2, new ItemStack(Content.bronzeLegs));
	        living.setCurrentItemOrArmor(1, new ItemStack(Content.bronzeBoots));
	        living.setCurrentItemOrArmor(0, new ItemStack(Content.bronzeSword));
	        }
	      
	      if (range == 83 || range == 84 || range == 85) {
	        living.setCurrentItemOrArmor(4, new ItemStack(Content.bronzeHelm));
	        living.setCurrentItemOrArmor(1, new ItemStack(Content.bronzeBoots));
	        living.setCurrentItemOrArmor(0, new ItemStack(Content.bronzePick));
	        }
	      
	      if (range == 86 || range == 87 || range == 88) {
	        living.setCurrentItemOrArmor(4, new ItemStack(Content.bronzeHelm));
	        living.setCurrentItemOrArmor(3, new ItemStack(Content.bronzeChest));
	        living.setCurrentItemOrArmor(0, new ItemStack(Content.bronzeAxe));
	        }
	      
	      if (range == 89 || range == 90 || range == 91) {
	        living.setCurrentItemOrArmor(2, new ItemStack(Content.bronzeLegs));
	        living.setCurrentItemOrArmor(1, new ItemStack(Content.bronzeBoots));
	        living.setCurrentItemOrArmor(0, new ItemStack(Content.bronzeShovel));
	        }
	      
	      if (range == 92 || range == 93 || range == 94) {
	        living.setCurrentItemOrArmor(4, new ItemStack(Content.bronzeHelm));
	        living.setCurrentItemOrArmor(1, new ItemStack(Content.bronzeBoots));
	        living.setCurrentItemOrArmor(0, new ItemStack(Content.bronzeHoe));
	        }
	      
	      if (range == 95 || range == 96) {
	        living.setCurrentItemOrArmor(4, new ItemStack(Content.thyriumHelm));
	        living.setCurrentItemOrArmor(3, new ItemStack(Content.thyriumChest));
	        living.setCurrentItemOrArmor(2, new ItemStack(Content.thyriumLegs));
	        living.setCurrentItemOrArmor(1, new ItemStack(Content.thyriumBoots));
	        living.setCurrentItemOrArmor(0, new ItemStack(Content.thyriumSword));
	        }
	      
	      if (range == 97 || range == 98) {
	        living.setCurrentItemOrArmor(4, new ItemStack(Content.thyriumHelm));
	        living.setCurrentItemOrArmor(1, new ItemStack(Content.thyriumBoots));
	        living.setCurrentItemOrArmor(0, new ItemStack(Content.thyriumPick));
	        }
	      
	      if (range == 99 || range == 100) {
	        living.setCurrentItemOrArmor(4, new ItemStack(Content.thyriumHelm));
	        living.setCurrentItemOrArmor(3, new ItemStack(Content.thyriumChest));
	        living.setCurrentItemOrArmor(0, new ItemStack(Content.thyriumAxe));
	        }
	      
	      if (range == 101 || range == 102) {
	        living.setCurrentItemOrArmor(2, new ItemStack(Content.thyriumLegs));
	        living.setCurrentItemOrArmor(1, new ItemStack(Content.thyriumBoots));
	        living.setCurrentItemOrArmor(0, new ItemStack(Content.thyriumShovel));
	        }
	      
	      if (range == 103 || range == 104) {
	        living.setCurrentItemOrArmor(4, new ItemStack(Content.thyriumHelm));
	        living.setCurrentItemOrArmor(1, new ItemStack(Content.thyriumBoots));
	        living.setCurrentItemOrArmor(0, new ItemStack(Content.thyriumHoe));
	        }
	     
	      if (range == 105) {
	        living.setCurrentItemOrArmor(4, new ItemStack(Content.sinisiteHelm));
	        living.setCurrentItemOrArmor(3, new ItemStack(Content.sinisiteChest));
	        living.setCurrentItemOrArmor(2, new ItemStack(Content.sinisiteLegs));
	        living.setCurrentItemOrArmor(1, new ItemStack(Content.sinisiteBoots));
	        living.setCurrentItemOrArmor(0, new ItemStack(Content.sinisiteSword));
	        }
	      
	      if (range == 106) {
	        living.setCurrentItemOrArmor(4, new ItemStack(Content.sinisiteHelm));
	        living.setCurrentItemOrArmor(1, new ItemStack(Content.sinisiteBoots));
	        living.setCurrentItemOrArmor(0, new ItemStack(Content.sinisitePick));
	        }
	      
	      if (range == 107) {
	        living.setCurrentItemOrArmor(4, new ItemStack(Content.sinisiteHelm));
	        living.setCurrentItemOrArmor(3, new ItemStack(Content.sinisiteChest));
	        living.setCurrentItemOrArmor(0, new ItemStack(Content.sinisiteAxe));
	        }
	      
	      if (range == 108) {
	        living.setCurrentItemOrArmor(2, new ItemStack(Content.sinisiteLegs));
	        living.setCurrentItemOrArmor(1, new ItemStack(Content.sinisiteBoots));
	        living.setCurrentItemOrArmor(0, new ItemStack(Content.sinisiteShovel));
	        }
	      
	      if (range == 109) {
	        living.setCurrentItemOrArmor(4, new ItemStack(Content.sinisiteHelm));
	        living.setCurrentItemOrArmor(1, new ItemStack(Content.sinisiteBoots));
	        living.setCurrentItemOrArmor(0, new ItemStack(Content.sinisiteHoe));
	        }

	      if (range == 110) {
	        living.setCurrentItemOrArmor(4, new ItemStack(Item.helmetGold));
	        living.setCurrentItemOrArmor(3, new ItemStack(Content.bronzeChest));
	        living.setCurrentItemOrArmor(2, new ItemStack(Item.legsIron));
	        living.setCurrentItemOrArmor(1, new ItemStack(Item.bootsLeather));
	        living.setCurrentItemOrArmor(0, new ItemStack(Content.sinisiteSword));
	        }
	      
		
	    }
	  }
}



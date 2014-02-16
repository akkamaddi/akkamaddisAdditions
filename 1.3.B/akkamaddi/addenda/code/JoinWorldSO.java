package akkamaddi.addenda.code;

import java.util.Random;

import alexndr.SimpleOres.api.helpers.CoreHelper;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;

public class JoinWorldSO {
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
	    range = random.nextInt(1, 168);
	    if (rand <= 0.03D)
	    {
	      EntityLiving living = (EntityLiving)event.entity;
	      if (range == 1 || range == 2 || range == 3) {
	        living.setCurrentItemOrArmor(4, new ItemStack(CoreHelper.coreContent.copperHelm));
	      }

	      if (range == 4 || range == 5 || range == 6) {
	        living.setCurrentItemOrArmor(3, new ItemStack(CoreHelper.coreContent.copperChest));
	      }

	      if (range == 7 || range == 8 || range == 9) {
	        living.setCurrentItemOrArmor(2, new ItemStack(CoreHelper.coreContent.copperLegs));
	      }

	      if (range == 10 || range == 11 || range == 12) {
	        living.setCurrentItemOrArmor(1, new ItemStack(CoreHelper.coreContent.copperBoots));
	      }
		  
		  if (range == 13 || range == 14 || range == 15) {
	          living.setCurrentItemOrArmor(0, new ItemStack(CoreHelper.coreContent.copperSword));
	        }
	      
		  if (range == 16 || range == 17 || range == 18) {
	          living.setCurrentItemOrArmor(0, new ItemStack(CoreHelper.coreContent.copperAxe));
	        }
	      
		  if (range == 19 || range == 20 || range == 21) {
	          living.setCurrentItemOrArmor(0, new ItemStack(CoreHelper.coreContent.copperPick));
	        }
	      
		  if (range == 22 || range == 23 || range == 24) {
	          living.setCurrentItemOrArmor(0, new ItemStack(CoreHelper.coreContent.copperShovel));
	        }
	      
		  if (range == 25 || range == 26 || range == 27) {
	          living.setCurrentItemOrArmor(0, new ItemStack(CoreHelper.coreContent.copperHoe));
	        }
	      
		  if (range == 28 || range == 29 || range == 30) {
	        living.setCurrentItemOrArmor(4, new ItemStack(CoreHelper.coreContent.tinHelm));
	      }

	      if (range == 31 || range == 32 || range == 33) {
	        living.setCurrentItemOrArmor(3, new ItemStack(CoreHelper.coreContent.tinChest));
	      }

	      if (range == 34 || range == 35 || range == 36) {
	        living.setCurrentItemOrArmor(2, new ItemStack(CoreHelper.coreContent.tinLegs));
	      }

	      if (range == 37 || range == 38 || range == 39) {
	        living.setCurrentItemOrArmor(1, new ItemStack(CoreHelper.coreContent.tinBoots));
	      }

		  if (range == 40 || range == 41 || range == 42) {
	          living.setCurrentItemOrArmor(0, new ItemStack(CoreHelper.coreContent.tinSword));
	        }
	      
		  if (range == 43 || range == 44 || range == 45) {
	          living.setCurrentItemOrArmor(0, new ItemStack(CoreHelper.coreContent.tinAxe));
	        }
	      
		  if (range == 46 || range == 47 || range == 48) {
	          living.setCurrentItemOrArmor(0, new ItemStack(CoreHelper.coreContent.tinPick));
	        }
	      
		  if (range == 49 || range == 50 || range == 51) {
	          living.setCurrentItemOrArmor(0, new ItemStack(CoreHelper.coreContent.tinShovel));
	        }
	      
		  if (range == 52 || range == 53 || range == 54) {
	          living.setCurrentItemOrArmor(0, new ItemStack(CoreHelper.coreContent.tinHoe));
	        }
	      
	      if (range == 55 || range == 56 || range == 57) {
	        living.setCurrentItemOrArmor(4, new ItemStack(CoreHelper.coreContent.mythrilHelm));
	      }

	      if (range == 58 || range == 59 || range == 60) {
	        living.setCurrentItemOrArmor(3, new ItemStack(CoreHelper.coreContent.mythrilChest));
	      }

	      if (range == 61 || range == 62 || range == 63) {
	        living.setCurrentItemOrArmor(2, new ItemStack(CoreHelper.coreContent.mythrilLegs));
	      }

	      if (range == 64 || range == 65 || range == 66) {
	        living.setCurrentItemOrArmor(1, new ItemStack(CoreHelper.coreContent.mythrilBoots));
	      }

	      if (range == 67 || range == 68 || range == 69) {
	          living.setCurrentItemOrArmor(0, new ItemStack(CoreHelper.coreContent.mythrilSword));
	        }
	      
	      if (range == 70 || range == 71 || range == 72) {
	          living.setCurrentItemOrArmor(0, new ItemStack(CoreHelper.coreContent.mythrilAxe));
	        }
	      
	      if (range == 73 || range == 74 || range == 75) {
	          living.setCurrentItemOrArmor(0, new ItemStack(CoreHelper.coreContent.mythrilPick));
	        }
	      
	      if (range == 76 || range == 77 || range == 78) {
	          living.setCurrentItemOrArmor(0, new ItemStack(CoreHelper.coreContent.mythrilShovel));
	        }
	      
	      if (range == 79 || range == 80 || range == 81) {
	          living.setCurrentItemOrArmor(0, new ItemStack(CoreHelper.coreContent.mythrilHoe));
	        }
	      
	      if (range == 82 || range == 83) {
	        living.setCurrentItemOrArmor(4, new ItemStack(CoreHelper.coreContent.adamantiumHelm));
	      }

	      if (range == 84 || range == 85) {
	        living.setCurrentItemOrArmor(3, new ItemStack(CoreHelper.coreContent.adamantiumChest));
	      }

	      if (range == 86 || range == 87) {
	        living.setCurrentItemOrArmor(2, new ItemStack(CoreHelper.coreContent.adamantiumLegs));
	      }

	      if (range == 88 || range == 89) {
	        living.setCurrentItemOrArmor(1, new ItemStack(CoreHelper.coreContent.adamantiumBoots));
	      }
	      
	      if (range == 90 || range == 91) {
	          living.setCurrentItemOrArmor(0, new ItemStack(CoreHelper.coreContent.adamantiumSword));
	        }
	      
	      if (range == 92 || range == 93) {
	          living.setCurrentItemOrArmor(0, new ItemStack(CoreHelper.coreContent.adamantiumAxe));
	        }
	      
	      if (range == 94 || range == 95) {
	          living.setCurrentItemOrArmor(0, new ItemStack(CoreHelper.coreContent.adamantiumPick));
	        }
	      
	      if (range == 96 || range == 97) {
	          living.setCurrentItemOrArmor(0, new ItemStack(CoreHelper.coreContent.adamantiumShovel));
	        }
	      
	      if (range == 98 || range == 99) {
	          living.setCurrentItemOrArmor(0, new ItemStack(CoreHelper.coreContent.adamantiumHoe));
	        }
	      
		  if (range == 100 || range == 101) {
	        living.setCurrentItemOrArmor(4, new ItemStack(CoreHelper.coreContent.onyxHelm));
	      }

	      if (range == 102 || range == 103) {
	        living.setCurrentItemOrArmor(3, new ItemStack(CoreHelper.coreContent.onyxChest));
	      }

	      if (range == 104 || range == 105) {
	        living.setCurrentItemOrArmor(2, new ItemStack(CoreHelper.coreContent.onyxLegs));
	      }

	      if (range == 106 || range == 107) {
	        living.setCurrentItemOrArmor(1, new ItemStack(CoreHelper.coreContent.onyxBoots));
	      }
	      
	      if (range == 108 || range == 109) {
	          living.setCurrentItemOrArmor(0, new ItemStack(CoreHelper.coreContent.onyxSword));
	        }
		
	      if (range == 110 || range == 111) {
	          living.setCurrentItemOrArmor(0, new ItemStack(CoreHelper.coreContent.onyxAxe));
	        }
		
	      if (range == 112 || range == 113) {
	          living.setCurrentItemOrArmor(0, new ItemStack(CoreHelper.coreContent.onyxPick));
	        }
		
	      if (range == 114 || range == 115) {
	          living.setCurrentItemOrArmor(0, new ItemStack(CoreHelper.coreContent.onyxShovel));
	        }
		
	      if (range == 116 || range == 117) {
	          living.setCurrentItemOrArmor(0, new ItemStack(CoreHelper.coreContent.onyxHoe));
	        }
		
	      if (range == 118 || range == 119) {
	        living.setCurrentItemOrArmor(4, new ItemStack(CoreHelper.coreContent.copperHelm));
	        living.setCurrentItemOrArmor(3, new ItemStack(CoreHelper.coreContent.copperChest));
	        living.setCurrentItemOrArmor(2, new ItemStack(CoreHelper.coreContent.copperLegs));
	        living.setCurrentItemOrArmor(1, new ItemStack(CoreHelper.coreContent.copperBoots));
	        living.setCurrentItemOrArmor(0, new ItemStack(CoreHelper.coreContent.copperSword));
	        }
	      
	      if (range == 120 || range == 121) {
	        living.setCurrentItemOrArmor(4, new ItemStack(CoreHelper.coreContent.copperHelm));
	        living.setCurrentItemOrArmor(1, new ItemStack(CoreHelper.coreContent.copperBoots));
	        living.setCurrentItemOrArmor(0, new ItemStack(CoreHelper.coreContent.copperPick));
	        }
	      
	      if (range == 122 || range == 123) {
	        living.setCurrentItemOrArmor(4, new ItemStack(CoreHelper.coreContent.copperHelm));
	        living.setCurrentItemOrArmor(3, new ItemStack(CoreHelper.coreContent.copperChest));
	        living.setCurrentItemOrArmor(0, new ItemStack(CoreHelper.coreContent.copperAxe));
	        }
	      
	      if (range == 124 || range == 125) {
	        living.setCurrentItemOrArmor(2, new ItemStack(CoreHelper.coreContent.copperLegs));
	        living.setCurrentItemOrArmor(1, new ItemStack(CoreHelper.coreContent.copperBoots));
	        living.setCurrentItemOrArmor(0, new ItemStack(CoreHelper.coreContent.copperShovel));
	        }
	      
	      if (range == 126 || range == 127) {
	        living.setCurrentItemOrArmor(4, new ItemStack(CoreHelper.coreContent.copperHelm));
	        living.setCurrentItemOrArmor(1, new ItemStack(CoreHelper.coreContent.copperBoots));
	        living.setCurrentItemOrArmor(0, new ItemStack(CoreHelper.coreContent.copperHoe));
	        }
	      
	      if (range == 128 || range == 129) {
	        living.setCurrentItemOrArmor(4, new ItemStack(CoreHelper.coreContent.tinHelm));
	        living.setCurrentItemOrArmor(3, new ItemStack(CoreHelper.coreContent.tinChest));
	        living.setCurrentItemOrArmor(2, new ItemStack(CoreHelper.coreContent.tinLegs));
	        living.setCurrentItemOrArmor(1, new ItemStack(CoreHelper.coreContent.tinBoots));
	        living.setCurrentItemOrArmor(0, new ItemStack(CoreHelper.coreContent.tinSword));
	        }
	      
	      if (range == 130 || range == 131) {
	        living.setCurrentItemOrArmor(4, new ItemStack(CoreHelper.coreContent.tinHelm));
	        living.setCurrentItemOrArmor(1, new ItemStack(CoreHelper.coreContent.tinBoots));
	        living.setCurrentItemOrArmor(0, new ItemStack(CoreHelper.coreContent.tinPick));
	        }
	      
	      if (range == 132 || range == 133) {
	        living.setCurrentItemOrArmor(4, new ItemStack(CoreHelper.coreContent.tinHelm));
	        living.setCurrentItemOrArmor(3, new ItemStack(CoreHelper.coreContent.tinChest));
	        living.setCurrentItemOrArmor(0, new ItemStack(CoreHelper.coreContent.tinAxe));
	        }
	      
	      if (range == 134 || range == 135) {
	        living.setCurrentItemOrArmor(2, new ItemStack(CoreHelper.coreContent.tinLegs));
	        living.setCurrentItemOrArmor(1, new ItemStack(CoreHelper.coreContent.tinBoots));
	        living.setCurrentItemOrArmor(0, new ItemStack(CoreHelper.coreContent.tinShovel));
	        }
	      
	      if (range == 136 || range == 137) {
	        living.setCurrentItemOrArmor(4, new ItemStack(CoreHelper.coreContent.tinHelm));
	        living.setCurrentItemOrArmor(1, new ItemStack(CoreHelper.coreContent.tinBoots));
	        living.setCurrentItemOrArmor(0, new ItemStack(CoreHelper.coreContent.tinHoe));
	        }
	     
	      if (range == 138 || range == 139) {
	        living.setCurrentItemOrArmor(4, new ItemStack(CoreHelper.coreContent.mythrilHelm));
	        living.setCurrentItemOrArmor(3, new ItemStack(CoreHelper.coreContent.mythrilChest));
	        living.setCurrentItemOrArmor(2, new ItemStack(CoreHelper.coreContent.mythrilLegs));
	        living.setCurrentItemOrArmor(1, new ItemStack(CoreHelper.coreContent.mythrilBoots));
	        living.setCurrentItemOrArmor(0, new ItemStack(CoreHelper.coreContent.mythrilSword));
	        }
	      
	      if (range == 140 || range == 141) {
	        living.setCurrentItemOrArmor(4, new ItemStack(CoreHelper.coreContent.mythrilHelm));
	        living.setCurrentItemOrArmor(1, new ItemStack(CoreHelper.coreContent.mythrilBoots));
	        living.setCurrentItemOrArmor(0, new ItemStack(CoreHelper.coreContent.mythrilPick));
	        }
	      
	      if (range == 142 || range == 143) {
	        living.setCurrentItemOrArmor(4, new ItemStack(CoreHelper.coreContent.mythrilHelm));
	        living.setCurrentItemOrArmor(3, new ItemStack(CoreHelper.coreContent.mythrilChest));
	        living.setCurrentItemOrArmor(0, new ItemStack(CoreHelper.coreContent.mythrilAxe));
	        }
	      
	      if (range == 144 || range == 145) {
	        living.setCurrentItemOrArmor(2, new ItemStack(CoreHelper.coreContent.mythrilLegs));
	        living.setCurrentItemOrArmor(1, new ItemStack(CoreHelper.coreContent.mythrilBoots));
	        living.setCurrentItemOrArmor(0, new ItemStack(CoreHelper.coreContent.mythrilShovel));
	        }
	      
	      if (range == 146 || range == 147) {
	        living.setCurrentItemOrArmor(4, new ItemStack(CoreHelper.coreContent.mythrilHelm));
	        living.setCurrentItemOrArmor(1, new ItemStack(CoreHelper.coreContent.mythrilBoots));
	        living.setCurrentItemOrArmor(0, new ItemStack(CoreHelper.coreContent.mythrilHoe));
	        }
	      
	      if (range == 148) {
	        living.setCurrentItemOrArmor(4, new ItemStack(CoreHelper.coreContent.adamantiumHelm));
	        living.setCurrentItemOrArmor(3, new ItemStack(CoreHelper.coreContent.adamantiumChest));
	        living.setCurrentItemOrArmor(2, new ItemStack(CoreHelper.coreContent.adamantiumLegs));
	        living.setCurrentItemOrArmor(1, new ItemStack(CoreHelper.coreContent.adamantiumBoots));
	        living.setCurrentItemOrArmor(0, new ItemStack(CoreHelper.coreContent.adamantiumSword));
	        }
	      
	      if (range == 149) {
	        living.setCurrentItemOrArmor(4, new ItemStack(CoreHelper.coreContent.adamantiumHelm));
	        living.setCurrentItemOrArmor(1, new ItemStack(CoreHelper.coreContent.adamantiumBoots));
	        living.setCurrentItemOrArmor(0, new ItemStack(CoreHelper.coreContent.adamantiumPick));
	        }
	      
	      if (range == 150) {
	        living.setCurrentItemOrArmor(4, new ItemStack(CoreHelper.coreContent.adamantiumHelm));
	        living.setCurrentItemOrArmor(3, new ItemStack(CoreHelper.coreContent.adamantiumChest));
	        living.setCurrentItemOrArmor(0, new ItemStack(CoreHelper.coreContent.adamantiumAxe));
	        }
	      
	      if (range == 151) {
	        living.setCurrentItemOrArmor(2, new ItemStack(CoreHelper.coreContent.adamantiumLegs));
	        living.setCurrentItemOrArmor(1, new ItemStack(CoreHelper.coreContent.adamantiumBoots));
	        living.setCurrentItemOrArmor(0, new ItemStack(CoreHelper.coreContent.adamantiumShovel));
	        }
	      
	      if (range == 152) {
	        living.setCurrentItemOrArmor(4, new ItemStack(CoreHelper.coreContent.adamantiumHelm));
	        living.setCurrentItemOrArmor(1, new ItemStack(CoreHelper.coreContent.adamantiumBoots));
	        living.setCurrentItemOrArmor(0, new ItemStack(CoreHelper.coreContent.adamantiumHoe));
	        }
	      
	      if (range == 153) {
	        living.setCurrentItemOrArmor(4, new ItemStack(CoreHelper.coreContent.onyxHelm));
	        living.setCurrentItemOrArmor(3, new ItemStack(CoreHelper.coreContent.onyxChest));
	        living.setCurrentItemOrArmor(2, new ItemStack(CoreHelper.coreContent.onyxLegs));
	        living.setCurrentItemOrArmor(1, new ItemStack(CoreHelper.coreContent.onyxBoots));
	        living.setCurrentItemOrArmor(0, new ItemStack(CoreHelper.coreContent.onyxSword));
	        }
	      
	      if (range == 154) {
	        living.setCurrentItemOrArmor(4, new ItemStack(CoreHelper.coreContent.onyxHelm));
	        living.setCurrentItemOrArmor(1, new ItemStack(CoreHelper.coreContent.onyxBoots));
	        living.setCurrentItemOrArmor(0, new ItemStack(CoreHelper.coreContent.onyxPick));
	        }
	      
	      if (range == 155) {
	        living.setCurrentItemOrArmor(4, new ItemStack(CoreHelper.coreContent.onyxHelm));
	        living.setCurrentItemOrArmor(3, new ItemStack(CoreHelper.coreContent.onyxChest));
	        living.setCurrentItemOrArmor(0, new ItemStack(CoreHelper.coreContent.onyxAxe));
	        }
	      
	      if (range == 156) {
	        living.setCurrentItemOrArmor(2, new ItemStack(CoreHelper.coreContent.onyxLegs));
	        living.setCurrentItemOrArmor(1, new ItemStack(CoreHelper.coreContent.onyxBoots));
	        living.setCurrentItemOrArmor(0, new ItemStack(CoreHelper.coreContent.onyxShovel));
	        }
	      
	      if (range == 157) {
	        living.setCurrentItemOrArmor(4, new ItemStack(CoreHelper.coreContent.onyxHelm));
	        living.setCurrentItemOrArmor(1, new ItemStack(CoreHelper.coreContent.onyxBoots));
	        living.setCurrentItemOrArmor(0, new ItemStack(CoreHelper.coreContent.onyxHoe));
	        }

	      if (range == 158) {
	        living.setCurrentItemOrArmor(4, new ItemStack(CoreHelper.coreContent.adamantiumHelm));
	        living.setCurrentItemOrArmor(3, new ItemStack(CoreHelper.coreContent.adamantiumChest));
	        living.setCurrentItemOrArmor(2, new ItemStack(CoreHelper.coreContent.adamantiumLegs));
	        living.setCurrentItemOrArmor(1, new ItemStack(CoreHelper.coreContent.mythrilBoots));
	        living.setCurrentItemOrArmor(0, new ItemStack(CoreHelper.coreContent.onyxSword));
	        }
	      
	      // shears
	      
	      if (range == 159 || range == 160 || range == 161) {
	        living.setCurrentItemOrArmor(0, new ItemStack(CoreHelper.coreContent.tinShears));
	        }

	      if (range == 162 || range == 163) {
	        living.setCurrentItemOrArmor(0, new ItemStack(CoreHelper.coreContent.adamantiumShears));
	        }

	      if (range == 164) {
	        living.setCurrentItemOrArmor(0, new ItemStack(CoreHelper.coreContent.onyxShears));
	        }

	      if (range == 165 || range == 166) {
	        living.setCurrentItemOrArmor(4, new ItemStack(CoreHelper.coreContent.tinHelm));
	        living.setCurrentItemOrArmor(3, new ItemStack(CoreHelper.coreContent.tinChest));
	        living.setCurrentItemOrArmor(0, new ItemStack(CoreHelper.coreContent.tinShears));
	        }

	      if (range == 167) {
	        living.setCurrentItemOrArmor(4, new ItemStack(CoreHelper.coreContent.adamantiumHelm));
	        living.setCurrentItemOrArmor(3, new ItemStack(CoreHelper.coreContent.adamantiumChest));
	        living.setCurrentItemOrArmor(0, new ItemStack(CoreHelper.coreContent.adamantiumShears));
	        }

	      if (range == 168) {
	        living.setCurrentItemOrArmor(4, new ItemStack(CoreHelper.coreContent.onyxHelm));
	        living.setCurrentItemOrArmor(3, new ItemStack(CoreHelper.coreContent.onyxChest));
	        living.setCurrentItemOrArmor(0, new ItemStack(CoreHelper.coreContent.onyxShears));
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

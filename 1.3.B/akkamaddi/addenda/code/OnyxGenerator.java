package akkamaddi.addenda.code;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import alexndr.SimpleOres.api.helpers.WorldGenHelper;
import cpw.mods.fml.common.IWorldGenerator;
import alexndr.SimpleOres.api.helpers.CoreHelper;


public class OnyxGenerator implements IWorldGenerator {
	

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world,
			IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {

		if(akkamaddiaddenda.enableHigherDimensionGen && akkamaddiaddenda.dimensionIDsArray.length >= 1)
		{
			for(int i = 0; i < akkamaddiaddenda.dimensionIDsArray.length; i++)
			{
				if(world.provider.dimensionId == akkamaddiaddenda.dimensionIDsArray[i])
				{
					generateOnyx(world, random, chunkX*16, chunkZ*16, akkamaddiaddenda.dimensionIDsArray[i]);
				}
			}
		}
		
	}
	
	/**
	 * Generates the main surface ores in dimensions other than the vanilla ones.
	 * This is all configurable through the settings file, and is classified as "Advanced".
	 * 
	 * Each different dimension can have different spawn rates, with support for up to ~30000 dimensions (I think).
	 */
	//@Override
	private void generateOnyx(World world, Random random, int blockX, int blockZ, int dimensionID) 
	{
		if(akkamaddiaddenda.enableHigherDimensionGen)
		{
			for(int i = 0; i < akkamaddiaddenda.dimensionIDsArray.length; i++)
			{
				int onyxRate = akkamaddiaddenda.config.get("Higher Dimension ID: " + dimensionID, "Onyx Spawn Rate", 5).getInt();
				
				for(int x = 0; x < onyxRate; x++)
				{
					int maxHeight = akkamaddiaddenda.config.get("Higher Dimension ID: " + dimensionID, "Onyx Maximum Spawn Height", 64).getInt();
					int minHeight = akkamaddiaddenda.config.get("Higher Dimension ID: " + dimensionID, "Onyx Minimum Spawn Height", 0).getInt();
					int veinSize = akkamaddiaddenda.config.get("Higher Dimension ID: " + dimensionID, "Onyx Vein Size", 7).getInt();
					
				    int Xcoord = blockX + random.nextInt(16);
				    int Ycoord = random.nextInt(maxHeight - minHeight);
				    int Zcoord = blockZ + random.nextInt(16);
				    new WorldGenHelper(CoreHelper.coreContent.onyxOre.blockID, veinSize, Block.stone).generate(world, random, Xcoord, Ycoord + minHeight, Zcoord);				    
				}
				
				
	
		}
	}
	
}


	
}
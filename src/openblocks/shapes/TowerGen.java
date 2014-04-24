package openblocks.shapes;

import java.util.ArrayList;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemBlockWithMetadata;
import net.minecraft.util.ChunkCoordinates;
import net.minecraft.world.World;
import openblocks.common.tileentity.TileEntityRopeLadder;
import openmods.shapes.IShapeGenerator;
import openmods.shapes.IShapeable;
import openmods.utils.BlockNotifyFlags;
import openmods.utils.MathUtils;

public class TowerGen implements IShapeGen {

	private final int height = 8;
	private final int width = 3;
	private final int depth = 3;
	
	@Override
	public void generateShape(int x, int y, int z, IShapeable shapeable) {

		new ShapeCylinderGen().generateShape(depth, height, width, shapeable);
		new ShapeXPlaneGen().generateShape(depth, height, width, shapeable);
	}
	

	@Override
	public ArrayList<BlockRepresentation> fill(ChunkCoordinates coord, World worldObj) {	
		
		ArrayList<BlockRepresentation> array = new ArrayList<BlockRepresentation>();
		
		array.addAll(new ShapeCylinderGen().fill(coord, worldObj));
		//array.add(new BlockRepresentation(coord.posX-1, coord.posY+height, coord.posZ, 0, 0, 3));
		worldObj.setBlockToAir(coord.posX-1, coord.posY+height, coord.posZ);
		
		int y=coord.posY+height+1;
		while(y-->0){
			if(!worldObj.isAirBlock(coord.posX-1, y, coord.posZ)){
				break;
			}
			array.add(new BlockRepresentation(coord.posX-1, y, coord.posZ,
					openblocks.OpenBlocks.Blocks.ropeLadder.blockID,5,3));
			
		}
		for (int h = coord.posY+3; h < coord.posY+height; h=h+2) { //ventanas
			array.add(new BlockRepresentation(coord.posX+depth, h, coord.posZ, Block.glass.blockID));
			array.add(new BlockRepresentation(coord.posX-depth, h, coord.posZ, Block.glass.blockID));
			array.add(new BlockRepresentation(coord.posX, h, coord.posZ+width, Block.glass.blockID));
			array.add(new BlockRepresentation(coord.posX, h, coord.posZ-width, Block.glass.blockID));
		}
		
		return array;
		
	}

}

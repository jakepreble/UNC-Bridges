
import bridges.connect.Bridges;
import bridges.validation.RateLimitException;

import java.io.IOException;

import bridges.base.Color;
import bridges.base.ColorGrid;

public class Pattern
{

	// SAMPLE PROBLEM: method to draw sample  (use this as a template)
	public void drawSample(ColorGrid grid, Bridges bridges) throws RateLimitException, IOException {
		//Display a two-eyeballs pattern to the grid (two meager beady eyes -- how lame)
		// first eyeball
		grid.set(5, 6, new Color("yellow"));
		// second eyeball
		grid.set(5, 9, new Color("yellow"));
		// call to the Bridges object called ‘bridges’ -- set the data structure to the Grid type
		bridges.setDataStructure(grid);
		// call to the Bridges object called ‘bridges’ -- show the ColorGrid object called ‘grid’
		bridges.visualize();
	}  // end method drawSample()


    // YOUR METHODS (for problems 1 through 7)  HERE:
    // PROBLEM 1: method to draw horizontal stripes
	public static void drawHorizontalStripes(ColorGrid grid, Bridges bridges, Color c1, Color c2) throws RateLimitException, IOException {
		for(int r = 0; r < grid.getHeight(); r++){
			for(int c = 0; c < grid.getWidth(); c++){
				if(r % 2 == 0) grid.set(r, c, c1);
				else grid.set(r,c,c2);
				
			}
		}
		bridges.setDataStructure(grid);
		bridges.visualize();
	}


	// PROBLEM 2: method to draw vertical stripes
	public static void drawVerticalStripes(ColorGrid grid, Bridges bridges, Color c1, Color c2) throws RateLimitException, IOException {
		for(int c = 0; c < grid.getWidth(); c++){
			for(int r = 0; r < grid.getHeight(); r++){
				if(c % 2 == 0) grid.set(r, c, c1);
				else grid.set(r,c,c2);
				
			}
		}
		bridges.setDataStructure(grid);
		bridges.visualize();
	}


	// PROBLEM 3: method to draw checkerboard
	public static void drawCheckerboard(ColorGrid grid, Bridges bridges, Color c1, Color c2) throws RateLimitException, IOException {
		
		for(int r = 0; r < grid.getHeight(); r++){
			for(int c = 0; c < grid.getWidth(); c++){
				if (r % 2 == 0 && c % 2 == 0){ 
					grid.set(r, c, c1);
				} else if (c % 2 == 1 && r % 2 == 1) {
					grid.set(r,c,c1);
				}
				
			}
		}
		bridges.setDataStructure(grid);
		bridges.visualize();
	}


	// PROBLEM 4: method to draw border
	public static void drawBorder(ColorGrid grid, Bridges bridges, Color c1, Color c2) throws RateLimitException, IOException {
	
		for(int r = 0; r < grid.getHeight(); r++){
			for(int c = 0; c < grid.getWidth(); c++){
				if (r == 0 || c == 0 || r == grid.getHeight() - 1 || c == grid.getWidth() -1) grid.set(r, c, c1);
				else grid.set(r,c,c2);
				
			}
		}
		bridges.setDataStructure(grid);
		bridges.visualize();
	}
	


	// PROBLEM 5: method to draw X
	public static void drawX(ColorGrid grid, Bridges bridges, Color c1, Color c2) throws RateLimitException, IOException {
		for(int r = 0; r < grid.getHeight(); r++){
			for(int c = 0; c < grid.getWidth(); c++){
				if(r == c) grid.set(r, c, c1);
				else grid.set(r,c,c2);
				
			}
		}
		for(int r = grid.getHeight()-1; r >= 0; r--){
			for(int c = 0; c < grid.getWidth(); c++){
				if(r + c == grid.getHeight()-1) grid.set(r, c, c1);
				
				
			}
		}
		bridges.setDataStructure(grid);
		bridges.visualize();
	}



	// PROBLEM 6: method to draw diagonal split
	public static void drawDiagSplit(ColorGrid grid, Bridges bridges, Color c1, Color c2) throws RateLimitException, IOException {
		for(int r = 0; r < grid.getHeight(); r++){
			for(int c = 0; c < grid.getWidth(); c++){
				if(c < r) grid.set(r, c, c1);
				else grid.set(r,c,c2);
			}
		}
		bridges.setDataStructure(grid);
		bridges.visualize();
	}
		

	// PROBLEM 7: method to draw 4 quadrants
	public static void drawQuadrants(ColorGrid grid, Bridges bridges, Color c1, Color c2, Color c3, Color c4) throws RateLimitException, IOException {
		for(int r = 0; r < grid.getHeight(); r++){
			for(int c = 0; c < grid.getWidth(); c++){
				if(r < grid.getHeight()/2 && c < grid.getWidth()/2 ) grid.set(r, c, c1);
				if(r > grid.getHeight()/2 - 1&& c < grid.getWidth()/2) grid.set(r, c, c2);
				if(r > grid.getHeight()/2 -1 && c > grid.getWidth()/2 -1) grid.set(r, c, c3);
				if(r < grid.getHeight()/2 && c > grid.getWidth()/2 - 1) grid.set(r, c, c4);
				
				
			}
		}
		bridges.setDataStructure(grid);
		bridges.visualize();
	}


}  // end class
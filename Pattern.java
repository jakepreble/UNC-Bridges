
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



	// PROBLEM 4: method to draw border



	// PROBLEM 5: method to draw X



	// PROBLEM 6: method to draw diagonal split



	// PROBLEM 7: method to draw 4 quadrants



}  // end class
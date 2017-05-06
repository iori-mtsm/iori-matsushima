package e1;

public class Grid
{
protected int rows;         // number of grid rows
protected int cols;         // number of grid columns
 
protected boolean [][] grid;     // the grid containing blobs
// You may define helper variables as needed

public Grid(int rows, int cols, boolean[][] grid)

{
 this.rows = rows;
 this.cols = cols;
 this.grid = grid;
 
}

public String toString()
{
 String gridString = "";
 for (int i = 0; i < rows; i++)
 {
   for (int j = 0; j < cols; j++)
   {
     if (grid[i][j])
       gridString = gridString + "X";
     else
       gridString = gridString + ".";
    }
   gridString = gridString + "\n";   // end of row
 }  
 return gridString;
}

public int blobCount()
// returns the number of blobs in this grid
{
 int count = 0;
 // Your code goes here
 return count;
}

// You may define heper methods as needed
}


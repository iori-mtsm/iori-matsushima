package e1;

public class Grid
{
    protected int rows;         // number of grid rows
    protected int cols;         // number of grid columns
    
    protected boolean [][] grid;     // the grid containing blobs
    // You may define helper variables as needed
    private boolean[][] copygrid;
    
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
        
        // make a copy of the grid
        copygrid = (boolean[][]) grid.clone();
        
        // once X is found, increment the count and erase other X's in the same Blob
        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < cols; j++)
            {
                if (copygrid[i][j])
                {
                    count += 1;
                    BlobEraser(i,j);
                }
            }
        }
        
        return count;
    }
    
    // You may define helper methods as needed
    public void BlobEraser(int i, int j)
    // given the location ij of some X, erases all the X's in the same blob
    {
        copygrid[i][j] = false;
        
        try{
            if (copygrid[i-1][j-1])
                BlobEraser(i-1, j-1);
        }
        catch (IndexOutOfBoundsException e){};
        
        try{
            if (copygrid[i-1][j])
                BlobEraser(i-1, j);
        }
        catch (IndexOutOfBoundsException e){};
        
        try{
            if(copygrid[i-1][j+1])
                BlobEraser(i-1, j+1);
        }
        catch (IndexOutOfBoundsException e){};
        
        try{
            if(copygrid[i][j-1])
                BlobEraser(i, j-1);
        }
        catch (IndexOutOfBoundsException e){};
        
        try{
            if(copygrid[i][j+1])
                BlobEraser(i, j+1);
        }
        catch (IndexOutOfBoundsException e){};
        
        try{
            if(copygrid[i+1][j-1])
                BlobEraser(i+1, j-1);
        }
        catch (IndexOutOfBoundsException e){};
        
        try{
            if(copygrid[i+1][j])
                BlobEraser(i+1, j);
        }
        catch (IndexOutOfBoundsException e){};
        
        try{
            if(copygrid[i+1][j+1])
                BlobEraser(i+1, j+1);
        }
        catch (IndexOutOfBoundsException e){};
        
    }
    
}

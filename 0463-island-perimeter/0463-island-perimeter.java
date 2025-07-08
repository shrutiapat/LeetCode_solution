// class Solution {
//     public int islandPerimeter(int[][] grid) {
//         int peri = 0;
//         int row = grid.length;
//         int col = grid[0].length;
//         for(int i =0; i<row; i++){
//             for (int j=0; j<col; j++){
//                 if(grid[i][j]==1) peri += 4;{
//                     if(i>0 && grid[i-1][j]==1) peri -= 2;
//                     if(j>0 && grid[i][j-1]==1) peri -= 2;
//                 }
                
//             }
//         }
//         return peri;

//     }
// }

class Solution {
    public int islandPerimeter(int[][] grid) {
        int perimeter = 0;
        
        int rows = grid.length;
        int cols = grid[0].length;
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 1) {
                    perimeter += 4;
                    
                    // Subtract shared edge with upper neighbor
                    if (i > 0 && grid[i - 1][j] == 1)
                        perimeter -= 2;
                    
                    // Subtract shared edge with left neighbor
                    if (j > 0 && grid[i][j - 1] == 1)
                        perimeter -= 2;
                }
            }
        }
        
        return perimeter;
    }
}

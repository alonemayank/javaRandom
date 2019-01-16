import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * Created by apurvatripathi on 1/3/19.
 */
public class ColorIsland {

    public List<Integer> countIsland(int[][] grid){
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                if(grid[i][j] != 0){
                    hm.put(grid[i][j], hm.getOrDefault(grid[i][j], 0)+1);
                    helper(grid, i, j, grid[i][j]);
                }

            }
        }

        return new ArrayList<Integer>(hm.values());
    }

    private void helper(int[][] grid, int i, int j, int color){
        if(i<0 || j<0 || j>=grid[0].length || i>=grid.length) return;
        if(grid[i][j] != color) return;
        if(grid[i][j] == color) grid[i][j] = 0;
        helper(grid, i+1, j, color);
        helper(grid, i-1, j, color);
        helper(grid, i, j+1, color);
        helper(grid, i, j-1, color);
    }

    public static void main(String args[]){
        ColorIsland obj = new ColorIsland();
        int[][] arr = { {1,1,2,1},
                        {3,1,2,1},
                        {3,2,2,1}
        };
        System.out.println(obj.countIsland(arr));
        System.out.println(Integer.MAX_VALUE+1);
    }
}

import java.util.Arrays;

/**
 * Created by apurvatripathi on 1/13/19.
 */
public class RotateMatrix {

    public void rotate(int[][] matrix) {
        int n = matrix[0].length;
        for(int l = 0; l < n/2; l++){
            int first = l;
            int last = n-l-1;
            for(int i=first; i < last; i++){
                int diff = i-first;
                int top = matrix[first][i];
                matrix[first][i] = matrix[last-diff][first];
                matrix[last-diff][first] =matrix[last][last-diff];
                matrix[last][last-diff] = matrix[i][last];
                matrix[i][last]= top;
            }
        }
    }

    public static void main(String args[]){
        RotateMatrix obj = new RotateMatrix();
        int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
        obj.rotate(arr);
        System.out.println(Arrays.toString(arr));

    }
}

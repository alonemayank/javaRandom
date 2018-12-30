/**
 * Created by apurvatripathi on 12/19/18.
 */
public class setZero {
    public void setZeroes(int[][] matrix) {
        for(int i=0; i < matrix.length; i++){
            for(int j=0; j < matrix[0].length; j++){
                int k = i;
                int l = j;
                if(matrix[i][j]==0) helper(matrix, i, j, k, l);
            }
        }
    }

    void helper(int[][] matrix, int i, int j, int k, int l){
        System.out.println("i is: "+i+" j is: "+j+" k is :"+k+" l is:"+l+" Matrix length:"+matrix.length+" another:"+matrix[0].length);
        if(i < 0 || j < 0 || i >= matrix.length || j >= matrix[0].length) return;
        else if(i < k-1 || i > k+1 || j < l-1 || j > l+1) return;
        else{
            //if(matrix[i][j] == 0) return;
            matrix[i][j] = 0;
            helper(matrix, i+1, j,k,l);
            helper(matrix, i-1, j,k,l);
            helper(matrix, i, j+1,k,l);
            helper(matrix, i, j-1,k,l);
        }
    }

    public static void main(String args[]){
        setZero obj = new setZero();

        int[][] arr = {{1,1,1},{1,0,1},{1,1,1}};

        obj.setZeroes(arr);
    }
}

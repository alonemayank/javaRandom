import java.util.Stack;

/**
 * Created by apurvatripathi on 2/4/19.
 */

class Tree{
    int val;
    Tree left;
    Tree right;
    Tree parent;

    Tree(int val){
        this.val = val;
    }
}

public class cdImplimentation {

    public void cd(String current, String cdTo){
        String str[] = cdTo.split("/");
        String curr[] = current.split("/");
        Stack<String> st = new Stack<>();
        for(String s: curr) st.push(s);
        int counter = 0;
        for(String s: str){
            if(s.equals("..")){
                st.pop();
            }else{
                st.push(s);
            }
        }

        StringBuilder result = new StringBuilder();
        while(!st.isEmpty()){
            result.insert(0,st.pop()+"/");
        }
        System.out.println(result);
    }

    public static void main(String args[]){
        cdImplimentation obj = new cdImplimentation();
        obj.cd("a/b/c/d", "../rd/../wasd/../");
        int[] arr = {9,8,7,6,4,3,2,1};
        Tree node = new Tree(5);
    }

   // public insert()

}

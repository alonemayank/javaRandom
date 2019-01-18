import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

/**
 * Created by apurvatripathi on 1/17/19.
 */

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    public TreeNode(int val){
        this.val = val;
    }
}
public class TopViewBinaryTree {

    private static class Pair{
        TreeNode first;
        int second;
        public Pair(TreeNode f, int s){
            first = f;
            second = s;
        }
    }

    public static void topView(TreeNode root){
        if(root == null) return;

        TreeNode temp = null;
        Map<Integer, Integer> hm = new HashMap<>();
        Queue<Pair> q = new LinkedList<>();

        q.add(new Pair(root,0));

        while(!q.isEmpty()){
            temp = q.peek().first;
            int d = q.peek().second;
            q.poll();

            if(!hm.containsKey(d)){
                hm.put(d, temp.val);
                System.out.println(temp.val);
            }

            if(temp.left!=null){
                q.add(new Pair(temp.left,d-1));
            }

            if(temp.right!=null){
                q.add(new Pair(temp.right, d+1));
            }
        }
    }


    public static void main(String args[]){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.left.right.right = new TreeNode(5);
        root.left.right.right.right = new TreeNode(6);
        System.out.println( "Following are nodes in top view of Binary Tree\n");
        topView(root);
    }
}

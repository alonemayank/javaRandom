/**
 * Created by apurvatripathi on 12/16/18.
 */
import java.util.Stack;

public class MinStack {

    Stack<Integer> st;
    private Stack<Integer> min;

    public MinStack() {
        st = new Stack<>();
        min = new Stack<>();
    }

    public void push(int x) {
        if(!min.isEmpty()){
            if(x<=min.peek()) min.push(x);
        }else{
            min.push(x);
        }

        st.push(x);
    }

    public void pop() {
        if(st.peek().equals(min.peek())) min.pop();
        st.pop();
    }

    public int top() {
        return st.peek();
    }

    public int getMin() {
        return min.peek();
    }

    public static void main(String args[]){

        MinStack obj = new MinStack();

        obj.push(512);
        obj.push(-1024);
        obj.push(-1024);
        obj.push(512);

        System.out.println(obj.getMin());

        obj.pop();
        System.out.println(obj.getMin());

        obj.pop();
        System.out.println(obj.getMin());

        obj.pop();
        System.out.println(obj.getMin());
    }

}

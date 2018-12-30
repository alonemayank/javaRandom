import java.util.PriorityQueue;

/**
 * Created by apurvatripathi on 12/29/18.
 */
public class priorityQ {

    PriorityQueue<Integer> pq;
    public priorityQ(){
        pq =  new PriorityQueue<>((x,y) -> y-x);
    }

    public int highestNumber(){
        return pq.peek();
    }

    public void add(int n){
        pq.add(n);
    }

    public void remove(){
        pq.poll();
    }

    public static void main(String args[]){
        priorityQ obj = new priorityQ();

        obj.add(5);
        obj.add(6);
        obj.add(7);
        obj.add(2);
        obj.add(1);
        obj.add(10);

        System.out.println(obj.highestNumber());
        obj.remove();
        System.out.println(obj.highestNumber());
    }
}

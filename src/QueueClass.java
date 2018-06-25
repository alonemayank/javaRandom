import java.util.*;

/**
 * Created by apurvatripathi on 5/17/18.
 */
public class QueueClass {

    public static void main(String args[]){
        Queue<Integer> q = new LinkedList<>();

        q.add(1);
        System.out.println(q.peek());

        HashMap<String,Integer> hm = new HashMap<>();

        hm.put("One",1);
        System.out.println(hm.get("One"));
        hm.remove("One");
        hm.put("Two",2);

        Iterator<Integer> it = hm.values().iterator();

        while(it.hasNext()){
            System.out.println(it.next());
            it.remove();
        }

        hm.put("Two",2);

        hm.put("One",1);

        for(Integer i : hm.values()){
            System.out.println(i);

        }

        ArrayList<String> names = new ArrayList();
        names.add("Chaitanya");
        names.add("Steve");
        names.add("Jack");

        Iterator it1 = names.iterator();

        while(it1.hasNext()) {
            //String obj = (String)it1.next();
            System.out.println(it1.next());
        }

        //Integer arr[] = new Integer[5];

        String s = "Hello";
        StringBuilder sb = new StringBuilder(s);
        System.out.print(sb.reverse().toString());
        System.out.println();

        for(int i = s.length();i>0;i--){
            System.out.print(s.charAt(i-1));
        }
    }
}

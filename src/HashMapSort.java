import java.util.*;

/**
 * Created by apurvatripathi on 5/8/18.
 */
public class HashMapSort {

    public void sortHashMap(LinkedHashMap hm){
        ArrayList<String> values = new ArrayList<>(hm.values());
        Collections.sort(values);
        Iterator<String> it = values.iterator();
        LinkedHashMap<String,String> lhm = new LinkedHashMap<>();

        while(it.hasNext()){
            String s = it.next().toString();
            Iterator<String> key = hm.keySet().iterator();
            while(key.hasNext()){
                String step = key.next();
                if(hm.get(step).toString().equals(s)){
                    lhm.put(step,s);
                    break;
                }
            }

        }

        Iterator<String> print = lhm.keySet().iterator();

        while(print.hasNext()){
            String temp = print.next();
            System.out.println(temp+" : "+lhm.get(temp));
        }

    }
}

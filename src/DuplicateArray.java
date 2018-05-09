import java.util.HashSet;

/**
 * Created by apurvatripathi on 5/9/18.
 */
public class DuplicateArray {
    public <E> void duplicate(E[] arr){
        HashSet<E> hs = new HashSet<E>();
        boolean flag = false;
        for(E element: arr){
            if(!hs.contains(element)){
                hs.add(element);
                flag=true;
            }else{
                flag = false;
                System.out.println("Found duplicate");
                break;
            }
        }

        if(flag){
            System.out.println("No Duplicate");
        }

    }
}

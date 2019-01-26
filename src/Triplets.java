import java.util.*;

/**
 * Created by apurvatripathi on 1/25/19.
 */
public class Triplets {

    long find3Numbers(long t, List<Integer> d)
    {

        int l=0;
        int r=0;
        int n = d.size();

        Collections.sort(d);
        long count = 0;

        for (int i = 0; i < n - 2; i++) {
            l = i + 1;
            r = n - 1;
            while (l < r) {
                if (d.get(i) + d.get(l) + d.get(r) == t) count++;
                else if (d.get(i) + d.get(l) + d.get(r) < t) l++;
                else r--;
            }
        }

       return count;
    }

    public static void main(String args[]){
        Triplets obj = new Triplets();

    }
}



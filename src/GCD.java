/**
 * Created by apurvatripathi on 5/8/18.
 */
public class GCD {
    public int gcd(int x, int y){

        if(y>x){
            return gcd(y,x);
        }

        if(y%x==0){
            return x;
        }

        return gcd(y,x%y);
    }
}

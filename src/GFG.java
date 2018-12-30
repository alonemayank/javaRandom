/**
 * Created by apurvatripathi on 10/12/18.
 */

import java.io.*;

class GFG
{
    public static int getValue(char c){
        if(c >= '0' && c<= '9') return (int)c - '0';
        return (int)c - 'A' + 10;
    }

    public static int toDeci(String s, int base){
        int result = 0;
        int power = 1;

        for(int i=s.length()-1;i>=0;i--){
            if(getValue(s.charAt(i)) >=base ){
                return -1;
            }

            result += getValue(s.charAt(i)) * power;
            power *= base;
        }

        return result;

    }

    // Driver code
    public static void main (String[] args)
    {
        String str = "F";
        int base = 16;
        System.out.println("Decimal equivalent of "+
                str + " in base "+ base +
                " is "+ " "+
                toDeci(str, base));
    }
}
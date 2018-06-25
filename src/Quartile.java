/**
 * Created by apurvatripathi on 6/25/18.
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Quartile {


    /*
    public static void quartile(int start, int end, int[] arr){
        int size = end-start+1;
        //System.out.println(size/2);
        int q = 0;
        if(size%2!=0){
            q=arr[start+(size/2)+1];
        }else{
            q=(arr[start+(size/2)]+arr[start+(size/2)+1])/2;
        }
        System.out.println(q);

    }
    */

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] arr = new int[size];
        int q1,q2,q3;

        for(int i=0;i<size;i++){
            arr[i] = scan.nextInt();
        }
        Arrays.sort(arr);
        if(size%2!=0){
            //quartile(0,(input/2)-1,arr);
            q2 = arr[size/2];

            int newSize = size/2;
            q1 = (arr[newSize/2]+arr[(newSize/2)-1])/2;

            int start = (size/2)+1;
            newSize = (start+size)/2;

            q3 = (arr[newSize]+arr[(newSize)-1])/2;
        }else if(size%4!=0){
            q2 = (arr[size/2]+arr[(size/2)-1])/2;

            int newSize = (size/2)-1;

            q1 = arr[newSize/2];

            newSize = (size/2)+size;

            q3 = arr[newSize/2];
        }else{
            q2 = (arr[size/2]+arr[(size/2)-1])/2;
            int newSize = size/2;
            q1 = (arr[newSize/2]+arr[(newSize/2)-1])/2;

            int start = (size/2)+1;
            newSize = (start+size)/2;

            q3 = (arr[newSize]+arr[(newSize)-1])/2;
        }

        System.out.println(q1);
        System.out.println(q2);
        System.out.println(q3);

        /*quartile(0,input-1,arr);

        if(input%2!=0){
            quartile((input/2)+1,input-1,arr);
        }else{
            quartile((input/2),input-1,arr);
        }*/





    }
}
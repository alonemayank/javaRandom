import java.util.ArrayList;
import java.util.regex.*;

/**
 * Created by apurvatripathi on 10/11/18.
 */
public class StringToInt {
    public ArrayList convert(String s, int base){
        char[] arr = s.toCharArray();
        ArrayList<String> arrList = new ArrayList<>();
        Pattern match1 = Pattern.compile("[0-9]+");
        Matcher found = match1.matcher(s);
        while(found.find()){
            arrList.add(found.group());
            //System.out.println(found.groupCount());
        }
        int temp = 0;
        int result = 0;

        for(int i=arr.length-1;i>=0;i--){
            if(arr[i] == '0') result += Math.pow(base,temp++)*0;
            else if(arr[i] == '1') result += Math.pow(base,temp++)*1;
            else if(arr[i] == '2') result += Math.pow(base,temp++)*2;
            else if(arr[i] == '3') result += Math.pow(base,temp++)*3;
            else if(arr[i] == '4') result += Math.pow(base,temp++)*4;
            else if(arr[i] == '5') result += Math.pow(base,temp++)*5;
            else if(arr[i] == '6') result += Math.pow(base,temp++)*6;
            else if(arr[i] == '7') result += Math.pow(base,temp++)*7;
            else if(arr[i] == '8') result += Math.pow(base,temp++)*8;
            else if(arr[i] == '9') result += Math.pow(base,temp++)*9;
            else{
                if(temp != 0){
                    System.out.println(result);
                    temp = 0;
                    result = 0;
                }

            }

        }


        return arrList;
    }



    public static void main(String[] args){
        StringToInt obj = new StringToInt();
        System.out.println(obj.convert("qwerty8qwerty456", 9));
    }
}

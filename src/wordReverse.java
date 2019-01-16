/**
 * Created by apurvatripathi on 1/7/19.
 */
public class wordReverse {

    public String reverseWords(String s) {
        StringBuffer sb = new StringBuffer();
        String[] arr = s.split("\\s+");

        for(int i=arr.length-1; i>=0; i--) sb.append(" "+arr[i]);
        return sb.toString().trim();
    }



    public static void main(String args[]){
        wordReverse obj = new wordReverse();
        System.out.println(obj.reverseWords("Man is God"));
    }
}

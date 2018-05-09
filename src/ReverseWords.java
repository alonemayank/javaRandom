/**
 * Created by apurvatripathi on 5/9/18.
 */
public class ReverseWords {

    public void reverseWords(String sentence){
        String[] reverse = sentence.split(" ");
        String result="";
        for(int i = reverse.length-1;i>=0;i--){
            if(i==0){
                result += reverse[i];
            }else {
                result += reverse[i] + " ";
            }
        }

        System.out.println(result);
    }
}

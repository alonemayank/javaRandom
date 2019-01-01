import java.util.Collections;

// Java program to print all permutations of a
// given string.
public class Permutation
{
    public static void main(String[] args){
        String str = "MARTY";
        int n = str.length();
        Permutation permutation = new Permutation();
        permutation.permute(new StringBuffer (str),new StringBuffer (""));
    }


    private void permute(StringBuffer str, StringBuffer ch){
        if(str.length() == 0){
            System.out.println(ch);
        }

        for(int i = 0; i< str.length(); i++){
            char c = str.charAt(i);
            ch.append(Character.toString(c));
            str.deleteCharAt(i);

            permute(str,ch);

            str.insert(i,Character.toString(c));
            ch.deleteCharAt(ch.length()-1);
        }

        String temp = "";

    }



}

// This code is contributed by Mihir Joshi

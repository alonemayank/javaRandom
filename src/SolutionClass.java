import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by apurvatripathi on 10/31/18.
 */


public class SolutionClass {
    static List<String> charityAllocation(List<Float> profits) {
        List<String> ls = new ArrayList<String>();
        float donation[] = new float[3];

        for(Float i : profits){
            if(donation[0] <= donation[1] && donation[0] <= donation[2]){
                donation[0] += i;
                ls.add("A");
            }else if(donation[1] <= donation[2]){
                donation[1] += i;
                ls.add("B");
            }else{
                donation[2] += i;
                ls.add("C");
            }
        }



        return ls;
    }

    public String reverseWords(String s) {
        s = s.replace("\\s{2,}"," ");
        String[] str1 = s.split(" ");
        String temp = "";
        for(int i = str1.length-1; i>=0;i--){
            String st = str1[i].replace("\\s","");
            if(i==str1.length-1) temp+= st;
            else if(!st.equals("")) temp+= " "+st;
        }

        List<String> allMatches = new ArrayList<String>();

        Matcher m = Pattern.compile("\\w+").matcher(s);
        String str = "";
        while (m.find()) {
            allMatches.add(m.group());
        }

        for(int i=allMatches.size()-1;i>=0;i--){
            if(i==allMatches.size()-1) str += allMatches.get(i);
            else str += " "+allMatches.get(i);
        }
        return temp;

    }

    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()) return false;
        HashMap<Character, Integer> hm1 = new HashMap<>();
        HashMap<Character, Integer> hm2 = new HashMap<>();

        for(int i = 0; i<s.length();i++){
            if(!hm1.containsKey(s.charAt(i))){
                hm1.put(s.charAt(i), 1);
            }else{
                hm1.put(s.charAt(i), hm1.get(s.charAt(i))+1);
            }
        }

        for(int i = 0; i<t.length();i++){
            if(!hm2.containsKey(t.charAt(i))){
                hm2.put(t.charAt(i), 1);
            }else{
                hm2.put(t.charAt(i), hm2.get(t.charAt(i))+1);
            }
        }

        for (Map.Entry<Character,Integer> entry : hm1.entrySet()){
            System.out.println("Key = " + entry.getKey() +
                    ", Value = " + entry.getValue());
        }

        System.out.println("\n\n");

        for (Map.Entry<Character,Integer> entry : hm2.entrySet()){
            System.out.println("Key = " + entry.getKey() +
                    ", Value = " + entry.getValue());
        }


        for (Map.Entry<Character,Integer> entry : hm1.entrySet()){
            if(hm2.containsKey(entry.getKey())){
                if(!entry.getValue().equals(hm2.get(entry.getKey()))){
//                    System.out.println("\n\n\n\n");
//                    System.out.println();
//
//                    System.out.println(entry.getValue()+ "=" + hm2.get(entry.getKey())+" is " + (hm2.get(entry.getKey()) == entry.getValue()));
                    return false;
                }

            }else{
                return false;
            }
        }

        return true;
    }

    public static void main(String args[]){
        SolutionClass obj = new SolutionClass();
        System.out.println(obj.reverseWords(" 1"));
        //System.out.println(obj.isAnagram(s1,s2));
        //List<String> res = charityAllocation(profits);
    }
}

/*
 for(Integer i : studentScoreArray){
         Integer maxScore = Collections.max(studentScoreArray);
         Integer stId = studentScoreArray.indexOf(maxScore);

         List<Integer> choice = studentSchoolPreferencesArray.get(stId);

        for(Integer j : choice){
        if(schoolSeatsArray.get(j) > 0){
        schoolSeatsArray.set(j, schoolSeatsArray.get(j)-1);
        break;
        }
        }
        }

        */

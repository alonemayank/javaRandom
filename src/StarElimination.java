/**
 * Created by apurvatripathi on 5/9/18.
 */
public class StarElimination {

    public void eliminate(String str){
        str=str.replace("*","");
        System.out.println(str);
    }

    public void eliminateAdvance(String str){
        System.out.println(str.replaceAll(".\\*+.",""));
    }
}

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Stack;

//Class
class Base{
    int number1;

    public Base(int a, int b){
        this.number1=a*b;
    }
    //Calling another constructor from within
    public Base(int x){
        this(x,x);
    }

    public String toString(){
        return "\nCall to another constructor and multiplication of another number is: "+number1;
    }

}

class Solution {
    static Stack<Integer> st1 = new Stack();
    static Stack<Integer> st2 = new Stack();

    //Generic function

    public static <E> void gens(E[] gen){
        for(E element: gen){
            System.out.println(element);
        }
    }
    //Balanced Parenthesis
    public static void stackParan(String in){
        Stack<Character> st = new Stack();
        //Stack<Character> st2 = new Stack();

        char[] paran = in.toCharArray();
        boolean flag = false;

        for(char c: paran){
            if(c == '(' || c=='{' || c=='['){
                st.push(c);
            }else{
                if(st.peek() == '(' && c==')'){
                    st.pop();
                    flag=true;
                }else if(st.peek() == '{' && c=='}'){
                    st.pop();
                    flag=true;
                }else if(st.peek() == '[' && c==']'){
                    st.pop();
                    flag=true;
                }else{
                    System.out.println("No");
                    flag=false;
                    break;
                }
            }
        }
        if (flag == true) {
            System.out.println("Yes");
        }
    }

    //String reverse
    public static void reverseString(String s){
        StringBuilder sb = new StringBuilder(s);
        System.out.println(sb.reverse());
        String temp = "";
        char[] arr = s.toCharArray();
        for(int i=arr.length-1;i>=0;i--){
            temp+=arr[i];
        }
        System.out.println(temp);
    }

    //Max fwd difference in array
    public static void maxFWD(int[] arr){
        Arrays.sort(arr);
        System.out.println(Math.abs(arr[0]-arr[arr.length-1]));

    }

    //Q using stack
    public static void qStack(int choice, int number){


        if(choice == 1){

                st1.push(number);

        }else{
            if(!st2.isEmpty()){
                st2.pop();
            }else{
                while(!st1.isEmpty()){
                    st2.push(st1.pop());
                }
                st2.pop();
            }
        }

    }

    public static void main(String[] args) {

        stackParan("[{()}]");
        stackParan("[{()]");

        reverseString("Hello");
        int[] temparr= {1,2,3,4,10,7,1};
        maxFWD(temparr);

        qStack(1,1);
        qStack(1,2);
        qStack(1,3);
        qStack(2,0);
        qStack(2,1);
        qStack(2,1);
        qStack(1,5);
        qStack(2,5);

        Integer[] i1 = {1,2,3,4,5};
        gens(i1);


        Base b = new Base(5);
        System.out.println(b.toString());
        GCD gcd = new GCD();
        System.out.println(gcd.gcd(2,25));
        System.out.println(gcd.gcd(5,25));
        System.out.println(gcd.gcd(25,0));

        HashMapSort hms = new HashMapSort();

        LinkedHashMap<String,String> lhm = new LinkedHashMap<>();

        lhm.put("One","3");
        lhm.put("Two","5");
        lhm.put("Three","6");
        lhm.put("Four","7");
        lhm.put("Five","1");

        hms.sortHashMap(lhm);


    }
}
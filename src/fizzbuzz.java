import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by apurvatripathi on 12/10/18.
 */
public class fizzbuzz {


    public static void fizzBuzz1(int n){
        for(int i = 1; i< n; i++){
            if(i%3 == 0 && i%5 == 0) System.out.println("FizzBuzz");
            else if(i%3 == 0) System.out.println("Fizz");
            else if(i%5 == 0) System.out.println("Buzz");
            else System.out.println(i);
        }
    }

    public static void fizzBuzz2(int i, int limit){
        if(i >= limit) return;
        if(i%3 == 0 && i%5 == 0) System.out.println("FizzBuzz");
        else if(i%3 == 0) System.out.println("Fizz");
        else if(i%5 == 0) System.out.println("Buzz");
        else System.out.println(i);

        fizzBuzz2(++i,limit);
    }

    public static void fizzBuzz3(int n){

        String result = "";
        for(int i=1; i < n;i++){
            result = "";
            if(i%3 == 0) result+="Fizz";
            if(i%5 == 0) result+="Buzz";
            if(i%3 != 0 && i%5 != 0) result+=i;
            System.out.println(result);
        }


    }

    public static int fizzBuzz3(int i, int j){
        return 2;
    }

    public static void main(String args[]){

        String[][] arr = {{"a", "b", "c"},{"d","e","f"}};
        int[][] arr2 = {{1,2,3},{4,5,6}};

        HashMap<String, Integer> mp = new HashMap<>();

        Iterator it = mp.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry)it.next();
            System.out.println(pair.getKey() + " = " + pair.getValue());
            it.remove(); // avoids a ConcurrentModificationException
        }


        HashSet<String> set = new HashSet<String>();

        // Use add() method to add elements into the Set
        set.add("Welcome");
        set.add("To");
        set.add("Geeks");
        set.add("4");
        set.add("Geeks");

        // Displaying the HashSet
        System.out.println("HashSet: " + set);

        // Creating an iterator
        Iterator value = set.iterator();

        // Displaying the values after iterating through the set
        System.out.println("The iterator values are: ");
        while (value.hasNext()) {
            System.out.println(value.next());
        }

        fizzBuzz1(100);
        fizzBuzz2(1,100);
        fizzBuzz3(100);



        // creating the Objects of Geek class.
        Geek g1 = new Geek("aa", 1);
        Geek g2 = new Geek("aa", 1);

        // comparing above created Objects.
        if(g1.hashCode() == g2.hashCode())
        {

            if(g1.equals(g2))
                System.out.println("Both Objects are equal. ");
            else
                System.out.println("Both Objects are not equal. ");

        }
        else
            System.out.println("Both Objects are not equal. ");

        Base2 obj5= new Derived();
        //obj5.display();
        obj5.print();
        System.out.println(obj5 instanceof Base2);

    }


}

// Java program to illustrate
// how hashCode() and equals() methods work


class Geek
{

    public String name;
    public int id;

    Geek(String name, int id)
    {

        this.name = name;
        this.id = id;
    }

    @Override
    public boolean equals(Object obj)
    {

        // checking if both the object references are
        // referring to the same object.
        if(this == obj)
            return true;

        // it checks if the argument is of the
        // type Geek by comparing the classes
        // of the passed argument and this object.
        // if(!(obj instanceof Geek)) return false; ---> avoid.
        if(obj == null || obj.getClass()!= this.getClass())
            return false;

        // type casting of the argument.
        Geek geek = (Geek) obj;

        // comparing the state of argument with
        // the state of 'this' Object.
        return (geek.name == this.name && geek.id == this.id);
    }

    @Override
    public int hashCode()
    {


        return this.id;
    }

}

class Base2 {
    private static void display() {
        System.out.println("Static or class method from Base");
    }

    public void print() {
        System.out.println("Non-static or instance method from Base");
    }
}
    class Derived extends Base2 {
        public static void display() {
            System.out.println("Static or class method from Derived");
        }

        public void print() {
            System.out.println("Non-static or instance method from Derived");
        }
    }



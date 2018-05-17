/**
 * Created by apurvatripathi on 5/13/18.
 */

class A
{
    public A(){
        System.out.println("A constructor");
    }


    int x = 10;
    int foo(){
        return x;
    }
}

class B extends A
{
    protected B(){
        System.out.println("B constructor");
    }
    int x = super.x + 10;
    int foo(){
        return x;
    }
}



public class RunTimePolyMor {

    public static void main(String[] args) {

        A a = new B();
        //B b = new A();
        a = (A)a;

        System.out.println(a.x);
        System.out.println(a.foo());
}

}

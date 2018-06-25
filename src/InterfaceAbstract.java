/**
 * Created by apurvatripathi on 5/16/18.
 */

interface vehicle{
    public abstract void steer();
    public abstract void breaking();
}


abstract class systems{
    int data;

    private void display(){
        System.out.println("Abstract display");
    }

    public void random(){
        System.out.println("Abstract Random");
    }

    abstract void warn();
}

class systemExtend extends systems{


    @Override
    void warn() {
        System.out.println("Warning");
    }

    class nested{
        void printNested(){
            warn();
            System.out.println("Nested class method");
        }
    }
}

class ExampleClass{
    protected void useful(){
        System.out.println("useful method");
        AnotherExample anotherExample = new AnotherExample();
        anotherExample.useful();
    }

}

class AnotherExample extends ExampleClass{
    @Override
    public void useful(){
        System.out.println("Another Useful Method");
        //useful();
    }
}


class InterfaceAbstract extends ExampleClass implements vehicle{

    @Override
    public void steer() {
        System.out.println("Overrid Steer");
    }

    @Override
    public void breaking() {
        System.out.println("Overide breaking");
    }

    public void printAll(){
        super.useful();
    }

    @Override
    protected void useful(){
        System.out.println("Another useful method in main");
    }

    public static void main(String args[]){
        InterfaceAbstract object = new InterfaceAbstract();
        object.printAll();
        object.useful();
        systemExtend se = new systemExtend();
        systemExtend.nested seInner = se.new nested();
        seInner.printNested();
    }
}

/**
 * Created by apurvatripathi on 5/17/18.
 */
class MyClass {
    private final String value;
    private final String type;

    public MyClass(int x){
        this(Integer.toString(x), "int");
    }

    public MyClass(boolean x){
        this(Boolean.toString(x), "boolean");
    }

    public String toString(){
        return value;
    }

    public String getType(){
        return type;
    }

    private MyClass(String value, String type){
        this.value = value;
        this.type = type;
    }
}


public class PrivateConstructor {

}

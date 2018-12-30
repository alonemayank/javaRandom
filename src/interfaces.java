import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

interface calculate {
    void cal(int item);
}
class displayA implements calculate {
    int x;
    public void cal(int item) {
        x = item * item;
    }
}
class displayB implements calculate {
    int x;
    public void cal(int item) {
        x = item / item;
    }
}

    class recursion {
        int fact(int n) {
        int result;
        if (n == 1)
        return 1;
        result = fact(n - 1) * n;
        return result;
        }
        }
class A1 {
    int i;
    public void display() {
        System.out.println(i);
    }
}
class B1 extends A1 {
    int j;
    public void display() {
        System.out.println(j);
    }
}
class interfaces {
    public static void main(String args[]) {
        int array_variable [] = new int[10];
        for (int i = 0; i < 10; ++i) {
            array_variable[i] = i;
            System.out.print(array_variable[i] + " ");
            i++;

        }
    }
}
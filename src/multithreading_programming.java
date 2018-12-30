
class newthread implements Runnable {
    Thread t1,t2;
    newthread() {
        t1 = new Thread(this,"Thread_1");
        t2 = new Thread(this,"Thread_2");
        t1.start();
        t2.start();
    }
    public void run() {
        t2.setPriority(Thread.MAX_PRIORITY);
        System.out.print(t1.equals(t2));
    }
}
class multithreaded_programing {

    static int addThreeNumbers(int x, int y, int z){

        return x+y+z;

    }

    public static void main(String args[]) {
        new newthread();
        int x = 2;
        int y = x++;
        x = --y;
        System.out.println(x);
        System.out.println(y);
        System.out.println();
        int a = 1;
        int b = 2;
        int c = 3;
        int d = addThreeNumbers(a,b,c);
        System.out.println(d);
    }
}
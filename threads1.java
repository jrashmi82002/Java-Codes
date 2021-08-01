import java.lang.Runnable;

public class threads1 implements Runnable {// by this way we can extend another class also with Runnable interface

    @Override
    public void run() {// overridden function of Thread class
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        threads1 t = new threads1();
        Thread t1 = new Thread(t);
        t1.start();// automatically run run() function of Thread class

    }
}
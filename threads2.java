import java.lang.Thread;

class printer extends Thread {
    public void run() {// run on start()
        System.out.println("Hi, welcome");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }

    public void print() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Data :" + i);
        }
    }

    public void pageno() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Pageno :" + i);
        }
    }
}

public class threads2 extends printer {
    public static void main(String[] args) {
        threads2 t1 = new threads2();
        Thread t = new Thread(t1);
        printer p1 = new printer();
        Thread p = new Thread(t1);
        t1.start();
        p1.start();// if two threads for same are started then they may lead to irregular output
        t1.pageno();
        t.start();
        p.start();
        try {
            Thread.sleep(1000);// stops thread from working
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        p1.pageno();
        t1.print();
    }
}

import java.util.Scanner;
//import java.lang.*;

class exc extends Exception { // custom exception
    @Override
    public String toString() {
        return super.toString() + "selfmade";
    }
}

public class exchandling {

    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        try { // try
            a = sc.nextInt();
            System.out.println(a / 0);
        } catch (ArithmeticException e1) { // catch
            System.out.println("error occured! " + e1);
        } catch (NullPointerException e1) {
            System.out.println(e1);
        } finally { // finally
            System.out.println("Final");
        }
        try {
            int b = sc.nextInt();
            System.out.println(b / 0);
            sc.close();
            throw new exc(); // throw
        } catch (Exception a1) {

            System.out.println(a1.toString() + "myexc");
            a1.printStackTrace();
        }

    }
}
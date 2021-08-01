import java.util.Scanner;

public class input_output {

    public static void main(String[] args) { // different data types and formatting
        Scanner sc = new Scanner(System.in); // Java input
        int x = sc.nextInt();
        System.out.println(x + " entered");
        System.out.println("hello java");
        System.out.print(5.66 + "\n");
        System.out.printf("%.2f%n", 52.669); // .2 means 2 digits after decimal rounded off
        System.out.printf("%f%n", 5.66);
        System.out.printf("%5.2s%n", "obj"); // 5.2 means 5 length of String and 2 starting alphabets from the string
        String s = sc.nextLine();
        System.out.println(s);
        sc.close();
    }
}
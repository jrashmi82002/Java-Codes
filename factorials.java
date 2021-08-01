
import java.util.Scanner;

public class factorials {
    public static void main(String[] args) {
        int a, ans = 1;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        for (int i = 1; i <= a; i++) {
            ans *= i;
        }
        System.out.println(ans);
        sc.close();

    }
}

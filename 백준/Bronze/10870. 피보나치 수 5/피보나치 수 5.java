import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();

        if (n <= 1) {
            System.out.println(n);
            return;
        }

        int a = 0, b = 1;
        for (int i = 2; i <= n; i++) {
            b = a + b;
            a = b - a;
        }

        System.out.println(b);
    }
}

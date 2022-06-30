import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print(" Input a: ");
        int a = scanner.nextInt();

        System.out.print(" Input b: ");
        int b = scanner.nextInt();

        System.out.print(" Input c: ");
        int c = scanner.nextInt();

        boolean result = a != b && b != c && a != c;

        String msg = result ? "yes, all numbers are not equal."
                : " No, numbers aren't different";

        System.out.println(msg);

        scanner.close();
    }
}


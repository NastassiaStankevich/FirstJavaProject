import java.util.Scanner;

class Parallelogramlogic{
    public static double calculateSquare(double h, double b) {
        return h * b;
    }

    public static double calculatePerimetr(double a, double b) {
        return (a + b) * 2;

    }
}

public class Task7 {
    public static void main(String[] args) {
        System.out.println(Parallelogramlogic.calculateSquare(5,6) ==30);
        System.out.println(Parallelogramlogic.calculateSquare(2.5,6) ==30);
        System.out.println(Parallelogramlogic.calculateSquare(1,6) ==30);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Input sides a and b: ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();

        System.out.print("Input height: ");
        double h = scanner.nextDouble();

        double s = Parallelogramlogic.calculateSquare(h, b);
        double p = Parallelogramlogic.calculatePerimetr(a, b);

        String msg = String.format("Parallelogram perimetr is %.2f", p);
        msg += String.format("\nParallelogram square is %.2f", s);

        System.out.println(msg);

    }
}

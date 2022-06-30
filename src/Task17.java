import java.util.Scanner;

public class Task17 {
    public static long factorial(int number) {

        if (number < 0){
            return 0;
        }


        long f = 1;

        for (int i = 2; i <= number; i++){
            f *= i;
        }
        return f;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        do {
            System.out.print("input you number: ");
            number = scanner.nextInt();
        } while(number <0);

        long result = factorial(number);

        String msg = String.format("Result: %d! = %d", number, result);
        System.out.println(msg);
    }
}


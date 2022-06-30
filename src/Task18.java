import java.util.Scanner;

public class Task18 {
    public static int countSearch(int number){
        if (number <= 0) {
            return 0;
        }

        int count = 0;

        while( number > 0){
            count++;
            number /= 2;
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        do {
            System.out.print("input number:");
            number= scanner.nextInt();
        } while( number <= 0);

        int result = countSearch(number);

        System.out.println("Result: " + result);
    }
}

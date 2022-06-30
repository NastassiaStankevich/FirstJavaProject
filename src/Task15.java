import java.util.Random;
import java.util.Scanner;


public class Task15 {

    public static int countTails(int number) {
        if(number <= 0){ return 0;}
        Random random = new Random();
        int count = 0;

        while (number > 0) {
            if (random.nextBoolean()) {
                count++;
            }

            number--;
        }
        return count;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        do {
            System.out.print("Input count of throwing : ");
            number = scanner.nextInt();
        } while(number <=0);

        int tail = countTails(number);
        int head = number - tail;
        String msg = String.format("Result : heads = %d, tails = %d", head, tail);
        System.out.println(msg);
    }
}


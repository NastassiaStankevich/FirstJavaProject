import javax.xml.bind.SchemaOutputResolver;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input your number: ");
        int number = scanner.nextInt();

        number = number >= 0 ? number : -number;

       int sum = number % 10;

       number /= 10;
       sum += number % 10;

        number /= 10;
        sum += number % 10;

        number /= 10;
        sum += number % 10;

        sum += number / 10;


        String msg = String.format("Sum of number digits = %d" , sum);

        System.out.println(msg);
    }

}

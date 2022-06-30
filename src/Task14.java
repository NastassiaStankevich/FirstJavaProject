import java.util.Scanner;

class DragonLogic {

    public static final int FIRST_PERIOD = 200;
    public static  final  int SECOND_PERIOD = 300;

    public static int calculateHeads(int age) {
        if (age <= 0) {
            return 0;
        }
        int head = 3;
        if (age <= FIRST_PERIOD) {
            head += age * 3;
        } else {
            if (age <= SECOND_PERIOD) {
                head += FIRST_PERIOD * 3 + (age - FIRST_PERIOD) * 2;
            } else {
                head += FIRST_PERIOD * 3 + (SECOND_PERIOD - FIRST_PERIOD) * 2
                        + (age - SECOND_PERIOD);
            }
        }

        return head;

    }

}

public class Task14 {
    public static void main(String[] args) {

        System.out.println(DragonLogic.calculateHeads(100));

    }
}

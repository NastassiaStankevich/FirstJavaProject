public class Task22 {
    public static boolean checkUnitDigit(long number){

        boolean flag = true;

        label :

        while (number > 0){
            long digit = number % 10;
            number /= 10;
            long copyNumber = number;

            while ( copyNumber > 0) {
                long t = copyNumber % 10;
                if (digit == t){
                    flag = false;
                    break label;
                }
                copyNumber /= 10;

            }


        }

        return flag;
    }

    public static void main(String[] args) {
        System.out.println(checkUnitDigit(123456789));
        System.out.println(checkUnitDigit(1657645689));
        System.out.println(checkUnitDigit(1237989));
        System.out.println(checkUnitDigit(123456789));
    }
}

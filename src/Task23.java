public class Task23 {

    public static String getOnlyEvenNumber(int number){

        StringBuilder builder = new StringBuilder();


        int i =number - (number % 2 == 0 ? 0:1);
        for (; i >= 2 ; i-= 2 ) {
              builder.append(i).append(" ");
        }
        return builder + " ";
    }

    public static void main(String[] args) {
        System.out.println(getOnlyEvenNumber(202));
    }
}

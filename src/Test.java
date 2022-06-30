public class Test {
    public static void main(String[] args) {
        int age = 27;
        int month = age * 12;
        int day = age * 365;
        int hours = day * 24;
        int min = hours * 60;
        long sec = min * 60;
        long millisecond = sec * 1000;

        System.out.println(age * 12 + " month");
        System.out.println(age * 365 + " days");
        System.out.println(age * 365 * 24 + " hours");
        System.out.println(age * 365 * 24 * 60 + " min");
        System.out.println(age * 365 * 24 * 60 * 60 + " sec");
        System.out.println(age * 365 * 24 * 60 * 60 * 1000 + " millisecond");
    }
}

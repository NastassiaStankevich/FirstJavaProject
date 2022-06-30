class  SecondWestFeedBack {
    public static String getFeedback(char mark) {
        String msg;

        mark =Character.toUpperCase(mark);

        switch(mark) {
            case 'F': msg = "very bad!!"; break;
            case 'D': msg = "So-so"; break;
            case 'C': msg = "Good"; break;
            case 'B': msg = "very good"; break;
            case 'A': msg = "well done"; break;
            default: msg = " Mark was wrong!!"; break;
        }
        return msg;
    }
}

public class Task12 {
    public static void main(String[] args) {
        char mark = 'C';
        String result = SecondWestFeedBack.getFeedback(mark);
        System.out.println(result);

    }
}
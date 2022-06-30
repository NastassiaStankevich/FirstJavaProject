class  WestFeedBack {
    public static String getFeedback(char mark) {
        String msg;

        mark =Character.toUpperCase(mark);

        if (mark == 'F') {
            msg = "very bad!!";
        } else {
            if (mark == 'D'){
                msg = "So-so";
            } else {
                if (mark == 'C'){
                    msg = "Good";
                } else {
                    if (mark == 'B'){
                        msg = "Very good";
                    }  else if( mark == 'A'){
                        msg = "Well done";
                    } else { msg= "Mark was wrong!!";
                    }
                }
            }
        }

        return msg;
    }
}

public class Task11 {
    public static void main(String[] args) {
        char mark = 'c';
        String result = WestFeedBack.getFeedback(mark);
        System.out.println(result);

    }
}
class  FeedBack {
    public static String getFeedback(int mark) {
        String msg;

        if (mark < 0 || mark > 10)
        {
            return "Mark was wrong!!";
        }


        if (mark >= 0 && mark <= 3) {
            msg = "very bad!!";
        } else {
            if (mark == 4){
                msg = "So-so";
            } else {
                if (mark == 5 || mark == 6){
                    msg = "Good";
                } else {
                  if (mark == 7 || mark ==8){
                      msg = "Very good";
                  }  else {
                      msg = "Well done";
                  }
                }
            }
        }

    return msg;
    }
}

public class Task10 {
    public static void main(String[] args) {
        int mark =17;
        String result = FeedBack.getFeedback(mark);
        System.out.println(result);

    }
}
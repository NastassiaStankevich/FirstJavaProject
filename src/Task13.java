class DateLogic {
    public static String getWeekDay(int day) {
        String msg = " Error, please, try again :)";

        switch(day) {
            case 1: msg = "Monday"; break;
            case 2: msg = "Tuesday"; break;
            case 3: msg = "Wednesday"; break;
            case 4: msg = "Thursday"; break;
            case 5: msg = "Friday"; break;
            case 6: msg = "Saturday"; break;
            case 7: msg = "Sunday"; break;
        }
        return msg;
    }

    public static String getSeason(String month) {
        String msg = "Error, try again";

        switch(month) {

            case "December":
            case "January":
            case "February": msg = "Winter"; break;
            case "March":
            case "April":
            case "May": msg = "Spring"; break;
            case "June":
            case "July":
            case "August": msg = "Summer"; break;
            case "September":
            case "October":
            case "November": msg = "Autumn"; break;

        }
        return msg;
    }

    public static String getSeason(int month) {
        String msg = "Error, try again";

        switch(month) {
            case 1: msg = "January"; break;
            case 2: msg = "February"; break;
            case 3: msg = "March"; break;
            case 4: msg = "April"; break;
            case 5: msg = "May"; break;
            case 6: msg = "June"; break;
            case 7: msg = "July"; break;
            case 8: msg = "August"; break;
            case 9: msg = "September"; break;
            case 10: msg = "November"; break;
            case 11: msg = "October"; break;
            case 12: msg = "December"; break;
        }
        return msg;

    }
}


public class Task13 {
    public static void main(String[] args) {
        int day = 0;
        int month = 7;


        String result = DateLogic.getWeekDay(day);
        result = DateLogic.getSeason(month);
        result = DateLogic.getSeason(month);
        System.out.println(result);

    }
}

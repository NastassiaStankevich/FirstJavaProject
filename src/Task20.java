public class Task20 {
    public static String getPythagorasTable( int size){
        StringBuilder msg = new StringBuilder();

        int j = 1;
        while (j <= size){

            int i =1;
            while (i <= size) {
                msg.append(String.format("%4d", i * j));
                i++;
            }
            msg.append("\n");
            j++;
        }

        return msg + "";

    }

    public static void main(String[] args) {
        System.out.println(getPythagorasTable(1000));
    }
}

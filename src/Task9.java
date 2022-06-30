class AvgLogic {
    public static double calcArithmeticalAvg(int a, int b, int c,int d) {
        return (a + b + c + d) / 4.0;
    }

    public static double calcGeometricalAvg(int a, int b, int c,int d) {
    return Math.pow(a * b * c * d, 1.0/4);
    }
}

public class Task9 {
    public static void main(String[] args) {
        System.out.println(AvgLogic.calcArithmeticalAvg(1,1,1,1)== 1);
        System.out.println(AvgLogic.calcArithmeticalAvg(1,2,3,4)== 2.75);
        System.out.println(AvgLogic.calcGeometricalAvg(1,1,1,1)==1);
        System.out.println(AvgLogic.calcGeometricalAvg(3,3,3,3)==3);
    }
}





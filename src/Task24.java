class Dragon {
    public static final int FIRST_PERIOD = 200;
    public static final int SECOND_PERIOD = 300;

    public String name;
    public int age;

    public int calculateHeads() {
        int head = 3;

        if (age <= FIRST_PERIOD) {
            head += age * 3;
        } else if (age <= SECOND_PERIOD) {
            head += 600 + (age - 200) * 2;
        } else {
            head += 200 * 3 + (300 - 200) * 2 + (age - 300);
        }
        return head;
    }

    public String getInfo() {
        return " Dragon: name = " + name + "; age = " + age
                + " heads = " + calculateHeads();
    }

}

public class Task24 {
    public static void main(String[] args) {
        Dragon dragon1 = new Dragon();
        dragon1.name = "Drakaris";
        dragon1.age = 150;

        Dragon dragon2 = new Dragon();
        dragon2.name = "Gorinich";
        dragon2.age = 250;

        System.out.println(dragon1.getInfo());
        System.out.println(dragon2.getInfo());

        System.out.println(dragon1.calculateHeads() > dragon2.calculateHeads());


    }
}

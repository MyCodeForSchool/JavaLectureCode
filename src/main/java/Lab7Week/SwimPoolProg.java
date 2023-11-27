package Lab7Week;

public class SwimPoolProg {
    public static void main(String[] args) {

        Pool ymca = new Pool("YMCA", 50);
        ymca.setName("Minneapolis YMCA");

        double totalSwam = ymca.distanceForLaps(6);
        System.out.println("The total distance is " + totalSwam);

        System.out.println(ymca);

        Pool como = new Pool("Como Park",25);
        System.out.println(como.distanceForLaps(10));

        System.out.println(como);

        Pool edina = new Pool("Edina", 50);
        System.out.println(edina.distanceForLaps(12));

        System.out.println(edina);




    }

    }

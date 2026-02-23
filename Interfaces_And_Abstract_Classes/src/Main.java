import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        // ---- BigDecimal Operations ----
        BigDecimal num1 = new BigDecimal("4.2545");
        double res1 = BigDecimalOps.roundToNearestHundredth(num1);
        System.out.println("4.2545 -> " + res1);

        BigDecimal num2 = new BigDecimal("1.2345");
        BigDecimal res2 = BigDecimalOps.reverseSignAndRoundToNearestTenth(num2);
        System.out.println("1.2345 -> " + res2);

        BigDecimal num3 = new BigDecimal("-45.67");
        BigDecimal res3 = BigDecimalOps.reverseSignAndRoundToNearestTenth(num3);
        System.out.println("-45.67 -> " + res3);

        System.out.println("---------------");

        // ---- Car Inventory System ----
        Car c1 = new Sedan("VIN001", "Toyota", "Camry", 120000);
        Car c2 = new UtilityVehicle("VIN002", "Jeep", "Wrangler", 80000, true);
        Car c3 = new Truck("VIN003", "Ford", "F-150", 65000, 13500.5);

        System.out.println("Cars:");
        System.out.println(c1.getInfo());
        System.out.println(c2.getInfo());
        System.out.println(c3.getInfo());

        System.out.println("---------------");

        // ---- Video Streaming Service ----
        Video v1 = new TvSeries("Breaking Bad", 49, 62);
        Video v2 = new Movie("Interstellar", 169, 8.6);

        System.out.println("Videos:");
        System.out.println(v1.getInfo());
        System.out.println(v2.getInfo());

        System.out.println("---------------");

        // ---- IntList ----
        IntArrayList listA = new IntArrayList();
        IntVector listB = new IntVector();

        int i = 1;
        while (i <= 25) {
            listA.add(i);
            listB.add(i);
            i++;
        }

        System.out.println("IntArrayList values:");
        System.out.println("first: " + listA.get(0));
        System.out.println("middle: " + listA.get(12));
        System.out.println("last: " + listA.get(24));
        System.out.println("size: " + listA.size());
        System.out.println("capacity: " + listA.capacity());

        System.out.println();

        System.out.println("IntVector values:");
        System.out.println("first: " + listB.get(0));
        System.out.println("middle: " + listB.get(12));
        System.out.println("last: " + listB.get(24));
        System.out.println("size: " + listB.size());
        System.out.println("capacity: " + listB.capacity());
    }
}
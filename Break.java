public class Break {
    public static void main(String[] args) {
        //CODE HERE

        // Perulangan dengan Break
        var counter = 2;

        while (true) {
            System.out.println("Perulangan " + counter);
            counter++;

            if (counter > 10) {
                break;
            }
        }
        System.out.println("Finshed");

        //Perulangan dengan Continue
        for (int counterx =1; counterx <= 10; counterx++) {
            if (counterx % 2 == 0) {
                continue;
            }
            System.out.println("Perulangan Ganjil " + counterx);
        }
    }
}

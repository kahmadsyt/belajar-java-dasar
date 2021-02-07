public class ForLoop {
    public static void main(String[] args) {
        //CODE HERE

        // Perulangan tanpa init statement
        var counter = 1;
        for (; counter <= 10 ;) {
            System.out.println("Perulangan ke " + counter);

            counter++;
        }

        //Perulangan dengan init Statement
        for (var counterx = 1; counterx <=10;) {
            System.out.println("No. " + counterx);

            counterx++;
        }

        //Perulangan dengan post Statement
        for (var countery =1; countery <=10; countery++) {
            System.out.println("Urutan ke " + countery);
        }

    }
}

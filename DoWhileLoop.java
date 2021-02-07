public class DoWhileLoop {
    public static void main(String[] args) {
        //CODE HERE

        //Perulangan tanpa do while
        var counter = 100;

        while (counter <= 10) {
            System.out.println("Perulangan " + counter);

            counter++;
        }

        //Perulangan dengan do while
        var counterx = 10;

        do {
            System.out.println("Perulangan " + counterx);
            counterx++;
        } while (counterx <= 10);
    }
}

public class RecursiveMethod {
    public static void main(String[] args) {
        //CODE HERE

        System.out.println(factorial(4));
        System.out.println(factorialRecursive(5));
        loop(10);

    }

    //Penyelesaian tanpa Recursive Method
    static int factorial(int value) {
        var result = 1;

        for (var counter = 1; counter <= value; counter++) {
            result *= counter;
        }

        return result;
    }

    //Penyelesaian dengan Recursive Method
    static int factorialRecursive(int value) {
        if (value == 1) {
            return 1;
        } else {
            return value * factorialRecursive((value - 1));
        }
    }

    //Contoh code error stackoverflow
    static void loop(int value) {
        if (value == 0) {
            System.out.println("Selesai");
        } else {
            System.out.println("Loop " + value);
            loop(value - 1);
        }
    }

}

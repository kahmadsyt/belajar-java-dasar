public class MethodVariableArgument {
    public static void main(String[] args) {
        //CODE HERE

        int[] values = {80,75,75};
        sayCongrats("Achmad Kamil", values);
        saySelamat("Nurul Khassanah", 80,80,80,80,80);
    }

    //Method Tanpa Variable Argument
    static void sayCongrats(String name, int[] values) {
        var total = 0;
        for (var value : values) {
            total += value;
        }

        var finalValue = total / values.length;

        if (finalValue >= 75) {
            System.out.println("Selamat " + name + ", Anda Lulus");
        } else {
            System.out.println("Maaf " + name + ", Anda Tidak Lulus");
        }
    }

    //Method Dengan Variable Argument
    static void saySelamat(String name, int... values) {
        var total = 0;
        for (var value : values) {
            total += value;
        }

        var finalValue = total / values.length;

        if (finalValue >= 75) {
            System.out.println("Selamat " + name + ", Anda Lulus");
        } else {
            System.out.println("Maaf " + name + ", Anda Tidak Lulus");
        }
    }
}

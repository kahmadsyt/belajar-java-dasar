public class TernaryOperator {
    public static void main(String[] args) {
        //CODE HERE

        //Statement if else tanpa ternary
        var nilai = 70;
        String ucapan;

        if (nilai >= 75) {
            ucapan = "Anda Lulus";
        } else {
            ucapan = "Anda Tidak Lulus";
        }

        System.out.println(ucapan);

        //Statement if else dengan ternary
        var nilai2 = 60;
        String greeting = nilai2 >= 75 ? "Anda Lulus" : "Anda Tidak Lulus";

        System.out.println(greeting);

        int n = 3;
        n = n % 3 == 1?1:0;
        System.out.println(n-n%1);
    }
}

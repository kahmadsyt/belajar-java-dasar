public class OperasiBoolean {
    public static void main(String[] args) {
        //CODE HERE

        var absen = 80;
        var nilaiAkhir = 90;

        boolean lulusAbsen = absen >= 75;
        boolean lulusNilai = nilaiAkhir >= 80;

        var lulus = lulusAbsen && lulusNilai;
        System.out.println(lulus);
    }
}

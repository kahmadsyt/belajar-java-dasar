public class SwitchStatement {
    public static void main(String[] args) {
        //CODE HERE

        // Statement Switch Default
        var nilai = "F";

        switch (nilai) {
            case "A":
                System.out.println("Anda Lulus dengan Baik");
                break;
            case "B":
            case "C":
                System.out.println("Nilai Anda cukup Baik");
                break;
            case "D":
                System.out.println("Anda Tidak Lulus");
                break;
            default:
                System.out.println("Tidak memenuhi kriteria");
        }

        // Statement Switch Lambda
        switch (nilai) {
            case "A" -> System.out.println("Anda Lulus dengan Baik");
            case "B", "C" -> System.out.println("Nilai Anda cukup Baik");
            case "D" -> System.out.println("Anda Tidak Lulus");
            default -> {
                System.out.println("Tidak memenuhi kriteria");
            }
        }

        // Statement Switch Tanpa Yield
        String ucapan;
        switch (nilai) {
            case "A" -> ucapan = "Anda Lulus dengan Baik";
            case "B", "C" -> ucapan = "Nilai Anda cukup Baik";
            case "D" -> ucapan = "Anda Tidak Lulus";
            default -> {
                ucapan = "Tidak memenuhi kriteria";
            }
        }
        System.out.println(ucapan);

        // Statement Switch Dengan Yield
        ucapan = switch (nilai) {
            case "A":
                yield "Anda Lulus dengan Baik";
            case "B", "C":
                yield "Nilai Anda cukup Baik";
            case "D":
                yield "Anda Tidak Lulus";
            default:
                yield "Tidak memenuhi kriteria";
        };
        System.out.println(ucapan);
    }
}

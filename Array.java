public class Array {
    public static void main(String[] args) {
        //CODE HERE

        String[] stringArray;
        stringArray = new String[2];

        stringArray[0] = "Achmad";
        stringArray[1] = "Kamil";

        System.out.println(stringArray[0]);
        System.out.println(stringArray[1]);

        String[] stringArray2 = new String[2];

        String[] namaNama = {
          "Achmad", "Kamil"
        };

        int[] arrayInt = new int[] {
                1,2,3,4,5
        };

        long[] arrayLong = {
                10,20,30
        };

        arrayLong[0] = 0;

        System.out.println(arrayLong.length);

        String[][] members = {
                {"Achmad", "Kamil"},
                {"Budi", "Setiadi"},
        };

        System.out.println(members[0][1]);
        System.out.println(members[1][0]);
    }
}

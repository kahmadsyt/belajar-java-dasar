public class ForEach {
    public static void main(String[] args) {
        //CODE HERE

        // Perulangan tanpa for each
        String[] names = {
                "Achmad", "Kamil",
                "Programmer", "Wannabe"
        };

        for(var i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        //Perulangan dengan for each
        String[] namesx = {
                "Achmad", "Kamil",
                "Programmer", "Wannabe"
        };

        for(var name:namesx) {
            System.out.println(name);
        }
    }
}

public class MethodOverloading {
    public static void main(String[] args) {
        //CODE HERE

        sayHello();
        sayHello("Achmad");
        sayHello("Achmad", "Kamil");

    }

    static void sayHello() {
        System.out.println("Hello");
    }

    static void sayHello(String name) {
        System.out.println("Hello " + name);
    }

    static void sayHello(String firstName, String lastName) {
        System.out.println("Hello " + firstName + " " + lastName);
    }
}

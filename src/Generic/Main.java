package Generic;

public class Main {

    public static <T> void generic(T a) {
        System.out.println(a);
    }

    public static void main(String[] args) {
        int a = 5;
        String b = "Hello";
        generic(a);
        generic(b);
    }
}


package Classes;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String parametr1,parametr2;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите 1 параметр");
        parametr1=in.next();
        System.out.println("Введите 2 параметр");
        parametr2=in.next();
        Test obj1=new Test();
        Test obj2=new Test();
        System.out.println(obj1.toString(parametr1));
        System.out.println(obj2.toString(parametr2));
    }
}

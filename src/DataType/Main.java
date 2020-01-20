package DataType;
import java.util.Scanner;

public class Main {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        //mediumArithmetic();
        //factorial();
        //costProduct();
        //parity();
        //split();
        // addHello();
        magic();
    }

    public static void mediumArithmetic() {
        int[] number = {1, 6, 3, 8, 5, 4};
        int a = 0;
        for (int i : number)
            a += i;
        System.out.println("Среднее арифметическое массива int: " + a);
    }

    public static void factorial() {
        System.out.println("Введите число:");
        int a = scan.nextInt();
        int sum = 1;
        if (a < 0) System.out.println("Нельзя вводить отрицательные числа");
        else if ((a == 0) || (a == 1))
            System.out.println("Факториал числа: 1");
        else {
            for (int i = a; i > 1; i--)
                sum *= i;
            System.out.println("Факториал числа: " + sum);
        }
    }

    public static void costProduct() {
        int[] number = {1533, 6123, 3123, 8686, 23425, 46786};
        System.out.println("Введите код товара [0-5]:");
        int a = scan.nextInt();
        if (a > -1 && a < number.length)
            System.out.println("Цена товара: " + number[a]);
        else System.out.println("Неверно задан индекс");
    }

    public static void parity() {
        System.out.println("Введите число:");
        int a = scan.nextInt();
        if (a % 2 == 0) System.out.println("Число четное");
        else
            System.out.println("Число нечетное");
    }

    public static void split() {
        String[] str = {"1", "2", "3", "4", "5"};
        String str1 = "";

        for (int i = 0; i < str.length; i++)
            str1 = str1.concat(str[i] + " ");
        System.out.print("Из массива в строку: " + str1);

        str = str1.split(" ");
        System.out.print("\nИз строки в массив: ");
        for (int i = 0; i < str.length; i++)
            System.out.print(str[i] + " ");
    }

    public static void addHello() {
        String[] str = {"1", "2", "3", "4", "5"};

        for (int i = 0; i < str.length; i++) {
            String str1 = "";
            str1 = str1.concat(str[i] + "Hello");
            str[i] = str1;
        }

        System.out.print("\nМассив: ");
        for (int i = 0; i < str.length; i++)
            System.out.print(str[i] + " ");

    }

    public static void magic() {
        int[] intArray = {1, 0, 1, 4, 1};
        boolean[] array=new boolean[intArray.length];
        System.out.println("Массив: " );
        for (int i=0;i<intArray.length;i++)
        {
            if (intArray[i]==0) array[i]=false; else array[i]=true;
            System.out.println("Индекс элемента "+i+" = "  +array[i] );}

    }

}

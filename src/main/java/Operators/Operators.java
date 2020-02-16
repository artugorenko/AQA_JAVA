package Operators;
import java.util.Scanner;

public class Operators {

    static double money;
    static String time;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите время в формате hh:mm:ss :");
        time = in.next();
        String[] str = time.split(":");
        for (int i = 0; i < str.length; i++) {
            if (Integer.parseInt(str[i]) < 0 || Integer.parseInt(str[i]) > 23)
                System.out.println("Неверно задано время");
        }
        System.out.println("Введите сумму денег :");
        money = in.nextDouble();
        if (Integer.parseInt(str[0]) >= 8 && Integer.parseInt(str[0]) <= 12 && money > 10)
            System.out.println("Идем в магазин");
        else if (Integer.parseInt(str[0]) > 12 && money > 50) System.out.println("Идем в кафе");
        else if (Integer.parseInt(str[0]) < 19 && money < 50) System.out.println("Идем к соседу");
        else if (Integer.parseInt(str[0]) > 19 && Integer.parseInt(str[0]) < 22)
            System.out.println("Идем смотреть телевизор");
        else if (Integer.parseInt(str[0]) > 22) System.out.println("Идем спать");
        else System.out.println("Ни чем не могу помочь");
    }
}



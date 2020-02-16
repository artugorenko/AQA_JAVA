package Thread;

import java.util.Random;

class ClassThreadSync extends Thread {

    private int a = 0;

    ClassThreadSync(int a) {
        this.a = a;
    }

    @Override
    public void run() {
        Main.synchronMethod(a);
    }

}

class ClassThreadUnSync extends Thread {

    private int a = 0;

    ClassThreadUnSync(int a) {
        this.a = a;
    }

    @Override
    public void run() {
        Main.unSynchronMethod(a);
    }

}

public class Main {

    public static synchronized void synchronMethod(int a) {
        int[] arr = new int[5];
        Random rnd = new Random(System.currentTimeMillis());

        for (int i = 0; i < 5; i++) {
            arr[i] = rnd.nextInt(3000 + 1);
            System.out.println("Элемент массива: " + arr[i] + " Поток " + a);
        }

    }

    public static void unSynchronMethod(int a) {
        int[] arr = new int[5];
        Random rnd = new Random(System.currentTimeMillis());

        for (int i = 0; i < 5; i++) {
            arr[i] = rnd.nextInt(3000 + 1);
            System.out.println("Элемент массива: " + arr[i] + " Поток " + a);
        }

    }

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Задание 1");
        ClassThreadSync one = new ClassThreadSync(1);
        ClassThreadSync two = new ClassThreadSync(2);
        one.start();
        two.start();

        if (two.isAlive()) {
            two.join();
        }

        System.out.println("Задание 2");
        ClassThreadUnSync one_un = new ClassThreadUnSync(1);
        ClassThreadUnSync two_un = new ClassThreadUnSync(2);
        one_un.start();
        two_un.start();
    }

}
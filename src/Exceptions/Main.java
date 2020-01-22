package Exceptions;

import java.io.*;

public class Main {

    public static void main(String[] args) {
        try {
            System.out.println(1 / 0);
        } catch (ArithmeticException e) {
            System.out.println("На ноль делить нельзя!");
        }

        //try {
        //    System.out.println(1 / 0);
        //} finally {
        //    System.out.println("На ноль делить нельзя!");
        //}

        FileInputStream fis = null;
        Integer num = null;
        int numm;
        try {
            numm = num;
            fis = new FileInputStream("");
        } catch (NullPointerException ex) {
            System.out.println("ссылка на объект, к которому вы обращаетесь хранит null");
        } catch (IOException e) {
            System.out.println("IO EXCEOTION");
        }

        System.out.println("Correct");
    }
}

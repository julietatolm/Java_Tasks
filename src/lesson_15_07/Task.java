package lesson_15_07;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write your name: ");
        String s = sc.nextLine();

        System.out.println("Task 1: " + helloName(s));

        System.out.println("Write one word: ");
        String a = sc.nextLine();
        System.out.println("Write second word: ");
        String b = sc.nextLine();

        System.out.println("Task 2: " + joinStrings(a, b));
        System.out.println("Task 3: " + returnTwoMiddleLetters(a));
    }

    //1. написать метод, принимающий имя и возвращающий  строку "Hello имя !"
    // public String helloName(String name) ->"Hello <name> !"
    public static String helloName(String name) {
        return "Hello " + name + " !";
    }

    //2.Написать метод,принимающий две строки и возвращающий их в таком виде:
    // public String joinStrings(String a, String b)-> abba
    public static String joinStrings(String a, String b) {
        return a + b + b + a;
    }

    //3. Написать метод, возвращающий первые два символа строки заглавными буквами
    // (hello->HE)
    public static String returnTwoLetters(String a) {
        return a.substring(0, 2).toUpperCase();
    }

    //4.Написать метод, возвращающий второй и третий символы строки ( Hello-> el)
    public static String returnTwoMiddleLetters(String a) {
        return a.substring(1, 3);
    }
}

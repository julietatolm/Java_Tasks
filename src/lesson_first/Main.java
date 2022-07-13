package lesson_first;

public class Main {
    public static void main(String[] args) {


        //System.out.println("I will be a programmer");
        //System.out.println();

        System.out.println(54 + 16);
        System.out.println(50 / 3);
        System.out.println(-5 + 8 * 6);
        System.out.println((55 + 9) % 9);

        int box = 5;
        int squareBox = box * box;
        System.out.println(squareBox);

        int a = 0;
        int b = 1;
        int c = 2;
        int d = 3;
        int e = 4;
        int f = 5;
        int g = 6;
        int h = 7;
        int i = 8;
        int j = 9;

        int result = (a + b + c + d + e + f + g + h + i + j) / 10;
        int result2 = (a + b + c + d + e + f + g + h + i + j) % 10;
        System.out.println("Среднее арифметическое: " + result);
        System.out.println("Остаток в дробной части: " + result2);

        int itemA = 1000;
        int itemB = 500;
        int discount = 100;
        System.out.println("Сумма с учетом скидки: " + (itemA + itemB - discount));
        System.out.println("Сумма скидки: " + discount);

    }
}
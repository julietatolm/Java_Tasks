package lesson_08_07;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Alex", 25);
        Student student2 = new Student("Maria", 24, "Berlin");

        Rectangle rectangle1 = new Rectangle(5,5);
        int result = rectangle1.perimeter();
        System.out.println(result);

        int result2 = rectangle1.area();
        System.out.println(result2);
    }
}

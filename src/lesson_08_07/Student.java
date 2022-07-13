package lesson_08_07;

public class Student {
    String name;
    int age;
    String address;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    Student(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }
}

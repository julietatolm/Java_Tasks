package lesson_08_07;

public class Rectangle {
    static int length;
    static int width;

    Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int perimeter() {
      return 2 * (Rectangle.length + Rectangle.width);
    }

    public int area() {
        return Rectangle.length*Rectangle.width;
    }

}

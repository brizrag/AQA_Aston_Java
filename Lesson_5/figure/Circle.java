package Lesson_5.figure;

public class Circle extends Figure implements Parameter {

    public Circle(double side1, String colorArea, String colorBorder) {
        super(side1, colorArea, colorBorder);
    }

    @Override
    public double area() {
        double PI = 3.14;
        return PI * side1 * side1;
    }

    @Override
    public double perimeter() {
        double PI = 3.14;
        return PI * side1 * 2;
    }
}

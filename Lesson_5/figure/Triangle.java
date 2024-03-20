package Lesson_5.figure;

public class Triangle extends Figure implements Parameter{

    public Triangle(double side1, double side2, String colorArea, String colorBorder) {
        super(side1, side2, colorArea, colorBorder);
    }

    @Override
    public double area() {
        return side1 * side2 / 2;
    }

    @Override
    public double perimeter() {
        return side1 + side2 * 2;
    }

}

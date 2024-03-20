package Lesson_5.figure;

public abstract class Figure implements Parameter{
    double side1;
    double side2;
    String colorArea;
    String colorBorder;


    public Figure(double side1, double side2, String colorArea, String colorBorder) {
        this.side1 = side1;
        this.side2 = side2;
        this.colorArea = colorArea;
        this.colorBorder = colorBorder;
    }


    public Figure(double side1, String colorArea, String colorBorder) {
        this.side1 = side1;
        this.colorArea = colorArea;
        this.colorBorder = colorBorder;
    }

    @Override
    public String toString() {
        return "Figure{" +
                "perimeter=" + perimeter() +
                ", area=" + area() +
                ", colorArea='" + colorArea + '\'' +
                ", colorBorder='" + colorBorder + '\'' +
                '}';
    }
}

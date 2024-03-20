package Lesson_5.figure;

public class Main {
    public static void main(String[] args) {
        Figure circle = new Circle(10, "пурпурный", "желтый");
        Figure rectangle = new Rectangle(10, 10, "белый", "черный");
        Figure triangle = new Triangle(10, 8 ,"изумрудный", "зеленый");

        System.out.println(circle);
        System.out.println(triangle);
        System.out.println(rectangle);
    }
}

public class Lesson_2 {

    public static void main(String[] args) {
        printThreeWorld();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    public static void printThreeWorld() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign() {
        int a = 10;
        int b = 4;
        int sym = a + b;
        if (sym > 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor() {

        int value = 10;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 100) {
            System.out.println("Зеленый");
        } else {
            System.out.println("Желтый");
        }
    }


    public static void compareNumbers() {

        int a = 9;
        int b = 11;
        if (a < b) {
            System.out.println("a < b");
        } else {
            System.out.println("a >= b");
        }
    }


}



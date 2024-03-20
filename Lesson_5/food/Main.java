package Lesson_5.food;

import java.util.Scanner;
public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        int action;
        Cat[] cats = new Cat[4];
        cats[0] = new Cat("Томас", 15);
        cats[1] = new Cat("Васька", 20);
        cats[2] = new Cat("Чеширк", 10);
        cats[3] = new Cat("Серый", 15);


        Bowl bowl = new Bowl(50);
        bowl.info();
        for (Cat cat : cats) {
            if (!cat.fullness && cat.appetite < bowl.food) {
                cat.eat(bowl);
                cat.fullness = true;
                System.out.println("Кот " + cat.name + " поел!");
            } else {
                System.out.println("Кот " + cat.name + " не поел!");
            }
        }
        bowl.info();
        System.out.println("Сколько еды добавить еще в миску?");
        action = sc.nextInt();
        bowl.increaseFood(action);
        bowl.info();

    }
}

package Lesson_4;

import java.util.Arrays;

public class Person {
    public static void main(String[] args) {
        Employee[] employee2 = new Employee[5];
        employee2[0] = new Employee("Ivanov Ivan", "Engineer",
                "ivivan@mail.ru", "895795456", 30000, 30);
        employee2[1] = new Employee("Petrov Sergey", "Engineer",
                "petrovs@mail.ru", "856782452", 38000, 38);
        employee2[2] = new Employee("Molokov Nikolai", "Engineer",
                "molokovn@mail.ru", "895795759", 40000, 40);
        employee2[3] = new Employee("Ivanova Olga", "Engineer",
                "ivivol@mail.ru", "895795689", 60000, 31);
        employee2[4] = new Employee("Makarova Vera", "Engineer",
                "makarovao@mail.ru", "895742569", 78000, 46);
        System.out.println(Arrays.toString(employee2));
    }
}



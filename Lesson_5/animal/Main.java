package Lesson_5.animal;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[10];
        animals[0] = new Cat("Мурзик", 200, 0);
        animals[1] = new Cat("Алиса", 200, 0);
        animals[2] = new Dog("Дик", 500, 10);
        animals[3] = new Dog("Лора", 500, 10);
        {
            System.out.println("Всего котов создано: " + Cat.getCountCat());
            System.out.println("Всего собак создано: " + Dog.getCountDog());
            System.out.println("Всего животных создано: " + Animal.getCountAnimal());
        }
        for (Animal animal : animals) {
            animal.run(120);
            animal.swim(10);
        }
    }
}

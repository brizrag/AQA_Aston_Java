package Lesson_5.animal;

public class Dog extends Animal {

    protected static int countDog = 0;

    public Dog(String name, int runLimit, int swimLimit) {
        super(name, runLimit, swimLimit);
        this.name = name;
        this.runLimit = runLimit;
        this.swimLimit = swimLimit;
        countDog++;
    }

    public static int getCountDog() {
        return countDog;
    }
}

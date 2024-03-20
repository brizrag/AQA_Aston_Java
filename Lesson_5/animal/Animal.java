package Lesson_5.animal;

public class Animal implements Action {

    protected int runLimit;
    protected int swimLimit;

    private static int countAnimal = 0;
    String name;

    public Animal(String name, int runLimit, int swimLimit) {
        this.runLimit = runLimit;
        this.swimLimit = swimLimit;
        countAnimal++;


    }

    public String getName() {
        return name;
    }

    public static int getCountAnimal() {
        return countAnimal;
    }

    public void run(int distance) {
        if (runLimit < distance) {
            System.out.println(name + ": расстояние " + distance + " м." + " - не смог пробежать");
        } else {
            System.out.println(name + ": расстояние " + distance + " м." + " пробежал");
        }
    }

    public void swim(int distance) {
        if (swimLimit < distance) {
            System.out.println(name + " расстояние " + distance + " м." + " - не смог проплыть");
        } else {
            System.out.println(name + ": расстояние " + distance + " м." + " проплыл");
        }
    }


}

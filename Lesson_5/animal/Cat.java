package Lesson_5.animal;

public class Cat extends Animal {
    protected static int countCat = 0;


    public Cat(String name, int runLimit, int swimLimit) {
        super(name, runLimit, swimLimit);
        this.name = name;
        this.runLimit = runLimit;
        this.swimLimit = swimLimit;
        countCat++;
    }

    Cat(String name, int runLimit) {
        super(name, runLimit, -1);
        countCat++;
    }


    public static int getCountCat() {
        return countCat;
    }

    @Override
    public void run(int distance) {
        super.run(distance);

    }
}

package Lesson_5.food;

public class Cat {
    public String name;
    public int appetite;
    public boolean fullness;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        fullness = false;
    }

    public void eat(Bowl bowl) {
        bowl.decreaseFood(appetite);
    }
}

package Lesson_5.food;

public class Bowl {
    public int food;

    public Bowl( int food) {
                this.food = food;
    }

    public void decreaseFood(int n) {
        food -= n;
    }
    public void increaseFood(int x) {
        food += x;
    }
    public void info() {
        System.out.println("Всего еды: " + food);
    }
}

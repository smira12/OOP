package hw2_java_OOP;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public void info() {
        System.out.println("plate: " + food);
    }

    public void setFood(int food) {
        if (food < 0)
            System.out.println("Error: food amount cannot be negative.");
        else
            this.food = food;
    }

    public void addFood(int foodValue) {
        food += foodValue;
        System.out.printf("%d food units added to the pleate\n", foodValue);
    }

    public int getFood() {
        return food;
    }
}

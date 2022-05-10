package Lesson_5;

public abstract class Fruit {

    public String type;
    public double weight;

    public Fruit(float weight, String type) {
        this.weight = weight;
        this.type = type;
    }

    public double getWeight() {
        return weight;
    }
}
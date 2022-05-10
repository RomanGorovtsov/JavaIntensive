package Lesson_4;

public abstract class Animals {

    public static int count = 0;

    protected String name;
    protected String type;

    public Animals(String name, String type) {
        this.name = name;
        this.type = type;
        count++;
    }

    protected abstract void animalRunning(int i);

    protected abstract void animalSwimming(int i);
}
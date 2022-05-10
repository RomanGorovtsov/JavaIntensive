package Lesson_4;

public class Dog extends Animals {

    Dog(String name, String type) {
        super(name, type);
    }

    protected void animalRunning(int i) {
        if (i > 500) {
            System.out.println("\nСобака может пробежать только 500 метров");
        } else {
            System.out.println("\nСобака " + name + " пробежал " + i + " метров");
        }
    }

    protected  void animalSwimming(int i) {
        if (i > 10) {
            System.out.println("\nСобака может проплыть больше 10 метров");
        } else {
            System.out.println("\nСобака " + name + " проплыла " + i + " метров");
        }
    }
}




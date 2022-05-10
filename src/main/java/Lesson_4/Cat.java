package Lesson_4;

public class Cat extends Animals {
    public static boolean satiety;
    private int appetite;


    Cat(String name, String type, int appetite, boolean satiety) {
        super(name, type);
        this.appetite = appetite;
        Cat.satiety = satiety;
    }

    @Override
    protected void animalRunning(int i) {
        if (i > 200) {
            System.out.println("\nКот может пробежать только 200 метров");
        } else {
            System.out.println("\nКот " + name + " пробежал " + i + " метров");
        }
    }

    @Override
    protected void animalSwimming(int i) {
        System.out.println("\nКот не умеет плавать");
    }

    public void eat(Plate p) {
        p.decreaseFood(appetite);
        if (!satiety) {
            System.out.println("Котик " + name + " голодный.");
        } else {
            System.out.println("Котик " + name + " сытый.");
        }
    }

//    public void satietyInfo(Cat r) {
//        if (!r.satiety) {
//            System.out.println("Котик голодный.");
//        } else {
//            System.out.println("Котик сытый.");
//        }
//    }
}
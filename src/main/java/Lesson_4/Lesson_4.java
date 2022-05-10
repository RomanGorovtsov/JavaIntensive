package Lesson_4;

import static Lesson_4.Animals.count;

public class Lesson_4 {
    public static void main(String args[]) {

        Cat cat1 = new Cat("Том", "Кот", 5, false);
        Dog dog1 = new Dog("Шарик", "Пёс");
        Plate plate = new Plate(10);

        Cat[] cats = new Cat[3];
        cats[0]=new Cat("Матроскин", "Кот", 5, false);
        cats[1]=new Cat("Да Винчи", "Кот", 7, false);
        cats[2]=new Cat("Рыжик", "Кот", 8, false);

        //info about running
        cat1.animalRunning(50);
        dog1.animalRunning(450);

        //info about swimming
        cat1.animalSwimming(600);
        dog1.animalSwimming(6);

        plate.info();
        cat1.eat(plate);
        //cat1.satietyInfo(cat1);

        cats[0].eat(plate);
        cats[1].eat(plate);
        cats[2].eat(plate);

        //add food method
        plate.addFood(50);
        plate.info();

        //info about count of animals
        System.out.println("\nОбщее количество животных: "+ count);

    }

}

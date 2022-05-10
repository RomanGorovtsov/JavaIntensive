package Lesson_5;

import jdk.jfr.Frequency;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Box {

    public static int totalCountOfApples = 0;
    public static int totalCountOfOranges = 0;

    public static List<Fruit> appleList = new ArrayList<>();
    public static List<Fruit> orangeList = new ArrayList<>();
    public static List<Fruit> freeBox = new ArrayList<>();


    public void addFruit(Fruit anyFruit) {
        if (anyFruit.type == "Orange") {
            orangeList.add(anyFruit);
            totalWeightOfOranges += anyFruit.getWeight();
            totalCountOfOranges++;

        } else {
            totalWeightOfApples += anyFruit.getWeight();
            appleList.add(anyFruit);
            totalCountOfApples++;
        }
    }

    public static void removeInOtherBox(List<Fruit> anyList){
        freeBox.addAll(anyList);
        anyList.clear();
        System.out.print("Коробка, в которую переложили: ");
        System.out.println(Arrays.toString((new List[]{freeBox})));
        System.out.print("Коробка, из которой переложили: ");
        System.out.println(Arrays.toString(new List[]{anyList}));

    }

    private static float totalWeightOfApples = totalCountOfApples * 1f;
    private static float totalWeightOfOranges = totalCountOfOranges * 1.5f;

    static void getWeight() {
        System.out.println("\nВес ящика с яблоками  " + totalWeightOfApples);
        System.out.println("Вес ящика с апельсинами " + totalWeightOfOranges);
    }

    public static boolean compare(float a, float b) {
        if (a==b) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Box box = new Box();
        box.addFruit(new Apple());
        box.addFruit(new Apple());
        box.addFruit(new Apple());
        box.addFruit(new Apple());
        box.addFruit(new Apple());
        box.addFruit(new Apple());
        box.addFruit(new Orange());
        box.addFruit(new Orange());
        box.addFruit(new Orange());
        box.addFruit(new Orange());

        //check that fruits added to box
        System.out.println(Arrays.toString(new List[]{appleList}));
        System.out.println(Arrays.toString(new List[]{orangeList}));

        //get weight of two boxes
        getWeight();

        //show compare info of two boxes
        System.out.println(compare(totalWeightOfApples,totalWeightOfOranges));

        //remove elements in other box
        removeInOtherBox(appleList);
    }
}
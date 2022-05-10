package Lesson_1;

public class HomeWorkApp {

    public static void printThreeWords(String a1) {
        System.out.println(a1);
    }
    public static void compareNumbers() {
        int a = 10;
        int b = 67;
        if (a > b) {
            System.out.println("a>=b");
        } else {
            System.out.println("a<b");
        }
    }

    static void printColor() {
        int value = 51;
        if (value <= 0) {
            System.out.println("Красный");
        }

        if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }

    }

    static void checkSumSign() {
        int a = 5;
        int b = 10;
        if (a + b > 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }

    }

    public static void main(String[] args) {
        HomeWorkApp s = new HomeWorkApp();
        printThreeWords("Orange");
        printThreeWords("Banana");
        printThreeWords("Apple");
        checkSumSign();
        printColor();
        compareNumbers();
    }
}

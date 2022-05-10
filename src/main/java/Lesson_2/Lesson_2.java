package Lesson_2;

import java.util.Arrays;

public class Lesson_2 {
    public static void main(String[] args) {
        Lesson_2 s1 = new Lesson_2();

        System.out.println(s1.granitsyTest(5, 19));

        s1.celoeChislo(-5);

        System.out.println(s1.celoeChisloBoolean(10));

        s1.strokaAndChislo("Java", 5);

        int[] myArray = new int[]{1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println(Arrays.toString(changing(myArray)));

        int[] myArray2 = new int[0];
        System.out.println(Arrays.toString(zapolnitMassive(myArray2)));

        int[] myArray3 = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(Arrays.toString(mensheShesti(myArray3)));

        int[][] myArray4 = new int[3][3];
        System.out.println(Arrays.deepToString(zapolnenyeDiagonaley(myArray4)));
    }

    boolean granitsyTest(int a, int b) {
        return a + b >= 10 && a + b <= 20;
    }

    void celoeChislo(int c) {
        if (c >= 0) {
            System.out.println("Положительное");
        } else {
            System.out.println("Отрицательное");
        }
    }

    boolean celoeChisloBoolean(int c) {
        return c >= 0;
    }

    void strokaAndChislo(String st2, int i) {
        for (int a = 1; a <= i; ++a) {
            System.out.println(st2);
        }
    }

    public static int[] changing(int[] array) {
        for (int i = 0; i < array.length; ++i) {
            if (array[i] == 0) {
                array[i] = 1;
            } else if (array[i] == 1) {
                array[i] = 0;
            }
        }
        return array;
    }

    public static int[] zapolnitMassive(int[] array) {
        int a = 1;

        for (int i = 0; i <= 100; ++i) {
            System.out.println(a);
            ++a;
        }
        return array;
    }

    public static int[] mensheShesti(int[] array) {
        for (int i = 0; i < array.length; ++i) {
            if (array[i] < 6) {
                array[i] *= 2;
            }
        }
        return array;
    }

    public static int[][] zapolnenyeDiagonaley(int[][] array) {
        for (int i = 0; i < array.length; ++i) {
            for (int j = 0; j < array.length; ++j) {
                if (i == j) {
                    array[i][j] = 1;
                }
            }
        }
        return array;
    }
}


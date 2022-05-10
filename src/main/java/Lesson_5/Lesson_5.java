package Lesson_5;

import java.util.Arrays;

public class Lesson_5 {

    static int[] argus = { 15, 63, 44, 14, 33, 36 };

    public static int[] menyaemMestami(int ignoredMass[]){
        int x = argus[3];
        argus[3] = argus[2];
        argus[2] = x;
        return ignoredMass;
    }

    public static void main(String []args){
        System.out.println(Arrays.toString(menyaemMestami(argus)));
    }


}

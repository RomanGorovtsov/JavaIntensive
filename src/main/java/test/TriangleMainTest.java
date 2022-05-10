package test;

import Lesson_13.src.main.Lesson_13;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TriangleMainTest {

    @Test
    public void mainTest() {
        Lesson_13 l13 = new Lesson_13();
        double m = l13.areaOfATriangle(6, 5, 6);
        double result = 9.797958971132712;
        Assert.assertEquals(m, result);
        System.out.println(m);
    }
}

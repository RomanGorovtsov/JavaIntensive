package test;

import Lesson_13.src.main.Lesson_13;
import org.testng.annotations.Test;

public class TriangleSideTest {
    @Test
    public void sideTest() {
        Lesson_13 l13 = new Lesson_13();
        double m = l13.areaOfATriangle(4, 4, 10);
        System.out.println(m);
    }
}

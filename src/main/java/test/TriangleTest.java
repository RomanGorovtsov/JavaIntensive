package test;

import Lesson_13.src.main.Lesson_13;
import org.testng.annotations.Test;

public class TriangleTest {

    @Test
    public void minusTest() {
        Lesson_13 l13 = new Lesson_13();
        double m = l13.areaOfATriangle(-4, 0, -3);
        System.out.println(m);
    }
}


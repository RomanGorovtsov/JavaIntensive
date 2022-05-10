package main;

import static java.lang.Math.sqrt;

public class Lesson_13 {
    public double areaOfATriangle(int a, int b, int c){
        if(a<=0||b<=0||c<=0){
            System.out.println("Сторона не может иметь отрицательное значение, либо 0.");
        }
        else if (a+b<c||a+c<b||b+c<a){
            System.out.println("У треугольника сумма любых двух сторон должна быть больше третьей. Иначе две стороны просто лягут на третью и треугольника не получится.");
        }
            double s;
            double p = (a + b + c) / 2;
            s = sqrt(p * (p - a) * (p - b) * (p - c));
            return s;
    }
}

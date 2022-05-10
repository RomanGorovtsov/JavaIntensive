package Lesson_4;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public void decreaseFood(int n) {
        if(n>food){
            System.out.println("\nВ миске недосаточно еды для котика. Пополните миску. ");
            Cat.satiety = false;
        }
        else {
            food -= n;
            Cat.satiety = true;
        }
    }

    public void addFood(int i){
        food +=i;
    }

    public void info() {
        System.out.println("\nКоличество еды в тарелке: " + food);
    }
}


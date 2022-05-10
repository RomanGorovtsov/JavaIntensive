package Lesson_4;

import java.util.ArrayList;

public class Park {

    public static void main(String[] args) {

        ArrayList<Attractions> attractionList = new ArrayList<>();
        attractionList.add(new Park.Attractions("Swing", "9:00 - 21:00", 500));
        attractionList.add(new Park.Attractions("Carousels", "9:00 - 21:00", 400));
        attractionList.add(new Park.Attractions("Room of fear", "17:00 - 24:00", 700));

    }

    public static class Attractions {
        String nameOfAttractions;
        String timeOfWorking;
        int price;

        Attractions(String nameOfAttractions, String timeOfWorking, int price) {
            this.nameOfAttractions = nameOfAttractions;
            this.timeOfWorking = timeOfWorking;
            this.price = price;
        }
    }
}


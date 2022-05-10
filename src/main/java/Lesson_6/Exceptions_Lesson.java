package Lesson_6;

public class Exceptions_Lesson {

    public static int workWithMassive(String[][] mass) throws MyArraySizeException, MyArrayDataException {

        int sum = 0;

        if (4 != mass.length) throw new MyArraySizeException("Неверное количество строк");
        for (int i = 0; i < mass.length; i++) {
            if (4 != mass[i].length) throw new MyArraySizeException("Неверное количество столбцов");
            for (int j = 0; j < mass[i].length; j++) {
                try {
                    sum += Integer.parseInt(mass[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Неверный тип данных");
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {

        String[][] correct = {
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"}
        };
        String[][] incorrect = {
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"}
        };

        String[][] incorrect2 = {
                {"1", "2", "3", "4"},
                {"1", "2", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"}
        };

        try {
            System.out.println("Сумма всех элементов мссива равна "+ workWithMassive(correct));
        } catch (MyArraySizeException | MyArrayDataException e) {
            e.printStackTrace();
        }


        try {
            System.out.println("Сумма всех элементов мссива равна "+ workWithMassive(incorrect));
        } catch (MyArraySizeException | MyArrayDataException e) {
            e.printStackTrace();
        }

        try {
            System.out.println("Сумма всех элементов мссива равна "+ workWithMassive(incorrect2));
        } catch (MyArraySizeException | MyArrayDataException e) {
            e.printStackTrace();
        }
    }
}



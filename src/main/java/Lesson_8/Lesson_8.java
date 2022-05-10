package Lesson_8;

import java.util.*;

public class Lesson_8 {
    public static void main(String[] args) {

        List<String> mass = Arrays.asList("Bykhov", "Bykhov", "Bykhov", "Bykhov", "Bykhov", "Minsk", "Moscow", "Kiev", "LA", "New York");

        System.out.println("\nСводка:");
        Map<String, Integer> wordsCount = new HashMap<>();
        for (String s : mass) {
            wordsCount.put(s, wordsCount.getOrDefault(s, 0) + 1);
        }
        wordsCount.entrySet().forEach(System.out::println);
        System.out.println("\nБез повторов: ");
        Set<String> unique = new HashSet<>(mass);
        unique.forEach(System.out::println);

    }
}

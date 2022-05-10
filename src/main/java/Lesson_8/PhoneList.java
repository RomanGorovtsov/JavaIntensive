package Lesson_8;

import java.util.*;

public class PhoneList {

    Map<String, String> phoneDirectory = new HashMap<>();

    void add(String phone_number, String surname) {
        phoneDirectory.put(phone_number, surname);
    }

    void phoneListInfo() {
        System.out.println(phoneDirectory.toString());
    }

    void get(String surname) {
        for (Map.Entry<String, String> entry : phoneDirectory.entrySet()) {
            if (entry.getValue().equals(surname)) {
                System.out.println("Фамилия " + surname + ", номер телефона: " + entry.getKey());
            }
        }
    }

    public static void main(String[] args) {

        PhoneList phoneList = new PhoneList();
        phoneList.add("55052", "Иванов");
        phoneList.add("55003", "Петров");
        phoneList.add("71154", "Соболев");
        phoneList.add("56979", "Сидоров");
        phoneList.add("55986", "Соболев");
        phoneList.phoneListInfo();
        phoneList.get("Петров");
        phoneList.get("Соболев");
    }
}



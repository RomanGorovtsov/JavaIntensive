package Lesson_3;

public class Employer {
    String name;
    String surname;
    String theSecondName;
    String position;
    String email;
    int phoneNumber;
    int salary;
    int age;

    Employer(String name, String surname, String theSecondName, String position, String email, int phoneNumber, int salary, int age) {
        this.name = name;
        this.surname = surname;
        this.theSecondName = theSecondName;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    static class EmployerTest {

        public void showInfo(Employer r) {
            System.out.println("Информация о сотруднике: " + r.surname + " " + r.name + " " + r.theSecondName + ": " + "позиция: " + r.position + ", зарплата: " + r.salary + ", email: " + r.email + ", номер телефона: " + r.phoneNumber + ", зарплата: " + r.salary + ", возраст: " + r.age+ " лет.");
        }

        public static void main(String[] args) {
            Employer[] employer = new Employer[5];
            employer[0] = new Employer("Иван", "Сокол", "Францевич", "AQA", "ivanov@mail.ru", 55986, 2500, 25);
            employer[1] = new Employer("Роман", "Абрамович", "Иванович", "QA", "roman@mail.ru", 65456, 2000, 30);
            employer[2] = new Employer("Сергей", "Зверев", "Романович", "Designer", "sergey@mail.ru", 36572, 1500, 20);
            employer[3] = new Employer("Олег", "Газманов", "Сергеевич", "Developer", "oleg@mail.ru", 23421, 4500, 45);
            employer[4] = new Employer("Павел", "Воля", "Константинович", "Analyst", "volya@mail.ru", 99878, 3000, 28);

            EmployerTest a = new EmployerTest();

            a.showInfo(employer[0]);
            a.showInfo(employer[1]);
            a.showInfo(employer[2]);
            a.showInfo(employer[3]);
            a.showInfo(employer[4]);
        }
    }
}

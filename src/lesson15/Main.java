package lesson15;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        try {
            person.setAge(12);
            System.out.println("Успех");
        } catch (PersonAgeException e) {
            System.out.println("Неверный возраст указан!");
        }
        System.out.println("Конец");
    }
}

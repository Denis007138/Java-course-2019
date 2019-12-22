package lesson3.classwork;

public class Main3 {
    public static void main(String[] args) {
        String password = "uchf7gDjffjtr";
        if (password.length() < 8) {
            System.out.println("Пароль меньше 8 символов не принимается");
            return;
        }
        boolean havenumberinpass = false;
        for (int i = 0; i < 10; i++) {
            if (password.contains("" + i)) {
                havenumberinpass = true;
                break;
            }
        }
        System.out.println(havenumberinpass);
        //---------------------------------------------------------------------дз найти заглавные буквы
        //запрос в гугл:java check if capital letter
        //stackoverflow.com/questions/16127923/checking-letter-case-upper-lower-within-a-string-in-java
        boolean hasUpperCase = !password.equals(password.toLowerCase());
        // метод toLowerCase возвращает строку, преобразованную в нижний регистр
        //метод equals сравнивает строку с указанным объектом, результатом является значение true
        //только в том случае,если аргумент не равен null и является строковым объектом String
        for (int i = 0; i <= password.length(); i++) {
            if (!hasUpperCase) {
                hasUpperCase = false;

            } else {
                hasUpperCase = true;
            }
        }
        System.out.println(hasUpperCase);
    }
}

package lesson2.classwork;

public class Main1 {
    public static void main(String[] args) {
        int a = 7;
        int b = 4;
        int c = 3;
        if (a == b && b == c && a==c) {
            System.out.println("Это равносторонний треугольник");
        }
        if ((b == c && a != b) || (a == c && c != b) || (a == b && b != c)) {
            System.out.println("Это равнобедренный треугольник");

        }
        if (a != b && b != c && a != c) {
            System.out.println("Разносторонний треугольник");
        }
    }
}

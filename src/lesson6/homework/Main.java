package lesson6.homework;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Прямоугольник
        Rectangle rect1 = new Rectangle();
        //Ромб
        Rhombus romb = new Rhombus();
        //Круг
        Circle circ = new Circle();
        Scanner keyboard = new Scanner(System.in);
        //Вычисления связанные с треугольником
        System.out.println("Введите стороны прямоугольника");
        int rectangleSide1 = keyboard.nextInt();
        int rectangleSide2 = keyboard.nextInt();
        rect1.setA(rectangleSide1);
        rect1.setB(rectangleSide2);
        rect1.print();
        System.out.println("Периметр прямоугольника=" + rect1.perimeterOfRectangle());
        System.out.println("Площадь прямоугольника =" + rect1.squareOfRectangle());
        //Вычисления связанные с ромбом
        System.out.println("Введите сторону ромба");
        int rombside = keyboard.nextInt();
        romb.setA(rombside);
        System.out.println("Введите диагонали ромба");
        int rombDiag1 = keyboard.nextInt();
        int rombDiag2 = keyboard.nextInt();
        romb.setDiag1(rombDiag1);
        romb.setDiag2(rombDiag2);
        romb.print();
        System.out.println("Периметр ромба=" + romb.perimeterOfRhombus());
        System.out.println("Площадь ромба =" + romb.squareOfRhombus());
        //Вычисления связанные с кругом
        System.out.println("Введите радиус круга");
        int radius = keyboard.nextInt();
        circ.setRadius(radius);
        circ.print();
        System.out.println("Периметр круга=" + circ.perimetr());
        System.out.println("Площадь круга=" + circ.square());
    }
}

package lesson6.classwork;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Triangle treyg1 = new Triangle();
        Triangle treyg2 = new Triangle();
        Triangle treyg3 = new Triangle();
        Scanner keyboard=new Scanner(System.in);
//        treyg1.color="orange";
//        treyg1.color="green";
//        treyg1.setColor("orange");
//        treyg2.setColor("green");
//        treyg3.setColor("yellow");
        System.out.println("Введите стороны треугольника");
        int triangleSide1=keyboard.nextInt();
        int triangleSide2=keyboard.nextInt();
        int triangleSide3=keyboard.nextInt();
        treyg1.setA(triangleSide1);
        treyg1.setB(triangleSide2);
        treyg1.setC(triangleSide3);
        treyg1.print();
        System.out.println("Периметр треугольника равен "+treyg1.perimetr());
        System.out.println("Площадь треугольника "+treyg1.square());
//        treyg2.setA(1);
//        treyg2.setB(1);
//        treyg2.setC(1);
//
//        treyg3.setA(1);
//        treyg3.setB(1);
//        treyg3.setC(1);
    }
}

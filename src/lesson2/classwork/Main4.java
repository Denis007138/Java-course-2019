package lesson2.classwork;

import lesson4.classwork.FiguresUtils;

public class Main4 {
    public static void main(String[] args) {
        //Напечатать на консоль цифры от 100 до 150, которые делятся на 5 без остатка

        for (int i = 100; i <= 150; i++) {
            if (i % 5 == 0) {
                System.out.println(i);
            }
        }
        FiguresUtils.printtypeofTriangle(3,9,6);
        int result=FiguresUtils.calculatePerimeterTriangle(3,3,3);
        System.out.println(result);
    }
}

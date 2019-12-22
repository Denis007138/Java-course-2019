package lesson1.homework;

import org.w3c.dom.ls.LSOutput;

public class Task2 {
    public static void main(String[] args) {
        byte a = 13;
        byte b = 14;
        byte c = 15;
        //найдем полупериметр
        int pp = (a + b + c) / 2;
        //найдем и выведем площадь
        double d = pp * (pp - a) * (pp - b) * (pp - c);
        int S = (int) Math.sqrt(d);
        System.out.println(S);
    }

}

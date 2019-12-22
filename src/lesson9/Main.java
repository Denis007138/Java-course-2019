package lesson9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int a = keyboard.nextInt();
        int b = keyboard.nextInt();
        FractionNumberImpl fractionNumber = new FractionNumberImpl(a, b);
        System.out.println(fractionNumber + "=" + fractionNumber.value());
    }

}

package lesson5;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String[][] tours={{"1","Италия","75000","4 звезды"},
                          {"2","Франция","110000","5 звезд"},
                          {"3","Израиль","55000","3 звезды"},
                          {"4","Италия","63000","5 звезд"},
                          {"5","Марокко","49000","4 звезды"}};
//        System.out.println("В какую страну вы хотите поехать?");
//        int a=7;

        Scanner keyboard=new Scanner(System.in);
        //String inputCountry=keyboard.nextLine();
        //ToursUtils.printToursByCountry(tours,inputCountry);
//        System.out.println("Введите минимальную сумму тура");
//        Scanner keyboard=new Scanner(System.in);
//        int priceFrom=keyboard.nextInt();
//        System.out.println("Введите максимальную сумму тура");
//        int priceTo=keyboard.nextInt();
//        ToursUtils.printTourFromPrice(priceFrom,priceTo,tours);
        // дз задача 1
        System.out.println("Самый дорогой тур");
        ToursUtils.themostexpensivetour(tours);
        //дз задача 2
//        System.out.println("Введите количество звезд");
//        String stars=keyboard.nextLine();
//        ToursUtils.stars(tours,stars);
        //дз задача 3
        System.out.println("Самый дешевый тур");
        ToursUtils.themostcheapest(tours);
        //дз задача 4
//        System.out.println("Введите страну для нахождения средней суммы туров этой страны");
//        String average=keyboard.nextLine();
//        ToursUtils.averagesumm(tours,average);
        }
    }


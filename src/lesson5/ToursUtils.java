package lesson5;

import java.util.Arrays;


public class ToursUtils {
    public static void printToursByCountry(String[][] tours, String inputCountry) {
        for (int i = 0; i < tours.length; i++) {
            if (inputCountry.equals(tours[i][1])) {
                System.out.printf("Тур:%s-%s, цена-%s,%s", tours[i][0], tours[i][1], tours[i][2], tours[i][3]);
                System.out.println();
            }
        }
    }

    public static void printTourFromPrice(int from, int priceTo, String[][] toursFromTo) {
        for (int i = 0; i < toursFromTo.length; i++) {
            int priceTour = Integer.parseInt(toursFromTo[i][2]);
            if (priceTour >= from && priceTour <= priceTo) {
                System.out.printf("Тур:%s-%s, цена-%s,%s", toursFromTo[i][0], toursFromTo[i][1], toursFromTo[i][2], toursFromTo[i][3]);
                System.out.println();
            }
        }

    }

    //дз задача 1
    public static void themostexpensivetour(String[][] tours) {
        int[] a=new int[tours.length];
        for(int i=0;i<tours.length;i++){
            int price=Integer.parseInt(tours[i][2]);
            for(int e:a){
                e=price;
                a[i]=e;
            }
        }
        Arrays.sort(a);
        int max=a[a.length-1];
        String b=String.valueOf(max);
        for(int i=0;i<tours.length;i++){
            boolean d=tours[i][2].equals(b);
            if(d){
                System.out.printf("Тур:%s-%s, цена-%s,%s", tours[i][0], tours[i][1], tours[i][2], tours[i][3]);
                System.out.println();
            }
        }
    }

    //дз задача 2
    public static void stars(String[][] tours, String stars) {
        for (int i = 0; i < tours.length; i++)
            if (stars.equals(tours[i][3])) {
                System.out.printf("Тур от %s в %s", tours[i][3], tours[i][1]);
                System.out.println();
            }
    }

    //дз задача 3
    public static void themostcheapest(String[][] tours) {
            int[] a=new int[tours.length];
            for(int i=0;i<tours.length;i++){
                int price=Integer.parseInt(tours[i][2]);
                for(int e:a){
                    e=price;
                    a[i]=e;
                }
            }
            Arrays.sort(a);
            int min=a[0];
            String b=String.valueOf(min);
            for(int i=0;i<tours.length;i++){
                boolean d=tours[i][2].equals(b);
                if(d){
                    System.out.printf("Тур:%s-%s, цена-%s,%s", tours[i][0], tours[i][1], tours[i][2], tours[i][3]);
                    System.out.println();
                }
            }
    }

    //дз задача 4
    public static void averagesumm(String[][] tours, String inputCountry) {
        int summ = 0;
        int a = 0;
        for (int i = 0; i < tours.length; i++) {
            int price = Integer.parseInt(tours[i][2]);
            if (inputCountry.equals(tours[i][1])) {
                a = a + 1;
                summ = (summ + price) / a;
            }
        }
        System.out.printf("Средняя сумма в данную страну составляет %s", summ);
        System.out.println();
    }
}



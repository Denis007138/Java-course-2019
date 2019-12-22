package lesson2.homework;
//третье задание
public class Task5 {
    public static void main(String[] args) {
        int summa = 0;
        for (int i = 500; i <= 1000; i++) {
            if (i % 7 == 0 || i % 19 == 0) {
                summa = summa + i;

            }
        }
        /*for (int i = 500; i <= 1000; i++) {
            if (i % 7 == 0 && i % 19 == 0) {
                summasi = summasi + i;

            }
        }*/
        System.out.println(summa);
        //System.out.println(summasi);
    }
}

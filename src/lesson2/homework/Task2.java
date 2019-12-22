package lesson2.homework;
//второе задание
public class Task2 {
    public static void main(String[] args) {
        for (int i = 500; i <= 1000; i++) {
            if (i % 7 == 0 || i % 19 == 0) {
                System.out.println(i);
            }
        }
        /*for (int i1 = 500; i1 <= 1000; i1++) {
            if (i1 % 7 == 0 && i1 % 19 == 0) {
                System.out.println(i1);

            }
        }*/
    }
}

package lesson3.homework;

public class Task3 {
    public static void main(String[] args) {
        int[] massiv = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int summ = 0;
        for (int currentElement : massiv) {
            if (currentElement % 2 == 0) {
                summ = summ + currentElement;
            }

        }
        System.out.println(summ);
    }
}

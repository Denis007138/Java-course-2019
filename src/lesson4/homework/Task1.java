package lesson4.homework;

public class Task1 {
    public static void main(String[] args) {
        int[][] mass = new int[5][5];
//        //1 задача
//        System.out.println("Задача 1");
//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j < 5; j++) {
//                if (i == j) {
//                    mass[i][j] = 1;
//                }
//                System.out.print(mass[i][j] + " ");
//            }
//            System.out.println();
//        }
//        //2 задача
//        System.out.println("Задача 2");
//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j <= i; j++) {
//                if (i == j) {
//                    mass[i][j] = 1;
//                    System.out.println(mass[i][j] + " ");
//                } else {
//                    System.out.print("  ");
//                }
//
//            }
//        }
//        //3 задача
//        System.out.println("Задача 3");
//        for (int i = 0; i < mass.length; i++) {
//            for (int j = mass.length - 1; j >= i; j--) {
//                if (j == i) {
//                    mass[2][2] = 1;
//                    System.out.println(mass[i][j] + " ");
//                } else {
//                    System.out.print("  ");
//                }
//
//            }
//        }
        //i<j-элементы матрицы находятся над главной диагональю
        //i>j-под главной диагональю
        //i+j<length-1 - над побочной диагональю
        //i+j>length-1 -под побочной диагональю
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j <mass.length; j++) {
                if (j+i == mass.length-1) {
                    mass[i][j] = 1;
                    System.out.print(mass[i][j]+" ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}

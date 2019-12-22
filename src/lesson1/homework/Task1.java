package lesson1.homework;

public class Task1 {
    public static void main(String[] args) {
        short lengthOfRoom = 15;
        byte widthOfRoom = 10;
        int lengthOfTable = 3;
        long widthOfTable = (long) lengthOfTable;
        int squareOfRoom = lengthOfRoom * widthOfRoom;
        long squareOfTable = lengthOfTable * widthOfTable;
        long result = squareOfRoom/squareOfTable;
        System.out.println(result);
    }
}

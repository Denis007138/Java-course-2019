package lesson1.classwork;

public class Main {
    public static void main(String[] args) {
        int number=7;

        int ostatokOtDelenia=number%2;
        if(ostatokOtDelenia==0){
            System.out.println("Число целое");
        }
        if(ostatokOtDelenia!=0){
            System.out.println("Число нецелое");
        }
    }
}

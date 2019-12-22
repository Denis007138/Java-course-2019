package lesson3.homework;

public class Task2 {
    public static void main(String[] args) {
        //доработано
        char[] a = {'a', 'b', 'c', 'd'};
        char[] b;

        for (int i = 0; i < a.length/2; i++) {
            char temp=a[i];
            a[i]=a[a.length-i-1];
            a[a.length-i-1]=temp;
        }
        b=a;
        for(int i=0;i<b.length;i++){
            System.out.println(b[i]);
        }

    }
}

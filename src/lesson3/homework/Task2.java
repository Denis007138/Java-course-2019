package lesson3.homework;

public class Task2 {
    public static void main(String[] args) {
        //доработано
        //создаем массив заполненный и массив пустой соответственно
        char[] a = {'a', 'b', 'c', 'd'};
        char[] b;
//создаем цикл, в котором мы находим первые 2 элемента которые затем перемещаем в нами созданную переменную
        for (int i = 0; i < a.length/2; i++) {
            char temp=a[i];
            //ту же самую операцию мы проводим для двух оставшихся элементов и добавляем к той же переменной
            a[i]=a[a.length-i-1];
            a[a.length-i-1]=temp;
        }
        b=a;
        for(int i=0;i<b.length;i++){
            System.out.println(b[i]);
        }

    }
}

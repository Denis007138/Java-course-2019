package lesson13.classwork;

import java.util.HashSet;
import java.util.TreeSet;

public class Main1 {
    public static void main(String[] args) {
        Coin coin1=new Coin(4,1980,5);
        Coin coin2=new Coin(7,1995,6);
        Coin coin3=new Coin(5,1934,3);
        Coin coin4=new Coin(6,1923,8);
        Coin coin5=new Coin(4,1980,7);
        TreeSet<Coin> coins=new TreeSet<>();
        coins.add(coin1);
        coins.add(coin2);
        coins.add(coin3);
        coins.add(coin4);
        coins.add(coin5);

        for(Coin coin:coins){
            System.out.println(coin);
        }

    }
}

package lesson13.classwork;

import java.util.HashMap;

public class Main3 {
    public static void main(String[] args) {
        HashMap<String,Integer> fridge=new HashMap<>();
        fridge.put("Яблоко",6);
        fridge.put("Груша",2);
        fridge.put("Слива",3);
        fridge.put("Ананас",7);
        System.out.println(fridge);

        int summa=0;
        for(Integer currentProduct:fridge.values()){
            summa=summa+currentProduct;
        }
        System.out.println(summa);

        fridge.put("Груша",3+fridge.get("Груша"));
        System.out.println(fridge);


    }
}

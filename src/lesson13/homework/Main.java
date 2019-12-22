package lesson13.homework;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> mass1=new ArrayList<>();
        ArrayList<Integer> mass2=new ArrayList<>();
        HashSet<Integer> hashSe=new HashSet<>();
        HashSet<String> hashSet=new HashSet<>();
        List<Double> list=new ArrayList<>();
        ClassCollectionUtils result=new ClassCollectionUtils();
        ClassSetUtils result1=new ClassSetUtils();
        ClassListUtils result2=new ClassListUtils();
        mass1.add(0);
        mass1.add(1);
        mass1.add(2);
        mass1.add(3);

        mass2.add(1);
        mass2.add(2);
        mass2.add(3);
        mass2.add(4);

        hashSe.add(4);
        hashSe.add(6);
        hashSe.add(3);
        hashSe.add(8);
        hashSe.add(2);

        hashSet.add("dwad");
        hashSet.add("fgsregf");
        hashSet.add("eeeee");
        hashSet.add("ddddddd");
        hashSet.add("qqqqqqq");

        list.add(6.5);
        list.add(12.655);
        list.add(64.554);
        list.add(0.56);
        list.add(6.52);


        System.out.println(mass1);
        System.out.println(mass2);
        //class CollectionUtils
        System.out.println("class CollectionUtils");
        System.out.println(result.union(mass1,mass2));
        System.out.println(result.intersection(mass1,mass2));
        System.out.println(result.unionWithoutDuplicate(mass1,mass2));
        System.out.println(result.intersectionWithoutDuplicate(mass1,mass2));
        System.out.println(result.difference(mass1,mass2));
        //class SetUtils
        System.out.println("class SetUtils");
        System.out.println(result1.customOrderSet(41,22,13,64,85));
        System.out.println(result1.orderedSet(hashSe,hashSet));
        //class ListUtils
        System.out.println("class ListUtils");
        System.out.println(result2.asList("feslfsel","dlwadjalw","dwaklhdakld","awudiladjl"));
        System.out.println(result2.sortedList(list));


    }
}

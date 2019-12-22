package lesson13.homework;

import java.util.*;

public class ClassSetUtils implements SetUtils {
    @Override
    public SortedSet<String> orderedSet(Collection<Integer> collection1, Set<String> set2) throws NullPointerException {
        TreeSet<String> list=new TreeSet<>();
        for(Integer myInt:collection1){
            list.add(myInt.toString());
        }
        list.addAll(set2);
        return list;
    }

    @Override
    public Set<Integer> customOrderSet(int val1, int val2, int val3, int val4, int val5) {
        TreeSet<Integer> list=new TreeSet<>();
        list.add(val1);
        list.add(val2);
        list.add(val3);
        list.add(val4);
        list.add(val5);
        return list;
    }
}

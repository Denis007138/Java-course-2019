package lesson13.homework;
import java.util.*;

public class ClassListUtils implements ListUtils {
    @Override
    public List<String> asList(String... strings) throws IllegalArgumentException {
        List<String> list=new ArrayList<>();
        for(int i=0;i<strings.length;i++) {
            list.add(strings[i]);
        }
        return list;
    }

    @Override
    public List<Double> sortedList(List<Double> data) throws IllegalArgumentException {
        List<Double> list=new ArrayList<>();
        list.addAll(data);
        Collections.sort(list,Collections.reverseOrder());
        return list;
    }
}

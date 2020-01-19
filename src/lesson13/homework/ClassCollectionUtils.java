package lesson13.homework;
import java.util.*;

public class ClassCollectionUtils implements CollectionUtils {
    @Override
    public Collection<Integer> union(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        ArrayList<Integer> newA=new ArrayList<>();
        newA.addAll(a);
        newA.addAll(b);
        return newA;
    }

    @Override
    public Collection<Integer> intersection(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        LinkedList<Integer> newA=new LinkedList<>();
        newA.addAll(a);
        newA.retainAll(b);
        return newA;
    }

    @Override
    public Set<Integer> unionWithoutDuplicate(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        ArrayList<Integer> newA=new ArrayList<>();
        HashSet<Integer> noRepeats=new HashSet<>();
        newA.addAll(a);
        newA.addAll(b);
        noRepeats.addAll(newA);
        return noRepeats;
    }

    @Override
    public Set<Integer> intersectionWithoutDuplicate(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        LinkedList<Integer> newA=new LinkedList<>();
        HashSet<Integer> noRepeats=new HashSet<>();
        newA.addAll(a);
        newA.retainAll(b);
        noRepeats.addAll(newA);
        return noRepeats;
    }

    @Override
    public Collection<Integer> difference(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        Set<Integer> diff=new HashSet<>(a);
        diff.addAll(b);
        Set<Integer> t=new HashSet<>(a);
        t.retainAll(b);
        t.removeAll(diff);
        return t;
    }
}

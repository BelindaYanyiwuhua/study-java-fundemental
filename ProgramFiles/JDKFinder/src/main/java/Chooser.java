import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class Chooser<T>{
    private final List<T> choiceList;

    public Chooser(Collection<T> choices){
        choiceList = new ArrayList<>(choices);
    }
    public T choose(){
        Random random = ThreadLocalRandom.current();
        return choiceList.get(random.nextInt(choiceList.size()));
    }

    public static <E> Set<E> union(Set<E> s1, Set<E> s2){
        Set<E> result = new HashSet<>(s1);
        result.addAll(s2);
        return result;
    }

    public static void main(String [] args){
//        Integer a = 123;
        Collection<Integer> choices = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
//        Collections.addAll(choices,11,12,22,a);
        Collections.addAll(choices,11,12,22);

        Chooser choiceList = new Chooser(choices);

        System.out.println(choiceList.choiceList);
        System.out.println(choiceList.choose());

//        Set<String> guys = Set.of("Tom","Marry","Sam");
//        Set<String> stooges = Set.of("Larry","Moe","Curly");
//        Set<String> aflCio = union(guys,stooges);
//        System.out.println(aflCio);
    }
}

package Java8classes;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

//Internal loop-java 8

public class ForEachDemo {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5, 4, 6, 7, 8);
        //  Consumer<Integer >c= i->System.out.println(i);
        Predicate<Integer> predicate=n-> n %2==1;


           int result= list.stream()
                    .filter(n->n%2!=0)
                    .sorted()
                    .map(n->n*2)
                    .reduce(0,(c,e)->c+e);

        System.out.println(result);
    }
}
  
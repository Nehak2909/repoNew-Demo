package Java8classes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static java.lang.System.out;

public class ComparatorExampleUsingJava8 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList=new ArrayList<>();
        arrayList.add(32);
        arrayList.add(27);
        arrayList.add(29);
        arrayList.add(72);
        arrayList.add(76);
        arrayList.add(44);

        out.println(arrayList);
        //for sorting elemnts we use comparator and comparable
        //here we used lambda expression to sort elemnts in compartor
        Comparator<Integer> comparator=(I1,I2)->(I1<I2)?-1:(I1>I2)?1:0;

        //collection.sort() => used for sorting
       Collections.sort(arrayList, comparator);

        //itreate using lambda expression
        arrayList.stream().forEach(out::println);

        // even number from this arraylist
        List<Integer> list= arrayList.stream().filter(i-> i%2 == 0).collect(Collectors.toList());
        out.println("even nums : " + list);



    }
}

package Java8classes;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergeStream {
    public static void main(String[] args) {
        List<String> list1= Arrays.asList("bruno","aru","tai");
        List<String> list2= Arrays.asList("abc","fgd");

        //List<Integer> merge= Stream.concat(list1.stream().flatMap())
        System.out.println(list1.stream().map(l->l.toUpperCase()).collect(Collectors.toList()) );

        List<String> mergeString= Stream.concat(list1.stream(),list2.stream()).collect(Collectors.toList());

        //mergeString.forEach(System.out::println);
        System.out.println(mergeString);
        System.out.println();

        List<Integer> list=Arrays.asList(74,11,66,33,78);
        List<Integer> sorted =list.stream().sorted().collect(Collectors.toList());
        System.out.println(sorted.stream().filter(i->i%3==0).collect(Collectors.toList()));

    }
}
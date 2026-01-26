package Java8classes;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class LengthCountString {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("neha","suraj","lucky");
        Function<String ,Integer> stringIntegerFunction=new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return s.length();
            }
        };
        list.stream().map(stringIntegerFunction).forEach(System.out::println);
       List<String> n=list.stream().map(u->u.toUpperCase()).collect(Collectors.toList());
        System.out.println(n );

    }
}

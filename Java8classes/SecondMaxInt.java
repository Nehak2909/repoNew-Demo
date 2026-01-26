package Java8classes;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SecondMaxInt {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(4,5,3,8,4,66,33);
        int num=list.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println("second Highest Number : "+num);
    }
}

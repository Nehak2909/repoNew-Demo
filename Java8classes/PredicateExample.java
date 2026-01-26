package Java8classes;

import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        int[] arr={0,5,10,15,20,25,30,35};

        //for even numbers
        Predicate<Integer> p1 = i -> i % 2 == 0;

        //for checking wheretr num >10 or not
        Predicate<Integer> p2 = i -> i > 10;

        // and or  negate
        System.out.println("number is even negate add");
        for (int a : arr)
        {
            // and
            if (p1.negate().test(a)){
                System.out.println(a);
            }
        }

    }
}

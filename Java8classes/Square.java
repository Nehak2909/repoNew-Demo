package Java8classes;

import java.util.function.Function;

public class Square {
    public static void main(String[] args) {
        Function<Integer, Integer>f=i->i*i;
        System.out.println("Square of 5:"+f.apply(5));
        System.out.println("Square of 25:"+f.apply(25));

    }
}

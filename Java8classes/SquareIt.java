package Java8classes;

import java.util.function.Function;

public class SquareIt {
    public static void main(String[] args) {

        //lambda function
        Function<Integer,Integer> t=i->i*i;
        System.out.println("Square of 4 :" +t.apply(4));


    }
}

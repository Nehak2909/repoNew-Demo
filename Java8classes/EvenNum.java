package Java8classes;

import java.util.function.Predicate;

public class EvenNum {
    public static void main(String[] args) {
        //even number
        Predicate<Integer> f= i->i%2==0;
        System.out.println("is even:"+f.test(4));

        //odd Number
        Predicate<Integer> p= i->i%2!=0;
        System.out.println("is odd:"+p.test(4));


    }
}

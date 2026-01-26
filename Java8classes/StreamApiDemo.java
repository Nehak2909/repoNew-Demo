package Java8classes;

import java.util.Arrays;
import java.util.List;

public class StreamApiDemo {
    public static void main(String[] args) {
        List<Integer> nums= Arrays.asList(9, 5,6,7,8,3);


  int result= nums.stream()
           .filter(n ->n%2==1)
           .sorted()
           .map(n->n*2)
           .reduce(0,(c,e)->c+e )
           ;
      //Stream<Integer>mappedData= data.map(n->n*2).
     //  Stream<Integer> sortedData=data.sorted();
       //long count= data.count();
        System.out.println(result);

      /*  for(int n:nums)
        {
            System.out.println(n*2);
    */}
}

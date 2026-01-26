package InterviewProgram;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumberstartWithOne {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(12,77,54,13,17,1,100,41);

       List<Integer> num=list.stream().
               filter(i->!String.
                       valueOf(i)
                       .startsWith("1"))
               .collect(Collectors.toList());

       num.forEach(System.out::println);
    }
}

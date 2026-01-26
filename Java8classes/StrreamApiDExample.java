package Java8classes;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StrreamApiDExample {
    public static void main(String[] args) {
        List<String>names= Arrays.asList("abc","tfdd","dg ","dyfg");
        for (String name:names)
        {
            if(name.startsWith("d"))
            {
            System.out.println(name);
        }
    }
        List<String> filterednmaes=names.stream()
                .filter(name->name.startsWith("d"))
                .collect(Collectors.toList());
        System.out.println("filterednmaes :"+filterednmaes);
}
} 

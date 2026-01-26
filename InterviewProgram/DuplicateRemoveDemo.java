package InterviewProgram;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DuplicateRemoveDemo {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("suraj","suraj","Neha","Aru");
        list.stream().collect(Collectors.toSet()).forEach(System.out::println);
    }
}

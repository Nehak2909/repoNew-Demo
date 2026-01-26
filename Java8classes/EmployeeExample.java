package Java8classes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class  Emp{
    int eno;
    String name;

    public Emp(int eno, String name) {
        this.eno=eno;
        this.name=name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "eno=" + eno +
                ", name='" + name + '\'' +
                '}';
    }
}
public class EmployeeExample {
    public static void main(String[] args) {
        List<Emp> list = new ArrayList<Emp>();
        list.add(new Emp (69878,"neha"));
        list.add(new Emp (35555,"lks"));
        list.add(new Emp (35553,"nehalk"));
        list.add(new Emp (42355,"arayan"));

        //sorting using ascending order
        Collections.sort(list,(e1,e2)->(e1.eno<e2.eno)?-1:(e1.eno>e2.eno)?1:0);
        System.out.println(list);

        //sorting using alphabetically
Collections.sort(list,(e1,e2)-> e1.name.compareTo(e2.name));
        System.out.println(list);
    }

}

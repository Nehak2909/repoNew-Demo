package Java8classes;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

class Employee {
    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}

public class EmpSalary {
    public static void main(String[] args) {
        List<Employee> empList = Arrays.asList(
                new Employee(1, "Alice", 75000.78),
                new Employee(2, "Bob", 80000),
                new Employee(3, "Charlie", 120000),
                new Employee(4, "Diana", 60000)
        );

        // Find and print the employee with the highest salary
        Optional<Employee>maxsalary= empList.stream()
                .collect(Collectors.maxBy(Comparator.comparing(Employee::getSalary)));
        System.out.println("Maximum Salary"+maxsalary);
    }
}
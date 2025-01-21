package org.example.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeImpl {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("emp1", 50000),
                new Employee("emp2", 60000),
                new Employee("emp3", 55000),
                new Employee("emp4", 70000),
                new Employee("emp5", 65000)
        );

        int topN = 3;

        List<Employee> topNSalaries = employees.stream()
                .sorted((e1, e2) -> Double.compare(e2.getSalary(), e1.getSalary()))
                .limit(topN)
                .collect(Collectors.toList());

        System.out.println("Top " + topN + " highest salaries:");
        topNSalaries.forEach(System.out::println);
    }
}

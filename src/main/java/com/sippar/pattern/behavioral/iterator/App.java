package com.sippar.pattern.behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Harry", 10000));
        employees.add(new Employee("Katniss", 3500));
        employees.add(new Employee("Peter", 2000));

        Company company = new Company(employees);
        Iterator<Employee> iterator = company.createIterator();

        double totalSalary = 0;
        while (iterator.hasNext()) {
            totalSalary += iterator.next().getSalary();
        }

        System.out.println("Total salary: " + totalSalary);
    }
}

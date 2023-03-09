package interfaces;

import equals.Employee;

import java.util.*;

public class EmployeeSortTest {

    public static void main(String[] args) {

        Employee staff = new Employee()[3];

        staff[0] = new Employee("Harry Hacker", 35000);
        staff[1] = new Employee("Carl Cracker", 75000);
        staff[2] = new Employee("Tony Tester", 38000);

        Arrays.sort(staff);

        // print out information about all Employee objects
        for (Employee e : staff)
            System.out.println("Name: " + e.getName() + " Salary: " + e.getSalary());
    }
}

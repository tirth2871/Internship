import java.time.*;

public class EmployeeTest {
    public static void  main(String[] args) {

        // fill the staff array with three Employee objects
        Employee[] staff= new Employee[3];

        staff[0] = new Employee("Tirth Shah", 75000, 2001, 12, 15);
        staff[1] = new Employee("Harsh Patel", 80000, 2002, 15, 18);
        staff[2] = new Employee("Abhishek Patel", 90000, 2001, 18, 21);

        //raise everyone's salary by 5%
        for (Employee e : staff)
            e.raiseSalary(5);

        // print info about all Employee objects
        for (Employee e : staff)
            System.out.println("Name: " + e.getName() + "Salary: " + e.getSalary() + "Hire Day: " + e.getHireDay());
    }
}

class Employee {
    private String name;
    private double salary;
    private LocalDate hireDay;

    public Employee (String n, double s, int year, int month, int day) {
        name = n;
        salary = s;
        hireDay = LocalDate.of(year, month, day);
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public LocalDate getHireDay() {
        return hireDay;
    }

    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent/100;
        salary += raise;
    }
}
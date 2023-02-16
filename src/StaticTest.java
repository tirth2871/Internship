public class StaticTest {
    public static void  main(String[] args) {

        // fill the staff array with three Employee Objects
        Employee2[] staff = new Employee2[3];

        staff[0] = new Employee2("Tirth", 40000);
        staff[1] = new Employee2("Rahul", 50000);
        staff[2] = new Employee2("Amita", 60000);

        // print out information about all Employee objects
        for (Employee2 e : staff) {
            e.setId();
            System.out.println("Name: " + e.getName() + " ID: " + e.getId() + " Salary: " + e.getSalary());
        }

        int n = Employee2.getNextId(); //calls static method
        System.out.println("Next Available ID: " + n);
    }
}

class Employee2 {
    private static int nextId = 1;
    private String name;
    private double salary;
    private int id;

    public Employee2 (String n, double s) {
        name = n;
        salary = s;
        id = 0;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public void setId() {
        id = nextId; // set id to next available id
        nextId++;
    }

    public static int getNextId() {
        return nextId; //returns static field
    }

    public static void main(String[] args) { //unit test
        Employee2 c = new Employee2("Vijay", 70000);
    }
}

package abstractClasses;

public class PersonTest {
    public static void main(String[] args) {
        Person[] people = new Person[2];

        // fill the people array with Student and Employee objects
        people[0] = new Employee("Harry Hacker", 50000, 1989, 10, 1);
        people[1] = new Student("Maria Morris", "Computer Science");

        // print out names and descriptions of all Person ojects
        for (Person p: people)
            System.out.println(p.getName() + ", " + p.getDescription());
    }
}

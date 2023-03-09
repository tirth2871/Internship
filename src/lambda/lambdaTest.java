package lambda;

import java.util.*;
import javax.swing.*;
import javax.swing.Timer;

public class lambdaTest {
    public static void main(String[] args) {

        String[] planets = new String[] {"Mercury", "Venus", "Earth", "Mars", "Jupiter",
        "Saturn", "Uranus", "Neptune"};
        System.out.println(Arrays.toString(planets));
        System.out.println("Sorted in dictionary order: ");
        Arrays.sort(planets);
        System.out.println(Arrays.toString(planets));
        System.out.println("Sorted by length: ");
        Arrays.sort(planets, (first, second) -> first.length() - second.length());
        System.out.println(Arrays.toString(planets));

        Timer t = new Timer(1000, event ->
                System.out.println("The time is " + new Date()));
        t.start();

        // keep the program running until the user selects "ok"
        JOptionPane.showMessageDialog(null, "Quit Program?");
        System.exit(0);
    }
}

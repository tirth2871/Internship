package anonymousInnerClass;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import javax.swing.Timer;

public class AnonymousInnerClassTest {
    public static void main(String[] args) {

        TalkingClock clock = new TalkingClock();
        clock.start(1000, true);

        // keep the program running until user selects "ok"
        JOptionPane.showMessageDialog(null, "Quit Program");
        System.exit(0);
    }
}

class TalkingClock {

    public void start (int interval, boolean beep) {

        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                System.out.println("At the tone, the time is " + new Date());
                if (beep) Toolkit.getDefaultToolkit().beep();
            }
        };
        Timer t = new Timer(interval, listener);
        t.start();
    }
}

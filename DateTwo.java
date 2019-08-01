import org.omg.CORBA.INTERNAL;

import javax.swing.*;

public class DateTwo {

    void displayDay() {

        int loopselectro = 0;
        do {
            String dayNumberAsString = JOptionPane.showInputDialog("Please enter day number");
            int dayNumber = Integer.parseInt(dayNumberAsString);

            if (dayNumber == 1) {
                JOptionPane.showMessageDialog(null, "Monday");
                loopselectro = 1;
            } else if (dayNumber == 2) {
                JOptionPane.showMessageDialog(null, "Theusday");
                loopselectro = 1;
            } else if (dayNumber == 3) {
                JOptionPane.showMessageDialog(null, "Wednesday");
                loopselectro = 1;
            } else if (dayNumber == 4) {
                JOptionPane.showMessageDialog(null, "Thursday");
                loopselectro = 1;
            } else if (dayNumber == 5) {
                JOptionPane.showMessageDialog(null, "Friday");
                loopselectro = 1;
            } else if (dayNumber == 6) {
                JOptionPane.showMessageDialog(null, "Saturday");
                loopselectro = 1;
            } else if (dayNumber == 7) {
                JOptionPane.showMessageDialog(null, "Sunday");
                loopselectro = 1;
            } else {
                JOptionPane.showMessageDialog(null, "Wrong day number");
                loopselectro = 0;
            }
        } while (loopselectro < 1);
    }
}

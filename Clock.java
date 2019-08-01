import javax.swing.*;

public class Clock {

    void displaypartOfDay(){

        int loopControl = 1;
        do{
            String actualTime = JOptionPane.showInputDialog("Please enter time" );
            int time = Integer.parseInt(actualTime);

            if (time >= 801 && time <=1200){
                JOptionPane.showMessageDialog(null,"Morning");
            loopControl = 1;
            }
            else if (time >= 1201 && time <=1700){
                JOptionPane.showMessageDialog(null,"Afternoon");
            loopControl = 1;
            }
            else if (time >= 1701 && time <=2400){
                JOptionPane.showMessageDialog(null,"Evening");
                loopControl = 0;}
            else if (time >= 2401 && time <=800){
                JOptionPane.showMessageDialog(null,"Early Morning");
                loopControl = 0;}

            else {
                JOptionPane.showMessageDialog(null,"Wrong Time entered","Error",JOptionPane.ERROR_MESSAGE);
            loopControl = 0;
            }


        }while (loopControl <1);


    }
}

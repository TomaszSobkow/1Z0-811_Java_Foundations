import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Frame {

    void showFrame() {
        JFrame myframe = new JFrame();
        myframe.setTitle("Tom");
        myframe.setSize(500,500);
        myframe.setVisible(true);
        int x = 200, y = 350;
        myframe.setLocationRelativeTo(null);
        myframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton button1 = new JButton("First Button");
        button1.setBounds(100,100,150,45);
        myframe.add(button1);
        if (button1.equals("First Button")){
                topic7Exercises.ternaryOperator();

        }



        }


    Topic7Exercises topic7Exercises = new Topic7Exercises();


}

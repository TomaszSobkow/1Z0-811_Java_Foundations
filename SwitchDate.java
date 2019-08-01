import javax.swing.*;

public class SwitchDate {


    public  void CalculateNumDays(){

        int doManipulator = 0;

        do{
            String choiceDay = JOptionPane.showInputDialog("Please enter month");
            int month = Integer.parseInt(choiceDay);

            switch (month){
                case 1:
                case 3: {System.out.println("Your choice is: " + month);
                doManipulator = 1;
                break;}
                case 2: {JOptionPane.showMessageDialog(null,"Your hoice is: " + month  );
                    doManipulator = 1;
                    break;}
                case 4: {JOptionPane.showMessageDialog(null,"Your hoice is: " + month  );
                    doManipulator = 1;
                    break;}
                case 5: {System.out.println("Your choice is: " + month); break;}
                case 6: {JOptionPane.showMessageDialog(null,"Your hoice is: " + month  );
                    doManipulator = 1;
                    break;}
                case 7: {System.out.println("Your choice is: " + month);
                    doManipulator = 1;
                    break;}
                case 0: {JOptionPane.showMessageDialog(null,"Wrong month","Error",JOptionPane.ERROR_MESSAGE);
                    break;}

                default:{
                    JOptionPane.showMessageDialog(null,"Wrong month","Error",JOptionPane.ERROR_MESSAGE);
                    doManipulator =0;
                    break;
                }

            }

        }while (doManipulator <1);
    }

}

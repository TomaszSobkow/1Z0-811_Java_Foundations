import javax.swing.*;

public class BlockRows {

    void displayRows(){
        String collumns = JOptionPane.showInputDialog("How many Collumns do you want? ");
        String rows = JOptionPane.showInputDialog("How many Rows do you want? ");

        int height = Integer.parseInt(collumns);
        int width =  Integer.parseInt(rows);
        for (int countRow = 1; countRow < height; countRow++){

            for (int countCol = 1; countCol < width; countCol++){
                System.out.print("£");
            }
            System.out.println(countRow);
        }
    }

    void negacja(){
        boolean m = true;
        boolean gotowe;

        if(!m){
            System.out.print("Uwaga m ma wartosc  zero");
        }
        gotowe = false;
        if(!gotowe){
            System.out.print("Jeszcze nie gotowe");
        }
    }
}

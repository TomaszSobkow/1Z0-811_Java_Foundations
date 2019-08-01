import javax.swing.*;
import java.util.ArrayList;

public class NamesList {

    public ArrayList theList;

    public void setTheList(){
    theList = new ArrayList();
    theList.add("Tom");
    theList.add("Aga");
    theList.add("Manuela");
    theList.add("Paule");
    theList.add(2,"Joe Smith");
    printTheList();
    theList.remove(0);
    printTheList();
    }

    public void printTheList(){
        JOptionPane.showMessageDialog(null,"Names List -->" + theList +
                "\nThe size theList is :" + theList.size());
    }


    }// end class



import javax.swing.*;
import java.util.ArrayList;

public class NameListTwo {
    public ArrayList names;

    public void setList(){
        names = new ArrayList();
        names.add("Tom Sobkow");
        names.add("Aga Hindmarsh");
        names.add("Manuela Upton");
        names.add("Paule");
        names.add("Beat ");
        names.add("John");
        names.add("Pearl");
        names.add("Paule");
        JOptionPane.showMessageDialog(null,"\nSize of ArrayList is: " +
                names.size());
    }
    public void displayNames(){
            System.out.println("Names in the ArrayList: ");
            for( int i = 0; i < names.size(); i++)  {
                System.out.println(""+ (i+1) +" " + names.get(i));
            }
            for (Object imiona: names){
                System.out.println("And now enhanced loop for "+ imiona);
            }
            }


    }


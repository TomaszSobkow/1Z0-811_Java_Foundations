import javax.swing.*;

public class Counter {
public final int MAX_COUNT = 100;
    int checkModule = 1;

public void dysplayCount(){
    for (int i = 1; i <= MAX_COUNT; i++){
        if(i% 12 ==0 ){
       System.out.println(checkModule+". Value for i -->" + i);
        checkModule++;
        }
    }
    //JOptionPane.showMessageDialog(null,"I has " + checkModule+ " divisible");

}


    public void loopFor(){
        for(String i = "|", t = "+----" ; i.length()<8; i += "|", t = t.substring(1))
        {
            System.out.println(i + t);


        }
    }
}

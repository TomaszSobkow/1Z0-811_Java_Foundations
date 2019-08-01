import javax.swing.*;

public class CD {



        String nameCD, author;
        int duration, numbersOfSongs;

    CD (String nameCD, String author, int duration, int numbersOfSongs){
            this.nameCD = nameCD;
            this.author = author;
            this.duration = duration;
            this.numbersOfSongs = numbersOfSongs;
        }

    CD(){}

       public void printCdDetails(){
            System.out.println("CD Name           "+nameCD+
                               "\nAuthor          "+author+
                               "\nDuration        "+duration+
                               "\nNumber of Songs "+numbersOfSongs);
        }

         public String  getCdName(){
             String nameCD = JOptionPane.showInputDialog("Please enter Cd Name");
             return  nameCD;
          }


}

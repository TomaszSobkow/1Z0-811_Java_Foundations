import javax.swing.*;


class Test{
    private String name;

    static String printName(String name){
        return name;
    }

        }

public class GuessingGame {

    public static void main(String args[]){

        Test.printName("Tomasz ");


        int randomNum = 0 ;
        int guess;

        if(args.length == 0 || args[0].compareTo("help") == 0){
            JOptionPane.showMessageDialog(null,"Usage: java GuessingGame [argument]");
            System.out.println("Enter a number from 1 - 5 as your guess.");}
            else{
            randomNum = ((int) (Math.random()*5)+1);
            guess = Integer.parseInt(args[0]);}
        }

    }



import jdk.nashorn.internal.scripts.JO;

import javax.swing.*;

public class Topic8Exercises {


    void JFT8Ex1(){
        for(int i =1; i <= 10; i++)
            System.out.println((i)+". Learning Java is truly a rewarding experience!"); }

    void JFT8Ex2(){
        for (int i = 0; i <=9; i++)
            System.out.println(i); }

    void JFT8Ex3(){
        for(int i = 6; i <=10; i++)
            System.out.println(i); }

    void JFT8Ex4(){
        for(int i = 0; i ==0; i++ )
        System.out.println(i); }

    void JFT8Ex5(){
        String[] artists = {"Michael Jackson", "Frankie Goes To Hollywood", "Queen", "Simple Minds", "Rick Astley" };
        for(int index  = 0; index < artists.length; index++)
            System.out.println("No "+(artists.length - index)+": "+artists[index]); }

    void JFT8Ex6(){
        for(int i = 5; i <= 30; i = i+5 )
            System.out.print(i+" "); }

    void JFT8Ex7(){
        for(int i  = 300; i > 0; i = (i-50) )
            System.out.print(i+" "); }

    void JFT8Ex8(){
        String[] colorsArray = {"Blue", "Orange", "Yellow", "Green", "White", "Red", "Black"};
        for(String colors: colorsArray){
            System.out.println(colors); } }

    void JFT8Ex9(){
        String[] novelsArray = {"Black Beauty", "Treasure Island", "Pride and Prejudice"};
        for(String novel: novelsArray)
            System.out.print(novel+" "); }

    void JFT8Ex10(){
        String[] passwordsArray = {"oxymoran", "poxedfox", "kingfisher","cruiseshipper"};
        String userName = JOptionPane.showInputDialog("Please enter password");
        boolean passwordFound = false;

        for(String passwords: passwordsArray){
            if(passwords.equals(userName)){
               JOptionPane.showMessageDialog(null,"Log-On Successful");
               passwordFound = true;
               break;
            }
        }

        if(!passwordFound)
        System.out.print("\"You cannot be logged on using the specified password.\"");
    }

     public void JFT8Ex11(){
        char[] responsesArray = {'N','Y','Y','Y','Y','Y','N','Y','N','N'};
        int correctAnsvers = 0;
        boolean responses = false;
        for(int i = 0; i < responsesArray.length; i++){
            if(responsesArray[i]=='Y'){
                correctAnsvers++;
                if(correctAnsvers == 7){
                    responses = true;
                    System.out.print("The trip will go: "+ responses);

                break;}
            }
        }
         if(!responses)
             System.out.print("The trip cannot go :"+responses);
     }

    void JFT8Ex12(){
        int[] agesArray = {34, 16, 31, 19, 30, 19, 32, 11, 12, 13};
        String[] namesArray = {"John Welsh", "Frank Hayes", "Anna Davis", "Francis Burns", "Fred Smith",
                                "Philippa Smith", "Jason Button", "Ian Hayes", "Derva Conway"};
        for( int i = 0; i < agesArray.length; i++){
            if(agesArray[i] < 18)
                continue;
                System.out.println("Index-->"+ i+". "+(agesArray[i])+" You are eligible to vote." + namesArray[i]);

        }
    }

    void JFT8Ex13(){
        int i =1;
        while(i < 6){
            System.out.println(i);
            i++;
        }
    }

    void JFT8Ex14(){
        int i = 5;
        while( i <=30){
            System.out.print(i+" ");
            i += 5;
        }
    }

    void JFT8Ex16(){
        int i = 1;
        while(i <= 10){
            System.out.println(i+" Hallo World!");
            i++;
        }
    }

    void JFT8Ex17(){


    }

void JFT8Ex18(){
    int i = 0;
    do{
        System.out.println(i+" In the loop ");
        i++;
    }while(i <8);
}

void JFT8Ex19(){
    int correctAnsvers = 0;
    boolean response = false;
    int i =0;
    char[] responsesArray = {'Y','Y','Y','Y','Y','Y','N','Y','N','N'};
    while(i < responsesArray.length){
        if(responsesArray[i] == 'Y'){
            correctAnsvers++;
            if (correctAnsvers == 7){
                System.out.print("The trip will go");
                response = true;
                break;
            }
        }
        i++;
    }
    if(!response){
        System.out.println("The trip cannot go");
    }
}



    void quiz(){
        float[] studentGrades = {25.00f, 49.00f, 55.00f, 65.00f, 12.00f};
        final float PASSmARK = 40.00F;
        int i ;
        for( i =0; i < studentGrades.length; i++){
            if(studentGrades[i] < PASSmARK)
                continue;
                System.out.println("true -->"+i);
        }
    }

    void question8(){
        int[] numbers = new int[] {1,2,3,4};

        for(int x=0; x<numbers.length; x++){

            System.out.println(numbers[x]);}
    }
}

import java.lang.NumberFormatException;
import java.util.InputMismatchException;
import java.util.Scanner;
public class JFT14Ex1 {

    boolean answer = true;




     void q6(){
         Scanner input = new Scanner(System.in);
         System.out.print("Enter a message; ");
         String message = input.nextLine();


         while (answer){
             try{
             System.out.print("Enter the position of the word to extract:");
             int positionWord = input.nextInt();
             System.out.println("Extracted word: ");
             answer = false;

             }
             catch(NumberFormatException e){
                 System.out.println("Enter the number not text please");
                 answer = true;
             }
             catch(InputMismatchException e){
                 System.out.println("Only numbers please");
                 answer = true;
             }
         }
     }


    void q5(){
        Scanner input = new Scanner(System.in);
        String position = "\tNow Enter the possition of the character that you wish to extract? ";
        System.out.print("\nPlease enter a message: ");
        String userMessage =  input.nextLine();

        while(answer){
            try{
                Scanner inputPossition = new Scanner(System.in);
                System.out.print(position);
                int positionAsInt = inputPossition.nextInt();

                System.out.println("\n\tExcracted character from your message is: --> "+ userMessage.charAt(positionAsInt-1)+" <--");
                answer = false;
            }
            catch(InputMismatchException errorInput){
                System.out.println("Please enter a number only!!");
                answer = true;}
            catch(StringIndexOutOfBoundsException arrayError){
                System.out.println("Please enter the character position between 1 to " + userMessage.length());
                answer = true;}
        }

    }

    void q4(){
        String[] popularPlaces = {"Cork","Munster","Fermoy","Limerick","Dublin","Sligo"};
        boolean correctAnser = true;
       
        while(correctAnser){
            System.out.println("\n\nThe following holiday destination are avilable.\n");
            
            for (int index = 0; index < popularPlaces.length; index++){
                System.out.println((index+1) + ": "+ popularPlaces[index]);
            }

            Scanner input = new Scanner(System.in);
            System.out.print("\nEnter a number to make your selection: ");

            try{
                int choice = input.nextInt();
                System.out.println("You will have great time in: "+ popularPlaces[choice -1]);
                correctAnser = false;}                  
            catch(ArrayIndexOutOfBoundsException arrayError){
                System.out.println("\n\tEntered wrong number !! please choice number from 1 to "+popularPlaces.length);
                correctAnser = true;}    
            catch(InputMismatchException numberError){
                System.out.println("\n\tAn incorrect character has been entered");
                correctAnser = true;}   
        } 
    }

    void q3(){
        
        byte[] numbers = {6,5,4,3,2,1};
        int in = 2500;
        try{
            System.out.println(numbers[in]);
        }
        catch(ArrayIndexOutOfBoundsException arrayError){
            System.out.println("Error: Unalbel to acces data - bad index: " + in);

       }

    }


    void q2() {
        int num1 = 10;
        int num2 = 0;
        int result = 0;

        try {
            result = num1 / num2;
            System.out.println(result);
        } catch (ArithmeticException ae) {
            System.out.println("You can't devided " + num1 + " by " + num2);
        }
    }


    void q1 () {
        String value = "Two";
         int passedValue = 0;

         try {
                passedValue = Integer.parseInt(value);
         }
         catch (NumberFormatException e) {
                System.out.println("Error: Unable to parse data. Program closing");
         }
    }
}

import javax.swing.*;

public class Topi6Exercises {
    int exerciseNumer = 1;

    void JFT6Ex1(){
        boolean hasPermit = true;
        if(hasPermit){
            System.out.println(exerciseNumer+" You can go on the fishing trip as you have a pernit");
        exerciseNumer++;
        }
    }

    void JFT6Ex2(){
        int registred = 2, toPassTrip = 5;
        if(registred < toPassTrip){
            System.out.println(exerciseNumer+" The fishing trip will not go ahead. Insufficient numbers");
        exerciseNumer++;}

    }

    void JFT6Ex3() {
        boolean hasPermit = false;
        int alowedAge = 19;
        if (hasPermit == false && alowedAge >= 18) {
            System.out.println(exerciseNumer + " You can't go on the fishing trip as " +
                    "you do not meet the qualifying criteria");
            exerciseNumer++;
        }
    }
    void JFT6Ex4(){
//        String withDrawAsString= JOptionPane.showInputDialog("Enter withdraw value? ");
//        float withDraw = Float.parseFloat(withDrawAsString);
        float withDraw = 40;
        float balance = 180;
        if(withDraw < balance){
            System.out.print(exerciseNumer+ " Withdrawal processed: "+withDraw+
                    "\n\tNew balance: " + (balance -= withDraw));}
        else {
            System.out.print(exerciseNumer + " Insufficient Founds");
        }
            exerciseNumer++;
        }


    void JFT6Ex5(){
        int withDraw = 20;
        int ballance = 180;
        String withdrowDecision = withDraw > ballance ? "Insufficient founds !!":" Withdraw Processed";
        System.out.println("\n" + exerciseNumer+withdrowDecision);
        exerciseNumer++;
    }
    void JFT6Ex6(){
        int minimumAge =18;
        boolean sober = true;
        if( (minimumAge >= 18) && (sober)){
            System.out.println(exerciseNumer+ " You Welcome");
        }
        else {System.out.println(exerciseNumer+" Not tonight. Sorry");
        }
        exerciseNumer++; }

    void JFT6Ex7(){
        int soldProducts = 1000;
        int yearsOfService = 20;
        int salesPerYear = 10000;

        if(soldProducts >=1000 ){
            if(yearsOfService >=20){
                if(salesPerYear >= 10000){
                    System.out.print(exerciseNumer+ " You are qualified to bonus Bravo !!");
                    }else{System.out.print(exerciseNumer+ " You have not qualified for a bonus to less SALES");}
            }else {System.out.print(exerciseNumer+ " You have not qualified for a bonus to less YEARS");}
        }else {System.out.println(exerciseNumer+" You have not qualified for a bonus not to less PRODUCTS");}
        exerciseNumer++;
    }


    void JFT6Ex8(){
            float grade = 45f;
            String gradeString = "Grade achieved :";
            if(grade >= 85 && grade <=100) System.out.println(gradeString+"A");
            else if (grade >= 70 && grade <= 84) System.out.println(gradeString+"B");
            else if (grade >= 55 && grade <= 69) System.out.println(gradeString+"C");
            else if (grade >= 40 && grade <= 54) System.out.println(gradeString+"D");
            else if (grade >= 25 && grade <= 39) System.out.println(gradeString+"E");
            else if (grade >= 10 && grade <= 24) System.out.println(gradeString+"F");
            else if (grade >= 0 && grade <= 9 )  System.out.println(gradeString+"No Grade");
    }

    void JFT6Ex9(){
        float currentTemperature = 14.19f;
        if (currentTemperature > 20) System.out.println("Tropical Temperature");
        if (currentTemperature >=10 && currentTemperature <= 19)System.out.println("Worm Temperature");
        if (currentTemperature >= 0 && currentTemperature <= 9)System.out.println("Moderate Temperature");
        if (currentTemperature >=(-1) && currentTemperature <=(-4))System.out.println("Cold Temperature");
        if (currentTemperature < (-5)) System.out.println("Arctic Temperature");
    }

    void JFT6Ex10(){
        String dayOfWeek = "Monday";

        switch (dayOfWeek)
        {
            case  "Monday":
                System.out.println("The day is Monday");
                break;
        }
    }

    void JFT6Ex611(){
        char status = 'D';
        String statusAsString = "Status: ";

        switch(status) {
            case 'D':
                System.out.print(statusAsString + "Divorced");
                break;
            case 'S':
                System.out.print(statusAsString + "Single");
                break;
            case 'M':
                System.out.print(statusAsString+ "Married");
                break;
            case 'W':
                System.out.print(statusAsString+ "Widowed");
                break;
            default:
                System.out.println("Invalid data");
        }
    }

    void JFT6Ex12(){
         /*
    // A single line comment can be placed within a multi-line comment.
   */
        byte noOfMilesCoverde = 10;
        String availableWater = "\nWater is available at this mark";
        String noWater = "\nNo water is available at this mark";
        if(noOfMilesCoverde == 5)
            System.out.print(availableWater);
        else if (noOfMilesCoverde == 10)
            System.out.print(availableWater);
        else if (noOfMilesCoverde == 15)
            System.out.print(availableWater);
        else if (noOfMilesCoverde == 20)
            System.out.print(availableWater);
        else if (noOfMilesCoverde == 25)
            System.out.print(availableWater);
        else
            System.out.println(noWater);

        switch (noOfMilesCoverde) {
            case 5:
            case 10:
            case 15:
            case 20:
            case 25:
            default: System.out.println(availableWater);
        }
    }



    void LogicOperators(){
        int k = 5;
        int z = k++;
        System.out.println(z+" k->"+k);
        if(--z>5 ||++z>6)--z;
        System.out.println(z);
    }
}

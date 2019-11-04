
import javax.swing.*;

public class Topic7Exercises {
     public void  ternaryOperator(){
        int a = 20, b = 30;
         a = (a > b)? (a = 12) : (a = 34);
        System.out.println("Hello" +a);
    }

    void loopsWhile(){
        int i =0;
        while (i < 120){
            System.out.print(i+".");
            i+=5;
        }
    }

     static void factorial(int target){
         int save = target;
         int fact = 1;
         do{
        System.out.println("fact->1: " + fact);
       fact *= target--;
             System.out.println("fact->past: " + fact);
         }while (target > 0 );
         System.out.println("Factorial " + save + ": " + fact);
     }
     void continu(){
         String[] names = {"John Hayes", "Michael", "Frankie Science"};
         for(int i =0;  i <names.length; i++ ){
             if(names[i].equalsIgnoreCase("Michael"))
                 continue;
             System.out.println(names[i]);
         }
     }

void enhancedForLoop(){
    String[] names = {"John Hayes", "Michael Smyth", "Frankie Science"};
    for(String name: names) {
    System.out.println(name);
    }
    }


    void readMontsArray(){
        String [] monts = {"January","February","March","April","May","June","July","August","September",
                "October","November","December"};
        for (String mont: monts) {
            System.out.print(mont+" " );
            }
        }

    void  readSalaryArray(){
        Float[] salary = {24000.50f, 30432.54f, 29454.54f, 45000.00f, 20500.00f };
        System.out.println("There are "+salary.length+" employees.\nTheir salary are: ");
        for (int index = 0; index < salary.length; index++)
            System.out.println((index+1)+" "+salary[index]);
    }

    void readAgesArray(){
        Integer[] ages = {16, 16, 17, 16, 17,16};

        System.out.println("There are "+ages.length +" students.\nThere ages are:");
        for (int index = 0; index<ages.length; index++){
            System.out.println((index+1)+". "+ ages[index]);

        }
    }

    void read4Arrays(){
        String[] names = {"John Hayes", "Michael Smyth", "Frankie Science"};
        float[] ages = {30f, 24f, 20f};
        String [] degree = {"Sport Science","Law","Computer Science"};
        char[] code = {'D', 'W', 'B'};

        int degreeArray = 0;
        int age = 0;
        int codeIndex = 0;
        for(int name = 0; name < names.length; name++) {
            for(age = age; age < ages.length; ){
                for ( degreeArray = degreeArray; degreeArray < degree.length; ){
                       for(codeIndex = codeIndex; codeIndex < code.length; ){
                           System.out.println((name+1) +". Name: "+names[name]+"\tAge: "+ages[age]+
                                   "\tDegree Programme: " +degree[degreeArray]+ "\tCode: "+ code[codeIndex]);
                        break;
                       }
                  codeIndex++;
                  break;
                }
             degreeArray++;
             break;
            }
         age++;
        }
    } // end void read3Arrays
        private String[] currancy = {"GBP", "USD", "ZL"};
        private float[] exchangeRate = {0.718836f, 1.12370f, 138.682f};


        private void exchangeCalc(float euro, float exchangeRate, String curracyName){
        double valueExchange = euro * exchangeRate;
        System.out.println(euro+ " Euro converted to " + curracyName + "  is: " +Math.round(valueExchange));
    }

    void currency(){
        int exchangeIndex = 0;
        int currancyIndex = 0;
        for( currancyIndex = currancyIndex; currancyIndex < currancy.length; currancyIndex++)
        {
            for(exchangeIndex = exchangeIndex; exchangeIndex < exchangeRate.length;){
                System.out.println(currancy[currancyIndex]+ "\t\t" +exchangeRate[exchangeIndex]);
                break;
            }
            exchangeIndex++;
        }

        int exchangeIndexTwo = 0;
        int currancyindexTwo = 0;
        for(currancyindexTwo = currancyindexTwo; currancyindexTwo < currancy.length; currancyindexTwo++){
            for (exchangeIndexTwo = exchangeIndexTwo; exchangeIndexTwo < exchangeRate.length;){
                exchangeCalc(100,exchangeRate[exchangeIndexTwo],currancy[currancyindexTwo]);
                break;
            }
            exchangeIndexTwo++;
        }
    }
    void arrayWithfruits(){
    String favoriteFruits = JOptionPane.showInputDialog("how many favorite fruits do you like?.");
    int fruits = Integer.parseInt(favoriteFruits);
   String[] fruit = new  String[fruits];
   for(int index = 0; index < fruit.length; index++){
       fruit[index] = JOptionPane.showInputDialog("Please enter your "+ ( index+1 )+" favorite fruit. ");
   }
   for(int i = 0; i < fruit.length; i++)
   System.out.println(fruit[i]);

   int[] tomy = new int[4];
   tomy[0] = 1;

    }
}

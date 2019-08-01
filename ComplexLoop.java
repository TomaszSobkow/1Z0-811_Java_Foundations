public class ComplexLoop {
    String name = "Lenny", guess = "";
    int numTries = 0;

        void tryName(){

       while (!guess.equals(name.toLowerCase())){
                guess = "";
                 while (guess.length() < name.length()) {
                    char asciiChar = (char)(Math.random()*26 + 97);
                    guess += guess + asciiChar;
               }
                    numTries++;
           }
           System.out.println(name + "Found after " + numTries + " tries");

       }
    }


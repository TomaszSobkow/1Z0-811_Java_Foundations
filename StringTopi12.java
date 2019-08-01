public class StringTopi12 {


        public static void main(String[] args){

           StringTopi12 newClass = new StringTopi12();

            newClass.text();
            /*
	JFT12Ex12();
	JFT12Ex10();
	JFT12Ex9();
	JFT12Ex8();
	JFT12Ex7();
	JFT12Ex6();
	JFT12Ex5();
	JFT12EX4();
	*/
        }


        public void text(){

            String message = "Ship Ahoy";
            String message2 = new String("Ships Ahoy");
            System.out.println(message.compareTo(message2));
        }

        public static void JFT12Ex13(){
            String club = "Liverpool";
            int year = 2015;
            System.out.printf("%s won the Champions League in %d",club,year);

        }

        public static void JFT12Ex12(){
            String name = "Daniel Franks";
            int age = 30;
            int averageAge = 23;

            if(age > averageAge)
                System.out.printf("%s - your age of %d is greater than the average age (%d) ",name,age,averageAge);


        }

        public static void JFT12Ex11(){
            String risingFootballStar = "Eden Hazard";
            String stringExtract = risingFootballStar.substring(2,risingFootballStar.length());
            System.out.println(stringExtract);
        }

        public static void JFT12Ex10(){
            String name = " Christopher N. Cross ";
            System.out.println(name.trim());
        }

        public static void JFT12Ex9(){
            String song = "FOLLOW THE YELLOW BRICK ROAD";
            System.out.println(song.toLowerCase());
        }

        public static void JFT12Ex8(){
            String tale = "Curiosity killed the cat!";
            System.out.println(tale.replace('k','f'));
        }

        public static void JFT12EX4(){
            String example = "Java Bean";
            String charakter = "\nThe sixth character in my String is: ";
            System.out.println(charakter+example.charAt(6));
        }

        public static void JFT12Ex5(){
            String userName = "Duke";
            String happy = userName.concat(" Happy Birthday!!");
            System.out.println(happy);
        }

        public static void JFT12Ex6(){
            String userEnteredPassword = "javabeans";
            String password = "JAVABEANs";
            if(userEnteredPassword.equalsIgnoreCase(password))
                System.out.println("Log-on successful");
            else
                System.out.println("Not equal");
        }

        public static void JFT12Ex7(){
            String message1 = "Message in a bottle";
            String message2 = "Message in a jar";
            if(message1.length() > message2.length())
                System.out.println("\nMessage 1 length: "+message1.length()+
                        "\nMessage 2 length: "+message2.length()+
                        "\n"+message1+ " is longer than Message in a jar");
        }
    }

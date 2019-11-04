
import java.io.*;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;


class Date{
    int month, day, year;

    public Date(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public Date(){
        this.day = 0;
        this.month = 0;
        this.year = 0;
    }

    public String  toString(){
        return "Day: "+day+"\nMonth: "+month+"\nYear: "+year;
    }

}

class Exam{

      public int arrayTEST() {
        ArrayList list = new ArrayList();
        list.add("Bananas");
        list.add("Apples");
        list.add("FileDescriptor");
        list.add("Bred");
          System.out.println(list.get(list.size()-1));

           return 0;
        }

    }

    class Question{

    String letter = "Q";
    }


public class Main {
    private String userLogin, userPassword, town, country;
    private static int phoneNumber;

static boolean defaultBoolean;
static int defaultInt;
static double defaultDouble;
static String defaultString;

private static int inny;

private static  final String lowercase= "2";


  public  static void main(String[] blabla)  {

onlyInt_Max_Min();
onlyIntBubble();



  }
  static int[] onlyIntArray = {12,45,67,-34,555,7890,325467,-2342,2563,235,234,-232,253,5652,-354,554,5675};

  static void onlyIntPrint(){
  for (int e: onlyIntArray)
        System.out.print(e+",");
  }

  static void onlyInt_Max_Min(){
     int min, max, sum;
     sum = onlyIntArray[0];
     min = max = onlyIntArray[0];
     for (int i = 1; i < onlyIntArray.length; i++){
          if(onlyIntArray[i] < min) min = onlyIntArray[i];
          if(onlyIntArray[i] > max) max = onlyIntArray[i];
          sum += onlyIntArray[i];
      }
        System.out.printf("Min %d\nMax %d\nNumbers in array %d\nSum %d%n", min, max, onlyIntArray.length, sum);
        onlyIntPrint();
    }

    static void  onlyIntBubble(){
      int a,b,c;
      for(a = 1; a < onlyIntArray.length; a++)
          for (b = onlyIntArray.length -1; b >= a; b-- ){
              if(onlyIntArray[b-1] > onlyIntArray[b]){
                  c = onlyIntArray[b - 1];
                  onlyIntArray[b -1] = onlyIntArray[b];
                  onlyIntArray[b] = c;
              }
          }
        System.out.println("\n");
      onlyIntPrint();
    }









//       FileWriter pw = new FileWriter("UsersAddresses.txt", true);
//       FileReader reader = new FileReader("UsersAddresses.txt");
//       BufferedReader bufferedReader = new BufferedReader(reader);
//
//       try {
//           String line = bufferedReader.readLine();
//           if (line != null) {
//               for (int i = 0; i < 1; i++) {
//                   pw.write("\n" + line);
//                   pw.close();
//               }
//               while (line != null) {
//                   System.out.println(line);
//                   line = bufferedReader.readLine();
//
//               }
//
//           } else {
//               pw.write("dd");
//               pw.close();
//               line = bufferedReader.readLine();
//               while (line != null) {
//                   System.out.println(line);
//                   line = bufferedReader.readLine();
//               }
//           }
//       } catch (IOException e) {
//           e.printStackTrace();
//       }
//       finally {
//           System.out.println(" finaly always work");
//       }
//       }

//       ArrayList<String> list = new ArrayList();
//       list.add(new String("Tom"));
//       list.add("Aga");
//       list.add("Ben");
//       list.add("Banana");
//       list.clear();
//       System.out.println(list.isEmpty());



//       Main user = new Main();
//       user.writeUserData();
//      user.readUsersFile();
//       user.readPasswordsFile();
//       user.readAddressFile();



        public static void test(){
            System.out.println("true");
            return;
        }
        FileWriter passwordFile, usersFile, addressFile;

    public  void writeUserData()  {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter Login: ");
        userLogin  = input.nextLine();
        System.out.print("Password: ");
        userPassword  = input.nextLine();
        System.out.print("Town: ");
        town = input.nextLine();
        System.out.print("Country: ");
        country = input.nextLine();
        try{
            System.out.print("Phone number: ");
            phoneNumber = input.nextInt();

            passwordFile = new FileWriter("UsersPasswords.txt",true);
            usersFile = new FileWriter("UsersLogin.txt",true);
            addressFile = new FileWriter("UsersAddresses.txt",true);
            passwordFile.write(userPassword+",");
            usersFile.write(userLogin+",");
            addressFile.write(town+",");
            addressFile.write(country+",");
            usersFile.close();
            passwordFile.close();
            addressFile.close();

        }catch (IOException ex){
           System.out.println("Problem with write to  file");
        }catch (NullPointerException np){
            System.out.println("File was not writen");
        }catch (InputMismatchException im){
            System.out.println("Please enter only digit please ");
        }
   }

   public void readPasswordsFile(){
       try {
            BufferedReader read = new BufferedReader(new FileReader("UsersPasswords.txt"));
            String line = read.readLine();
      while (line !=null){
          System.out.println("Password: "+line);
          line = read.readLine();
          }
       }catch (IOException oe){
        System.out.println("Password file was not read");
       }
   }
        public void readUsersFile(){
            try {
                BufferedReader read = new BufferedReader(new FileReader("UsersLogin.txt"));
                String line = read.readLine();
                while (line !=null){
                    System.out.println("User: "+line);
                    line = read.readLine();
                }
            }catch (IOException oe){
                System.out.println("Users file was not read");
            }
        }

        public void readAddressFile(){
            try {
                BufferedReader read = new BufferedReader(new FileReader("UsersAddresses.txt"));
                String line = read.readLine();
                while(line!=null){
                    if(line == ","){
                        continue;
                    }
                    System.out.println("Town: "+line);
                    line = read.readLine();
                }
            }catch (IOException io){

            }
        }






//		IteratorTest iteratorTest = new IteratorTest();
//		//iteratorTest.iteratorArray();
//
//
//        int x=10;
//        int y=10;
//
//        Main obj = new Main();
//        Main obj2 = new Main();
//        Main obj3 = obj2;
//
//        boolean b1 = x==y;
//        boolean b2 = obj == obj3;
//
//        System.out.println(b1 + "-" + b2);


//        if(message1.equals(message2)){
//            System.out.println(true);
//        }else{
//            System.out.println(false);
//        }

//        if(message1.compareTo(message2)){
//            System.out.println(true);
//        }else{
//            System.out.println(false);
//        }

//        if(message1 == message2){
//            System.out.println(true);
//        }else{
//            System.out.println(false);
//        }


        //Topic15 topic15 = new Topic15();
        //topic15.phonePad();


//            int[] numbers = new int[5];
//            numbers[0] = 0;
//            numbers[1] = 1;
//            numbers[2] = 2;
//            numbers[3] = 3;
//            numbers[4] = 4;
//            numbers[5] = 5;
//
//            for(int n:numbers)
//                System.out.println(n);


//        String[] names = {"Tom", "Aga", "Gregor"};
//        System.out.println(names[2]);
//
//        String name = null;
//        try {
//            System.out.println(name.length());
//        }
//        catch (NullPointerException e){
//            System.out.println("Cany by null");
//        }


//        TestClass testclass = new TestClass();
//        try{
//            testclass.fileTst();
//        }
//        catch (IOException e){
//        //System.out.println(e.getClass());
//        }

//        int[] numbers = {3,5,7,67,45,23,12,23,34};
//        try {
//            System.out.println(numbers[21]);
//        }
//        catch (ArrayIndexOutOfBoundsException error){
//            error.printStackTrace();
//            System.out.println(error);
//        }
//        JOptionPane.showMessageDialog(null,"Code continue here");


//        Scanner input = new Scanner(System.in);
//        int number1 =0, number2 = 0;
//        float result = 0;
//        try{
//            System.out.print("Enter number 1: ");
//            number1 = input.nextInt();
//
//            System.out.print("Enter number 2: ");
//            number2 = input.nextInt();
//            result = ( number1 / number2 );
//            int moduloo = number1%number2;
//
//            System.out.println(number1+" devided by "+number2+ " is "+result+" Modulo "+moduloo );
//        }
//        catch (InputMismatchException e){
//            System.out.println("\nIncorect data entered wholu number "); }
//        catch(ArithmeticException e){
//            System.out.println("You can't divided by "+ number2);
//        }
//        System.out.println("After the exception handling code.....");


//       Topic8Exercises topic8Exercises = new Topic8Exercises();
//       topic8Exercises.JFT8Ex11();


        // String s1 = new String("dinghy");
        // String s2 = "dinghy";
        // String s3 = s2;
        // s1 = s1.concat("rubber");
        // s2.concat(s1);
        // System.out.println(s1 == s2);
        // System.out.println(s1.equals(s2));
        // System.out.println(s2 == s3);
        // System.out.println(s2.equals(s3));
        // System.out.println(s1 == s3);
        // System.out.println(s1.equals(s3));
        // System.out.println(s1 + " " + s2);


//        String javaFoundations = new String("Java Foundations");
//        String jFoundations = "Java Foundations";
//        System.out.println(javaFoundations == jFoundations);
//        System.out.println(javaFoundations.equals(jFoundations));
//        System.out.println(javaFoundations.compareTo(jFoundations));

//        String x = new String ("Java");
//        x = x.concat(" Rules");
//        System.out.println("x = " + x); // ?
//
//        x.toUpperCase();
//        System.out.println("x = " + x.toUpperCase());
//        System.out.println("x2 = " + x); // ?
//
//        x.replace('a', 'X');
//        System.out.println("x = " + x); // ?
//
//        x = x.concat(" Rules!");
//        System.out.println("x = " + x); // ?
//


//        Car car = new Car("Subaru Hatchback", 53.45f, "89C4545", true);
//        System.out.println(car.toString() +car.brake() + car.accererate());
//
//        Car car1 = new Car("Toyota Corolla", 1400f);
//        car1.setRegistrationNumber("90C4343");
//        car1.setNCT(true);
//        System.out.println(car1.toString() +car1.brake()+ car1.accererate()+"\n"+
//                Car.noCreatedCars+" Cars have been provided");
//
//        Truck truck = new Truck("Ford Transit");
//        truck.setIsTriler(false);
//        System.out.println(truck.toString() + truck.brake() + truck.accererate());
//
//
//        Truck truck2 = new Truck();
//        truck2.setManufacturer("Hyundai Pick-Up");
//        truck2.setEngineSize(89.45f);
//        truck2.setRegistrationNumber("99C5344");
//        truck2.setNCT(true);
//        truck2.setIsTriler(false);
//        System.out.println(truck2.toString() + truck2.brake() + truck2.accererate());


//        Adult adult = new Adult();
//        adult.setName("Billy White");
//        adult.setAge(30);
//        adult.setGender("male");
//        adult.setHeight(6.5f);
//        adult.setWeight(11.0f);
//        adult.setPPSnumber("5645614F");
//        adult.setOcupation("Software Developer");
//        adult.setIsmarried(true);
//        adult.setisCarOwner(true);
//        adult.tooString();
//        adult.eat();
//        adult.drive();
//
//        Child child = new Child();
//        child.setName("Frank Davis");
//        child.setAge(3);
//        child.setGender("male");
//        child.setHeight(1.5f);
//        child.setWeight(3.0f);
//        child.tooString();
//        child.eat();
//        child.swim(child.getAge());
//
//
//        Baby baby = new Baby();
//        baby.setName("Gilliam Taylor");
//        baby.setAge(1);
//        baby.setGender("male");
//        baby.setHeight(0.6f);
//        baby.setWeight(1.0f);
//        baby.setIsTeething(true);
//        baby.tooString();
//        baby.checkIsTeething(baby.getIsTeething());
//
//

//          IQ  student1 = new IQ();
//           student1.setName ("James Devine");
//            student1.setAge(46);
//            student1.setiQScore(87.00f);
////            System.out.println(student1.toString());
////            student1.iQReport(student1.getiQScore());
////
//            IQ student2 = new IQ();
//            student2.setName("Helena Snith");
//            student2.setAge(89);
//            student2.setiQScore(101f);
//           System.out.println(student2.toString());
//            student2.iQReport(student2.getiQScore());
//
//        IQ student3 = new IQ();
//        student3.setName("Daniel Jons");
//        student3.setAge(27);
//        student3.setiQScore(1f);
//        System.out.println(student3.toString());
//        student3.iQReport(student3.getiQScore());


//        Smartphone sm1 = new Smartphone();
//
//        sm1.topUpCredit(15.00f);
//        sm1.name = "Nokia 610";
//        sm1.manufactured = "Nokia";
//        sm1.price = 100.00f;
//        sm1.releaseDate = "04/06/2018";
//        sm1.creditRemaining = 0.00f;
//        sm1.isFullyCharged = true;
//        Smartphone.noOfSmartfones++;
//
//        System.out.print(sm1.toString());
//
//        Smartphone sm2 = new Smartphone();
//        sm2.name = "H3C Sensation 610";
//        sm2.manufactured = "H3C";
//        sm2.price = 110.00f;
//        sm2.releaseDate = "04/07/2012";
//        sm2.creditRemaining = 0.00f;
//        sm2.isFullyCharged = false;
//        Smartphone.noOfSmartfones++;
//        System.out.print(sm2.toString());
//
//        Smartphone sm3 = new Smartphone();
//        sm3.name = "Simsung Desire";
//        sm3.manufactured = "Simsung";
//        sm3.price = 190.00f;
//        sm3.releaseDate = "14/07/2015";
//        sm3.creditRemaining = 0.00f;
//        sm3.isFullyCharged = false;
//        System.out.print(sm3.toString());
//        Smartphone.noOfSmartfones++;
//
//        Smartphone.averagePrice = (sm1.price + sm2.price + sm3.price);
//
//        System.out.print("\nAvailable smartpones: "+Smartphone.noOfSmartfones+"\nAverage price for smartphone: "+
//                        Smartphone.averagePrice / Smartphone.noOfSmartfones);
//


//    Student st1 = new Student();
//   st1.firstName = "Billy";
//    st1.lastName = "Davis";
//    st1.age = 17;
//    st1.className = "Living Cert 1";
//    st1.gradeAverage = 70.50f;
//    st1.address = "12 High Street, Dublin";
//
//    System.out.print(st1.toString());
//
//    Student.noObjectsCreated ++;
//    Student.averageGrade += st1.gradeAverage;
//
//        Student st2 = new Student();
//        st2.firstName = "Anna";
//        st2.lastName = "Smith";
//        st2.age = 18;
//        st2.className = "Living Cert 1";
//        st2.gradeAverage = 80.0f;
//        st2.address = "19 Lower Street, Dublin ";
//
//        Student.noObjectsCreated ++;
//        Student.averageGrade += st2.gradeAverage;
//
//        Student st3 = new Student();
//        st3.firstName = "Georgia";
//        st3.lastName = "Moriarty";
//        st3.age = 17;
//        st3.className = "Living Cert 1";
//        st3.gradeAverage = 90.00f;
//        st3.address = "5 Middle Street, Dublin";
//
//        Student.noObjectsCreated ++;
//        Student.averageGrade += st3.gradeAverage;
//
//        System.out.println(st1.toString());
//        System.out.println("\n"+st2.toString());
//        System.out.println("\n"+st3.toString());
//
//       System.out.println("\nStudent object created: "+Student.noObjectsCreated+
//                           "\nAverage grade = "+ Student.averageGrade / Student.noObjectsCreated);


//    JFT10Ex6VowelCount jft10Ex6VowelCount = new JFT10Ex6VowelCount();
//    System.out.println(jft10Ex6VowelCount.vovelCount("Walking on the moon"));


//        JFT10Ex4Numbers JFT10Ex4Numbers = new JFT10Ex4Numbers();
//        System.out.println("Sum: "+ JFT10Ex4Numbers.sum(5,10));
//        System.out.println("Divide: "+ JFT10Ex4Numbers.divide(10f, 10f));
//        System.out.println("Mutiplay: "+ JFT10Ex4Numbers.multiplay(15f, 10f));
//		System.out.println("Remainder: "+ JFT10Ex4Numbers.remainder(100, 90));
//		JFT10Ex4Numbers.message();


//        Dog d1 = new Dog();
//        d1.name = "Frodo";
//        d1.age = 4;
//        d1.breed = "Alsatian";
//
//        Dog d2 = new Dog();
//        d2.name = "Labby";
//        d2.age = 3;
//        d2.breed = "Labrador";
//
//        Dog d3 = d2;
//        d3.age = 6;
//
//        System.out.println(d1.name); // Answer?
//        System.out.println(d2.age); // Answer?
//        System.out.println(d3.age); // Answer?
//        System.out.println(d1.age == d2.age); // Answer?
//        System.out.println(d1 == d2); // Answer?
//        System.out.println(d1 == d3); // Answer?
//        System.out.println(d2 == d3); // Answer?


        //        JFT10Ex2Jelly jft10Ex2Jelly = new JFT10Ex2Jelly();
//        jft10Ex2Jelly.manufacturer = "Chivery";
//        jft10Ex2Jelly.price = 3.50f;
//        jft10Ex2Jelly.flavour = "Strafbery";
//        jft10Ex2Jelly.noOfCalories = 24f;
//        jft10Ex2Jelly.expiryDate = "25/06/2016";
//        JOptionPane.showMessageDialog(null,jft10Ex2Jelly.tooString());


//        JFT10Ex1Pizza JFT10Ex1Pizza = new JFT10Ex1Pizza();
//        JFT10Ex1Pizza.size = "Small";
//        JFT10Ex1Pizza.toppings = "Ham and Pineapple";
//        JFT10Ex1Pizza.diamater = 12.00f;
//        JFT10Ex1Pizza.price = 10f;
//        System.out.println(JFT10Ex1Pizza.tooString());
//        System.out.println(JFT10Ex1Pizza.eat());
//
//        JFT10Ex1Pizza JFT10Ex1Pizza1 = new JFT10Ex1Pizza();
//        JFT10Ex1Pizza1.size = "Medium";
//        JFT10Ex1Pizza1.toppings = "Chicken and Mushroom";
//        JFT10Ex1Pizza1.diamater = 14.00f;
//        JFT10Ex1Pizza1.price = 12f;
//        System.out.println(JFT10Ex1Pizza1.tooString());
//        System.out.println(JFT10Ex1Pizza1.eat());
//
//        JFT10Ex1Pizza JFT10Ex1Pizza2 = new JFT10Ex1Pizza();
//        JFT10Ex1Pizza2.size = "Large";
//        JFT10Ex1Pizza2.toppings = "Tuna and Sweetcorn";
//        JFT10Ex1Pizza2.diamater = 16.00f;
//        JFT10Ex1Pizza2.price = 14f;
//        System.out.println(JFT10Ex1Pizza2.tooString());
//        System.out.println(JFT10Ex1Pizza2.eat());

//        Topic9Exercises topic9Exercises = new Topic9Exercises();
//        topic9Exercises.JFT9Ex3();


        // Topic7Exercises topic7Exercises = new Topic7Exercises();
        // topic7Exercises.continu();
//
        //  Topic8Exercises topic8Exercises = new Topic8Exercises();
        //topic8Exercises.JFT8Ex19();

        //topic7Exercises.enhancedForLoop();
//        topic7Exercises.currency();;
//        //topic7Exercises.read3Arrays();
//        topic7Exercises.readAgesArray();
        //topic7Exercises.readSalaryArray();
//
//        topic7Exercises.continu();
//          topic7Exercises.loopsWhile();
//        String[] items = {"Shirt","Scarf","Trousers"};
//
//        for( int i = 0; i < items.length ; i++){
//            System.out.println(i+ " "+items[i]);
//        }
        //Topi6Exercises topi6Exercises = new Topi6Exercises();
//        topi6Exercises.JFT6Ex1();
//        topi6Exercises.JFT6Ex2();
//        topi6Exercises.JFT6Ex3();
//        topi6Exercises.JFT6Ex4();
//        topi6Exercises.JFT6Ex5();
//        topi6Exercises.JFT6Ex6();
//        topi6Exercises.JFT6Ex7();
        // topi6Exercises.JFT6Ex12();
//
//        ExperymentsClass experymentsClass = new ExperymentsClass();
//        experymentsClass.areNamesEqual();
//        experymentsClass.conditionOperators();
//      ClassMap cm = new ClassMap();
//        cm.setDeskArrey();
//
//        cm.name = "Ann";
//        cm.setDesk();
//
//        cm.name = "Bond";
//        cm.setDesk();
//        cm.name = "Tom";
//        cm.setDesk();
//        cm.name = "Agnes";
//        cm.setDesk();
//
//        cm.displayDeskMap();
//
//        cm.name = "Wajdek";
//        cm.searchDesk();
//        NameListTwo nameListTwo = new NameListTwo();
//        nameListTwo.setList();
//        nameListTwo.displayNames();

//        VacationScaleTwo vacationScaleTwo = new VacationScaleTwo();
//        vacationScaleTwo.setVacationDay();
//        vacationScaleTwo.displaVacationDay();

//        ComplexLoop complexLoop = new ComplexLoop();
//        complexLoop.tryName();
//        BlockRows blockRows = new BlockRows();
//        blockRows.negacja();

//        ChellengeSequence  chellengeSequence = new ChellengeSequence();
//        chellengeSequence.displaySequence();
////        Sequence sequence = new Sequence();
//        sequence.displaySequence();


//        Counter loopFor = new Counter();
//        loopFor.loopFor();
////    NamesList test = new NamesList();
//    test.setTheList();


//    VacationScale testVacation = new VacationScale();
//    testVacation.vacationArey();
//    testVacation.getYearOfService();
//    testVacation.displayVacationDays();


//

//        System.out.println(names.names[1]);
// SwitchDate swithdate = new SwitchDate();
//	swithdate.CalculateNumDays();


//        DateTwo date = new DateTwo();
//	date.displayDay();
//
//	Clock time = new Clock();
//	time.displaypartOfDay();


    }

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Topic9Exercises {

    void JFT9Ex1(){
        ArrayList<String> albumArray = new ArrayList();
        albumArray.add("Thriller");
        albumArray.add("The Dark Site of the Moon");
        albumArray.add("Bat Out of Hell");
        albumArray.add("Come On Over");
        albumArray.add("Led Zeppelin IV");
        albumArray.add("Jagged Little Pill");
        albumArray.add(3,"Back in Black");

        for(String albums: albumArray){
            System.out.println(albums);
        }
    }

    void JFT9Ex2(){
        boolean arrayEmpty = false;
        ArrayList holidayArray = new ArrayList();
        holidayArray.add("Ibiza");
        holidayArray.add("Gran canaria");
        holidayArray.add("Nice");
        holidayArray.add("Tropea");

        System.out.println("The size of holidayArray is "+holidayArray.size());
            for(int i = 0; i < holidayArray.size(); i++){
                System.out.println(holidayArray.get(i));
            }


        if(holidayArray.size() <= 0){
            arrayEmpty = true;
            System.out.println("\n"+ arrayEmpty);
        }
        else {
            arrayEmpty = false;
            System.out.println("\n"+arrayEmpty);
            }

        System.out.println(+holidayArray.size());

        for(int i = 0; i < holidayArray.size(); i++){
            if(holidayArray.get(i) == ("Tropea")){
               System.out.println(i);
            }
        }

        holidayArray.add(2,"Fuerteventura");
        holidayArray.remove(1);

        boolean niceAvilable = false;
        for(int i = 0; i < holidayArray.size(); i++){
            if(holidayArray.contains("Nice")){
                niceAvilable = true;
            }
        }

        System.out.println(niceAvilable);

    }
    void JFT9Ex3(){
        ArrayList<String> league = new ArrayList();
        league.add("Chelse");
        league.add("Manchaster City");
        league.add("Arsenal");
        league.add("Manchester Utd");
        Iterator arrayIterator = league.iterator();
        while (arrayIterator.hasNext()){
            System.out.println(arrayIterator.next());}


       System.out.println("\n"+league.contains("Leeds Utd"));

         league.remove(league.size()-1);
         league.add("Liverpool");

         System.out.println(league.get(2));

        System.out.println(league.indexOf("Liverpool"));
        System.out.print("\n");

        for(Object ll :league)
            System.out.println(ll);
    }





    void Cd(){
       List <CD> myCd = new ArrayList();
        myCd.add(new CD());
        myCd.add(new CD());
        System.out.println(myCd.size());


    }

    void iterator(){

        ArrayList names = new ArrayList();
        names.add("Tomash");
        names.add("Bernard");
        names.add("Ryan");
        Iterator it = names.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }

    void shoppingCart(){

        ArrayList<String> items = new ArrayList<>();
        items.add("Shirt");
        items.add("Belt");
        items.add("Tie");

        System.out.println(items);
        items.add(0,"Shoes");
        System.out.println(items);

        if(items.contains("Belt"))
            System.out.println("Belt was found in array");
        else
            System.out.println("Belt wasn't found in array");

    }



    void readArrayList(){

       ArrayList<Integer> partList = new ArrayList();
       partList.add(2);
       partList.add(3);
       partList.add(12);
        Iterator<Integer> elements = partList.iterator();
        while (elements.hasNext()){
            Integer partNumberObject = elements.next();
            int partNumber = partNumberObject.intValue();
            System.out.println("PartNumber - "+partNumber);
        }

        for(Integer partNumberObject : partList){
            //int partNumber = partNumberObject; // auto unboxing
            System.out.println("Loop PartNumber - "+partNumberObject);
        }

//       ArrayList tom = new ArrayList<>();
//
//       tom.add("Aga");
//       tom.add("tom");
//       tom.add(0,"Dzidzius");
//       tom.add("Pisior");
//
//      for(int i = 0; i < tom.size(); i++){
//          System.out.println(tom.get(i));}
//
//        tom.add(new Integer(33));
//
//          System.out.println(tom.size());
//            for(Object asdasds: tom) {
//             System.out.println(asdasds);
//            }
//         Integer intObject = new Integer(1234);
//
//          int intPrimitive = 2;
//          int tempPrimitive;
//         Integer tempIntegerObject = new Integer(intObject);
//
//         tempPrimitive = intObject.intValue();
//
//        System.out.println("IntObject--> "+intObject);
//        System.out.println("tempInteger--> "+tempIntegerObject);
//        System.out.println("tempPrimitive--> "+tempPrimitive);
//
//        tempIntegerObject = intPrimitive;
//        intPrimitive = intObject ;
//
//        System.out.println("IntObject--> "+intPrimitive);
//        System.out.println("tempInteger--> "+tempIntegerObject);
    }

}

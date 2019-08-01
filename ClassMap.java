public class ClassMap {

     String deskArrey[][];
     String name;

     void searchDesk(){
         boolean flag = false;
         for(int row =0; row <deskArrey.length; row++){
             for(int col =0; col <4; col++){
                 if (deskArrey[row][col] != null && deskArrey[row][col].equals(name)) {
                     System.out.println(name + "\t Desk position: Row: "+row+ "Column; " +
                             col);
                     flag = true;
                     break;
                 }
             }//end of column loop
                if(flag == true)
                 break;
         }
         if (flag == false)
             System.out.println("Desk not allocated for " + name);
     }



     void displayDeskMap(){
         for(int row =0; row < 3; row++){
             for (int col = 0; col < 4; col++){
                 System.out.print(" "+ deskArrey[row][col] + " ");
             }
             System.out.println();
         }
     }

     void setDeskArrey(){
         deskArrey = new String[3][4];
     }

     void setDesk(){
        boolean flag = false;
        for(int row =0; row <3; row++){
            for(int col =0; col <4; col++){
                if(deskArrey[row][col] == null){
                    deskArrey[row][col] = name;
                    System.out.println("\""+name +"\"\t"+ " Desk set at position: Row: "+row+"  Col: "+col);
                    flag = true;
                    break;
                }  //end iff
            }   // inner fool for col
        if(flag == true){
            break;
        } // end if
        }  // end row loop
         if(flag == false){
             System.out.println("All desc occupied");
         }
     }
}

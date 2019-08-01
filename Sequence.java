public class Sequence {

    public int firstNumber = 0, secoundNumber =1, nextNumber;
    final int SEQUENCE_LIMIT = 100;

    void displaySequence(){
        System.out.println(firstNumber +" "+ secoundNumber);
        nextNumber = firstNumber + secoundNumber;

        while (nextNumber <= SEQUENCE_LIMIT){
            System.out.print( nextNumber +" " );
            firstNumber = secoundNumber;
            secoundNumber = nextNumber;
            nextNumber = firstNumber + secoundNumber;

        }
        System.out.print("\nGood");
    }


}

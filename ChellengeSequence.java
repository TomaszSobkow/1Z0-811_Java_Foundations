public class ChellengeSequence {
    public int firstNumber = 0, secoundNumber =1, nextNumber;
    final int SEQUENCE_LIMIT = 100;
    final int SEQUENCE_COUNT = 10;

    void displaySequence(){
        System.out.println(firstNumber +" "+ secoundNumber);
        nextNumber = firstNumber + secoundNumber;

        for (int count = 2; count <= SEQUENCE_COUNT; count++){
            System.out.print( nextNumber +" " );
            firstNumber = secoundNumber;
            secoundNumber = nextNumber;
            nextNumber = firstNumber + secoundNumber;

        }
        System.out.print("\nGood");
    }

}

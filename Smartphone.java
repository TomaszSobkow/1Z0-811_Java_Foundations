public class Smartphone extends IQ  {

    String name, manufactured, releaseDate;
    float price, creditRemaining;
    boolean isFullyCharged;
    static int noOfSmartfones ;
    static float averagePrice ;


    public void makeCall(String numberToCall){
        System.out.println("Dialling number: " +numberToCall);
    }

    public void topUpCredit(float topUpamount){
        creditRemaining += topUpamount;
        System.out.println("You have successfully topped up by: "+topUpamount+
                           "\nYour new balance is: "+ creditRemaining+
                             "\nThe smartfon is now  Fully re-charged.");
    }
    @Override
    public String toString() {
        return "\nName: "+name+"\nmanufactured: "+manufactured+"\nPrice: "+price+"\nRelease Date: "+releaseDate
                    +"\nCredit Remaining: "+creditRemaining+"\nCharge status: "+isFullyCharged+"\n";
    }

    ;

}

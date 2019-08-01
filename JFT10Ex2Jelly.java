
public class JFT10Ex2Jelly {
    String manufacturer, flavour, expiryDate;
    float price, noOfCalories;

    String setInstruction(){
        return "Leave Jelly to set in a cool\nenvironment for 1hr";
    }

    String tooString(){
        return "Manufacturer:   " +manufacturer+ "\nPice:     " +price+ "\nFlavour:   " +flavour+ "\nNo Calories:     "+
                                noOfCalories +"\nExpiry DATE:   "+expiryDate;
    }
}


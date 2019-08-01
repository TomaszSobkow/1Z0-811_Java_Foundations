public class JFT10Ex5NumberRange {

    void checkInRange(int lower_value, int upper_value, int no_to_search){
        if(no_to_search >= lower_value && no_to_search <= upper_value)
            System.out.println("No. in range");
        else
            System.out.println("No. not in range!");

    }

}

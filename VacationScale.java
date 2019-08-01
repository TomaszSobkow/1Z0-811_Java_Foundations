import javax.swing.*;

public class VacationScale {


    public int yearOfService;
    public int[] vacationDays;

    public void vacationArey(){
        vacationDays = new int[13];
        vacationDays[0] = 15;
        vacationDays[1] = 10;
        vacationDays[2] = 10;
        vacationDays[3] = 15;
        vacationDays[4] = 10;
        vacationDays[5] = 10;
        vacationDays[6] = 15;
        vacationDays[7] = 18;
        vacationDays[8] = 10;
        vacationDays[9] = 16;
        vacationDays[10] = 19;
        vacationDays[11] = 33;
        vacationDays[12] = 45;
        System.out.println("Vacation-->" + vacationDays);
    }

    public int getYearOfService() {
        String yearOfServiceAsString = JOptionPane.showInputDialog("Please enter year of service: ");
        yearOfService = Integer.parseInt(yearOfServiceAsString);
        if(yearOfService > vacationDays.length)
            yearOfService = 8;
        return yearOfService;
    }

    public void displayVacationDays(){
        System.out.println("*********" + yearOfService + " length -->"+ vacationDays.length);
        if(yearOfService >=0 && yearOfService <=vacationDays.length){
            JOptionPane.showMessageDialog(null,"Vacation days: " +
                    vacationDays[yearOfService],"Vacations Days",JOptionPane.PLAIN_MESSAGE);
            }
        }
    }


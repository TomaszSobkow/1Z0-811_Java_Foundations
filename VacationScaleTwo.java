import java.util.ArrayList;

public class VacationScaleTwo {
    public ArrayList vacationDay;

    public void setVacationDay(){
        vacationDay = new ArrayList();
        vacationDay.add(10);
        vacationDay.add(15);
        vacationDay.add(15);
        vacationDay.add(15);
        vacationDay.add(20);
        vacationDay.add(20);
        vacationDay.add(25);
        vacationDay.add(25);
        vacationDay.add(30);
    }

    public void displaVacationDay(){
        for(int years = 0; years < vacationDay.size(); years++){
          System.out.println("The vacation for " + years + " gives you " + vacationDay.get(years));
        }
    }
}

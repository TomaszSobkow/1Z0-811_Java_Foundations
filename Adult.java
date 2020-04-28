public class Adult extends Human{

private String ppsNo;
private String occupation;
private boolean isMarried;
private boolean isCarOwner;
private int age;


Adult(String name,String  ppsNo){
	super(name);
	this.ppsNo = ppsNo;
};

void setPPSnumber(String ppsNo) {this.ppsNo = ppsNo;}
void setOcupation(String occupation){this.occupation = occupation;}
void setIsmarried(boolean isMarried) {this.isMarried = isMarried;}
void setisCarOwner(boolean isCarOwner) {this.isCarOwner = isCarOwner;}


String getPPSnumber() { return ppsNo;}
String getOccupation(){ return occupation;}
boolean getIsMarrige(){return isMarried;}
boolean getisCarOwner(){return isCarOwner;}

void drive(){
	System.out.println("Driving a car safely...");
	}
void procreate(){
	System.out.println("SProcreating...");
	}
	

public void tooString(){
	super.toString();
	System.out.println("PPs No: "+ppsNo+"\nOccupation: "+occupation+
					   "\nMarriage: "+isMarried+"\nCar ovner: "+isCarOwner);
}

}
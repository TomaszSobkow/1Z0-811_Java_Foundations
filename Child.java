public class Child extends Human{

private String schoolCardNo = "N/A";

Child(String name, String schoolCardNo){
	super(name);
	this.schoolCardNo = schoolCardNo;
}

	void setSchoolCardNo(String schoolCardNo){ this.schoolCardNo = schoolCardNo;}
		
String getSchoolcardNo(){return schoolCardNo;}

public String toString(){
	super.toString();
	return ("School Card No: "+schoolCardNo);
}

void swim(int age){
	if (age <5){
		System.out.println("As the child is under 5 years old, arnbands must be warn and parentL SUPERVISION"+
		" is required");
		super.swim();
	}		
	else {
			super.swim();
		}
	}
}
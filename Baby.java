public class Baby extends Human{

private boolean isTeething;

Baby(String name, boolean isTeething){
	super(name);
	this.isTeething = isTeething;
};
void setIsTeething(boolean isTeething){this.isTeething = isTeething;}

boolean getIsTeething(){return isTeething;}

public void tooString(){
	super.toString();
	System.out.println("Teething: "+isTeething);
}
void checkIsTeething(boolean isTeething){
	if (isTeething){
		sleep();
		swim();
	}else
		{
			super.sleep();
			swim();
		}
	
}



public void sleep(){
	System.out.println("Baby having difficulty sleeping due to teething pain.");
	}

public void swim(){
	System.out.println("A baby cannot swim safely");
	}


}
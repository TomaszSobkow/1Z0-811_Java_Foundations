public class Truck extends Vehicle{

private boolean isTriler;

	public Truck(String manufacturer, float engineSize, String registrationNumber, boolean NCT){
		super(manufacturer, engineSize, registrationNumber, NCT);
}
	public Truck(String manufacturer, float engineSize, String registrationNumber){
		super(manufacturer, engineSize, registrationNumber);
	}
	
	public Truck(String manufacturer, float engineSize){
		this(manufacturer,engineSize,"Truck regNO",false);
	}
	public Truck(String manufacturer){ 
			this(manufacturer,0.0f, "Truck RegNo",false);
	}
	public Truck(){}
	
	public String brake(){
		return "\nTruck braking...";
	}

public void setIsTriler(boolean isTriler){
		this.isTriler = isTriler;}


public boolean getIsTriler(){return isTriler;}

@Override
public String toString(){
	return super.toString() + "\nHas Triller? "+ getIsTriler();
}
}
public class Car extends Vehicle{

static int noCreatedCars;

	public Car(String manufacturer, float engineSize, String registrationNumber, boolean NCT){
		super(manufacturer,engineSize,registrationNumber,NCT);
		Car.noCreatedCars++;
	}	
	
	public Car(String manufacturer, float engineSize, String registrationNumber){
		manufacturer = manufacturer;
		engineSize = engineSize;
		registrationNumber =registrationNumber;
	}
	
	public Car(String manufacturer, float engineSize){
		this(manufacturer, engineSize,"nothing",false);
	}
	
	public Car(String manufacturer){manufacturer = manufacturer;}
	public Car(){}
	
	
	public String brake(){return "\nCar braking...";}
	
	
}
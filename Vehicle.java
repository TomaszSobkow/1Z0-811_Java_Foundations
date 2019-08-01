public class Vehicle{

private String manufacturer;
private float engineSize;
private String registrationNumber;
private boolean NCT;

	public Vehicle(String manufacturer, float engineSize, String registrationNumber, boolean NCT){
				this.manufacturer = manufacturer;
				this.engineSize = engineSize;
				this.registrationNumber = registrationNumber;
				this.NCT = NCT;
			}
	
	public Vehicle(String manufacturer, float engineSize, String registrationNumber){
		manufacturer = manufacturer;
		engineSize = engineSize;
		registrationNumber = registrationNumber;
	}
	
	public Vehicle(String manufacturer, float engineSize){
		manufacturer = manufacturer;
		engineSize = engineSize;
	}
	
	public Vehicle (String manufacturer){manufacturer = manufacturer;}
	public Vehicle (){}



	void setManufacturer(String manufacturer){this.manufacturer = manufacturer;}
	void setEngineSize (float engineSize) {this.engineSize = engineSize;}
	void setRegistrationNumber (String registrationNumber) {this.registrationNumber = registrationNumber;}
	void setNCT(boolean NCT) {this.NCT = NCT;}

	public String getManufacturer()		 {return manufacturer;}
	public float getEngineSize() 	     {return engineSize;}
	public String getRegistrationNumber(){return registrationNumber;}
	public boolean getNCT()				 {return NCT;}

	public String accererate(){return "\nAccelerating...";}
	public String brake(){return "\nVehicle braking...";}
	
	@Override
	public String toString(){
		return("\nManufacturer: "+manufacturer+"\nEngine Size: "+engineSize+
			"\nRegistration No: "+registrationNumber+"\nNCT: "+NCT);
	}


}
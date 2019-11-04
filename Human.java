
public class Human{

private String name = "Brak Danych";
private String gender = name;
private int age = 0;
private float height = (float)age;
private float weight = height;

Human(){};
	Human(String gender){
		this.gender = gender;
		}
Human(String gender, int age){
	this.gender = gender;
	this.age = age;}

Human(String name, String gender, int age, float height, float weight){
	this.name = name;
	this.gender = gender;
	this.age = age;
	this.height = height;
	this.weight = weight;
};

void setName   ( String name)  { this.name = name;}
void setGender ( String gender){ this.gender = gender;}
void setAge    ( int age)      { this.age = age;}
void setHeight ( float height) { this.height = height;}
void setWeight ( float weight) { this.weight = weight;}

String getName  (){ return name;}
String getGender(){ return gender;}
int getAge   (){ return age;}
float getHeight(){ return height;}
float getWeight(){ return weight;}

void sleep(){System.out.println("Sleeping soundly...");}
void eat (){System.out.println("Eating slowly and chewing carefuly...");}
void swim(){System.out.println("Arms rotating and pushing the body forward...");}

@Override
public String toString(){
	final String s = "\nName: " + name + "\nAge: " + age + "\nGender: " + getGender() + "\nHeight: " + height +
			"\nWeight: " + weight;
	return s;
						}


}
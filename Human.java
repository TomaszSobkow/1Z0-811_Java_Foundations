
public class Human{

private String name;
private String gender;
private int age;
private float height;
private float weight;



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

public void tooString(){
	System.out.println("\nName: "+name+"\nAge: "+age+"\nGender: "+gender+"\nHeight: "+height+
					   "\nWeight: "+weight);
						}


}
public class Dog {

    public String name;
    public byte age;
    public String breed;
    public String makeNoise(){
        return "Woof....";
    }// method
    public String toString(){
        return "Name: " + name +"\n" +"Age: " + age + "\n" + "Breed: " + breed;
    }// method
}

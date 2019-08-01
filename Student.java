public class Student {
    public String firstName;
    public String lastName;
    public byte age;
    public String className;
    public float gradeAverage;
    public String address;

    public Student(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Student(){}


    static int noObjectsCreated;
    static float averageGrade;
@Override
    public String toString(){
        return "First Name: "+firstName+"\nLast Name: "+lastName+"\nAge: "+age+"Class name: "+className
                             + "\nGrade Average: "+gradeAverage+"\nAddress: "+address;
    }






}

public class IQ {

    private String name;
    private int age;
    private float iQScore;

    public void setAge( int age){
        if(age >=1 && age <=115){
            this.age = age;
        }
        else if (age <= 0 || age > 115)
            System.out.print("\nIncorrect Age data value ! for "+ name);
    }
    public void setName (String name){ this.name = name; }

    public void setiQScore (float iQScore){
        if(iQScore >=1 && iQScore <=200)
            this.iQScore = iQScore;
        else if (iQScore <= 0 || iQScore >200)
            System.out.print("\nIncorrect IQScore data value !");

    }

    public int getAge(){return age;}
    public String getName(){ return name; }

    public float getiQScore(){return iQScore;}

    @Override
     public String toString (){
    return ("\nName: "+name+ "   Age:"+age+ "    IQ Score: "+iQScore);
    }

    void iQReport( float score){
       if(score < 100)
           System.out.println("\tYour score of "+score+" is bellow average.");
       else if (score >=100 && score <= 150)
           System.out.println("\tYour score of "+score+" is above average.");
       else if (score > 150)
           System.out.println("\tYour score of " +score+ " is exceptional.");
        }
    }


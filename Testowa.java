
public class Testowa extends Human {

   private String gacie;

    Testowa(String name,String gender,String gacie){
        super(name, gender,0,0,0);
        this.gacie = gacie;
        };

    public String toString(){
        return (super.toString() +( "\ngacie of: "+ gacie));
    }

    public static void main(String[] args) {
        System.out.println(new Human("Kobieta",12));
        System.out.print(new  Testowa("Women","tomcio","\"Brak Danych\" "));








    }
}


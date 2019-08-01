public class Gorilla {
    private float height;
    private float weight;
    private static float sumHeight;
    private static float sumWeight;
    private static int noOfGorillas;

    public Gorilla(float height, float weight){
        this.height=height;
        this.weight=weight;
        Gorilla.sumHeight+=height;
        Gorilla.sumWeight+=weight;
        Gorilla.noOfGorillas++;
    }

    public static float getAverageHeight(){
        return (Gorilla.sumWeight / Gorilla.noOfGorillas);
    }

    public static float getAverageWeight(){
        return (Gorilla.sumHeight / Gorilla.noOfGorillas);
    }

    public String toString(){
        return "Height: " + this.height + "\n" + "Weight: " + this.weight;
    }

    public static void main(String[] args){
        Gorilla gorilla1 = new Gorilla(1.8f,180f);
        Gorilla gorilla2 = new Gorilla(1.6f,220f);
        System.out.println(gorilla1.getAverageHeight());
        System.out.println(gorilla2.getAverageWeight());
    }
}

public class Animal {

    private float height;
    private float weight;


public Animal(){}

    public Animal(float height, float weight){
        this.height=height;
        this.weight=weight;
    }



@Override
    public String toString(){
        return "Height: " + height + "\n" + "Weight: " + weight;
    }
}

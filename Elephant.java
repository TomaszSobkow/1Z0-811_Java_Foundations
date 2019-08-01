public class Elephant {
    private float weight;
    private float height;

    public void setWeight(float weight){
        weight=weight;
    }

    public float getWeight(){
        return weight;
    }

    public void setHeight(float height){
        height=height;
    }

    public float getHeight(){
        return height;
    }
}

 class Exam_Ready_Quiz2_Q28{
    public static void main(String[] args){
        Elephant nelly = new Elephant();
        nelly.setWeight(5000);
        nelly.setHeight(7000);

        System.out.println(nelly.getWeight());
        System.out.println(nelly.getHeight());
    }
}

package Third;
public class Area {
    private int weight;
    public Area(int weight,int height){
        this.weight = weight;
        this.height = height;
    }
    public int getWeight(){
        return weight;
    }
    public void setWeight(int weight){
       // this.weight = weight;
    }
    private int height;
    public int getHeight(){
        return height;
    }
    public void setHeight(int height){
        //this.height = height;
    }
    public void getArea(){
        System.out.println("Area: "+weight*height);
    }
    public void getPerimeter(){
        System.out.println("Perimeter: "+(weight*2)+(height*2));
    }



}

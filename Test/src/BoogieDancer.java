public class BoogieDancer extends Dancer{
    public BoogieDancer(String name,int age){
        super(name,age);
    }
    @Override
    public void dance(){
        System.out.println(toString()+" Я танцую буги-буги");
    }
}

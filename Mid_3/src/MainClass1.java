import java.util.concurrent.Callable;

class Parent{
    int i=10;
    public Parent(int j){
        System.out.println(i);
        j=j*2;
        this.i=j*10;
    }
}
class Child extends Parent{
    public Child(int j){
        super(j);
        System.out.println(i);
        this.i=j*20;
    }
}
public class MainClass1{
    public static void main(String[] args) {
        Child n = new Child(4);
        System.out.println(n.i);
    }
}

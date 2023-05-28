class Base{
    public int a;
    private double b;
    Base(int a,double b){
        this.a=a;
        this.b=b;
    }
    Base(Base ob){
        a= ob.a;
        b=ob.b;
    }
    public void setB(double b){
        this.b=b;
    }
    public double getB(){
        return b;
    }
    void show(){
        System.out.println("Sum of variables "+" In the Base class "+ (a+b));
    }
}
class Override extends Base{
    int c;
    Override(int a,double b,int c){
        super(a,b);
        this.c=c;
    }
    void show() {
        System.out.println("Sum of variables "+" In the Override class "+ (a+getB()+c));
    }
}
class Override2 extends Base{
    Override2(int a,double b){
        super(a,b);
    }
    Override2(Override2 obj2){
        super(obj2);
    }
    void show() {
        System.out.println("Sum of variables "+" In the Override2 class "+ (a+getB()));
    }
}
public class MethodeOverride {
    public static void main(String[] args) {
        Override obj = new Override(10,20.5,12);
        obj.show();
        Override2 obj2 = new Override2(6,10);
        obj2.show();
        Override2 obj3 = new Override2(obj2);
        obj3.show();
    }
}

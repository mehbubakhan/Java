class A{
    int a;
    int b;
    public A(int a){
        this.a = a;
    }
    public A(int a, int b){
        this.a = a;
        this.b = b;
    }
    public int substract(){
        return a - b;
    }
}
class B extends A{
    public B(int a, int b){
        super(a);
    }
    public int substract(){
        if (a >= b){
            return a - b;
        }
        else{
            return b - a;
        }
    }
}
public class FinalQues {
    public static void main(String[] args){
        A obj = new B(-5, 5);
        System.out.println(obj.substract());
    }
}

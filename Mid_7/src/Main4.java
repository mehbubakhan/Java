class Base1{
    public void print(){
        System.out.println("Base");
    }
}
class Derived1 extends Base1{
    public void print(){
        System.out.println("Derived");
    }
}
public class Main4 {
    public static void DoPrint(Base1 o){
        o.print();
    }

    public static void main(String[] args) {
        Base1 x = new Base1();
        Base1 y = new Derived1();
        Derived1 z = new Derived1();
        DoPrint(x);
        DoPrint(y);
        DoPrint(z);
    }
}

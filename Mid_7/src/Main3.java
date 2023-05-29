class Base{
    Base(){
        System.out.println("Base Called");
    }
    public void show(){
        System.out.println("Base: :() show called");
    }
}
class Derived extends Base{
    Derived(){
        System.out.println("Derived called");
    }
    public void show(){
        System.out.println("Derived :() show called");
    }
}
public class Main3 {
    public static void main(String[] args) {
        Base b=new Derived();
        b.show();
    }
}

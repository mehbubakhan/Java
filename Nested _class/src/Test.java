abstract class A{
    abstract void m1(A a);
}
class B extends A{
    void m1(A a){
        System.out.println("one");
    }
}
class C extends B{
    void m1(B b){
        System.out.println("two");
        super.m1(new B());
        System.out.println("three");
    }
}
public class Test {
    public static void main(String[] args) {
        C c = new C();
        c.m1(new B());
    }
}

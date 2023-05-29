public class SomeClass {
    SomeClass(){
        System.out.println("I an the base constructor");
    }
    SomeClass(int a){
        this();
        System.out.println("I have an extra value" + a);
        this.someMethode(a);
    }
    SomeClass(int a,double b){
        this(a);
        System.out.println("I have an more value" + b);
    }
    public void someMethode(){
        System.out.println("I Have no param");
    }
    public void someMethode(int c){
        System.out.println("I brrow "+c+" from a constractor");
    }

    public static void main(String[] args) {
        SomeClass s= new SomeClass(5,6.3);
        s.someMethode();
    }
}

class Parent {
    public static int count=0;
    public static void printDetails(){
        count++;
        System.out.println("I am in Parent Class: "+ count);
    }
}
class Child extends Parent{
    public static void printDetails(){
        count++;
        System.out.println("I am in Child Class: "+ count);
    }
}
public class Main4 {
    public static void main(String[] args) {
        Child X = new Child();
        X.printDetails();
        X.printDetails();
        Parent y = new Parent();
        y.printDetails();
        Child.printDetails();
        Parent.printDetails();
        X.printDetails();
    }
}

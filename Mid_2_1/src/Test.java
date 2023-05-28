class Person{
    double  id, height, weight;
    String name;
    Person(double id,double height,double weight,String name){
        this.id=id;
        this.height=height;
        this.weight=weight;
        this.name=name;
    }
}
public class Test {
    public static void main(String args[]) {
        Person p = new Person();
        p.id = 1;
        p.name = "Steven";
    }
}

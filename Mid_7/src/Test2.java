 class Shape {
    void introduce() {
        System.out.println("It is shape class");
    }
}
 class Triangle extends  Shape{
    @Override
    void introduce(){
        System.out.println("It is Triangle class");
    }
    void calcArea(){
        System.out.println("Calculate Area");
    }
 }
 public class Test2 {
    public static void main(String[] args){
        Shape s = new Triangle();
        s.introduce();
        ((Triangle) s).calcArea();
    }
}


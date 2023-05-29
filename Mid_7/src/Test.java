class Student{
    private String name;
    Student(String n){
        name=n;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
}
public class Test {
    public static void main(String[] args){
        Student s1=new Student("Sam");
        System.out.println(s1.getName());
    }

}

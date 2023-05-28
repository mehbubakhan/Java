class Member{
    private String name;
    private int age;
    private String number;
    private double salary;
    private double experience;
    Member(String name,int age,String number,double salary,double experience){
        this.name=name;
        this.age=age;
        this.number=number;
        this.salary=salary;
        this.experience=experience;
    }
    public void setValue(String name,int age,String number,double salary,double experience){
        this.name=name;
        this.age=age;
        this.number=number;
        this.salary=salary;
        this.experience=experience;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getNumber() {
        return number;
    }

    public double getSalary() {
        return salary;
    }

    public double getExperience() {
        return experience;
    }
}
class Employee extends Member{
    String designation;
    Employee(String name,int age,String number,double salary,double experience,String designation){
        super(name,age,number,salary,experience);
        this.designation=designation;
    }
    public void  changedesignation(String designation){
        if(getExperience()>5){
            this.designation=designation;
        }
        else{
            System.out.println("Designation change is not possible.");
        }
    }
    public String getdesignation(){
        return designation;
    }
}
public class MainClass{
    public static void main(String[] args) {
        Employee employee = new Employee("Mehbuba",20,"02",10000,7,"Jadu");
        employee.changedesignation("Jadu2");
        System.out.println(employee.getdesignation());
    }
}

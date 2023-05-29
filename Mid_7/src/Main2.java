class student{
    public String name;
    public int id;
    student(String name,int id){
        this.name = name;
        this.id = id;
    }
    public student getStudent(student s1){
        s1 = new student("Rahim",101);
        return s1;
    }
}
public class Main2{
    public static void main(String[] args) {
        student s1 = new student("Karim",102);
        System.out.println("Name : " + s1.name + " ID : " + s1.id);
        student s2 = s1.getStudent(s1);
        student s3 = s2;
        System.out.println("Name : " + s3.name + " ID : " + s3.id);
    }
}

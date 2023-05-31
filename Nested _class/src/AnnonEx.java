interface person{
    void introduce();
}
public class AnnonEx {
    public static void main(String[] args) {
        person engineer;
        person doctor;
        engineer=new person() {
            public void introduce() {
                System.out.println("I am an engineer");
            }
        };
        doctor=new person() {
            public void introduce() {
                System.out.println("I am a doctor");
            }
        };
        engineer.introduce();
        doctor.introduce();
    }
}

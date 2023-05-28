class Marks{
    String id;
    double quizeMark;
    double midMark;
    double finalMark;
    Marks(String id,double quizeMark,double midMark,double finalMark){
        this.id=id;
        this.quizeMark=quizeMark;
        this.midMark=midMark;
        this.finalMark=finalMark;
    }
    public void passedOrNot(){
        double totalMark;
        totalMark=quizeMark+midMark+finalMark;
        if(totalMark>=55){
            System.out.println("Passed");
        }
        else{
            System.out.println("Failed");
        }
    }
}
public class Run {
    public static void main(String[] args) {
        Marks stu1 = new Marks("011222189",20,30,35);
        stu1.passedOrNot();
    }
}

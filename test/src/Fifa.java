public class Fifa {
    int noOfGoals;
    String venue;
    public Fifa(){
        System.out.println("Who will be winner?");
    }
    public Fifa(int noOfGoals,String venue){
        this.noOfGoals=noOfGoals;
        this.venue=venue;
    }
    public String toString(){
        return "[Fifa ->"+"noofGoals:"+noOfGoals+","+"venue:"+venue;
    }
    public int getNoOfGoals(){
        return noOfGoals;
    }
}

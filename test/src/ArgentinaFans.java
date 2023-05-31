public class ArgentinaFans extends Fifa{
    int havingWorldcups;
    public ArgentinaFans(int noOfGoals,String venue,int havingWorldcups){
        super(noOfGoals,venue);
        this.havingWorldcups=havingWorldcups;
    }
    public String toString(){
        return "ArgentinaFans -> "+"[Fifa ->"+"noofGoals:"+noOfGoals+","+"venue:"+venue+","+"havingWorldCups:"+havingWorldcups;
    }
    public void incrementWorldCup(){
        havingWorldcups++;
    }
}

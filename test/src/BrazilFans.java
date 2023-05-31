public class BrazilFans extends Fifa{
    int havingWorldcups;
    public BrazilFans(int noOfGoals,String venue,int havingWorldcups){
        super(noOfGoals,venue);
        this.havingWorldcups=havingWorldcups;
    }
    public String toString(){
        return "BrazilFans -> "+"[Fifa ->"+"noofGoals:"+noOfGoals+","+"venue:"+venue+","+"havingWorldCups:"+havingWorldcups;
    }
    public void incrementWorldCup(){
        havingWorldcups++;
    }
}

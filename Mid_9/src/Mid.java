class Fifa{
    int noOfGoals;
    String vanue;
    Fifa(){
        System.out.println("Who will be winner?");
    }
    Fifa(int noOfGoals,String vanue){
        this.noOfGoals=noOfGoals;
        this.vanue=vanue;
    }
    public String toString(int noOfGoals,String vanue){
        return "[Fifa -> noofGoals: "+noOfGoals+","+" venue: "+vanue+"]";
    }
    public int getNoOfGoals(){
        return noOfGoals;
    }
}
class BrazilFans extends Fifa{
    int havingWorldCups;
    BrazilFans(int noOfGoals,String vanue,int havingWorldCups){
        super(noOfGoals,vanue);
        this.havingWorldCups=havingWorldCups;
    }
    public String toString(int noOfGoals,String vanue){
        return "BrazilFans -> "+"[Fifa -> noofGoals: "+noOfGoals+","+" venue: "+vanue+"]"+","+" havingWorldCups: "+havingWorldCups;
    }
    public void incrementWorldCups(){
        havingWorldCups++;
    }
}
class ArgentinaFans extends Fifa{
    int havingWorldCups;
    ArgentinaFans(int noOfGoals,String vanue,int havingWorldCups){
        super(noOfGoals,vanue);
        this.havingWorldCups=havingWorldCups;
    }
    public String toString(int noOfGoals,String vanue){
        return "ArgentinaFans -> "+"[Fifa -> noofGoals: "+noOfGoals+","+" venue: "+vanue+"]"+","+" havingWorldCups: "+havingWorldCups;
    }
    public void incrementWorldCups(){
        havingWorldCups++;
    }
}
public class Mid {
    public static void main(String[] args) {
        ArgentinaFans argentina = new ArgentinaFans(10,"Qatar",2);
        BrazilFans    brazil = new BrazilFans(7,"Qatar",5);

        System.out.println(argentina.toString());
        System.out.println(brazil.toString());

        if(argentina.noOfGoals>brazil.noOfGoals){
            argentina.incrementWorldCups();
            System.out.println("Argentina will win");
        }
        else{
            brazil.incrementWorldCups();
            System.out.println("Brazil will win");
        }


        System.out.println(argentina.toString());
        System.out.println(brazil.toString());
    }
}
package M1;

public class Monster {
    String name;
    double weight;
    public Monster(String name,double weight){
        this.name=name;
        this.weight=weight;
    }
    public void increaseWeight(double weight){
        System.out.println("New weight of moster="+(this.weight+weight));
    }
    public boolean eat(Human h){
        if(h.intelligence == "high"){
            return true;
        }
        else{
            increaseWeight(10.0);
            return false;
        }
    }
    public String scare(boolean bravery){
        if(bravery == false){
            return "Human scared";
        }
        else{
            return "Human is too btave to scare";
        }
    }
}

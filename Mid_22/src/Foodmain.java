class Food{
    double calories;
    double fat;
    double carb;
    Food(double calories, double fat,double carb) {
        this.calories=calories;
        this.fat=fat;
        this.carb=carb;
    }
    void description() {
        System.out.println("Inside Food class");
    }
}
class FastFood extends Food{
    String type;
    String flavour;
    public FastFood(double calories, double fat,double carb, String type, String flavour){
        super(calories,fat,carb);
        this.type=type;
        this.flavour=flavour;
    }
    public void Fastfoodreview(){
        System.out.println("Inside the review method of Fastfood class.");
    }
}
class Homemade extends Food{
    double protine;
    public Homemade(double calories, double fat,double carb,double protine){
        super(calories,fat,carb);
        this.protine=protine;
    }
    public void Homemadereview(){
        System.out.println("Inside the review method of Homemade class.");
    }

    @Override
    void description() {
        System.out.println("Hiii Homemade class");
    }
}
public class Foodmain {
    public static void main(String[] args) {
        Food f1 = new Homemade(4.6,3.5,5.3,4.5);
        Food f2 = new FastFood(4.6,3.5,5.3,"dsff","etw");
        f2.
    }
}

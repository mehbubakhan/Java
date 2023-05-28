class Food {
    Double calories, fat, carb;
    Food(Double calories,  Double fat, Double carb )
    {         this.calories=calories;
              this.fat=fat;
              this.carb=carb;
    }
    void description(){
           System.out.println("Inside Food class");
    }
}
class Fastfood extends Food{
    String Type;
    String Flavour;
    Fastfood(double calories, double fat, double carb ,String Type,String Flavour){
        super(calories,fat,carb);
        this.Type=Type;
        this.Flavour=Flavour;
    }
    void Fastfoodreview(){
        System.out.println("Inside the review method of Fastfood class.");
    }
}
class  Homemade extends Food{
    double Protein;
    Homemade(double calories, double fat, double carb,double Protein){
        super(calories,fat,carb);
        this.Protein=Protein;
    }
    void Homemadereview(){
        System.out.println("Inside the review method of Homemade class");
    }
    void description(){
        System.out.println("Inside Homemade class");
    }
}
public class Foodmain{
    public static void main(String[] args) {
        Food f1,f2;
    }
}

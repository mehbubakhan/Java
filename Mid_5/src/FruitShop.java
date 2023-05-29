class Fruit{
    String name;
    double weight;
    double price_per_kg;
    double new_total_price=0;
    Fruit(String name,double weight,double price_per_kg){
        this.name=name;
        this.weight=weight;
        this.price_per_kg=price_per_kg;
    }
    public void reducePricePerKG(double amount){

        double reducePrice;
        double new_total_price;
        reducePrice=price_per_kg-amount;
        new_total_price=weight*reducePrice;
    }
    public void increasePricePerKG(double amount){
        double increasePrice;
        double new_total_price;
        increasePrice=price_per_kg+amount;
        new_total_price=weight*increasePrice;
    }
    public void printDetails(){
        System.out.println("Fruit Details:");
        System.out.println("Name:"+name);
        System.out.println("Weight"+weight);
        System.out.println("Price Per KG"+price_per_kg);
        System.out.println("Total Price"+new_total_price);
    }
}
public class FruitShop{
    public static void main(String[] args){
        Fruit fruit1 = new Fruit("Apple", 3.5, 110);
        Fruit fruit2 = new Fruit("Mango", 5, 90);
        fruit1.reducePricePerKG(10);
        fruit2.increasePricePerKG(20);
        fruit1.printDetails();
        fruit2.printDetails();
    }
}

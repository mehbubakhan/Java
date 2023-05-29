public class Cake {
    protected String name;
    protected double rate;
    public Cake(String n,double r){
        name=n;
        rate=r;
    }
    public double calcPrice(){
        System.out.println("Print the calculeted price");
        return 0;
    }
    public void printDetails(){
        System.out.println("Print the detail");
    }
}
class orderCake extends Cake{
    double weight;
    public orderCake(String n,double r,double w){
        super(n,r);
        weight=w;
    }
    public double calcPrice(){
        System.out.println(weight*rate);
        return 0;
    }
    public void printDetails(){
        System.out.print("Name: "+name+"\nRate: "+rate+"\nWeight: "+weight+"\nTotal Price: ");
        calcPrice();
    }

}
class Readymadecake extends Cake{
    int quantity;
    public Readymadecake(String n,double r,int q){
        super(n,r);
        quantity=q;
    }
    public double calcPrice(){
        System.out.println(quantity*rate);
        return 0;
    }
    public void printDetails(){
        System.out.println("Name: "+name+"\nRate: "+rate+"\nWeight: "+quantity+"\nTotal Price: ");
        calcPrice();
    }
}

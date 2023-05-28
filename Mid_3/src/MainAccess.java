class Vehicle{
    double mph;
    String model;
    int year;
    Vehicle(){
        System.out.println("We are dealing "+"with a vehicle class");
    }
    Vehicle(String model,double mph,int year){
        this.model=model;
        this.mph=mph;
        this.year=year;
    }
    void display(){
        System.out.println(" Paretnt class method ");
    }
}
class Bus extends Vehicle{
    String license_no;
    Bus(String license_no){
        super("hino",30,2023);
        this.license_no=license_no;
    }

    @Override
    void display() {
        super.display();
        System.out.println("Inside Bus class");
    }
}
public class MainAccess {
    public static void main(String[] args) {
        Bus bus = new Bus("abc_123");
    }
}

class Fraction{
    int num;
    int denom;
    Fraction(){
        this.num=1;
        this.denom=2;
    }
    Fraction(int num,int domain){
        this.num=num;
        this.denom=denom;
    }
}
public class Main {
    public static void main(String[] args) {
        Fraction f1 = new Fraction();
        System.out.println(f1.num + "/" + f1.denom);
        Fraction f2 = new Fraction(2, 5);
        System.out.println(f2.num + "/" + f2.denom);

    }
}
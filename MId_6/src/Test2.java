class Product{
    String productId;
    double price;
    Product(String id, double _price){
        productId = id;
        price = _price;
    }
}
class Modifier{
    void updateId(Product p,String newId){
        p.productId = newId;
    }
    void updatePrice(double curPrice,double newPrice){
        curPrice = newPrice;
    }
    void updateIdV2(Product p,String newId){
        p = new Product(newId, p.price);
    }
    void updatePriceV2(Product p,double newPrice){
        p.price = newPrice;
    }
}
public class Test2 {
    public static void main(String[] args) {
        Modifier m = new Modifier();
        Product p= new Product("L-124", 450.0);
        m.updateId(p, "L-567");
        System.out.println(p.productId);
        m.updatePrice(p.price, 470.0);
        System.out.println(p.price);
        m.updateIdV2(p, "L-135");
        System.out.println(p.productId);
        m.updatePriceV2(p, 490.0);
        System.out.println(p.price);
    }
}

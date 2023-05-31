interface Vehicle{
    void fuelType();
}
//class CNG implements Vehicle{
//    public void fuelType(){
//        System.out.println("Use LPG");
//    }
//}
//class Airplane implements Vehicle{
//    public void fuelType(){
//        System.out.println("Use jet fuel");
//    }
//}
public class Spring {
    public static void main(String[] args) {
        Vehicle cng = new Vehicle(){
            public void fuelType(){
                System.out.println("Use LPG");
            }
        };

        Vehicle airplane = new Vehicle() {

            public void fuelType() {
                System.out.println("Use jet fuel");
            }
        };
    }
}

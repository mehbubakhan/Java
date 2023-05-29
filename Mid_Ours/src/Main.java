public class Main {
    public static void main(String[] args) {
        Cake cake []= new Cake[3];
        cake[0]=new orderCake("Ordercake",150,3);
        cake[1]=new orderCake("Ordercake",100,2);
        cake[2]=new Readymadecake("Readymadeckake",200,2);

        for(int i=0;i<cake.length;i++){
            cake[i].printDetails();
        }
    }
}
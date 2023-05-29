class Q{
    Q(){
        System.out.println("A");
    }
}
class P extends Q{
    P(){
        System.out.println("B");
        }
        }
public class dg {
    public static void main(String[] args) {
        Q q= new P();
    }
}

import java.util.Scanner;

public class ExceptionTest {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            int[] data = new int[10];
            for(int i=0;i<data.length;i++){
                int a= sc.nextInt();
                int b= sc.nextInt();
                int c=sc.nextInt();
                data[a]=b/c;
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
        finally {
            System.out.println("Done");
        }
    }
}

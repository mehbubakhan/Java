import java.io.FileWriter;
import java.util.Scanner;
import java.io.File;

public class Q3 {
    public static void main(String[] args) {
        try{
            File fr = new File("LaLaLa.txt");
            Scanner sc = new Scanner(fr);
            while (sc.hasNext()){
                String str= sc.next();
                String str1=str.substring(7,9);
                int num=Integer.parseInt(str1);
                if(num%2==0){
                    try{
                        FileWriter fw = new FileWriter("Even.txt",true);
                        fw.write(str+"\n");
                        fw.close();
                    }
                    catch (Exception e) {
                        System.out.println(e);
                    }
                }
                else {
                    try{
                        FileWriter fw = new FileWriter("Odd.txt",true);
                        fw.write(str+"\n");
                        fw.close();
                    }
                    catch (Exception e){
                        System.out.println(e);
                    }

                }

            }
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}

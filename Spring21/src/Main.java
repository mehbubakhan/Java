import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int count = 0;
        String str = null;
        try {
            File fr = new File("in.txt");
            Scanner sc = new Scanner(fr);

            while (sc.hasNext()) {
                str = sc.next();
                count++;
            }
            for (int i = count - 5; i < count; i++) {
                try {
                    FileWriter fw = new FileWriter("Out.txt");
                    fw.write(str);
                    fw.close();
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        }
        catch (Exception e) {
            System.out.println(e);
        }


    }
}
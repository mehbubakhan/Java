import javax.swing.*;

public class Myframe extends JFrame {
    Myframe(){
        this.setTitle("PROVA's JFrem");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setSize(420,420);
        this.setVisible(true);
        ImageIcon image = new ImageIcon("2499873.jpg");
        this.setIconImage(image.getImage());
    }
}

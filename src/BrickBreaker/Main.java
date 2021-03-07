package  BrickBreaker;
import javax.swing.JFrame;

public class Main {
    public static void main(String[] args) throws Exception {
        JFrame obj = new JFrame("Brick Breaker");
        gameplay gplay = new gameplay();
        obj.setBounds(10, 10, 700, 600);
    
        obj.setResizable(false);
        obj.setVisible(true);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        obj.add(gplay);
    }
}

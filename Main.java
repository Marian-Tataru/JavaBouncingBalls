import javax.swing.JFrame;

public class Main{
    public static void main(String [] args) {
        JFrame f= new JFrame();
        f.setSize(500,500);
        f.setVisible(true);
        f.add(new Balls());        
    }
}
import javax.swing.JPanel;
public class Balls extends JPanel{
    public Balls(){
        setLayout(null);
        setVisible(true);
        add(new Ball(1, 2 ));
    }
}
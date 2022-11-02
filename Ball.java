import javax.swing.JPanel;
import javax.swing.text.AttributeSet.ColorAttribute;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Color;

public class Ball extends JPanel implements Runnable {
    private int vx,vy , diameter , delay=10;
    public Ball (int vx ,int  vy ){
        this.vx = vx; 
        this.vy = vy ;
        new Thread(this).start();
    }
    public Dimension preferredSize() {
        return new Dimension(diameter, diameter);
    }
    public void move(){
        int x  = getX();
        int y  = getY();
        if((x+diameter) > WIDTH || (x-diameter) < 0  ){
            vx=-1*vx;
            x=x+vx;
        }else if((y+diameter) < HEIGHT || (y-diameter)< 0){
            vy=-1*vy;
            y=y+vy;
        }
        setSize(getPreferredSize());
        setLocation(x, y);
    }
    public void run(){
        while(true){
            try {
                Thread.sleep(delay);
            } catch (Exception e) {
                // TODO: handle exception
            }
            move();
            repaint();
        }
    }   
    public void paintComponent(Graphics g){
        super.paintComponent(g);

        g.setColor(Color.BLACK);
        g.drawOval(0, 0, diameter, diameter);
        g.setColor(Color.RED);
        g.fillOval(0, 0, diameter, diameter);
    } 
}
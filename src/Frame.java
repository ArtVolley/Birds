import java.awt.*;
import javax.swing.JFrame;

public class Frame extends JFrame
{
    private Flock flock;
    protected static int length = 1200;
    protected static int height = 800;
    protected static int thickness = 20;
    protected static Color backgroundColor = Color.CYAN;


    public Frame(Flock flock)
    {
        super("BIRDS");
        this.setSize(length, height);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.flock = flock;

    }

    public void paint(Graphics g)
    {
        Rectangle s = this.getBounds();
        //g.clearRect(s.height, s.width, s.height,s.width);
        g.setColor(backgroundColor);
        g.fillRect(0, 0, s.width, s.height);





        g.setColor(Color.WHITE);
        g.drawLine(thickness , thickness + 25, thickness, s.height - thickness);
        g.drawLine(thickness, s.height - thickness, s.width - thickness, s.height - thickness);
        g.drawLine(s.width - thickness, s.height - thickness, s.width - thickness, thickness + 25);
        g.drawLine(thickness, thickness + 25, s.width - thickness, thickness + 25);


        //g.translate(height/2, length/2);                                        Charge coord to center
        flock.draw(g);
    }
}

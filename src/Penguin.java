import java.awt.*;

public class Penguin extends Bird
{
    private static int penguinSize = 50;


    public Penguin()
    {
        System.out.println("And a penguin");
    }

    @Override
    public void fly()
    {
        System.out.println("But I can't fly(");
    }

    public int getType()
    {
        return 1;
    }

    @Override
    public void draw(Graphics g)
    {
        size = penguinSize;
        g.setColor(Color.BLUE);
        g.fillOval(x, y, size/2, size);                                                         //body
        g.fillOval(x + (size/2 - size/3)/2, y - size/3 + size/25, size/3, size/3);              //head
        g.setColor(Color.YELLOW);
        g.fillOval(x + size/4, y - size/6 + size/25, size/4, size/12);                          //beak
        g.setColor(Color.CYAN);
        g.drawOval(x + size/16, y + size/4, size/5, 8*size/13);                                  //wing
        g.setColor(Color.black);
        g.fillOval(x + size/6, y - size/5, size/15, size/15);                                    //eyes
        g.fillOval(x + 13*size/40, y - size/5, size/15, size/15);
    }

    public static int getXSize()
    {
        return penguinSize/2;
    }
    public static int getYSize()
    {
        return penguinSize;
    }

}

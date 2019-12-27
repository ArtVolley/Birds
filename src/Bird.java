import java.awt.*;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

public abstract class Bird
{
    protected   int num = 0;
    protected int x;
    protected int y;
    protected int size = 25;
    protected Color color =Color.RED;
    

    public Bird()
    {
        num = num + 1;
        x = (int)((Frame.length - Frame.thickness * 2 - 25 - size/2)*Math.random() + 25 + Frame.thickness);
        y = (int)((Frame.height - Frame.thickness * 2 - 25 - size/2)*Math.random() + 25 + Frame.thickness);
        Calendar calendar = Calendar.getInstance();

        int hours = calendar.get(Calendar.HOUR_OF_DAY);;
        if ( hours >= 12 && hours < 18) {
            System.out.print("Good afternoon");
        }
        if ( hours >= 0 && hours < 6) {
            System.out.print("Good night");
        }
        if ( hours >= 6 && hours < 12) {
            System.out.print("Morning");
        }
        if ( hours >= 18 && hours < 24) {
            System.out.print("Good evening");
        }

        System.out.println(", Ima stupid Bird №" + num);
    }

    public void fly()
    {
        System.out.println("I can fly, maybe");
    }

    public int getType()
    {
        return 100;
    }

    public int getX()
    {
        return x;
    }
    public int getY()
    {
        return y;
    }

    public void draw(Graphics g)
    {
        g.setColor(color);
        g.fillOval(x, y, size, size);
    }
}
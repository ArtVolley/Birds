import java.awt.*;

public class Sparrow extends Bird
{
    private static int sparrowSize = 10;

    public Sparrow()
    {
        color = Color.BLACK;
        size = sparrowSize;
        System.out.println("And I think I'm a sparrow");
    }

    public int getType()
    {
        return 2;
    }

    public static int getSize()
    {
        return sparrowSize;
    }
}

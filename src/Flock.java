import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Flock
{
    private ArrayList<Bird> flock;
    private int max = -40000;
    private int min = 40000;

    public Flock()
    {
        Scanner read = new Scanner(System.in);
        flock = new ArrayList<>();
        int qty = 0;

        for (int i = 0;; i++)
        {
                String answer = read.nextLine();
            //System.out.println(answer.length());

            if (answer.equals("parrot"))
            {
                qty++;
                flock.add(new Parrot());
            }
            if (answer.equals("penguin"))
            {
                qty++;
                flock.add(new Penguin());
            }
            if (answer.equals("sparrow"))
            {
                qty++;
                flock.add(new Sparrow());
            }
            if (answer.equals("stop"))
            {
                System.out.println("There is " + qty + " birds in that flock. maybe");
                break;
            }
        }
    }



    public void fly()
    {
        for (int i = 0; i < flock.size(); i++)
        {
            flock.get(i).fly();
            System.out.println("Okay, goodbye, my friend, we flew..");
        }
    }

    public int parrotXMax()
    {
        max = -40000;
        for (int i = 0; i < flock.size(); i++)
        {
            if (flock.get(i).getType() == 0)
            {
                if (flock.get(i).getX() > max)
                    max = flock.get(i).getX();
            }
        }
        return max;
    }
    public int parrotYMax()
    {
        max = -40000;
        for (int i = 0; i < flock.size(); i++)
        {
            if (flock.get(i).getType() == 0)
            {
                if (flock.get(i).getY() > max)
                    max = flock.get(i).getY();
            }
        }
        return max;
    }
    public int parrotXMin()
    {
        min = 40000;
        for (int i = 0; i < flock.size(); i++)
        {
            if (flock.get(i).getType() == 0)
            {
                if (flock.get(i).getX() < min)
                    min = flock.get(i).getX();
            }
        }
        return min;
    }
    public int parrotYMin()
    {
        min = 40000;
        for (int i = 0; i < flock.size(); i++)
        {
            if (flock.get(i).getType() == 0)
            {
                if (flock.get(i).getY() < min)
                    min = flock.get(i).getY();
            }
        }
        return min;
    }
    public int penguinXMax()
    {
        max = -40000;
        for (int i = 0; i < flock.size(); i++)
        {
            if (flock.get(i).getType() == 1)
            {
                if (flock.get(i).getX() > max)
                    max = flock.get(i).getX();
            }
        }
        return max;
    }
    public int penguinYMax()
    {
        max = -40000;
        for (int i = 0; i < flock.size(); i++)
        {
            if (flock.get(i).getType() == 1)
            {
                if (flock.get(i).getY() > max)
                    max = flock.get(i).getY();
            }
        }
        return max;
    }
    public int penguinXMin()
    {
        min = 40000;
        for (int i = 0; i < flock.size(); i++)
        {
            if (flock.get(i).getType() == 1)
            {
                if (flock.get(i).getX() < min)
                    min = flock.get(i).getX();
            }
        }
        return min;
    }
    public int penguinYMin()
    {
        min = 40000;
        for (int i = 0; i < flock.size(); i++)
        {
            if (flock.get(i).getType() == 1)
            {
                if (flock.get(i).getY() < min)
                    min = flock.get(i).getY();
            }
        }
        return min;
    }
    public int sparrowXMax()
    {
        max = -40000;
        for (int i = 0; i < flock.size(); i++)
        {
            if (flock.get(i).getType() == 2)
            {
                if (flock.get(i).getX() > max)
                    max = flock.get(i).getX();
            }
        }
        return max;
    }
    public int sparrowYMax()
    {
        max = -40000;
        for (int i = 0; i < flock.size(); i++)
        {
            if (flock.get(i).getType() == 2)
            {
                if (flock.get(i).getY() > max)
                    max = flock.get(i).getY();
            }
        }
        return max;
    }
    public int sparrowXMin()
    {
        min = 40000;
        for (int i = 0; i < flock.size(); i++)
        {
            if (flock.get(i).getType() == 2)
            {
                if (flock.get(i).getX() < min)
                    min = flock.get(i).getX();
            }
        }
        return min;
    }
    public int sparrowYMin()
    {
        min = 40000;
        for (int i = 0; i < flock.size(); i++)
        {
            if (flock.get(i).getType() == 2)
            {
                if (flock.get(i).getY() < min)
                    min = flock.get(i).getY();
            }
        }
        return min;
    }





    public void draw(Graphics g)
    {
        for (int i = 0; i < flock.size(); i++)
        {
            flock.get(i).draw(g);
        }
        g.setColor(Color.RED);
        g.drawRect(parrotXMin(), parrotYMin(), parrotXMax() - parrotXMin() + Parrot.getSize(), parrotYMax() - parrotYMin() + Parrot.getSize());   //Parrot square
        g.setColor(Color.BLACK);
        g.drawRect(sparrowXMin(), sparrowYMin(), sparrowXMax() - sparrowXMin() + Sparrow.getSize(), sparrowYMax() - sparrowYMin() + Sparrow.getSize());      //Sparrow square
        g.setColor(Color.BLUE);
        g.drawRect(penguinXMin(), penguinYMin() - Penguin.getYSize()/3, penguinXMax() - penguinXMin() + Penguin.getXSize(), penguinYMax() - penguinYMin() + 4*Penguin.getYSize()/3);  //Penguin square



    }




}

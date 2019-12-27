public class Parrot extends Bird
{
    private String name = "Billy";
    private static int num = 0;
    private static int parrotSize = 25;

    public Parrot()
    {
        size = parrotSize;
        System.out.println("And " + ++num + " parrot");
    }

    public Parrot(String name)
    {
        this.name = name;
        System.out.println("And " + ++num + " parrot");
    }

    public void speak()
    {
        this.name = name;
        System.out.println("My name is " + name + ", if u really care");
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return this.name;
    }

    public int getType()
    {
        return 0;
    }

    public void friendWith(Parrot parrot)
    {
        System.out.println("Let's be friends, " + parrot.getName());
    }

    public void friendWith(Penguin penguin)
    {
        System.out.println("F**k u, we'll never be friends");
    }

    public static void sum()
    {
        System.out.println("There are " + num + " parrots");
    }

    public static int getSize()
    {
        return parrotSize;
    }
}

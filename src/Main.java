import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner read = new Scanner(System.in);
        //Flock Birds = new Flock();

        System.out.println("....\n" +
                "Hello, man!\n" +
                "What do u want to add?\n" +
                "If u want to add parrot, write parrot\n" +
                "If u want to add penguin, write penguin\n" +
                "If u want to add sparrow, write sparrow\n" +
                "If u want to stop that shit, write stop");

        Flock FirstFlock = new Flock();

        new Frame(FirstFlock);











        /*ArrayList<Bird> Group = new ArrayList<>();                     dynamic array
        Group.add(new Parrot ("Fill"));
        Group.add(new Parrot ("Mike"));
        Group.add(new Penguin ());

        System.out.println("....");
        for (int i = 0; i < Group.size(); i++)
        {
            if (Group.get(i) instanceof Parrot)
            {
                ((Parrot)Group.get(i)).speak();
            }
            Group.get(i).fly();
        }*/









        /*System.out.println("....");                                              static array
        Bird[] BirdGroup = new Bird[3];
        BirdGroup[0] = new Parrot("Fluffy");
        BirdGroup[1] = new Parrot("Joe");
        BirdGroup[2] = new Penguin();


        System.out.println("....");
        for (int i = 0; i < BirdGroup.length; i++)
        {
            if (BirdGroup[i] instanceof Parrot)
            {
                ((Parrot) BirdGroup[i]).speak();
            }
            BirdGroup[i].fly();

        }*/









 /*
        System.out.println("Program work");


        //Bird WhiteBird = new Bird();                added "abstract" to class Bird
        Parrot BlackParrot = new Parrot();
        Parrot GreenParrot = new Parrot();
        Parrot BlueParrot = new Parrot("Anatolii");
        Penguin WhitePenguin = new Penguin();
        Date Now = new Date();

        System.out.println("....");
        //WhiteBird.fly();                              added "abstract" to class Bird
        BlackParrot.fly();
        GreenParrot.fly();
        WhitePenguin.fly();

        System.out.println("....");
        BlackParrot.setName("Frank");
        System.out.println(BlackParrot.getName());

        System.out.println("....");
        BlueParrot.speak();
        BlackParrot.speak();
        GreenParrot.speak();

        System.out.println("....");
        BlackParrot.friendWith(GreenParrot);
        BlackParrot.friendWith(WhitePenguin);

        System.out.println("....");
        Parrot.sum();


        System.out.println("....");
        System.out.println(Now.getTime());*/
    }
}

import java.util.Scanner;


public class MultiplicationTables
{

    static public void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        int userPick;



        System.out.println("Welcome to Multiplication Tables"
            + "\nHow large would you like to see them?");
        userPick = keyboard.nextInt();


        for (int count = 0; count <= userPick; count++)
        {
            for (int i = 1; i <= userPick; i++)
            {
                System.out.println(count + " * " + i + " = " + count * i);
            }
        }



    }


}

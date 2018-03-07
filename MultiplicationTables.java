import java.util.Scanner;


public class MultiplicationTables
{

    static public void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        int size;



        System.out.println("Welcome to Multiplication Tables"
            + "\nHow large would you like to see them?");
        size = keyboard.nextInt();

        if ((size >=0) && (size <= 20))
        {

            for (int count = 0; count <= size; count++)
            {
                for (int i = 1; i <= size; i++) {
                    System.out.println(count + " * " + i + " = " + count * i);
                }
            }

        }
        else
        {
            System.out.println("Please choose a number between 0 and 20");
        }

    }


}

import java.util.Scanner;

public class CalculatorNexus
{
    /*
    Computer asks for simple math, user gives math pieces and then computer gives answer

    Solved: Error for dividing by zero should be 'undefined' Added if statement in division method with exit to stop
    code from finishing

    Research: How to look for a whole line problem rather than break it into separate parts

    Note: changed everything to float to use decimals (not sure how necessary it is except for division)
     */
    public static float add(float a, float b)
    {
        //this works!
        return a + b;
    }
    public static float subtract(float a, float b)
    {
        //finish code
        return a - b;
    }
    public static float multiply(float a, float b)
    {
        //finish code
        return a * b;
    }
    public static float divide(float a, float b)
    {
        //make your own method for division
        //original flawed code a / b; found that both top and bottom need to have data type
        //float answer = (float)a / (float)b; <is this to change int to float? Could everything be changed back to int?
        //return answer;
        //need to add condition that cannot divide by 0
        if (b == 0)
        {
            System.out.println("Undefined. I break when you divide by zero. You'll have to start again.");
            System.exit(1);//how do I get this to loop back?
        }
        return a / b;
    }
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        float firstNum;
        float secondNum;
        String operator;
        String yesOrNo = null;

        System.out.println("Simple Math Helper");

        do
        {

            System.out.println("\nEnter first number, whole or integer:");
            firstNum = keyboard.nextFloat();

            System.out.println("Enter operator such as +, -, *, or /:");
            operator = keyboard.next();

            System.out.println("Enter second number, whole or integer:");
            secondNum = keyboard.nextFloat();
            keyboard.skip("\n");

            float a = firstNum;
            float b = secondNum;
            float answer = 0;


            if (operator.equals("+"))
            {
                answer = add(a, b);
            }
            else if (operator.equals("-"))
            {
                answer = subtract(a, b);
            }
            else if (operator.equals("*"))
            {
                answer = multiply(a, b);
            }
            else if (operator.equals("/"))
            {
                answer = divide(a, b);
            }

            System.out.println("You asked: " + firstNum + " " + operator + " " + secondNum +
                    "\nYour answer is: " + answer);
            System.out.println("\nDo you have another problem?");
            yesOrNo = keyboard.nextLine();

        }
        while(yesOrNo.equalsIgnoreCase("Y"));
        System.out.println("Until next time!");
    }
}

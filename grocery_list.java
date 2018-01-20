package com.company;

import java.util.Scanner;


public class grocery_list {

    public static void main(String[] args) {
        // write your code here
        /*
            Notes while testing:

            Thought: Maybe want a for statement to go through three items? Have the answers declared to a set variable
            then the answers compute a final total?

            Solved: If two words were entered code would execute next statement without break for user input.
            Had to use keyboard.nextLine rather than keyboard.next

            FIX: If character is entered rather than a number causes code to error.
            Will need to add a prompt. If else statement? Boolean?
            If number entered move on else "A number is needed, please try again"
            > http://moriel.smarterthanthat.com/tips/java/java-user-input-validation/ GREAT INFO

            Solved: Replace number strings with int count = keyboard.nextInt(); or float meters = keyboard.nextFloat();
            (this might fix having to reassign string using float parse and allow for variables at top)
            float qt1 = Float.parseFloat(quan1);

            Thought: Could let user dictate if item was entered correctly before moving on to next item.
            Maybe quantity or price was mistyped and they need to re-enter it. if else statement?

            Solved: On second and third item code skipping user input. Added 'keyboard.nextLine();' which absorbs end of
            line

            Thought: Once more java is known would like to practice and make a UI with split sides. One side would have
            3 input areas (item, quantity, price) and one button to add input to other side. The second side would keep
            all user input added and compute pricing upon item added. Maybe have preference inputs for taxes or currency
            choice. Could be a small part of a bigger project like budget tracking.

         */


        //could ask user if ready. Yes to start questions, no to prompt good bye


        Scanner keyboard = new Scanner(System.in);

        //Variables for first item
        String item1;
        int quan1;
        float price1;
        float total1;


        //Variables for second item
        String item2;
        int quan2;
        float price2;
        float total2;

        //Variables for third item
        String item3;
        int quan3;
        float price3;
        float total3;

        //variable for complete total of all items
        float bill;


        //Greeting
        System.out.println("Hello! I am your personal shopping helper! " +
                "\nI will help you total three items and their quantities before purchase. Let's get started!\n");

        //****** What is first shopping item ******


        System.out.println("What is your first item?");
        item1 = keyboard.nextLine(); //enter item

        System.out.println("How many would you like of " + item1 + "?");
        quan1 = keyboard.nextInt();//enter quantity

        System.out.println("And what is the price of one " + item1 + "?");
        price1 = keyboard.nextFloat();//enter price
        keyboard.nextLine();

        total1 = quan1 * price1;

        System.out.println("For " + quan1 + " " + item1
                + "s your total will be $" + total1 + ".\n");

        //****** What is your second item? ******


        System.out.println("What is your second item?");
        item2 = keyboard.nextLine(); //enter item

        System.out.println("How many would you like of " + item2 + "?");
        quan2 = keyboard.nextInt();//enter quantity

        System.out.println("And what is the price of one " + item2 + "?");
        price2 = keyboard.nextFloat();//enter price
        keyboard.nextLine();

        total2 = quan2 * price2;

        System.out.println("For " + quan2 + " " + item2
                + "s your total will be $" + total2 + ".\n");


        //****** What is your third item? ******


        System.out.println("What is your third item?");
        item3 = keyboard.nextLine(); //enter item

        System.out.println("How many would you like of " + item3 + "?");
        quan3 = keyboard.nextInt();//enter quantity

        System.out.println("And what is the price of one " + item3 + "?");
        price3 = keyboard.nextFloat();//enter price

        total3 = quan3 * price3;

        System.out.println("For " + quan3 + " " + item3 +
                "s your total will be $" + total3 + ".\n");


        //******calculate the complete total of all items (1, 2, and 3)******

        //math for all items
        bill = total1 + total2 + total3;


        System.out.println("For " + quan1 + " " + item1 + "s, "
                + quan2 + " " + item2 + "s, and " + quan3 + " " + item3 + "s");
        System.out.println("your entire total will be $" + bill);
        System.out.println("Happy shopping!");

    }
}
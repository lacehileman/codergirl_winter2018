package com.company;

import java.util.Scanner;


public class SandwichShop {

    public static void main(String[] args)
    {

        /*
        Thought: Maybe add math statements to let the user know profit and debt of each item?

        Thought: there should be a closing statement to let the user know the program is done running when goal is
        not made.

        Thought: The user would want a more extensive program. One that would keep track of a weekly
        or monthly goal and that would let them know when they are behind to meet the weekly goal
        based on the daily items sold. Red versus black. Maybe this would be better with a UI...
        (of course there is always excel)
            Example: Weekly goal of 5 day week = 100; Daily goal = 20. When daily goal is not met
            user would be prompted "You need to sell x additional of item to meet weekly goal tomorrow.
            This would need to keep track of all days and reevaluate depending on goal met or not.

         */

        //given code
        Scanner keyboard = new Scanner(System.in);
        int goalForVeggies = 50;
        int goalForBurgers = 250;
        int goalForSubs = 180;
        int goalForSoup = 70;


        //new variables
        int veggiesSold;
        int burgersSold;
        int subsSold;
        int soupSold;



        //code below
        System.out.println("Checking goals for day.\n");

        //veggies goal
        System.out.println("The sales goal for Veggie Sandwiches is " + goalForVeggies + ".\n" +
         "How many Veggie Sandwiches were sold today?");
        veggiesSold = keyboard.nextInt();
        if (veggiesSold >= goalForVeggies)
        {
            System.out.println("You made goal.\n");
        }
        else
        {
            System.out.println("You fell short.\n");
        }


        //burgers goal
        System.out.println("The sales goal for Burgers is " + goalForBurgers + ".\n" +
                "How many Burgers were sold today?");
        burgersSold = keyboard.nextInt();
        if (burgersSold >= goalForBurgers)
        {
            System.out.println("You made goal.\n");
        }
        else
        {
            System.out.println("You fell short.\n");
        }


        //sub goal
        System.out.println("The sales goal for Sub Sandwiches is " + goalForSubs + ".\n" +
                "How many Subs were sold today?");
        subsSold = keyboard.nextInt();
        if (subsSold >= goalForSubs)
        {
            System.out.println("You made goal.\n");
        }
        else
        {
            System.out.println("You fell short.\n");
        }


        //soup goal
        System.out.println("The sales goal for Soup is " + goalForSoup + ".\n" +
                "How many Soups were sold today?");
        soupSold = keyboard.nextInt();
        if (soupSold >= goalForSoup)
        {
            System.out.println("You made goal.\n");
        }
        else
        {
            System.out.println("You fell short.\n");
        }

        //final totals for the day
        if (veggiesSold >= goalForVeggies && burgersSold >= goalForBurgers && +
                subsSold >= goalForSubs && soupSold >= goalForSoup)
        {
            System.out.println("Good job! You made daily goal for everything!");
        }


    }

}

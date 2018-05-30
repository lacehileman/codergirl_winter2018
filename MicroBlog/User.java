package MicroBlog;

import java.util.ArrayList;
import java.util.*;
import java.util.Scanner;

public class User {

    private String avatar;//url will go here
    private String userName;
    private String fullName;
    private String email;

    public User(String avatar, String userName, String fullName, String email)
    {
        this.avatar = avatar;
        this.userName = userName;
        this.fullName = fullName;
        this.email = email;
    }




    public String displayUser()
    {
        return avatar + " " + userName;
    }

//    public static String userList()
//    {
//
//        List<ArrayList<String>> i = new ArrayList<>();
//        ArrayList<String> i1 = new ArrayList<String>();
//
//        i.add(makeUser());
//
//        for(ArrayList obj:i) {
//
//            ArrayList<String> temp = obj;
//
//            for (String job : temp) {
//                System.out.print(job + " ");
//            }
//            System.out.println();
//        }
//        return null;
//    }

    public static ArrayList<String> makeUser()
    {
        Scanner keyboard = new Scanner(System.in);


        ArrayList<User> userArray = new ArrayList<>();

        System.out.println("\nYou have chosen to make a new user." +
                "\nPlease enter a Email Address:");
//        keyboard.nextLine();
//        keyboard.nextLine();
        String email = keyboard.nextLine();
        System.out.println("Please enter First and Last Name:");
        String fullName = keyboard.nextLine();
        System.out.println("Please enter User Name:");
        String userName = keyboard.nextLine();
        System.out.println("Please enter URL image for avatar:");
        String avatar = keyboard.nextLine();
        System.out.println("\n");

        userArray.add (new User(avatar, userName, fullName, email));//need a get function?

        for (int i = 0; i < userArray.size(); i++)
        {
            System.out.println(userArray.get(i));
            //System.out.println(Arrays.deepToString(userArray.));
        }
//        System.out.println(Arrays.toString(userArray.toArray()));
//        System.out.println(userArray);

        for(User stuff : userArray)
            System.out.println(stuff);




//        List<ArrayList<String>> a = new ArrayList<>();
//
//        ArrayList<String> a1 = new ArrayList<String>();
//
//
//        a1.add(email);
//        a1.add(fullName);
//        a1.add(userName);
//        a1.add(avatar);
//
//        a.add(a1);

//        for(ArrayList obj:a) {
//
//            ArrayList<String> temp = obj;
//
//            for (String job : temp) {
//                System.out.print(job + " ");
//            }
//            System.out.println();
//        }
        /*
        so get the info from inputs (diff variable for each?) which assigns to a
        new user. User would have a undefined array limit which would be a for loop?
want to verify emails and tell if user name is taken or not
         */
    //return a1;
        return null;
    }
}

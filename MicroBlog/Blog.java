package MicroBlog;
import java.util.*;

public class Blog
{
    public User user;
    public Postings postings;

    public static void mainMenu(String user)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Main Menu. " +
                "\n1. Create New User" +
                "\n2. Become an Existing User" +
                "\n3. Create a Post" +
                "\n4. Print All Posts" +
                "\n5. Print All Users\n" +
                "\nYou are currently \"" + user + "\". " +
                "\nWhat would you like to do?");

    }

    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        int menuChoice;
        String avatar, fullName, userName, email;
        String comment;

        System.out.println("Welcome to the blog.\n");

        ArrayList<User> userArray = new ArrayList<>();
        ArrayList<Postings> postArray = new ArrayList<>();
        userArray.add(0, new User("","","",""));

        String currentUser = "";
        String currentPost = "First Post";
        int pkUser = 0;
        User pkUserString = userArray.get(pkUser);

        if(pkUser != 0)
        {
            currentUser = String.valueOf(userArray.get(pkUser).displayUser());
        }

        if (userArray != null && !userArray.isEmpty())
        {
            currentUser = String.valueOf((userArray.get(userArray.size()-1).displayUser()));

        }

        do {
                //REWORK: Make user create user upon first use before they can do anything else
                //This searches userArray to find the last element
                //FIX: Keeps pkUser as user when making new user, does not make new user current user

                if (postArray != null && !postArray.isEmpty())
                {
                    currentPost = String.valueOf((postArray.get(postArray.size()-1).getPost()));
                } 
            
                mainMenu(currentUser);
                menuChoice = keyboard.nextInt();

                while (menuChoice >= 6 || menuChoice <= 0)
                {
                    System.out.println("I don't understand your choice, please choose 1 through 5");
                    menuChoice = keyboard.nextInt();
                }


                //create new user
                if (menuChoice == 1) 
                {
                    //User.makeUser();
                    //would apply similar solution to making posts
                    System.out.println("\nYou have chosen to make a new user.\n" +
                            "\nPlease enter a Email Address:");
                    keyboard.nextLine();
                    email = keyboard.nextLine();
                    System.out.println("Please enter First and Last Name:");
                    fullName = keyboard.nextLine();
                    System.out.println("Please enter User Name:");
                    userName = keyboard.nextLine();
                    System.out.println("Please enter URL image for avatar:");
                    avatar = keyboard.nextLine();
                    System.out.println("\n");
                    User user = new User (avatar, userName, fullName, email);

                    userArray.add (user);//need a get function?

                }
                //become existing user
                else if (menuChoice == 2) 
                {
                    System.out.println("\nThese are the current users:\n");
                    System.out.println("List of Users...");

                        for (int i = 1; i < userArray.size(); i++)
                        {
                            System.out.println(i + " " + userArray.get(i).displayUser());
                        }
                    System.out.println();
                    
                    System.out.println("\nPlease choose number of user you would like to log in as:");
                    pkUser = keyboard.nextInt();
                    System.out.println();
                    
                    currentUser=userArray.get(pkUser).getUserName();
                    System.out.println("you are now user: \"" + userArray.get(pkUser).displayUser() + "\"");
                    System.out.println();
                    
                }
                //create a post
                else if (menuChoice == 3) //Fixed: Prints last post and takes whole line as comment, not first word
                {
                    System.out.println();
                    int userPost = -1;
                    for (int i = 0; i < postArray.size(); i++)
                    {
                        if (postArray.get(i).user.equals(currentUser))
                        {
                            userPost = i;
                        }
                    }
                    if (userPost > -1)
                    {
                        System.out.println("This was your last post:");
                        System.out.println(postArray.get(userPost).getPost());
                    }
                    else
                    {
                        System.out.println("You haven't posted anything yet.");
                    }
                   //makePost();
                    System.out.println("Most recent post in thread:\n" + currentPost);
                    System.out.println();

                    System.out.println("You are currently posting as \"" + currentUser + "\".\n" +
                            "What would you like to say?");
                    keyboard.nextLine();
                    comment = keyboard.nextLine();
                    System.out.println();

                    postArray.add(new Postings(currentUser, comment));
                }
                //print all posts
            else if (menuChoice == 4) 
            {
                for (int i = 0; i < postArray.size(); i++)
                {
                System.out.println(postArray.get(i).getPost());
                }
                System.out.println();
            }
            //print all users
            else if (menuChoice == 5)
            {

                for (int i = 1; i < userArray.size(); i++)
                {
                    System.out.println(userArray.get(i).displayUser());
                }

            }
            else if (menuChoice >= 6 || menuChoice <= 0)//seems redundant?
            {
                while (menuChoice >= 6 || menuChoice <= 0)
                {
                    System.out.println("I don't understand your choice, please choose 1 through 5");
                    menuChoice = keyboard.nextInt();
                }
            }

    }while (true);

}

}

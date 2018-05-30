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
//                "\nPlease make a choice:" +
                "\n1. Create New User" +
                "\n2. Become an Existing User" +
                "\n3. Create a Post" +
                "\n4. Print All Posts" +
                "\n5. Print All Users\n" +
                "\nYou are currently \"" + user + "\". " +
                "\nWhat would you like to do?");

    }

//    public static void becomeUser(String user)//pass in user as a argument?
//    {
//        Scanner keyboard = new Scanner(System.in);
//        String bcUs;
//        int pkUs;
//        System.out.println("\nThese are the current users:\n");
//        System.out.println("List of Users...");
//        System.out.println("\nPlease choose number of user you would like to log in as:");
//        pkUs = keyboard.nextInt();
//        System.out.println("You have chosen: \"" + user + "\", is this correct?");
//        System.out.println("Yes or No");
//        bcUs = keyboard.next();
//        System.out.println();
//        return;
//        /*
//        would print all the users from the array including invisible users
//
//        Add ask for password later
//         */
//    }

//    public static void makePost()//pass in current user to make post
//    {
//        Scanner keyboard = new Scanner(System.in);
//        String mkPt;
//        System.out.println("You are currently posting as \"    \".\n" +
//                "What would you like to say?");
//        mkPt = keyboard.next();
//        System.out.println();
//
//        /*
//        a for loop which would put users and posts in array with no limit
//         */
//    }

//    public static void printPosts()
//    {
//        System.out.println("\nThese are all the posts\n");
//    }
//
//    public static void printUsers()
//    {
//        System.out.println("\nThese are all current users:\n");
//    }

//    public static String userList()
//    {
//
//        List<ArrayList<String>> i = new ArrayList<>();
//        ArrayList<String> i1 = new ArrayList<String>();
//
//        i.add(User.makeUser());
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

    public static void main(String[] args)
    {
//        User[] user = new User[5];
//
//        user[0] = new User("URL", "Squirrel", "Dean Winchester", "impala67@molbunker.com");
//        user[1] = new User("URL", "Moose", "Sam Winchester", "samwin@molbunker.com");
//        user[2] = new User("URL", "Angel", "Jimmy Novak", "castiel@heaven.com");
//        user[3] = new User("URL", "King", "Fergus Roderick MacLeod", "bowToTheKing@hello.com");
//        user[4] = new User("URL", "MOD: Caver Edmund", "Chuck Shurley", "GOD@heaven.com");
//
//        Postings[] post = new Postings[5];
//
//        post[0] = new Postings(user[0], "SOB");//need to fix post num so auto numbers
//        post[1] = new Postings(user[1], "So, get this...");
//        post[2] = new Postings(user[2], "Assbutt");
//        post[3] = new Postings(user[3], "Hello Boys");
//        post[4] = new Postings(user[4], "Feel the power of my Ban Hammer!");

        Scanner keyboard = new Scanner(System.in);
        int menuChoice;
        String avatar, fullName, userName, email;
        String comment;
//        int userChoice = keyboard.nextInt();



        System.out.println("Welcome to the blog.\n");


        ArrayList<User> userArray = new ArrayList<>();
        //ArrayList<String> al1 = new ArrayList<String>();
        ArrayList<Postings> postArray = new ArrayList<>();
        userArray.add(0, new User("","","",""));

        String currentUser = "";//come back to this once everything else is complete
        int pkUser = 0;
        User pkUserString = userArray.get(pkUser);




//        mainMenu(currentUser);
//
//        switch (userChoice) {
//            case 1:
//                System.out.println("case 1");
//                break;
//            case 2:
//                System.out.println("case 2");
//                break;
//            default:
//                System.out.println("defailt");
//                break;
//
//        }


        do {



            //This searches userArray to find the last element, Need to assign that to a variable
            if(pkUser != 0){
                currentUser = String.valueOf(userArray.get(pkUser).displayUser());
                }
            else if (userArray != null && !userArray.isEmpty()) {
//            System.out.println("Last element is:");
//            System.out.println(userArray.get(userArray.size()-1));
                currentUser = String.valueOf((userArray.get(userArray.size()-1).displayUser()));
                //System.out.println(userArray.get(i).displayUser());
                //System.out.println(currentUser);
            }

            mainMenu(currentUser);
            menuChoice = keyboard.nextInt();

            while (menuChoice >= 6 || menuChoice <= 0)
            {
                System.out.println("I don't understand your choice, please choose 1 through 5");
                menuChoice = keyboard.nextInt();
            }


            //create new user
            if (menuChoice == 1) {
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
            else if (menuChoice == 2) {
                //becomeUser(currentUser);//need to reassign currentUser to the user's choice;
                                        // do this at assignment of variable?
                String bcUs;

                System.out.println("\nThese are the current users:\n");
                System.out.println("List of Users...");

//                User first = userArray.get(0);
////                System.out.println(userArray);
////                for(User stuff : userArray)
////                System.out.println(stuff);
//                System.out.println(first.displayUser());
//                System.out.println(userArray.get(1).displayUser());


                    for (int i = 1; i < userArray.size(); i++)
                    {
                        System.out.println(i + " " + userArray.get(i).displayUser());
                    }
                    System.out.println();

//                System.out.println(Arrays.toString(userArray.toArray()));
//                System.out.println(userArray);
                //System.out.println(this.user.displayUser());

                System.out.println("\nPlease choose (name/number?) of user you would like to log in as:");
                pkUser = keyboard.nextInt();
                

                //System.out.println("You are now: \"" + currentUser + "\"");
//                System.out.println("Yes or No");
//                bcUs = keyboard.next();
                System.out.println();
            }
            //create a post
            else if (menuChoice == 3) {
               //makePost();
                System.out.println("You are currently posting as \"" + currentUser + "\".\n" +
                        "What would you like to say?");
                comment = keyboard.next();

                postArray.add(new Postings(currentUser, comment));
            }
            //print all posts
            else if (menuChoice == 4) {
//                printPosts();//use similar solution to that of times table to number posts
//                nested for loop
//                for (int i = 0; i < postArray.size(); i++)
//                {
//                    //System.out.println(userArray.get(i));
//                    System.out.println(Arrays.deepToString(postArray.toArray()));
//                }
                for (int i = 0; i < postArray.size(); i++)
                {
                System.out.println(postArray.get(i).getPost());
                }

//                    for(int i = 0; i < post.length; i++)
//                    {
//                        System.out.println("length " + post.length);
//                        System.out.println("index " + i);
//                        System.out.println(post[i].getPost());
//                    }
                System.out.println();
            }
            
            //print all users
            else if (menuChoice == 5)
            {

                for (int i = 1; i < userArray.size(); i++)
                {
                    System.out.println(userArray.get(i).displayUser());
                }
//                userList();
//                printUsers();
//                for(int i = 0; i < user.length; i++)
//                {
//                    System.out.println(user[i].displayUser());
//                }
//                System.out.println();

            }
            else if (menuChoice >= 6 || menuChoice <= 0)
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
/*

 */
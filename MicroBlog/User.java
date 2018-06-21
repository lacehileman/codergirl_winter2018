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

    public String getUserName()
    {
        return userName;
    }
    
    public String displayUser()
    {
        return avatar + " " + userName;
    }

}

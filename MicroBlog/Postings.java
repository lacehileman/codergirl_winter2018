package MicroBlog;

public class Postings
{
    public String user;
    public String comment;


    public Postings (String user, String comment)//user id needs to pull avatar and user name
    {
        this.user = user;
        this.comment = comment;
    }

//    public int getPostNum()
//    {
//        return postNum++;
//    }

    public String getPost()
    {
        return user + ":\n" + "    \"" + comment + "\"";
    }




}
/* need to be able to call a user into a post*/
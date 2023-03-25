import java.util.Scanner;
class mybook extends book
{
    void setTitle(String s)
    {
        this.title=s;
    }
    public static void main(String [] args)
    {
        Scanner a= new Scanner(System.in);
        mybook m=new mybook();
        String s=a.nextLine();
        m.setTitle(s);
        System.out.println("The title is: "+m.getTitle());
        
        a.close();
    }
}
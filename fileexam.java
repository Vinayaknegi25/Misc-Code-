import java.io.*;
import java.util.*;
public class fileexam 
{
    public static void main(String[] args)
    {
        int c;
        Scanner sc=new Scanner(System.in);
        try
        {
        FileWriter f=new FileWriter("abc.txt");
        String str;
        str=sc.nextLine();
        f.write(str);
        f.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        try
        {
            FileReader f=new FileReader("abc.txt");
            FileWriter f2=new FileWriter("new.txt");
            while((c=f.read())!=-1)
            {
                if((char)c ==65||c==69||c==73||c==80||c==85)
                {
                    f2.write(c);
                }
            }
            f.close();
            f2.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        sc.close();
    }
    
}

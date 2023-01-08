//import java.util.*;
class prime extends Thread
{
    public void run()
    {
        int count=0,i=1,c=0;
        while (count<=20)
        {
            for(int j=1;j<=i;j++)
            {
                if(i%j==0)
                {
                    c++;
                }
            }
            if(c==2)
            {
                count++;
                System.out.println(i);
            }
            c=0;
            i++;
        }
    }
}
class even extends Thread
{
    public void run()
    {
        for(int i=2;i<=42;i=i+2)
        {
            System.out.println(i);
        }
    }
}
public class threadexam 
{
    public static void main(String[] args)
    {
    new even().start();
    new prime().start();
    }
}


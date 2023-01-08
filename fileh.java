import java.util.*;
import java.io.File;
//import java.io.FileWriter;
class fileh
{
    public static void main(String[] args)
    {
        File f = new File("vivafile.txt");
        Scanner sc = new Scanner(f);
        System.out.println(f.length());
        int c=0;
        while (sc.hasNext())
        {
            String word=sc.next();
            if(ispalindrome(word))
                c++;
        }
        sc.close();
        System.out.println(c);
    }
    public static boolean ispalindrome(String s)
    {
        int low,high;
        low=0;
        high=s.length()-1;
        while(low<high)
        {
            if(s.charAt(low)!=s.charAt(high))
            {
                return false;
            }
            low++;
            high--;
        }
        return true;

    }
}
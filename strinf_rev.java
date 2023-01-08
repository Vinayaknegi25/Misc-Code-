import java.util.*;
class strinf_rev 
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner (System.in);
        String str;
        str=sc.nextLine();
        remove_vow(str);
        sc.close();
    }
    public static void remove_vow(String str)
    {
        char[]c=new char[10];
        char ch;
        int k;
        int a=0;
        for(int i=0;i<str.length();i++)
        {
            ch=str.charAt(i);
            if(ch!=32)
            {
                c[a]=ch;
                a++;
            }
        }
    }
}
    



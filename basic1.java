import java.util.*;
class basic1
{
    public static void main(String[]k)
    {
        Scanner sc=new Scanner(System.in);
        String s;
        int ch;int x;
        s=sc.nextLine();
        char arr[]=new char[s.length()];
        for(int i=0;i<s.length();i++)
        {
            arr[i]=s.charAt(i);
        }
        do{
            System.out.println("\n1 to count lengtl\n2 to count vowels\n3 to remove space\n4 to exit");
            ch=sc.nextInt();
            switch(ch)
            {
                case 1:
                count(arr,s.length());
                break;
                case 2:
                countvowels(arr,s.length());
                break;
                case 3:
                x=space_remove(arr,s,s.length());
                //System.out.println(String.valueOf(arr).subSequence(0, x))
                s=arr.toString();
                System.out.print(s);
                // System.out.print(arr[z]);
                break;
            }
        }while(ch!=0);
        sc.close();
    }
    public static void count(char arr[],int len)
    {
        int c=0;
        for(int i=0;i<len;i++)
            c++;
        System.out.println(c);
    }
    public static void countvowels(char arr[],int len)
    {
        for(int i=0;i<len;i++)
        {
            int c=0;
            if(arr[i]=='a'|| arr[i]=='e'|| arr[i]=='i'|| arr[i]=='o'|| arr[i]=='u')
            {
                c++;
            }
            System.out.println(c);
        }
    }
    public static int space_remove(char arr[],String s,int len)
    {
        int c=0;
        for(int i=0;i<len;i++)
        {
            if(arr[i]!=32)
            {
                arr[c++]=arr[i];
            }

        }
        return c;
    }
}

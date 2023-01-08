import java.util.*;
class array 
{
    public static void main(String []k)
    {
        Scanner sc=new Scanner(System.in);
        String s;
        int i=1,v=5,x=10,l=50,c=100,d=500,m=1000;
        s=sc.nextLine();
        int len=s.length();
        System.out.println(len);
        char arr[]=new char[len];
        for(int j=0;j<len;j++)
        {
            arr[i]=s.charAt(i);
        }
        for(int j=0;j<len;j++)
            System.out.println(arr[i]);
        sc.close();
    }
}

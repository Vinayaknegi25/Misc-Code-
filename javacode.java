import java.util.Scanner;
public class javacode 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s;
        System.out.println("enter string");
        s=sc.nextLine();int flag=0;
        int len=s.length();
        System.out.println(len);
        if(s.length()%2!=0)
        {
            System.out.println("False");
            flag=-1;
            sc.close();
        }        
        char arr[]=new char[len];
        for (int i=0; i<len;i++)
        {
            arr[i]=s.charAt(i);
           //System.out.println(arr[i]);
        }
        int j=0;
        for(int i=0; i<len-1;i++)
        {
            j=len-i-1;
            if((arr[i]!=arr[j]||arr[i]!=arr[i+1]) && i>j)
            {
                flag =1;
                break;   
            }
            else
            {
                flag=0;
            }
        }
        if(flag==1)
            System.out.println("flase");
        if(flag==0)    
            System.out.println("true");
        sc.close(); 
    }
    
}

import java.util.*;

public class Q4_7thWk 
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        String str;
        str=sc.nextLine();
        sortArr(str);
        sc.close();
    }
    public static void sortArr(String str)
    {
        char arr[]=new char[str.length()];
        int count[]=new int[26];
        int max=0,index=0;
        for(int j=0;j<str.length();j++)
        {
           char ch=str.charAt(j);
           arr[j]= ch;
           count[arr[j]-97]++;
        }
        int k;
        for( k=0;k<26;k++)
        {
          if(count[k]>max)
          {
            max=count[k];
            index=k;      
          }    
        }
        if(max==1)
        {
          System.out.println("No Duplicates found");
        }
        else
        {
            char c= (char)(index+97);
            System.out.println(c+max);
        }

    }
    
}

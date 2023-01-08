import java.util.*;
public class Main
{
    String rev(String s)
    {
        String st="";
        for(int i=s.length()-1;i>=0;i--)
        {
            st=st+s.charAt(i);
        }
        return(st);
    }
	public static void main(String[] args) 
	{
	    Scanner sc = new Scanner(System.in);
	    
		System.out.println("Enter String");
		Main ob = new Main();
		String str,s="",t;
		str= sc.nextLine();
		str=str+ " ";
		for(int i=0;i<str.length();i++)
		{
		    if(str.charAt(i)!=' ')
		    {
		        s=s+str.charAt(i);
		    }
		    else
		    {
		    t=ob.rev(s);
		    System.out.print(t+" ");
		    s="";
		    }
		}
		sc.close();
		
	}
}

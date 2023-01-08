public class prime 
{
    public static void main(String[] args)
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
            }
            c=0;
            System.out.println(i);
            i++;
        }
    }
    
}

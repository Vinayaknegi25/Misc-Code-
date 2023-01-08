import java.util.*;
public class ararylist 
{
    public static void main(String []args)
    {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Ravi");
        list.add("Vivek");
        list.add("Ravi");
        for(int i = 0; i < list.size(); i++)
        {
            System.out.println(list.get(i));
        }
    }
    
}

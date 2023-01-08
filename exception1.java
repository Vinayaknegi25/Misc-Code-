import java.util.*;
class invalid_emp_id extends Exception
{
    public invalid_emp_id(String str)
    {
        super(str);
    }
}
class invalid_dept_id extends Exception
{
    public invalid_dept_id(String str)
    {
        super(str);
    }
}
class exception1 
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("enter name");
        //String name=sc.nextLine();
        System.out.println("enter employee id");
        int emp_id=sc.nextInt();
        System.out.println("enter Dept id");
        int dept=sc.nextInt();
        try
        {
            if(emp_id<=2001 || emp_id>=5001)
            {
                sc.close();
                throw new invalid_emp_id("out of range emp id");
            }
            else
            {
                System.out.println("Employee id: "+emp_id);
            }
            if(dept>=1 || dept<=5)
            {
                sc.close();
                throw new invalid_dept_id("out of range dept id");
            }
            else
            {
                System.out.println("Department id: "+dept);
            }
            
        }
        catch(invalid_emp_id s1)
        {
            System.out.println(s1);
        }
        catch(invalid_dept_id s1)
        {
            System.out.println(s1);
        }
        sc.close();
    }
    
}

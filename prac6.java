class one 
{
    public void print_one()
    {
        System.out.println("class one the main class");
    }
}
class two extends one
{
    public void print_two()
    {
        System.out.println("class two the derived class");
       // print_one();
    }
}
public class prac6 //driver class
{
    public static void main(String []args)
    {
        two object=new two();
        object.print_two();
        object.print_one();
    }
    
}

import java.util.*;
public class abstractarea 
{
    public static void main(String[]args)
    {
        Scanner sc =new Scanner(System.in);
        sc.close();
        area obj=new area();
        obj.rectangle(5,12);
    }
    
}
abstract class Shape 
{
    abstract void rectangle(int l,int b);
    abstract void square(int side);
    abstract void circle(int r);
}
class area extends Shape
{
    void rectangle(int l,int b)
    {
        System.out.println(l*b);
    }
    void circle(int r)
    {
        System.out.println(r*r*3.14);
    }
    void square(int side)
    {
        System.out.println(side*side);
    }
}

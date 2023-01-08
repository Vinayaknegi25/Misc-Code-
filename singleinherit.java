class base {
    public void print_Single()
    {
        System.out.println("Single");
    }
}
 
class deri extends base {
    public void print_Inheritance()
    { 
        System.out.println("Inheritance"); 
    }
}
public class singleinherit {
    public static void main(String[] args)
    {
        deri g = new deri();
        g.print_Single();
        g.print_Inheritance();
    }
}
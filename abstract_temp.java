import java.util.*;
public class abstract_temp 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        double x=sc.nextDouble();
        System.out.println("1 to convert to celcius\n2 to convert to farenheit\n");
        int ch=sc.nextInt();
        switch(ch)
        {
            case 1:
            celcius c=new celcius();
            x=c.change_temp(x);
            break;
            case 2:
            farenheit f=new farenheit();
            x=f.change_temp(x);
            break;
        }  
        System.out.println(x);
        sc.close();  
    }
}
abstract class temperature
{
    Scanner sc=new Scanner(System.in);
    double temp;
    void set_temp_data(double temp)
    {
        System.out.println("enter temp");
        temp = sc.nextDouble();
    }
    abstract double change_temp(double temp);
}
class farenheit extends temperature
{
    Scanner sc=new Scanner(System.in);
    double change_temp(double temp)
    {
        temp=((9*temp)/5)+32;
        return temp;
    }
}
class celcius extends temperature
{
    Scanner sc=new Scanner(System.in);
    double change_temp(double temp)
    {
        temp=((temp-32)*5)/9;
        return temp;
    }
}

import java.util.*;
import java.lang.Math;
class Bank
{
    Scanner sc=new Scanner(System.in);
    String name,address;
    int bal;
    double acc;
    public void get_data()
    {
        System.out.println("Name");
        name =sc.nextLine();
        System.out.println("Address");
        address=sc.nextLine();
        System.out.println("balance");
        bal = sc.nextInt();
    }
    public void acc_generate()
    {
        acc=Math.random();  
    }
    public void display_dets()
    {
        System.out.println("Name: "+name);
        System.out.println("Address: "+address);
        System.out.println("Balance: "+bal);
        System.out.println("Account No.: "+acc);
    }
}
class bank_dets
{
    public static void main(String[] args)
    {
        Bank b=new Bank();
        b.get_data();
        b.acc_generate();
        b.display_dets();
        
    }
}


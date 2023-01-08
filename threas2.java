import java.util.Scanner;
class EO
{
    synchronized void p()
    {
        try 
        {

            Scanner obj=new Scanner(System.in);
            System.out.println("\n Enter the first number whose multiplication table you want to display");
            int j=obj.nextInt();
            System.out.println("\n");
            System.out.println("Multiplication Table of "+ j);
            for(int i = 1; i <=10; i++) 
            {
                System.out.println(j+"*"+i+"="+ j*i);
                Thread.sleep(10);
            }
        }
        catch (InterruptedException e) 
        {
        System.out.println("error");
        }
    }
}

class MT implements Runnable 
{
    //String name; // name of thread
    EO o1;
    Thread t;
    int j;
    MT(EO o2) 
    {
        o1=o2;
        t = new Thread(this);
        System.out.println("New thread: " + t);
        t.start(); // Start the thread
    }
    public void run() 
    {
        synchronized(o1)
        {
            o1.p();
            System.out.println("exiting->"+t);
        }
    }   
}
class thread2
{

    public static void main(String args[]) 
    {

        EO o1=new EO();

        MT ob1=new MT(o1); //start threads

        MT ob2=new MT(o1);

        try
        {
            ob1.t.join();
            ob2.t.join(); 
        }
        catch(InterruptedException e)
        {
            System.out.println("error");
        }
        System.out.println("Main thread exiting.");
      
    }
}

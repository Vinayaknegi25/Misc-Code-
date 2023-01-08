import java.util.*;
public class Q1_7thWk 
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner (System.in);
        int month;
        int year;
        System.out.println("enter month");
        month=sc.nextInt();
        System.out.println("enter year");
        year=sc.nextInt();
        boolean check=false;
        check=year_checker(year);
        switch(month)
        {
            case 1:
                System.out.println("January "+year+" has 30 days");
                break;
            case 2:
                check=year_checker(year);
                if(check==true)
                {
                    System.out.println("February "+year+" has 29 days");
                }
                else
                {
                    System.out.println("February "+year+" has 28 days");
                }
            break;
            case 3:
            System.out.println("March "+year+" has 31 days");
            break;
            case 4:
            System.out.println("April "+year+" has 30 days");
            break;
            case 5:
            System.out.println("May "+year+" has 31 days");
            break;
            case 6:
            System.out.println("June "+year+" has 30 days");
            break;
            case 7:
            System.out.println("July "+year+" has 31 days");
            break;
            case 8:
            System.out.println("August "+year+" has 31 days");
            break;
            case 9:
            System.out.println("September "+year+" has 30 days");
            break;
            case 10:
            System.out.println("October "+year+" has 31 days");
            break;
            case 11:
            System.out.println("November "+year+" has 30 days");
            break;
            case 12:
            System.out.println("December "+year+" has 31 days");
            break;
            default:
            System.out.println("WRONG CHOICE");
            break;
        }
        sc.close();
    }
    public static boolean year_checker(int year)
    {
        boolean leap=false;
        if (year % 4 == 0) 
        {
            if (year % 100 == 0) 
            {
              if (year % 400 == 0)
                leap = true;
              else
                leap = false;
            }    
            else
              leap = true;    
        }
        else
        leap = false;
        return leap;
    }   
}

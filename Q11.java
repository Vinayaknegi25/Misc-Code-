import java.util.*;
class word_example
{
    Scanner sc=new Scanner(System.in);
    private
    String str_data;
    public
    void count_word(String str)
    {
    }
    word_example(String str)
    {
        int len=str.length();
        str_data=str;
        int count=0;
        char ch=str.charAt(len-1);
        if(ch=='?'||ch=='!'||ch=='.')
        {
            count_word(str_data);
        }
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner (System.in);
        String str;
        str=sc.nextLine();
        word_example word= new word_example(str);
        sc.close();
    }
}
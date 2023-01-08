import java.util.*;
class MulMatrices
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner (System.in);
        int rows1,rows2,col1,col2;
        System.out.println("enter rows and columns for first matrix");
        rows1=sc.nextInt();
        col1=sc.nextInt();
        int matrix1[][]=new int [rows1][col1];
        System.out.println("enter rows and columns for Second matrix");
        rows2=sc.nextInt();
        col2=sc.nextInt();
        int matrix2 [][]=new int [rows2][col2];
        if(col1!=rows2)
        {
            System.out.println("CANNOT MULTIPLY THE MATRICES");
            sc.close();
            return;
        }
        System.out.println("enter first matrix");
        for(int i =0;i <rows1;i++)
        {
            for(int j=0;j<col1;j++)
                matrix1[i][j]=sc.nextInt();
        }
        System.out.println("enter second matrix");
        for(int i =0;i <rows1;i++)
        {
            for(int j=0;j<col1;j++)
                matrix2[i][j]=sc.nextInt();
        }
        int c[][]=new int[rows1][col2];
        for(int i=0;i<rows1;i++)
        {    
            for(int j=0;j<col2;j++)
            {    
                c[i][j]=0;      
                for(int k=0;k<col2;k++)      
                {      
                    c[i][j]+=matrix1[i][k]*matrix2[k][j];      
                }
                    System.out.print(c[i][j]+" ");  
            } 
            System.out.println();
        }
        sc.close(); 
    }        
}


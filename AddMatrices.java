import java.util.*;
public class AddMatrices 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int rows = 3, columns = 3;
        int[][] firstMatrix =new int[3][3];
        int[][] secondMatrix = new int[3][3];
        int sum[][]=new int[3][3];
        System.out.println("First matrix");
        for(int i=0;i<rows;i++) 
        {
            for (int j = 0; j < columns; j++) 
            {
                firstMatrix[i][j]=sc.nextInt();
            }
        }
        System.out.println("Second matrix");
        for(int i=0;i<rows;i++) 
        {
            for (int j = 0; j < columns; j++) 
            {
                secondMatrix[i][j]=sc.nextInt();
            }
        }
        for(int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) 
            {
                sum[i][j] = firstMatrix[i][j] - secondMatrix[i][j];
            }
        }
        System.out.println("Sum of two matrices is: ");  
        for(int i=0;i<rows;i++) 
        {
            for (int j = 0; j < columns; j++) 
            {
                System.out.print(sum[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
    
}
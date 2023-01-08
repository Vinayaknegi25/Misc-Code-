#include <stdlib.h>
#include <stdio.h>
#include <math.h>
int main()
{
    printf("NAME - VINAYAK NEGI \nSECTION - AI&DS \nROLL NO - 52\n");
    printf("This is a program to implement the Gauss Jordan Method.\n\n");
    printf("Enter the coefficients of the Augmented Matrix (row-wise) : \n");
    float a[3][4];
    int n = 4;
    for(int i = 0 ; i < 3; i++)
    {
        for(int j = 0 ; j < 4; j++)
            scanf("%f", &a[i][j]);
    }
    float first = a[0][0], div1 = a[1][0], div2 = a[2][0];
    for(int i = 0 ; i < 4; i++)
    {
        a[1][i] = a[0][i] - ((a[1][i]/div1) * first);
        a[2][i] = a[0][i] - ((a[2][i]/div2) * first);
    }
    first = a[1][1], div1 = a[0][1], div2 = a[2][1];
    for(int i = 0 ; i < 4; i++)
    {
        a[0][i] = a[1][i] - ((a[0][i]/div1) * first);
        a[2][i] = a[1][i] - ((a[2][i]/div2) * first);
    }
    first = a[2][2], div1 = a[0][2], div2 = a[1][2];
    for(int i = 0 ; i < 4; i++)
    {
        a[0][i] = a[2][i] - ((a[0][i]/div1) * first);
        a[1][i] = a[2][i] - ((a[1][i]/div2) * first);
    }
    printf("\nAfter Gauss Jordan : \n");
    for(int i = 0 ; i < 3; i++)
    {
        for(int j = 0 ; j < 4; j++)
        {
            printf("%.2f ", a[i][j]);
        }
        printf("\n");
    }
    float x = a[0][3]/a[0][0];
    float y = a[1][3]/a[1][1];
    float z = a[2][3]/a[2][2];
    printf("\nThe solution is: \n");
    printf("x : %.3f\n", x);
    printf("y : %.3f\n", y);
    printf("z : %.3f\n", z);
}

#include <stdio.h>
#include <math.h>
float function(float x)
{
    return (x * x * x - 3 * x - 5);
}
float derivativeFunction(float x)
{
    return (3 * x * x - 3);
}
int main()
{
    float b = 0.0001;
    float a, p;
    int counter = 0;
    printf("Enter the Value of guessed root : ");
    scanf("%f", &a);
    while (1)
    {
        // formula for newton raphson
        // p=a-f(a)/f'(a);
        int x=derivativeFunction(a);
        if(x==0)
            break;
        p = a - (function(a) /x);
        if (fabs(function(p)) <= b)
        {
            printf("Root of The Equation is : %f", p);
            printf("No of Iterations required to reach the results : %d", counter);
            printf("Absolute Error in the result : %f", function(p) - b); //answer-tolerance
            printf("\n");
            break;
        }
        else
        {
            printf("Iteration Number : %d", counter);
            printf("Current Value of the root : %f", p);
            printf("\n");
            a = p;
            counter++;
            if (counter > 1000)
            {
                printf("Error in calc %d", fabs(function(p)) - b);
                break;
            }
        }
    }
    return 0;
}

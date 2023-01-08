#include <stdio.h>
#include <math.h>

double function(double x)
{
    return (x * x * x - 3 * x - 5);
}

int main()
{
    int counter = 0;
    double c, a, b;
    double tolerance = 0.0001;
    printf("Enter the Values of a and b : ");
    scanf("%lf%lf", &a, &b);

    while (1)
    {
        c = (a * function(b) - b * function(a)) / (function(b) - function(a));
        counter++;
        if (counter>10000)
        {
            printf("%lf",c);
            break;
        }
        if (function(c) == 0.0)
        {
            printf("Results : %lf", c);
            printf("No of Iterations %d", counter);
            break;
        }
        else if (function(a) * function(c) < 0.0)
        {
            b = c;
        }
        else
        {
            a = c;
        }
        if (fabs(function(c)) < tolerance)
        {
            printf("Results : %lf", c);
            printf("No of Iterations %d", counter);
            break;
        }
    }
    return 0;
#include<stdio.h>
#include<math.h>
double func (double x)
{
    double z= ((x*x*x)-(x)-1);
    return z;
}

int main()
{
    double a,b,c=0;
    int itr=0;
    printf("First guess");
    scanf("%lf %lf",&a,&b);
    while (func(a)*func(b)>0.00 || a==b)
    {
        printf("enter valid range");
        scanf("%lf %lf",&a,&b);   
    }
    c=(a+b)/2;    /* c= (a*f(b)- b*f(a))/f(b)-f(a)*/
    itr++;
    while(func(c)>0.0001)
    {
        if(func(a)*func(b)<0)
            b=c;
        else
            a=c;
    }
    printf("the root is %f and iterations are %d",c,itr);
}
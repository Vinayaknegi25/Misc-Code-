#include <stdio.h>
#include <math.h>
int main()
{
    int num;
    scanf("%d", &num);
    int digit=0,copy=0;
    int arm_num=0;
    copy=num;
    while (copy!=0)
    {
        digit=copy%10;
        arm_num=arm_num+pow(digit,3);
        copy=copy/10;
    }
    if(num==arm_num)
    {
        printf("Number is Armstrong");
    }
    else
    {
        printf("Number is not Armstrong");
    }    
}
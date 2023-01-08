#include <stdio.h>
int main()
{
    int x;
    scanf("%d",&x);
    int *p=&x;
    printf("value of x is : %d",x);
    printf("\n");
    printf("value of address is : %p\n",p);
    *p=*p+1;
    printf("compromised: %d",*p);
}
#include<stdio.h>
int main()
{
    int a, x;
    scanf("%d", &a);
    scanf("%d", &x);
    if (a>x)
        printf("%d",a/x);
    else 
        printf("%d",x/a);

    int c;
    scanf("%d", &c);
    if(c>=0)
        printf("positive");
    else
        printf("negative");

    printf("done");
    return 0;
}

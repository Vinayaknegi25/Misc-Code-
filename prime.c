#include <stdio.h>
int main()
{
    int n;
    int count = 0;
    scanf("%d", &n);
    for(int i = 0; i <= n; i++)
    {
        if(n%i==0)
        {
            count++;
        }
    }
    if(count==2)
        printf("prime");
    else
        printf("not prime");
}
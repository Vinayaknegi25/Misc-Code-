#include <stdio.h>
#include <stdlib.h>
int binsearchrecur(int*,int,int,int,int);
int main()
{
    int n,key ;
    printf("enter size of array");
    scanf("%d",&n);
    int *p=NULL;
    p=(void*)malloc(n*sizeof(int));
    for(int i=0;i<n;i++)
        scanf("%d",p+i);
    printf("enter key");
    scanf("%d",&key);
    int low=0,high=n-1;
    int mid=(low+high)/2;
    printf("%d",*(p+mid));
    binsearchrecur(p,key,low,high,mid);
}
int binsearchrecur(int *p,int key,int low,int high,int mid)
{
    if(key<=*(p+mid))
    {
        high=mid;
       // p=&low;
        mid=(low+high)/2;
        binsearchrecur(p,key,low,high,mid);
    }
    if(key>=*(p+mid))
    {
        low=mid;
       // p=&low;
        mid=(low+high)/2;
        binsearchrecur(p,key,low,high,mid);
    }
    if(key==*(p+mid))
        printf("FOUND AT %d",mid);
    else
        printf("NOT FOUND");
    return 0;
}

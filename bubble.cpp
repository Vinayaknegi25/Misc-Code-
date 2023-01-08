#include <iostream>
#include <stdlib.h>
using namespace std;
void bsort(int *,int );
int main()
{
    int n;
    cout<<"\nEnter size of array";
    cin>>n;
    int *p=NULL;
    p=(int*)malloc(n*sizeof(int));
    cout<<"Enter Elements\n";
    for(int i=0; i<n; i++)
    {
        cin>>*(p+i);   
    }
    bsort(p,n);
}
void bsort(int *p,int n)
{
    int i,j,temp=0;
    for(i=0;i<n;i++)
    {
        for(j=1;j<n-i;j++)
        {
            if((*p+i)>*(p+j))
            {
                temp=*(p+i);
                *(p+i)=*(p+j);
                *(p+j)=temp;
            }
        }
    }
}

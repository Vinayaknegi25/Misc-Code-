#include <iostream>
using namespace std;
int logntc(int[],int,int,int,int*);
void main()
{
    int n;
    cin>>n;
    int arr[n];
    for(int i=0;i<n;i++)
    {
        cin>>arr[i];
    } 
    int c=0;
    int *p=&c;
    int begin=0,end=n-1; 
    int c=logntc(arr,n,begin,end,p);
}
void logntc(int arr[],int n ,int begin,int end,int* p)
{
    int k;
    cout<<"enter key ";
    cin>>k;
    int mid=begin+(end-begin)/2;
    
    if(arr[mid]==k)
    {
        for(int i=mid;i<n;i++)
        {
            if(arr[i]==mid)
            {
                *p=*(p)+1;
            }
        }
    }
    if(k>arr[mid])
    {
        logntc(arr,n,mid+1,end,p);
    }
}
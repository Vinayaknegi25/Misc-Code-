#include <iostream>
using namespace std;
int binsear(int arr[],int n,int l,int r,int x)
{
    while(l<=r)
    {
        int m=(l+r)/2;
        if(arr[m]==x)
        {
            return m;
        }
        if(arr[m]<x)
        {
            l=m+1;
        }
        else
        {
            r=m-1;
        }
    }  
    return -1;
}
int binsearrecur(int arr[],int n,int l,int r,int x)
{
    if(r>=l)
    {
        int m=(l+r)/2;
        if(arr[m]==x)
        {
            return m;
        }
        else if(arr[m]<x)
        {
            binsearrecur(arr,n,l,m+1,x);
        }
        else
        {
            binsearrecur(arr,n,m-1,r,x);
        }
    }
    return -1;
}
int main()
{
    int n;
    int x;
    cin>>n;
    int arr[n];
    for(int i=0; i<n; i++)
        cin>>arr[i];
    cout<<"enter X";
    cin>>x;
    int l=0;int r=n-1;
    int k=binsearrecur(arr,n,l,r,x);
    if(k==-1)
    {
        cout<<"NOT FOUND";
    }
    else
    {
        cout<<"FOUND AT: "<<k+1;
    }
}

#include <iostream>
using namespace std;
void insert_sort(int arr[],int n)
{
    int i,j,temp;
    for(i=1;i<=n;i++)
    {
        j=i-1;
        temp=arr[i];
        while(j>=0 && arr[j]>temp)
        {
            arr[j+1]=arr[j];
            j--;
        }
        arr[j+1]=temp;
    }
    for(i=1;i<=n;i++)
    {
        cout<<arr[i]<<" ";
    }
}
int main()
{
    int n;
    cin>>n;
    int arr[n];
    for(int i=0; i<n; i++)
    {
        cin>>arr[i];
    }
    insert_sort(arr,n);
}
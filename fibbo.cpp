#include <iostream>
using namespace std;
void in_sort(int [],int);
int main()
{
   int n;
   cin>>n;
   int arr[n];
   for(int i=0;i<n;i++)
   {
       cin>>arr[i];
   }
   in_sort(arr,n);
   for(int i=0;i<n;i++)
    cout<<arr[i]<<" ";

}
void in_sort(int arr[],int n)
{
    int i,j,temp;
    for(i=0;i<n;i++)
    {
        temp=arr[i];
        j=i-1;
        while(j>=0 && arr[j]>temp)
        {
            arr[j+1]=arr[j];
            j--;
        }
        arr[j+1]=temp;
    }
    return ;
}

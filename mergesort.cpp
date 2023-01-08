#include <iostream>
using namespace std;
void mergesort(int[],int,int);
void merge(int[],int,int,int);
void printarr(int[],int);
int main()
{
    int n;
    cout<<"enter size of array";
    cin>>n;int arr[n];
    for(int i=0;i<n;i++)
    {      //elements insert in array
        cin>>arr[i];
    }
    int begin=0;
    int end=n-1;
    mergesort(arr,begin,end);
    printarr(arr,n);
}
void mergesort(int arr[],int begin,int end)
{
    if(begin>=end)
        return;
    int mid;
    mid=begin+(end-begin)/2;
    mergesort(arr,begin,mid);
    mergesort(arr,mid+1,end);
    merge(arr,begin,mid,end);
}
void merge(int arr[],int l,int m,int r)
{
    int i, j, k;
    int n1 = m - l + 1;
    int n2 = r - m;
  
    /* create temp arrays */
    int L[n1], R[n2];
  
    /* Copy data to temp arrays L[] and R[] */
    for (i = 0; i < n1; i++)
        L[i] = arr[l + i];
    for (j = 0; j < n2; j++)
        R[j] = arr[m + 1 + j];
  
    /* Merge the temp arrays back into arr[l..r]*/
    i = 0; // Initial index of first subarray
    j = 0; // Initial index of second subarray
    k = l; // Initial index of merged subarray
    while (i < n1 && j < n2) {
        if (L[i] <= R[j]) {
            arr[k] = L[i];
            i++;
        }
        else {
            arr[k] = R[j];
            j++;
        }
        k++;
    }
  
    /* Copy the remaining elements of L[], if there
    are any */
    while (i < n1) {
        arr[k] = L[i];
        i++;
        k++;
    }
  
    /* Copy the remaining elements of R[], if there
    are any */
    while (j < n2) {
        arr[k] = R[j];
        j++;
        k++;
    }
}
void printarr(int arr[],int n)
{
    int i;
    for (i = 0; i < n; i++)
    {
        cout<<arr[i]<<" ";
    }
}

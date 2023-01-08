#include <iostream>
using namespace std;
void SortArr(char[],int);
int main()
{
    int T;
    cout<<"Enter the number of testcases: ";
    cin>>T;
    while(T>0)
    {
      int n;
      cout<<"Enter the number of element: ";
      cin>>n;
      char arr[n];
      for(int i=0;i<n;i++)
      {
          cin>>arr[i];
      }
    SortArr(arr,n);
    T--;
    }
return 0;
}
void SortArr(char arr[],int n)
{
  int count[26]={0};
  int max=0,index;
  for(int j=0;j<n;j++)
  {
    count[arr[j]-97]++;
  }
  int k;
  for( k=0;k<26;k++)
  {
    if(count[k]>max)
    {
      max=count[k];
      index=k;      
    }    
  }
  if(max==1)
  {
    cout<<"No Duplicates found";
  }
  else
    printf("%c-%d",index+97,max);
}

#include <iostream>
#include <math.h>
using namespace std;
int main()
{
    int n;
    cin>>n;
    int a=n;
    int d,res=0;
    while(a!=0)
    {
        d=a%10;
        res=res+pow(d,3);
        a=a/10;
    }
    if(res==n)
    {
        cout<<"Armstrong";
    }
    else
    {
        cout<<"Not Armstrong";
    }
}
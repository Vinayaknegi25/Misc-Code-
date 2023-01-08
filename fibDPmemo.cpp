#include <iostream>
using namespace std;
int fib_num(int n,int lookup[])
{
    if(lookup[n]==-1)
    {
        if(n<=1)
        {
            lookup[n] =n;
        }
        else
        {
            lookup[n] =fib_num(n-1,lookup)+fib_num(n-2,lookup);
        }
    }
    return lookup[n];
}
int memo (int n)
{
    int lookup[n];
    for(int i=0; i<n; i++)
    {
        lookup[i] =-1;
    }
    return fib_num(n,lookup);
}

int main()
{
    int n;
    cin>>n;
    int x=memo(n);
    cout<<x;
}
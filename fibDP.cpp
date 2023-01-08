#include <iostream>
using namespace std;
int fib_number(int n)
{
    if(n<=1)
    {
        return n;
    }
    return fib_number(n-1)+fib_number(n-1);
}
int main()
{
    int n;
    cin>>n;
    int x= fib_number(n);
    cout<<x;
}
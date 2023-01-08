#include <iostream>
using namespace std;
int main()
{
    int n;
    cout<<"enter size of stack";
    cin>>n;
    int stack[n];
    int top=0;
    for(int i=0; i<n; i++)
    {
        cin>>stack[i];
        top++;
    }
    int f=n-1;
    while(top>-1)
    {
        if(stack[top]==stack[top-1])
        {
            top--;
            f=top-1;
        }
        else
            top--;
    }
}
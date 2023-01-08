#include <iostream>
#include <vector>
using namespace std;
int main()
{
    vector<int> stack;
    vector<int> it;
    int top;
    int n,num;
    cout<<"enter no of elements";
    cin>>n;
    top=n-1;
    for(int i=0;i<n;i++)
    {
        cin>>num;
        stack.push_back(num);
    }
    while(top>-1)
    {
        if(stack[top]==stack[top-1])
        {
            stack.erase(top);
            top--;
        }
        else
            top--;
    }
    for(int  i=0; i<top;i++)
        cout <<stack[i] ;
}
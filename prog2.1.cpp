#include <iostream>
#include <vector>
#include <list> 
using namespace std;
int main()
{
    vector<int> stack;
    vector<int> it;
    int top=0;
    int n,num;
    cout<<"enter no of elements";
    cin>>n;
    top=n-1;
    for(int i=0;i<n;i++)
    {
        cin>>num;
        stack.push_back(num);
    }
    int c=0;int temp=top;
    while(top>-1)
    {
        if(stack[top]==stack[top-1])
        {
            stack.erase(top);
            top--;
            c++;
        }
        else
            top--;
    }
    top=temp-c;
    for(int i=0; i<top;i++)
        cout <<stack[i] ;
}
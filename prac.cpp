#include <iostream>
using namespace std;
bool isperfect(int);
int main()
{
    int num;
    cin>>num;
    cout<<isperfect(num);
    return 0;
}
bool isperfect(int num)
{
    int beg=0,mid,z=0;
    int end=num;
    mid=beg + (num-beg)/2;
    z=mid*mid;
    while(z>=num)
    {
        mid=beg + (num-beg)/2;
        z=mid*mid;
        if(z==num)
            return true;
        else
            end=mid;
    }
    return false;
}
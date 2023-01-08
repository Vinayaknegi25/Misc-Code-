#include <iostream>
using namespace std;
int main()
{
    int up,down;
    cin>>up>>down;
    int num,c;
    if(up>0 && down>0) // + / +
    {
        num=up;
        while(num>0)
        {
            num=up-down;
            if(num>=0)
                c++;
        }
        cout<<c;
            
    }
    if(up<0 && down<0) //  - / -
    {
        up=up*-1;
        down=down*-1;
        num=up;
        while(num>0)
        {
            num=up-down;
            if(num>=0)
                c++;
        }
        cout<<c;
    }
    if(up<0 && down>0)  //  - / +
    {
        up=up*-1 ;
        num=up;
        while(num>0)
        {                
            num=up-down;
            if(num>=0)
                c++;
        }
        cout<<c*-1;        
    }
    if(up>0 && down<0)  // + / -
    {           
        down=down*-1;
         num=up;
        while(num>0)
        {
            num=up-down;
            if(num>=0)
                c++;
        }
        cout<<c*-1;
    }
    cout<<c;
}
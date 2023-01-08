#include <iostream>
using namespace std;
class name
{
    string name ;
    int age ;

    public :
    void getdata() ;
    void showdata() ;
} ;
void name :: getdata() f
{
    cout<<"enter name" ;
    getline(cin, name);
    cout<<"enter age";
    cin>>age ;
    return ;
}
void name :: showdata()
{
    cout<<"NAME : "<<name<<endl;
    cout<<"AGE : "<<age<<endl;
}
int main()
{
    name obj ;
    obj.getdata() ;
    obj.showdata() ;
}
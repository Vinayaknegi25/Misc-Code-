#include <iostream>
#include <vector>
using namespace std;
int main()
{
    vector <int> v;int n,k;
    cin>>k;
    for(int i=0;i<k;i++)
    {
        cin>>n;
        v.push_back(n);
    }
    int sz=v.size();
    for(int i=0;i<sz;i++)
        cout<<v[i]<<" ";
    cout<<endl<<"last element is "<<v[v.size()-1]<<endl;
    v.pop_back();
    cout<<endl<<"after poping, last element is "<<v[v.size()-1]<<endl;
    v.insert(v.begin(),0); //at index or position insert 0 (parameter placement respectively)
    cout<<"new vector after insertion at front ";
    for(int i=0;i<sz;i++)
        cout<<v[i]<<" ";
    v.erase(v.begin());
    cout<<endl<<"after erase() in the beginning ";
    for(int i=0;i<v.size();i++)
        cout<<v[i]<<" ";
}   
#include <iostream>
#define v 5
using namespace std;
void add_edge(int matrix [][v],int i,int j);
void initialize(int adj[][v]);
void show_edge(int adj[][v]);
int main()
{
    int adj[v][v];
    int ch;
    int x,y;
    initialize(adj);
    do
    {
        cout<<"\n1 to add edge \n2 to show edge \n0 to exit\n ";
        cin>>ch;
        switch(ch)
        {
            case 1:
            cin>>x>>y;
            add_edge(adj,x,y);
            break;
            case 2:
            show_edge(adj);
            break;
        }

    }while(ch!=0);
}
void initialize(int adj[][v])
{
    for(int i=0;i<v;i++)
    {
        for(int j=0;j<v;j++)
        {
            adj[i][j]=0;
        }
    }
    return;
}
void add_edge(int adj[][v],int i,int j)
{
    adj[i][j]=1;
    adj[i][j]=1;
}
void show_edge(int adj[][v])
{
    for(int i=0;i<v;i++)
    {
        for(int j=0;j<v;j++)
        {
            cout<<adj[i][j]<<" ";
        }
        cout<<endl;
    }
}
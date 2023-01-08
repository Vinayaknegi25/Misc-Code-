#include <iostream>
using namespace std;
typedef struct graph
{
    int info;
    struct graph * next;
}graph;
graph * create_node(graph * ,int);
int main()
{
    graph *g=NULL;
    int ch;
    do
    {
        cout<<"1 to add\n2 to traverse\n0 to exit";
        cin>>ch;
        int num;
        switch(ch)
        {
            case 1:
            cout<<"enter number";
            cin>>num;
            g=create_node(g,num);
            break;
        }
    } while (ch!=0);    
}
graph* create_node(graph * g,int n)
{
    graph * p=NULL;
    p=(graph *)malloc(sizeof(graph*));
    p->info=n;
    p->next=NULL;
} 
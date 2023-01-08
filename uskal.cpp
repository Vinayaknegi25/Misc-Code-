#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;
typedef vector<pair<int,pair<int,int> > > viii;
int find(int u,int *parent)
{
    if(parent[u]<0) return u;
    return find(parent[u],parent);
}
void unionByWeight(int u,int v,int *parent)
{
    int pu=find(u,parent) , pv=find(v,parent);
    if(pu!=pv)
    {
        if(parent[pu]<parent[pv]) 
        {
            parent[pu]+=parent[pv];
            parent[pv]=pu;
        }
        else
        {
            parent[pv]+=parent[pu];
            parent[pu]=pv;
        }
    }
}
viii kruskals(viii g,int v)
{
    viii res;int s,d,w; //source,destination and weight
    int parent[v];
    for(int i=0;i<v;i++)
    {
        parent[i]=-1;  //for disjoint set data structure
    }
    sort(g.begin(),g.end());
    int E=g.size();
    for(int i=0;i<E;i++)
    {
        s=g[i].second.first;
        d=g[i].second.second;
        w=g[i].first;
        if(find(s,parent)!=find(d,parent))
        {
            res.push_back(g[i]);
            unionByWeight(s,d,parent);
        }
    }
}
int main()
{
    viii g,res; //input graph and kruskals graph
    int V,E,s,d,w; //vertex,edge
    cin>>V>>E;
    for(int i=0;i<E;i++)
    {
        cin>>s>>d>>w;
        g.push_back(make_pair(w,make_pair(s,d)));
    }
    res=kruskals(g,V);
    int sum=0; //sum of all weights
    for(int i=0;i<res.size();i++)
    {
        int W=res[i].first;
        cout<<res[i].second.first<<"to"<<res[i].second.second;
        sum+=W;
    }
    cout<<"sum of weights"<<sum;
   
}
#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;
bool compare(pair<int ,int> a ,pair<int ,int> b)
{
    return a.first > b.first ;
}
int main()
{
    vector<pair<int ,int> > jobs ;
    int n,profit,deadline;
    cin>>n;
    for(int i=0; i<n; i++)
    {
        cin>>profit>>deadline;
        jobs.push_back(make_pair(profit,deadline));
    }
    sort(jobs.begin(), jobs.end(),compare);
    int maxEndTime=0;
    for(int i=0; i<n; i++)
    {
        maxEndTime=jobs[i].second;
    }
    int fill[maxEndTime];
    for(int i=0; i<maxEndTime; i++)
    {
        fill[i]=-1;
    }
    int count=0;int maxprofit=0;
    for(int i=0; i<n; i++)
    {
        int j=jobs[i].second-1;
        while(j>=0 &&fill[j]!=-1)
        {
            j--;
        }
        if(j>=0 && fill[j]==-1)
        {
            fill[j]=i;
            count++;
            maxprofit+=jobs[i].first;
        }
    }
    cout<<"Total profit: "<<maxprofit;
}
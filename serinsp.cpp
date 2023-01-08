#include <iostream>
#include <vector>
using namespace std;
int searchinsertpos(vector<int>,int);
int main()
{
    vector<int> nums;
    int n,k;
    cin>>n;
    for(int i=0; i<n; i++)
    {
        cin>>k;
        nums.push_back(k);
    }
    int t=searchinsertpos(nums,k);
    cout<<t;

}
int searchinsertpos(vector<int>nums,int k)
{
    int beg=0,mid;
    int end=nums.size();
    while(beg<end)
    {
        mid=beg+(end-beg)/2;
        if(nums[mid]==k)
            return k;
        else if(nums[mid]>k)
        {
            end=mid;
        }
        else
        {
            beg=mid+1;
        }
    }
    mid=beg+(end-beg)/2;
    if(nums[mid]<k && nums[mid+1]>k)
        return mid+1;
    if(nums[mid]>k && nums[mid-1]<k)
        return mid-1;
    return mid;
}
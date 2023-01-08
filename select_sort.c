int * select_sort(int*p,int n)
{
    int i,j,key,temp=0;
    for(int i=0;i<n-1;i++)
    {
        key=i;
        for(j=0;j<n;j++)
        {
            if(*(p+j)>*(p+key))
                key=j;
        }
        temp=*(p+i);
        *(p+i)=*(p+j);
        *(p+j)=temp;
    }
    return p;
}
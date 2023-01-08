int* insert(int* p,int no_elem)
{
    int i;
    p=(void*)malloc(no_elem*sizeof(int));
    for(i=0;i<no_elem;i++)
    {
        scanf("%d",p+i);
    }
    return p;
}
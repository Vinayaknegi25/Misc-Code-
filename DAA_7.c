#include <stdio.h>
#include <stdlib.h>
#include "insert_fun.c"
#include "insertion_sort.c"
int main()
{
    int no_it;
    int *p=NULL;
    printf("enter number of inputs");
    scanf("%d", &no_it);
    for(int i=0;i<no_it;i++)
    {
        printf("\nenter no of elements");
        int no_elem;
        scanf("%d", &no_elem);
        p=insert(p,no_elem);
        p=insertion_sort(p,no_elem);
        //for(int i=0;i<no_elem;i++)
        //    printf("%d ",*(p+i));
    }
}
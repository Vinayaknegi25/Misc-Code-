#include <stdio.h>
#include<stdlib.h>
typedef struct list
{
    int info ;
    struct list * next ;
}list;
list *insert(list *,int) ;
list *show(list *) ;
void largest(list *);
int main()
{
    int ch,num =0,count=0;
    list *k=NULL;
    do
    {
        num=0;
        printf("\n1 to add\n2 to show\n3 to find largest node info.\n0 to stop\n") ;
        scanf("%d",&ch) ;
        int val=0;
        switch(ch)
        {
            case 1:
                printf("enter number to insert\n") ;
                scanf("%d",&num) ;
                count++;
                k=insert(k,num);
                break ;
            case 2:
                show(k) ;
                break ;
            case 3:
                largest(k);
                break;
        }
    }while(ch!=0);
}
list * insert(list * k,int num)
{
    list *p=NULL; 
    p=(void*)malloc(sizeof(list));
    if(p==NULL)
        printf("\nNOT ENOUGH MEMORY\n") ;
    else
    {
        p->info=num ;
        p->next=k ;
        k=p ;
    }
    return(k) ;
}
list * show(list * k )
{
    printf("\nelements are: ") ;
    while(k!=NULL)
    {
        printf("%d\t",k->info) ;
        k=k->next ;
    }
    printf("\n");
}
void largest(list *k)
{
    int max=-99;
    while(k!=NULL)
    {
        if(k->info>max)
        {
            max=k->info;
        }
        k=k->next ;
    }
    printf("largest number in linked list is: %d",max);
}
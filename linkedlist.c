#include <stdio.h>
#include <stdlib.h>
struct Node
{
  int data;
  struct Node *next;
};
void push(struct Node ** head_ref, int new_data)
{
  struct Node* new_node =
    (struct Node*) malloc(sizeof(struct Node));
  new_node->data = new_data;
  new_node->next = (*head_ref);
  (*head_ref) = new_node;
}
void printList(struct Node *head)
{
  struct Node *temp = head;
  while (temp != NULL)
  {
    printf("%d ", temp->data);
    temp = temp->next;
  }
  printf("\n");
}
void merge(struct Node *p, struct Node **q)
{
  struct Node *p_curr = p, *q_curr = *q;
  struct Node *p_next, *q_next;
  while (p_curr != NULL && q_curr != NULL)
  { 
    p_next = p_curr->next;
    q_next = q_curr->next;
    q_curr->next = p_next; 
    p_curr->next = q_curr; 
    p_curr = p_next;
    q_curr = q_next;
  }
  *q = q_curr;
}
int main()
{
  struct Node *p = NULL, *q = NULL;
  int n,num;
  scanf("%d",&n);
  for(int i=0;i<n;i++)
  {
    scanf("%d",&num);
    push(&p,num);
  }
scanf("%d",&n);
  for(int i=0;i<n;i++)
  {
    scanf("%d",&num);
    push(&q,num);
  }
  merge(p, &q);
  printList(p);
  merge(p, &q);
  return 0;
}

 
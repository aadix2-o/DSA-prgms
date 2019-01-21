#include<malloc.h>
#include<stdio.h>
#include<conio.h>
#include<iostream>
struct node
{
	int data;
	struct node *next;
};
struct node *addNodeAtFront(struct node*,int);
struct node *addNodeAtEnd(struct node*,int);
struct node *addNodeAtNthPosition(struct node*,int,int);
struct node *addNodeAfterNode(struct node* , int ,int);
struct node *addNodeBeforeNode(struct node* ,int,int);
struct node *createLinkedList();
struct node *deleteNodeAtStart(struct node*);
struct node *deleteNodeAtEnd(struct node*);
struct node *deleteNodeByKey(struct node*,int);
void traverse(struct node*);
int search(struct node*, int);
int main()
{
	 int x;
	 struct node *start = NULL;
     while(true)
     {
     	printf("-------------------------------------------------\n");
     	printf("Menu:                                           |\n");
     	printf("1.To Create a new linked list                   |\n");
     	printf("2.To add a node at front                        |\n");
     	printf("3.To add a node at end                          |\n");
     	printf("4.To add a node at position n                   |\n");
     	printf("5.To add a node after a node                    |\n");
     	printf("6.To add a node before a node                   |\n");
     	printf("7.To delete a node at start of the list         |\n");
     	printf("8.To delete a node at end of the list           |\n");
     	printf("9.To print the linked list                      |\n");
     	printf("10.To search an element in the list             |\n");
     	printf("Please press 0 to exit                          |\n");
     	printf("-------------------------------------------------\n");
     	scanf("%d",&x);
     	switch(x)
     	{
     		
     		case 0:
     			{
     			exit(0);
     			break;
     		    }
     		case 1:
			 {
			     start = createLinkedList();
				 printf("Linked List Created\n");
				 break; 	
			 }
			 case 2:
			 {
			 	   char choice='y';
			 	   while(choice=='y'||choice=='Y')
			 	   {
					  int element;
			          printf("Enter the element to be inserted:");
				      scanf("%d",&element);
				      start = addNodeAtFront(start,element);
				      fflush(stdin);
				      printf("\nDo you want to insert an element again (Y/N)");
				      scanf("%c",&choice);
				   }
				   break;
			 }
			 case 3:
			 {
			      char choice='Y';
			 	   while(choice=='y'||choice=='Y')
			 	   {
					  int element;
			          printf("Enter the element to be inserted:");
				      scanf("%d",&element);
				      start = addNodeAtEnd(start,element);
				      printf("\nDo you want to insert an element again (Y/N)");
				      scanf("%c",&choice);
				   }	
				   break;
			 }
			 case 4:
			 {
			       char choice='Y';
			 	   while(choice=='y'||choice=='Y')
			 	   {
					  int element,position;
			          printf("Enter the element to be inserted:");
				      scanf("%d",&element);
				      printf("\nEnter the position");
				      scanf("%d",&position);
				      start = addNodeAtNthPosition(start,element,position);
				      printf("\nDo you want to insert an element again (Y/N)");
				      scanf("%c",&choice);
				   }	
				   break;
			 }
			 case 5:
			 {
			     char choice='Y';
			 	   while(choice=='y'||choice=='Y')
			 	   {
					  int element,key;
			          printf("\nEnter the element to be inserted:");
				      scanf("%d",&element);
				      printf("\nEnter the element after which you want to insert the element:");
				      scanf("%d",&key);
				      start = addNodeAfterNode(start,element,key);
				      printf("\nDo you want to insert an element again (Y/N)");
				      scanf("%c",&choice);
				   }	
				   break;
			 }
			 case 6:
			 {
			     char choice='Y';
			 	   while(choice=='y'||choice=='Y')
			 	   {
					  int element,key;
			          printf("\nEnter the element to be inserted:");
				      scanf("%d",&element);
				      printf("\nEnter the element before which you want to insert the element:");
				      scanf("%d",&key);
				      start = addNodeBeforeNode(start,element,key);
				      printf("\nDo you want to insert an element again (Y/N)");
				      scanf("%c",&choice);
				   }	
				   break;
			 }
			 /*case 7:
			 {
			       char choice='Y';
			 	   while(choice=='y'||choice=='Y')
			 	   {
				      start = deleteNodeAtStart(start);
				      printf("\nDo you want to Delete an element again (Y/N)");
				      scanf("%c",&choice);
				   } 	
				   break;
			 }*/
			 /*case 8:
			 {
			       char choice='Y';
			 	   while(choice=='y'||choice=='Y')
			 	   {
				      start = deleteNodeAtEnd(start);
				      printf("\nDo you want to Delete an element again (Y/N)");
				      scanf("%c",&choice);
				   } 	
				   break;
			 }*/
			 case 9:
			 {
			     traverse(start);
				 break; 	
			 }
			 /*case 10:
			 {
			       int key;
			       printf("Enter the key to be serached");
			       scanf("%d",&key);
			       int pos = search(start,key);
			       printf("\nElement found at position %d",pos);
			       break;
			 }*/
			 default:
			 {
			       printf("Invalid selection");
				   //clrscr();
				   break; 	
			 }	
		 }
     	
	 }
	 return 0;
}
/**********************************************************************************************************/
struct node *createLinkedList()
{
	struct node *start = NULL;
	struct node *p=start;
	int item,choice=1;
	while(choice==1)
	{
        printf("Enter a element to insert in the list:");
	    scanf("%d",&item);
	    start = addNodeAtEnd(start,item);
	    fflush(stdin);
		printf("\nto continue press 1 otherwise 0");
		scanf("%d",&choice);        
    }
    return start;
}
/***********************************************************************************************************/
struct node *addNodeAtFront(struct node *start, int item)
{
	struct node *temp = (struct node*)malloc(sizeof(struct node));
	if(start==NULL)
	{
		temp->data=item;
		start=temp;
		temp->next=NULL;
	}
	else
	{
		temp->data = item;
		temp->next = start;
		start = temp;
	}
	return start;
}
/***********************************************************************************************************/
struct node *addNodeAtEnd(struct node *start , int item)
{
	struct node *temp = (struct node*)malloc(sizeof(struct node));
	temp->data=item;
	temp->next=NULL;
	if(start==NULL)
	{
		start=temp;
	}
	else
	{
	   struct node* p=start;
	   while(p->next!=NULL)
	   {
	   	   p=p->next;
	   }
	   p->next=temp;
	}
	return start;
}
/*********************************************************************************************************/
struct node *addNodeAtNthPosition(struct node* start , int item,int n)
{
	struct node *p = start;
	for(int i=0;i<n && p->next!=NULL;i++)
	{
		p=p->next;
	}
	struct node *temp = (struct node*)malloc(sizeof(struct node));
	temp->data = item;
	temp->next = p->next;
	p->next = temp;
	return start;
}
/***********************************************************************************************************/
struct node *addNodeAfterNode(struct node* start,int item,int node)
{
	struct node *p=start;
	while(p->next!=NULL)
	{
		if(p->data==node)
		    {
		    		struct node *temp = (struct node*)malloc(sizeof(struct node));
	                temp->data = item;
	                temp->next = p->next;
	                p->next = temp;
	                return start;
			}
	}
	printf("\nNode not found");
	return start;
}
/************************************************************************************************************/
struct node *addNodeBeforeNode(struct node* start , int item , int node)
{
	struct node *p = start;
	if(start==NULL)
	{
		printf("\nEmpty list");
		return start;
	}
	if(p->data==node)
	{
		start = addNodeAtFront(start,item);
		return start;
	}
	while(p->next!=NULL)
	{
	    	if(p->next->data == node)
	    	    {
	    	    	struct node *temp = (struct node*)malloc(sizeof(struct node));
	                temp->data = item;
	                temp->next = p->next;
	                p->next = temp;
	                return start;
				}
	    	        
	}
}
/************************************************************************************************************/
/*struct node *deleteNodeAtStart(struct node *start)
{
	
}
/************************************************************************************************************/
/*struct node *deleteNodeAtEnd(struct node *start)
{
	
}
/************************************************************************************************************/
/*struct node *deleteNodeByKey(struct node *start , int key)
{
	
}
/*************************************************************************************************************/
void traverse(struct node *start)
{
	printf("Linked list---\n");
     struct node *p= start;
	 while(p!=NULL)
	 {
	    printf("| %d |---->",p->data); 
		p=p->next;	
	 }
	 printf("NULL\n");	
}
/*************************************************************************************************************/
/*int search(struct node *start , int item)
{
	
}*/
/**************************************************************************************************************/


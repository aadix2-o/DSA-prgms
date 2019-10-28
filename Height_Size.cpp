/*Height and size of a binary tree*/
#include<iostream>
using namespace std;
struct node
{
	int data;
	struct node *left,*right;
};
struct node *newNode(int data)
{
	struct node* temp = new node;
	temp->data = data;
	temp->left = NULL;
	temp->right= NULL;
}
int height(struct node* root)
{
	if(root==NULL)
		return 0;
	int lh = 1+height(root->left);
	int rh = 1+height(root->right);
	if(lh>rh)
		return lh;
	return rh;
}
int size(struct node* root)
{
	if(root==NULL)
		return 0;
	int s = 1+size(root->left)+size(root->right);
	return s;
}
int main()
{
	struct node* root = newNode(10);
	root->left= newNode(6);
	root->right = newNode(5);
	root->left->left = newNode(12);
	root->left->right=newNode(32);
	root->right->left = newNode(3);
	root->right->right = newNode(0);
	cout<<"height = "<<height(root)<<endl;
	cout<<"size = "<<size(root)<<endl;

}
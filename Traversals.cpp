/*BFS and DFS traversals of tree*/
#include<iostream>
#include<queue>
using namespace std;
struct Node
{
	int data;
	struct Node* left;
	struct Node* right;
};
struct Node* newNode(int data)
{
	struct Node* temp = new Node;
	temp->data = data;
	temp->left=NULL;
	temp->right=NULL;
}
void inorder(struct Node* root)
{
	if(root==NULL)
		return;
	inorder(root->left);
	cout<<root->data<<",";
	inorder(root->right);
}
void preorder(struct Node *root)
{
	if(root==NULL)
		return;
	cout<<root->data<<",";
	preorder(root->left);
	preorder(root->right);
}
void postorder(struct Node* root)
{
	if(root==NULL)
		return;
	postorder(root->left);
	postorder(root->right);
	cout<<root->data<<",";
}
void levelorder(struct Node* root)
{
	if(root==NULL)
		return;
	queue<struct Node*> q;
	q.push(root);
	while(!q.empty())
	{
		struct Node* temp = q.front();
		q.pop();
		cout<<temp->data<<",";
		if(temp->left!=NULL)
			q.push(temp->left);
		if(temp->right!=NULL)
			q.push(temp->right);
	}
}
int main()
{
	struct Node* root = newNode(10);
	root->left= newNode(6);
	root->right = newNode(5);
	root->left->left = newNode(12);
	root->left->right=newNode(32);
	root->right->left = newNode(3);
	root->right->right = newNode(0);
	cout<<"Inorder Traversal"<<endl;
	inorder(root);
	cout<<endl<<"Preorder Traversal"<<endl;
	preorder(root);
	cout<<endl<<"Postorder Traversal"<<endl;
	postorder(root);
	cout<<endl<<"Level Order Traversal"<<endl;
	levelorder(root);
}

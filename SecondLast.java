// Java program to find  
// of a linked list in single traversal

// Linked list node
class Node
{
	int data;
	Node next;
	Node(int d)
	{
		this.data = d;
		this.next=null;
	}
}
class LinkedList
{
    Node start;
	LinkedList()
	{
	  start=null;
	}
	// Function to push node at head
	public void push(int data)
	{   
		if(this.start==null)
		{
		Node temp = new Node(data);
		this.start = temp;
	    }
	    else
	    {
	    	Node temp = new Node(data);
	    	temp.next = this.start;
	    	this.start = temp;
	    }
	}
	//method to get teh count of node
	public int getCount(Node start)
	{
         Node temp = start;
         int cnt = 0;
         while(temp!=null)
         {
         	temp=temp.next;
         	cnt++;
         }
         return cnt;
	}
	public int printKthfromid(Node start,int k)
	{
		int n = getCount(start);
		int reqNode = ((n+1)/2) - k;
		if(reqNode<=0)
			return -1;
		else
		{
			Node current = start;
			int count = 1,ans=0;
             while (current != null) { 
            if (count == reqNode) 
                {
                ans=current.data;
                break; 
                }
            count++; 
            current = current.next; 
        }
        return ans;
		}
		
	}
	
	public static void main(String[] args) {
	   	
	   LinkedList ll = new LinkedList();
	   /* Use push() function to construct  
        the below list 8 -> 23 -> 11 -> 29 -> 12 */
		ll.push(7);
		ll.push(6);
		ll.push(5);
		ll.push(4);
		ll.push(3);
		ll.push(2);
		ll.push(1);
		System.out.println(ll.printKthfromid(ll.start,2));
      }
    }
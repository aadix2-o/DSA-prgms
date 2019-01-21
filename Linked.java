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
	public void addNewNode(int data)
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
	public void traverse()
	{
		Node p =this.start;
		while(p!=null)
		{
			System.out.print(p.data+"-->");
			p=p.next;
		}
		System.out.print("null\n");
	}

	public static void main(String[] args) {
		
		// new linked list . .. . . .. ..
		LinkedList ll = new LinkedList();
		ll.addNewNode(3);
		ll.addNewNode(2);
		ll.addNewNode(1);
		ll.addNewNode(0);
        ll.traverse();
        // new linked list . . .. .. . ..
        LinkedList ll2 = new LinkedList();
		ll2.addNewNode(10);
		ll2.addNewNode(20);
		ll2.addNewNode(30);
        ll2.traverse();
    }
}
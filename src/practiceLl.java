
public class practiceLl {
	public static class LinkedNode{
		
		int data;
		LinkedNode next;
		LinkedNode(int d)
		{
			this.data=d;
			this.next=null;
			
		}
		
	}
public static void main(String[] args)
{
	
	LinkedNode a=new LinkedNode(23);
	LinkedNode b=new LinkedNode(29);
	LinkedNode c=new LinkedNode(34);
	LinkedNode d=new LinkedNode(45);
	LinkedNode e=new LinkedNode(67);
	LinkedNode f=new LinkedNode(78);
	a.next=b;
	b.next=c;
	c.next=d;
	d.next=e;
	e.next=f;
	f.next=a;
	//print(a);
	//getLastNode(a);
	//System.out.println(length(a));
	//print(insert(a,length(a),27));
	cllPrint(a);
	
	}
private static void cllPrint(LinkedNode head) {
	// TODO Auto-generated method stub
	
	LinkedNode curr=head;
	System.out.println(curr.data);
	curr=curr.next;
	while(curr!=head)
	{
		System.out.println(curr.data);
        curr=curr.next;
	}
	
}
private static void getLastNode(LinkedNode head) {
	// TODO Auto-generated method stub
	LinkedNode curr=head;
	while(curr.next!=null)
	{
		curr=curr.next;
	}
	
	System.out.println(curr.data);
}
private static LinkedNode insert(LinkedNode head, int pos, int data) {
	// TODO Auto-generated method stub
	if(head==null)
		return new LinkedNode(data);
	else if( pos==1)
		return insertAtBeginning(head,data);
	else if(pos==length(head))
	    return insertAtEnd(head,data);
	else{
		
		int count=1;
		LinkedNode curr=head;
		LinkedNode prev=null;
		while(count<=pos)
			
		{   prev=curr;
			curr=curr.next;
			count++;
			
		}
		LinkedNode newNode=new LinkedNode(data);
		LinkedNode temp=prev.next;
		prev.next=newNode;
		newNode.next=temp;
		
		return head;
		
		
		
	}
	
	//return null;
}
private static LinkedNode insertAtEnd(LinkedNode head, int data) {
	// TODO Auto-generated method stub
	
 LinkedNode curr=head;
 while(curr.next!=null)
 {
	 curr=curr.next;
	 
 }
	
 curr.next=new LinkedNode(data);
return head;
}
private static LinkedNode insertAtBeginning(LinkedNode head, int data) {
	// TODO Auto-generated method stub
	//return null;
	
	//LinkedNode temp=head;
	LinkedNode newHead=new LinkedNode(data);
	newHead.next=head;
	head=newHead;
	return head;
}
private static void print(LinkedNode head) {
	// TODO Auto-generated method stub
	if(head==null)
		return;
	LinkedNode curr=head;
	while(curr!=null)
	{
		System.out.println(curr.data);
		curr=curr.next;
	}
	
}
private static int length(LinkedNode head) {
	// TODO Auto-generated method stub
	if(head==null)
		return 0;
	int count=0;
	LinkedNode curr=head;
	while(curr!=null)
	{
		//System.out.println(curr.data);
		count++;
		curr=curr.next;
	}
	return count;
}



}


public class llrev {
	
	int data;
	llrev next;
	
	llrev(int d)
	{
		this.data=d;
		this.next=null;
	}
	
	
	static void print(llrev head)
	{
		if(head==null)
			System.out.println("empty");
		else{
			
			llrev curr=head;
			while(curr!=null)
			{
				System.out.println(curr.data);
				curr=curr.next;
			}
			
			
		}
	}
	
	public static void main(String[] args)
	{
		llrev l1=new llrev(1);
		llrev l2=new llrev(2);
		llrev l3=new llrev(4);
		llrev l4=new llrev(41);
		llrev l5=new llrev(36);
		llrev l6=new llrev(78);
		l1.next=l2;
		l2.next=l3;
		l3.next=l4;
		l4.next=l5;
		l5.next=l6;
		//l5.next=new llrev(78);
		//l5.next=l1;
	//	System.out.println("brefore");
		//print(l1);
		System.out.println("after");
		//print(reverse(l1));
		//print(deleteEnd(l1));
		//print(deleteFront(l1));
		//print(insert(l1,23,2));
	//	System.out.println("length is"+len(l1));
		printKth(l1,4);
	}


	


	private static void printKth(llrev head, int i) {
		// TODO Auto-generated method stub
		llrev fastptr=head; int ct=0;
		while(ct<i)
		{   ct++;
			fastptr=fastptr.next;
		}
		llrev slowptr=head;
		while(fastptr!=null)
		{
			slowptr=slowptr.next;
			fastptr=fastptr.next;
		}
		while(slowptr!=null)
		{
			System.out.println(slowptr.data);
			slowptr=slowptr.next;
		}
	}


	private static int len(llrev head) {
		// TODO Auto-generated method stub
		//return null;
		
		if(head==null)
			return 0;
		if(head.next==head)
			return 1;
		llrev prev=head;
		llrev curr=head.next;
		System.out.println(prev.data);
		int l=1;
		while(curr!=head)
		{  System.out.println(curr.data);
			l++;
			prev=curr;
			curr=curr.next;
			
			
		}
		return l;
	}


	private static llrev deleteFront(llrev head) {
		// TODO Auto-generated method stub
		//return null
		if(head==null)
			
			if(head.next==null)
			{
				head=null;
				return head;
			}
		llrev curr=head.next;
		head.next=null;
		head=curr;
		
		return head;
	}


	private static llrev deleteEnd(llrev head) {
		// TODO Auto-generated method stub
		if(head==null)
			return null;
		if(head.next==null)
		{
			head=null;
			return head;
		}
		llrev curr=head;llrev prev=null;
		while(curr.next!=null)
		{
			prev=curr;
			curr=curr.next;
		}
		prev.next=null;
		return head;
		
	}


	private static llrev reverse(llrev head) {
		
		if(head==null)
		     return head;
		if(head.next==null)
			return head;
		llrev curr=head;llrev prev=null;
		while(curr!=null)
		{
			llrev temp=curr.next;
			curr.next=prev;
			prev=curr;
			curr=temp;
		
		}
		
		return prev;
		// TODO Auto-generated method stub
		
	}

}

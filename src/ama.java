
public class ama {
	int data;
	ama next;
	ama(int d)
	{
		this.data=d;
		this.next=null;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ama a=new ama(1);
		ama b=new ama(2);
		ama c=new ama(3);
		ama d=new ama(4);
		ama e=new ama(5);
		ama f=new ama(6);
		a.next=b;
		b.next=c;
		c.next=d;
		d.next=e;
		e.next=f;
		
		print(reverse(a));
		

	}

	private static void print(ama head) {
		// TODO Auto-generated method stub
		if(head==null)
			System.out.println("empty");
		ama curr=head;
		while(curr!=null)
		{
			System.out.println(curr.data);
			curr=curr.next;
			
		}
	}

	private static ama reverse(ama head) {
		// TODO Auto-generated method stub
		//return null;
		
		if(head==null)
			return null;
		if(head.next==null)
			return head;
		ama curr=head;
		ama prev=null;
		
		while(curr!=null)
		{ ama temp=curr.next;
		  curr.next=prev;
		  prev=curr;
		  curr=temp;
			
		}
		return prev;			
		
	}

}

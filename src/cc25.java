
public class cc25 {
int data;
cc25 next;
cc25(int d)
{
	this.data=d;
	this.next=null;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//LinkedList<Integer>
		cc25 head1=new cc25(6);
		cc25 ll=new cc25(1);
		cc25 ll1=new cc25(7);
		cc25 head2=new cc25(2);
		cc25 ll2=new cc25(9);
		cc25 ll3=new cc25(5);
		
		head1.next=ll;
		ll.next=ll1;
		head2.next=ll2;
		ll2.next=ll3;
		
		sum(head1,head2);
	}

	private static void sum(cc25 head1, cc25 head2) {
		// TODO Auto-generated method stub
		//return null;
		
		if(head1==null)
			print(head2);
		if(head2==null)
			print(head1);
		
		cc25 curr1=head1;
		cc25 curr2=head2;
		cc25 curr=new cc25(0);
		cc25 res=curr;
		int inc=0;
		while(curr1!=null&&
				curr2!=null)
		{   // System.out.println("insidewhile in sum");
			int res1=(curr1.data+curr2.data+inc);
			int resf=res1%10;
			inc=res1/10;
			curr.next=new cc25(resf);
			curr=curr.next;
			curr1=curr1.next;
			curr2=curr2.next;
			
		}
		print(res.next);
	}

	private static void print(cc25 head) {
		// TODO Auto-generated method stub
		if(head==null)
			System.out.println("empty");
		
		cc25 curr=head;
		while(curr!=null)
		{  System.out.println(curr.data);
			curr=curr.next;
		}
		
	}

}

import java.util.Stack;

public class cc27 {
	
	int data;
	cc27 next;
	cc27(int d)
	{
		this.data=d;
		this.next=null;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cc27 head1=new cc27(6);
		cc27 ll=new cc27(1);
		cc27 ll1=new cc27(7);
		cc27 ll4=new cc27(8);
		cc27 ll5=new cc27(3);
		cc27 ll6=new cc27(1);
		cc27 head2=new cc27(2);
		cc27 ll2=new cc27(9);
		cc27 ll3=new cc27(5);
		head1.next=ll;
		ll.next=ll1;
		ll1.next=ll4;
		ll4.next=ll5;ll5.next=ll6;
		head2.next=ll2;
		ll2.next=ll3;
		ll3.next=ll4;
		Stack<cc27> s1=new Stack<>();
		Stack<cc27> s2=new Stack<>();
		
		cc27 curr1=head1;
		cc27 curr2=head2;
		while(curr1!=null)
		{			
			s1.push(curr1);
			curr1=curr1.next;	
			
		}
		while(curr2!=null)
		{
			s2.push(curr2);
			curr2=curr2.next;
		}
		
		int size=(s1.size()<s2.size())?s1.size():s2.size();
		cc27 prev=null;
		int ct=0;
		while(ct<size)
		{   cc27 curr=s1.pop();
			if(curr
					
					
					!=s2.pop()&&ct!=0)
			{
				System.out.println(prev.data);
				break;
			}
			prev=curr;
			ct++;
			
			
		}

	}

}

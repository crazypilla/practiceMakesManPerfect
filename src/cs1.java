import java.util.Stack;

public class cs1 {
	int data;
	cs1 next;
	cs1(int d){
		this.data=d;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cs1 f=new cs1(9);
		cs1 g=new cs1(10);
		cs1 h=new cs1(11);
		cs1 i=new cs1(12);
		cs1 j=new cs1(13);
		cs1 k=new cs1(14);
		cs1 l=new cs1(21);
		cs1 m=new cs1(23);
		cs1 n=new cs1(27);
		cs1 p=new cs1(9);
		cs1 q=new cs1(9);
		f.next=g;
		g.next=h;
		h.next=i;
		i.next=j;
		j.next=k;
		//k.next=h;
		l.next=m;
		m.next=n;
		n.next=i;
		System.out.println(findIntersection(f,l));

	}

	private static int findIntersection(cs1 head1,cs1 head2) {
		// TODO Auto-generated method stub
		//return null;
		if(head1==null||head2==null)
			return -1;
		else{
			
		Stack<cs1> s1=new Stack<cs1>();	
		Stack<cs1> s2=new Stack<>();
		cs1 curr1=head1;
		cs1 curr2=head2;
		while(curr1!=null)
		{   s1.push(curr1);
			curr1=curr1.next;
		}
		while(curr2!=null)
		{   s2.push(curr2);
			curr2=curr2.next;
		}
		//System.out.println(s2);
		cs1 curr3=s1.pop();
		cs1 curr4=s2.pop();
		System.out.println(curr3.data+" "+curr4.data);
		cs1 prev1=null,prev2;
		while(curr3==curr4)
		{
			prev1=curr3;
			//prev2=s2.pop();
			curr3=s1.pop();
			curr4=s2.pop();
			//System.out.println("Same");
		}
		return prev1.data;	
			
		}
	}

	private static int findInt(cs1 head) {
		// TODO Auto-generated method stub
		//return null;
		if(head==null)
			return -1;
		cs1 slowptr=head;
		cs1 fastptr=head;
		boolean loopExists=false;
		while(fastptr!=null&& fastptr.next!=null)
		{
			slowptr=slowptr.next;
			fastptr=fastptr.next.next;
			if(slowptr==fastptr)
			{
				loopExists=true;
				break;
			}
		}
		
		if(loopExists)
		{
			slowptr=head;
			while(slowptr!=fastptr)
			{
				slowptr=slowptr.next;
				fastptr=fastptr.next;
			}
			return slowptr.data;
		}
		return -1;
	}

}

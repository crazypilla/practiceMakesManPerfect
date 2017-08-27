
public class ll {
	
	int data;
	ll next;
	ll(int d)
	{
		this.data=d;
		this.next=null;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ll frst=new ll(23);
        ll sec=new ll(27);
        ll three=new ll(29);
        ll four=new ll(31);
        ll five=new ll(45);
        ll six=new ll(78);
        ll seven=new ll(99);
        
        frst.next=sec;
        sec.next=three;
        three.next=four;
        four.next=five;
        five.next=six;
        six.next=seven;
         
        int n=3;
        print(findNthList(frst,n));
		
	}
	public static ll findNthList(ll head,int n)
	{
		if(head==null)
			return null;
		ll ptr=head;
		int ct=0;
		while(ct<n)
		{
			
			ptr=ptr.next;
			ct++;
			
		}
		ll actualptr=head;
		//ll prev=actualptr;
		while(ptr!=null)
		{
			ptr=ptr.next;
			//prev=actualptr;
			actualptr=actualptr.next;
		}
		return reverse(actualptr);
	}
	private static ll reverse(ll head) {
		// TODO Auto-generated method stub
		//return null;
		
		if(head==null)
			return head;
		ll prev=null;
		ll curr=head;
		ll nextNode=null;
		
		while(curr!=null)
		{
			nextNode=curr.next;
			curr.next=prev;
			prev=curr;
			curr=nextNode;
		}
		
		return prev;
	}

	private static void print(ll frst) {
		// TODO Auto-generated method stub
		//return null;
		if(frst==null)
			return;
		ll curr=frst;
		while(curr!=null)
		{
			System.out.println(curr.data);
			curr=curr.next;
	
		}
		
		
		
	}

}

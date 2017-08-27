
public class revll {
	
	int data;
	revll next;
	revll(int d)
	{
		this.data=d;
	}
	
	public static void main(String[] args){
		
		revll frst=new revll(1);
		
		revll sec=new revll(2);
		revll three=new revll(3);
		revll four=new revll(4);
		revll five=new revll(7);
		revll six=new revll(9);
		frst.next=sec;
		sec.next=three;
		three.next=four;
		four.next=five;five.next=six;
		print(reverse(frst));
		
		
		
	}

	private static void print(revll head) {
		// TODO Auto-generated method stub
		if(head==null)
			System.out.println(0);
		revll curr=head;
		while(curr!=null)
		{
			System.out.println(curr.data);
			curr=curr.next;
		}
		
	}

	private static revll reverse(revll head) {
		// TODO Auto-generated method stub
		//return null;
		if(head==null||head.next==null)
			return head;
		revll curr=head;
		revll prev=null;
		revll nextNode;
		while(curr!=null)
		{
			nextNode=curr.next;
			curr.next=prev;
			//nextNode.next=curr;
			prev=curr;
			curr=nextNode;
			
		}
	
	return prev;
	
	}

}

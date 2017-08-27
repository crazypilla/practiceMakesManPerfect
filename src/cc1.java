
public class cc1 {
	
	int data;
	cc1 next;
	cc1(int d)
	{
		this.data=d;
		this.next=null;
	}

	public static void main(String[] args)
	{
		cc1 first=new cc1(24);
		cc1 sec=new cc1(25);
		cc1 three=new cc1(27);
		cc1 four=new cc1(29);
		cc1 five=new cc1(31);
		cc1 six=new cc1(35);
		
		first.next=sec;
		sec.next=three;
		three.next=four;
		four.next=five;
		five.next=six;
		six.next=four;
		System.out.println(findBegin(first));
	}



	private static int findBegin(cc1 head) {
		// TODO Auto-generated method stub
		//return null;
		System.out.println("inside loop");
		boolean loopexists=false;
		if(head==null)
			loopexists= false;
		
		cc1 slowptr=head;
		cc1 fastptr=head;
		
		while(fastptr!=null&&fastptr.next!=null)
		{
			slowptr=slowptr.next;
			fastptr=fastptr.next.next;
			
			if(slowptr==fastptr)
				{loopexists=true;
				 break;
				}
		}
		//loopexists= false;
		if(loopexists)
		{
			slowptr=head;
			while(slowptr!=fastptr)
			{
				slowptr=slowptr.next;
				fastptr=fastptr.next;
			}
			
			return fastptr.data;
		}
			
		else 
			return 0;
		
		
			
	}
	
}

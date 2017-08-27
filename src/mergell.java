
public class mergell {
	char data;
	mergell next;
	mergell(char d)
	{
		this.data=d;
		this.next=null;
	}
	

    
  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mergell frst=new mergell('a');
		mergell f1=new mergell('b');
		mergell f2=new mergell('c');
		mergell frst1=new mergell('1');
		mergell f3=new mergell('2');
		mergell f4=new mergell('3');
	   // frst.next=f1;
	    //f1.next=f2;
	    frst.next=f1;
	    f1.next=f2;
	    frst1.next=f3;
	    f3.next=f4;
	    
	    print(merger(frst,frst1));

	}




	private static mergell merger(mergell head1, mergell head2) {
		// TODO Auto-generated method stub
		//return null;
		mergell curr1=head1;
		mergell curr2=head2;
		if(curr1==null)
			return curr2;
		if (curr2==null)
			return curr1;
		//	return 
		while((curr1!=null)&&(curr2!=null))
		{
			//curr1.next=curr2;
			mergell temp1=curr1.next;
			curr1.next=curr2;
			mergell temp2=curr2.next;
			curr2.next=temp1;
			curr1=temp1;
			curr2=temp2;
			//curr1=curr1.next;
			//curr2=curr2.next;
			
		}
		return head1;
	}




	private static void print(mergell hd) {
		if(hd==null)
			System.out.println("empty");
		mergell curr=hd;
		while(curr!=null)
		{
			System.out.println(curr.data);
			curr=curr.next;
		}
		// TODO Auto-generated method stub
		
	}

}

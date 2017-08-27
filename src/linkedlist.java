
public class linkedlist {
	
	int data;
	linkedlist next;
	linkedlist(int d){
		this.data=d;
		this.next=null;
	}
	public static void main(String[] args){
		linkedlist first=new linkedlist(6);
		linkedlist sec=new linkedlist(1);
		linkedlist three=new linkedlist(3);
		linkedlist four=new linkedlist(5);
		linkedlist five=new linkedlist(4);
		linkedlist six=new linkedlist(2);
		linkedlist seven=new linkedlist(9);
		first.next=sec;
		sec.next=three;
		three.next=four;
		four.next=five;
		five.next=six;
		six.next=seven;
		print(first);
		System.out.println("after partition");
		//kthNodeFromEnd(first,2);
		print(partition(first,5));
		//System.out.println("after dup rem: ");
		//print(removeDups(first));
		//System.out.println("After reversing: ");
		//printReverse(first);
		/*System.out.println(findlength(first));
		first=insertAtBegin(first,22);
		System.out.println("hey inserting at end");
		insertAtEnd(first,26);
		insertAtEnd(first,27);
		//System.out.println("hey inserting in middle");
		//print(insertInMid(null,2,1));
		//System.out.println("hey deleting the beginning");
		//print(deleteFront(first));
		//System.out.println("hey deleting the mid");
		System.out.println("Before:");
		print(first);
		//System.out.println("After:");
		//print(deleteEnd(first));
		//print(delMid(first,3));
		//System.out.println(printPFromEnd(first,2));
		
		//System.out.println(findLoopBeginning(first));
		//print(reverse(first));
		System.out.println("middle is"+findMid(first)); 
		*/
		
	}
	private static linkedlist partition(linkedlist head, int k) {
		// TODO Auto-generated method stub
		linkedlist curr=head;
		linkedlist newHead=head;
		linkedlist prev=null;
		linkedlist mid=findMid(head);
		while(curr!=mid)
		{
			prev=curr;
			if(curr.data<k)
			{
				curr=curr.next;
			}
			
			else{	
				linkedlist nextNode=curr.next;
				prev.next=nextNode;
				
				addToEnd(mid,curr);
				
				curr=nextNode;
				
			}	
		}
		while(curr!=null)
		{
			prev=curr;
			if(curr.data>=k)
			{
				curr=curr.next;
			}
			
			else{	
				linkedlist nextNode=curr.next;
				prev.next=nextNode;
				
				newHead=addToFront(head,curr);
				
				curr=nextNode;
				
			}		
		}
	
   return newHead;		
	}
	private static linkedlist addToFront(linkedlist head, linkedlist curr) {
		// TODO Auto-generated method stub
		
		if(head!=null)
		{
			curr.next=head;
			head=curr;
		}
		else{
			head=curr;
		}
		return head;
	}
	private static void addToEnd(linkedlist mid, linkedlist end) {
		// TODO Auto-generated method stub
		
		linkedlist curr=mid;
		linkedlist prev=null;
		while(curr!=null)
		{   prev=curr;
			curr=curr.next;
		}
		prev.next=end;
		
	}
	private static linkedlist deleteMid(linkedlist head) {
		// TODO Auto-generated method stub
		if(head==null)
			return null;
		if(head.next==null)
			return null;
		linkedlist prev=null;
		linkedlist sptr=head;
		linkedlist fptr=head;
		while((fptr.next!=null)&&(fptr.next.next!=null))
		{
			prev=sptr;
			sptr=sptr.next;
			fptr=fptr.next.next;
		}
		return delMidUtil(head,prev,sptr);
		
	}
	private static linkedlist delMidUtil(linkedlist head, linkedlist prev, linkedlist sptr) {
		// TODO Auto-generated method stub
		//return null;
		if(prev!=null)
		{
			linkedlist nextNode=sptr.next;
			prev.next=nextNode;
			sptr=null;
		}
		else{
			
			head.next=null;
		}
		
		return head;
		
		
		
	}
	private static void kthNodeFromEnd(linkedlist head, int k) {
		// TODO Auto-generated method stub
		linkedlist curr=head;
		linkedlist temp=head;
	  int count=0;
	  while(count<k)
	  {
		  temp=temp.next;
		  count++;
	  }
		while(temp!=null)
		{   curr=curr.next;
			temp=temp.next;
		}
		
		
		System.out.println(curr.data);
		
		
		
		
		
		
	}
	private static linkedlist removeDups(linkedlist head) {
		// TODO Auto-generated method stub
		
		if(head==null||head.next==null)
			return head;
		linkedlist curr=head.next;
		linkedlist prev=head;
		
		
		while(prev!=null&&curr!=null)
		{
			if(prev.data==curr.data)
			{
				while(curr!=null)
				{  
					if(curr.data==prev.data)
						curr=curr.next;
					else
						break;
					
				}
		       prev.next=curr;
		       if(curr!=null)
		       {
		    	   prev=curr;
			       curr=prev.next;
		       }
		       
			}
			else{
				
				prev=curr;
		
			    curr=curr.next;
			  
		      }
		}
		
		return head;
	}
	private static void printReverse(linkedlist head) {
		// TODO Auto-generated method stub
		
		
		if(head==null)
			return;
		printReverse(head.next);
		System.out.println(head.data);
		
		
		
	}
	private static linkedlist findMid(linkedlist first) {
		// TODO Auto-generated method stub
		if(first==null)
			return null;
		linkedlist slowptr=first;
		linkedlist fastptr=first;
		while(fastptr!=null&&fastptr.next!=null){
			slowptr=slowptr.next;
			fastptr=fastptr.next.next;
		}
		
		
		return slowptr;
	}
	private static linkedlist reverse(linkedlist first) {
		// TODO Auto-generated method stub
		
		if(first==null)
		 return null;
		
		linkedlist curr=first;
		linkedlist prev=null;
		linkedlist nextnode;
		while(curr!=null)
		{ nextnode=curr.next;
		  curr.next=prev;
		  prev=curr;
		  curr=nextnode;
			
		}
		return prev;
	}
	private static int findLoopBeginning(linkedlist first) {
		// TODO Auto-generated method stub
		
		if(!loopExists(first))
		{return -1;}
		linkedlist slowptr=first;
		linkedlist fastptr=first;
		while(slowptr!=fastptr){
			slowptr=slowptr.next;
			fastptr=fastptr.next;
		}
		return fastptr.data;
	}
	private static boolean loopExists(linkedlist first) {
		// TODO Auto-generated method stub
		
		if(first==null)
			return false;
		linkedlist slowptr=first;
		linkedlist fastptr=first;
		while(fastptr!=null&&fastptr.next!=null){
			slowptr=slowptr.next;
			fastptr=fastptr.next.next;
			if(slowptr==fastptr)
				return true;
		}
		return false;
	}
	private static int printPFromEnd(linkedlist first,int pos) {
		// TODO Auto-generated method stub
		
		if(first==null)
			return -1;
		if(pos>findlength(first))
			return -1;
		linkedlist curr=first;
		int count=0;
		while(count<pos)
		{
			curr=curr.next;
			count++;
			
		}
		linkedlist newcurr=first;
		while(curr!=null){
			newcurr=newcurr.next;
			curr=curr.next;
		}
		return newcurr.data;
		
		
	}
	private static linkedlist delMid(linkedlist first,int pos) {
		// TODO Auto-generated method stub
		if(first==null)
			return first;
		if(findlength(first)<pos)
			return first;
		if(findlength(first)==pos)
			deleteEnd(first);
		
		linkedlist prev=null;
		linkedlist curr=first;
		int count=0;
		while(count<pos){
			prev=curr;
			curr=curr.next;
			count++;
		}
		prev.next=curr.next;
		curr=null;
		
		return first;
	}
	private static linkedlist deleteEnd(linkedlist first) {
		// TODO Auto-generated method stub
		
		if(first==null)
			return null;
		if(findlength(first)==1)
		{
			first=null;
			  return first;
		}
		linkedlist curr=first;
		//linkedlist prev=null;
		while(curr.next.next!=null){
			//prev=curr;
			curr=curr.next;
		}
		curr.next=null;
		
		return first;
	}
	private static linkedlist deleteFront(linkedlist first) {
		// TODO Auto-generated method stub
		//
	  if(first==null)
		return first;
	  if(findlength(first)==1)
	  {
		  first=null;
		  return first;
	  }
	 
	  linkedlist curr=first;
	  linkedlist newhead=first.next;
	  first=newhead;
	  return first;
	  
	}
	private static linkedlist insertInMid(linkedlist first, int i,int pos) {
		// TODO Auto-generated method stub
		linkedlist newnode=new linkedlist(i);
		if(first==null)
			return newnode;
		if(pos>=findlength(first))
			return insertAtEnd(first,i);
		linkedlist curr=first;
		linkedlist prev=null;
		int count=0;
		while(count<pos){
			prev=curr;
			curr=curr.next;
			count++;
			
		}
		prev.next=newnode;
		newnode.next=curr;
		return first;
	}
	private static linkedlist insertAtEnd(linkedlist first, int i) {
		// TODO Auto-generated method stub
		if(first==null)
			return new linkedlist(i);
		linkedlist newnode=new linkedlist(i);
		linkedlist curr=first;
		linkedlist prev=null;
		while(curr!=null){
			prev=curr;
			curr=curr.next;
		}
		prev.next=newnode;
		return first;
	}
	private static linkedlist insertAtBegin(linkedlist first, int i) {
		// TODO Auto-generated method stub
		if(first==null){
			first=new linkedlist(i);
		}
		linkedlist newnode=new linkedlist(i);
		newnode.next=first;
		first=newnode;
		return first;
	}
	private static int findlength (linkedlist first) {
		// TODO Auto-generated method stub
		if(first==null)
			return 0;
		int count=0;
		linkedlist curr=first;
		
			while(curr!=null)
			{count++;
			curr=curr.next;
			}
		
		return count;
	}
	private static void print(linkedlist first) {
		// TODO Auto-generated method stub
		if(first==null) 
			System.out.println("empty list");
		linkedlist curr=first;
		while(curr!=null){
			System.out.print(curr.data+"     ");
			curr=curr.next;
		}
		
	}
	

}

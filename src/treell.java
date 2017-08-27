import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class treell {
	
	int data;
	treell left;
	treell right;
	treell(int d)
	{this.data=d;
	this.left=null;
	this.right=null;	
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   treell root=new treell(1);
   treell t1=new treell(2);
   treell t2=new treell(3);
   treell t3=new treell(4);
   treell t4=new treell(5);
   treell t5=new treell(6);
   treell t6=new treell(7);
   root.left=t1;
   root.right=t2;
   t1.left=t3;
   t1.right=t4;
   
   t2.left=t5;
   t2.right=t6;
   //print(root);
   zizag(root);
   
	}


	private static void print(treell root) {
		// TODO Auto-generated method stub
		if(root==null)
			return;
		
		print(root.left);
		System.out.println(root.data);
		print(root.right);
	}


	private static void zizag(treell root) {
		// TODO Auto-generated method stub
		
		if(root==null)
			System.out.println("empty");
		ArrayList<ArrayList<Integer>> res=new ArrayList<>();
		ArrayList<Integer> curr=new ArrayList<>();
		Queue<treell> q=new LinkedList<>();
		q.offer(root);
		q.offer(null);
		while(!q.isEmpty())
		{
	
			treell temp=q.poll();
            //System.out.println(temp.data);
			if(temp!=null)
			{
				curr.add(temp.data);
				if(temp.left!=null)
					{q.offer(temp.left);}
				if(temp.right!=null)
					{q.offer(temp.right);}
				
			}
			else{
				ArrayList<Integer> ccurr=new ArrayList<>(curr);
				res.add(ccurr);
				curr.clear();
				if(!q.isEmpty())
				   q.offer(null);
				
			}
			
		}
		//System.out.println(res);
		for(int i=0;i<res.size();i++)
		{
			if(i%2==0)
				System.out.println(res.get(i));
			else{
				
				Stack<Integer> s=new Stack<>();
				s.addAll(res.get(i));
				ArrayList<Integer> ccurr=new ArrayList<>();
				while(!s.isEmpty())
				{
					ccurr.add(s.pop());
				}
				System.out.println(ccurr);
			}  
		}
		
	}
	

}

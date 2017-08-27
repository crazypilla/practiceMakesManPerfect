import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class tree {
	int data;
	tree left;tree right;
	tree(int d,tree l, tree r)
	{
		this.data=d;
		this.left=l;
		this.right=r;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
tree root=new tree(23,null,null);
tree n1=new tree(20,null,null);
tree n2=new tree(26,null,null);
tree n3= new tree(29,null,null);
tree n4=new tree(16,null,null);
root.left=n4;
n4.right=n1;
root.right=n3;
n3.left=n2;

tree n5=new tree(12,null,null);
n4.left=n5;
//print(root);
//System.out.println(levelOrder(root));
//printPaths(root);
//System.out.println(lca(root,n5,n1));


	}

	private static tree lca(tree root,tree n5, tree n1) {
		// TODO Auto-generated method stub
		//return null;
		if(n5==null||n1==null)
			return root;
		if(root==null)
			return root;
		tree left=lca(root.left,n5,n1);
		tree right=lca(root.right,n5,n1);
		if(left!=null && right!=null)
			return root;
		else{
			return(left!=null?left:right);
		}
		//if(n5.left==n1||)
	}

	private static boolean find(tree root, int i) {
		// TODO Auto-generated method stub
		if(root==null)
			return false;
		if(root.data==i)
		  return true;
        return find(root.left,i)||find(root.right,i);
		
		
	}

	private static void printPaths(tree root) {
		// TODO Auto-generated method stub
		//return null;
		ArrayList<Integer> path=new ArrayList<>();
		printPaths(root,path);
	}

	private static void printPaths(tree root, ArrayList<Integer> path) {
		// TODO Auto-generated method stub
		if(root==null)
			return;
		path.add(root.data);
		if(root.left==null&&root.right==null)
			System.out.println(path);
		else{
			
			printPaths(root.left,path);
			printPaths(root.right,path);
		}
		path.remove(path.size()-1);
	}

	private static ArrayList<ArrayList<Integer>> levelOrder(tree root) {
		// TODO Auto-generated method stub
		
		ArrayList<ArrayList<Integer>> res=new ArrayList<>();
		
		if(root==null)
			return res;
		ArrayList<Integer> curr=new ArrayList<>();
		Queue q=new LinkedList<tree>();
		q.offer(root);
		q.offer(null);
		while(!q.isEmpty())
		{
			tree temp=(tree) q.poll();
			if(temp!=null)
			{ curr.add(temp.data);
			if(temp.left!=null)
				q.offer(temp.left);
			if(temp.right!=null)
				q.offer(temp.right);
			}
			else{
				res.add(new ArrayList<Integer>(curr));
				curr.clear();
				if(!q.isEmpty())
					q.offer(null);	
			}	
			
		}
		
return res;
}	
			
	private static void print(tree root) {
		// TODO Auto-generated method stub
	if(root!=null)
		{
			print(root.left);
			System.out.println(root.data);
			print(root.right);
		}
	}

}

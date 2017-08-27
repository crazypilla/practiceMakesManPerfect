package practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class parenthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=4;
	//	printPars(n); //has error
		ArrayList<String> list=new ArrayList<String>();
		dfs(list,"",n,n);
		System.out.println((list.size()));

	}
	public static void dfs(ArrayList<String> list, String s, int left, int right){
	    if(left > right)
	        return;
	 
	    if(left==0&&right==0){
	        list.add(s);
	        return;
	    }
	 
	    if(left>0){
	        dfs(list, s+"(", left-1, right);
	    }
	 
	    if(right>0){
	        dfs(list, s+")", left, right-1);
	    }
	}

	private static void printPars(int n) {
		// TODO Auto-generated method stub
		if(n==0)
			return;
		HashSet<String> res=new HashSet<>();
		
	
		
			StringBuilder sb=new StringBuilder("(");
			sb.append(")");
			res.add(sb.toString());
		
			if(n==1){
				System.out.println(res);
			}
		 printPars(res,n-1);
		
		
	}

	private static void printPars(HashSet<String> res, int n) {
		// TODO Auto-generated method stub
		if(n==0)
		{
			System.out.println(res);
			System.out.println(res.size());
			return;
		}
		
		HashSet<String> cloneSet=new HashSet<>();
		cloneSet.addAll(res);
		HashSet<String> resSet=new HashSet<>();
		Iterator<String> it=cloneSet.iterator();
		while(it.hasNext()){
			String curr=it.next();
			StringBuilder sb=new StringBuilder();
			sb.append("(");
			sb.append(curr);
			sb.append(")");
			resSet.add(sb.toString());
			sb.setLength(0);
			sb.append("(");
			sb.append(")");
			sb.append(curr);
			resSet.add(sb.toString());
			
			sb.setLength(0);
			sb.append(curr);
			sb.append("(");
			sb.append(")");
			
			resSet.add(sb.toString());
		}
		printPars(resSet,n-1);
	}

}

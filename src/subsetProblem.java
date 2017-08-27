import java.util.ArrayList;
import java.util.HashSet;

public class subsetProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int[] arr={1,2,3,4,5};
      ArrayList<ArrayList<Integer>> res=new ArrayList<>();
      res.add(new ArrayList<Integer>());
    
      for(int i=0;i<arr.length;i++)
      {
    	  addToPreviousSet(res,arr[i]);
    	  
      }
    System.out.println(res.size());
	}

	private static void addToPreviousSet(ArrayList<ArrayList<Integer>> res, int num) {
	   // System.out.println("before:....");
	    //System.out.println(res);
		 ArrayList<ArrayList<Integer>> cloneset=new ArrayList<>(res);
		// ArrayList<ArrayList<Integer>> tempset=new ArrayList<>(res);
		// ArrayList<Integer> newSet;
		for(int i=0;i<cloneset.size();i++)
		{   
			ArrayList<Integer>newSet= new ArrayList<Integer>(cloneset.get(i));
			newSet.add(num);
			//ArrayList<Integer> temp=new ArrayList<Integer>();
			//temp.addAll(newSet);
			//System.out.println("temp value"+ temp);
			res.add(newSet);
			//System.out.println(res);
			//System.out.println(res);
			//newSet.clear();
			//newSet=null;
		}
		//res.addAll(tempset);
	//	System.out.println("after");
	//	System.out.println(res);
	}

}

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class subset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int[] arr={1,2,2};
       ArrayList<ArrayList<Integer>> result=new ArrayList<>();
       for(int i=0;i<arr.length;i++)
       {
    	   ArrayList<ArrayList<Integer>> temp=new ArrayList<>();
    	   for(ArrayList<Integer> a: result)
    	   {
    		   temp.add(new ArrayList(a));
    	   }
    		   
    		for(ArrayList<Integer> x: temp)
    		{
    			x.add(arr[i]);
    		}   
    		   ArrayList<Integer> single=new ArrayList<Integer>();
    		   single.add(arr[i]);
    		   temp.add(single);
    		   result.addAll(temp);

       }
       result.add(new ArrayList<Integer>());
       System.out.println(result);
       ArrayList<ArrayList<Integer>> newResult=new ArrayList<>();
     for(ArrayList<Integer> a:result)
     {
    	 ArrayList<Integer> tempList=new ArrayList<>(a);
    	 Collections.sort(tempList,new Comparator<Integer>(){

		
			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o1-o2;
			}});
    	 newResult.add(tempList);
     }
     Collections.sort(newResult,new Comparator<ArrayList<Integer>>(){

		@Override
		public int compare(ArrayList<Integer> o1, ArrayList<Integer> o2) {
			// TODO Auto-generated method stub
			int diff= o1.size()-o2.size();
			if((diff==0)&&(o1.size()==1))
			{
				return o1.get(0)-o2.get(0);
			}
			return diff;
		}
    	 
     });
    // System.out.println(newResult);
	}

}

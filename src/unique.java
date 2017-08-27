import java.util.HashSet;

public class unique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 int[] arr={23,5,6,78,9,9};
	 HashSet<Integer> set=new HashSet<>();
	 HashSet<Integer> dups=new HashSet<>();
	 int[] narr={45,6,7,8,2};
     for(int i=0;i<arr.length;i++)
     {set.add(arr[i]);}
     for(int j=0;j<narr.length;j++)
     {
    	 if(!set.add(narr[j]))
             dups.add(narr[j]);
    	 
     }
     set.removeAll(dups);
     System.out.println(set);
	}

}

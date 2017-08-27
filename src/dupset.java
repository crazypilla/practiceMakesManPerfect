import java.util.ArrayList;
import java.util.HashSet;

public class dupset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1={1,3,3,5,7};
		int[] arr2={2,3,6,7,8};
		HashSet<Integer> set=new HashSet<>();
		HashSet<Integer> dups=new HashSet
				<>();
		for(int i=0;i<arr1.length;i++)
		{
			if(!set.add(arr1[i]))
			{ //set.remove(arr1[i]);
			  dups.add(arr1[i]);}
		}
		for(int i=0;i<arr2.length;i++)
		{
			
			if(!set.add(arr2[i]))
			{
				dups.add(arr2[i]);
			}
		}
		System.out.println(set);
    System.out.println(dups);
    HashSet<Integer> unique=new HashSet<>();
    set.removeAll(dups);
    System.out.println(set);
	}

}

import java.util.ArrayList;
import java.util.HashSet;

public class cs7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int[] arr1={4,7,9,13,16};
  int[] arr2={3,4,5,9,13};
  HashSet<Integer> set=new HashSet<>();

  ArrayList<Integer> uni=new ArrayList<>();
  for(int i=0;i<arr1.length;i++)
  { set.add(arr1[i]);
	  
  }
  for(int i=0;i<arr2.length;i++)
  {
	  if(!set.add(arr2[i]))
		  uni.add(arr2[i]);
		  
  }
  System.out.println(uni);
	}

}

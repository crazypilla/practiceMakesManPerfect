import java.util.HashMap;

public class progcreek1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={2,7,11,15,7,1,2,1,2,2};
		int target=3;
		HashMap<Integer,Integer> map=new HashMap<>();
		
		for(int i=0;i<arr.length;i++)
		{
			
			if(!map.containsKey(arr[i]))
			{
				map.put(target-arr[i],i);
			}
			else{
				
				
				int otherIndex=map.get(arr[i]);
				//System.out.println(otherIndex+","+i);
				System.out.println(arr[otherIndex]+","+arr[i]);
			}
			
		}
		

	}

}

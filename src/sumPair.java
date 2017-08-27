import java.util.HashMap;

public class sumPair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int[] arr={1,2,6,4,3,5};
     int n=8;
     HashMap<Integer,Integer> map=new HashMap<>();
     for(int i=0;i<arr.length;i++)
     {  int val=n-arr[i];
    	 if(!map.containsKey(arr[i]))
    	 {
    		 map.put(val, i);
    		 System.out.println("well adding to map "+ val +" "+ i);
    	 }
    	 else{
    		 int index=map.get(arr[i]);
    		 System.out.println(arr[index]+" "+arr[i]);
    	 }
     }
     System.out.println(map);
     
	}
	

}

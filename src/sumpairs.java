import java.util.HashMap;

public class sumpairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		int[] arr={2,3,4,8,5,1,6,2};
        HashMap<Integer,Integer> map=new HashMap<>();
        int sum=6;
        for(int i=0;i<arr.length;i++)
        {   	
        	if(map.containsKey(sum-arr[i]))
        	{
        		System.out.println(sum-arr[i]+" "+arr[i]);
        		int num=Integer.MAX_VALUE+1;
        		System.out.println(num);
        	}
        	else{
        		map.put(arr[i], 1);
        	}      	
        }
        
	}

}

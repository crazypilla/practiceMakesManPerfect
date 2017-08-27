import java.util.PriorityQueue;

public class kthlargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={5,9,1,14,16,3,31,2};
		int k=3;
		if(k>arr.length)
			System.out.println("sorry bro, k should be longer!");
		PriorityQueue<Integer> minHeap=new PriorityQueue<Integer>();
		for(int i=0;i<k;i++)
		{
			minHeap.add(arr[i]);
		}
		
		for(int i=k;i<arr.length;i++)
		{
			if(arr[i]>minHeap.peek())
			{
				minHeap.poll();
				minHeap.add(arr[i]);
			}
		}
		
		
		System.out.println(minHeap.poll());
		
		int num=0;
		StringBuilder sb=new StringBuilder();
		//if(num==0)
			//;
		while(num>0)
		{
			int remainder=num%2;
			sb.append(remainder+"");
			num=num/2;
		}
		
		System.out.println(sb.reverse().toString());

	}

}

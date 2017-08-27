import java.util.Comparator;
import java.util.PriorityQueue;

public class getMinK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={7,17,8,9,12,4,10,5};
		
		int k=2;
		getMinK(arr,k);

	}

	private static void getMinK(int[] arr, int k) {
		// TODO Auto-generated method stub
		PriorityQueue<Integer> pq=new PriorityQueue<Integer>(new Comparator<Integer>(){

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o2-o1;
			}
			
		});
		for(int i=0;i<k;i++)
		{
			pq.offer(arr[i]);
		}
		for(int i=k;i<arr.length;i++)
		{
			if(arr[i]<pq.peek()){
				pq.poll();
				pq.offer(arr[i]);
			}
		}
		
		while(!pq.isEmpty())
		{
			System.out.println(pq.poll());
		}
	}

}

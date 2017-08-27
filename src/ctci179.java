import java.util.ArrayList;
import java.util.PriorityQueue;

public class ctci179 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] factors={3,5,7};
		//
		int k=6;
		getKthNumber(factors,k);

	}

	private static void getKthNumber(int[] factors, int k) {
		// TODO Auto-generated method stub
		if(k<0)
			return;
		if(k==1)
			{
			  System.out.println(1);
			//  System.out.println(k);
			  return;
			}
		PriorityQueue<Integer> pq=new PriorityQueue<>();
		ArrayList<Integer> list=new ArrayList<>();
		pq.add(1);
		int ct=0;
		while(ct<k)
		{ int temp=pq.poll();
		  list.add(temp);
		  pq.offer(temp*3);
		  pq.offer(temp*5);
		  pq.offer(temp*7);
		  ct++;
		}
		System.out.println(list);
		System.out.println(list.get(k-1));
	}

}

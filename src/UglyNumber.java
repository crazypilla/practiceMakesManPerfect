import java.util.PriorityQueue;

public class UglyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=11;
		findNth(n);

	}

	private static void findNth(int n) {
		// TODO Auto-generated method stub
		
		if(n==1)
		{
			System.out.println(1);
			return;
		}
		PriorityQueue<Integer> queue=new PriorityQueue<>();
		int cnt=1;
		queue.offer(2);
		queue.offer(3);
		queue.offer(5);
		while(cnt<n)
		{
		int temp=queue.poll();
		System.out.println(temp);
		cnt++;
		if(!queue.isEmpty()&&queue.peek()==temp)
		{
			queue.poll();
		}
		
		queue.offer(temp*2);
		queue.offer(temp*3);
		queue.offer(temp*5);
		}
		
	//	System.out.println((int)queue.poll());
		
	}

}

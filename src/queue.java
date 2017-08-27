import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class queue {
	public static void main(String[] args){
		
		
		Queue<Integer> queue=new LinkedList<Integer>();
		queue.add(1);
		queue.add(2);
		queue.add(3);
		queue.add(4);
		print(queue);
		System.out.println("after");
		print(reverse(queue));
		
		
	}

	private static void print(Queue queue) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list=new ArrayList<>(queue);
		for(int i=0;i<list.size();i++)
		{
			System.out.print(list.get(i));
			
		}
		System.out.println("");
	}

	private static Queue reverse(Queue<Integer> queue) {
		// TODO Auto-generated method stub
		//return null;
		Stack<Integer> stk=new Stack<>();
		while(!queue.isEmpty()){
			stk.push(queue.poll());
			
		}
		while(!stk.isEmpty()){
			queue.add(stk.pop());
		}
		return queue;
	}

}

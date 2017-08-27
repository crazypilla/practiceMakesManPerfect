import java.util.LinkedList;
import java.util.Queue;

public class excption {

	public static void main(String[] args) throws Exception  {
		// TODO Auto-generated method stub
		int a;
		try{
		 a=24;
		 if(a<25)
		 {
			 throw new Exception();
		 }
		}
		catch(Exception e)
		{
			System.out.println("a is 24");
		}
	 //  a=28;
	  // System.out.println(a);
		
		Queue<Integer> queue=new LinkedList<>();
		queue.add(4);
		queue.add(5);
		queue.add(78);
		queue.add(45);
		((LinkedList<Integer>) queue).addFirst(45);
		System.out.println(((LinkedList) queue).removeFirstOccurrence(45));
		
		while(!queue.isEmpty())
		{
			System.out.println(queue.remove());
		}
		

	}

}

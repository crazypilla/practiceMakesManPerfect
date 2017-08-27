import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class progcreek3 {

	
	
	public static void main(String[] args)
	{
		ArrayList<Integer> al=new ArrayList<>();
		ArrayList<Integer> al2=new ArrayList<>();
		al.add(23);
		al.add(45);
		al.add(67);
		al2.add(45);
		al2.add(67);
		al2.add(23);
		TreeSet<Integer> set=new TreeSet<>();
		
		set.addAll(al);
		
		if(set.containsAll(al2))
		{ System.out.println("al2 already present");}
		else{
			System.out.println("failed");
		}
	}
}

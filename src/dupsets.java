import java.util.HashSet;
import java.util.Set;

public class dupsets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="i came i saw i left after i came";
		Set<String> nonRepeat=new HashSet<String>();
		Set<String> repeat=new HashSet<String>();
		
		String[] words=str.trim().split(" ");
		for(String x:words)
		{
			if(!nonRepeat.add(x))
			{
				repeat.add(x);
			}
		}
		nonRepeat.removeAll(repeat);
		System.out.println(nonRepeat +"         and repeated  "+ repeat);

	}

}

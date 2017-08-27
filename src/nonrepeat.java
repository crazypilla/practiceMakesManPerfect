import java.util.HashSet;

public class nonrepeat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="hanuman";
		char[] arr=str.toCharArray();
		HashSet<Character> set=new HashSet<>();
		for(int i=0;i<arr.length;i++)
		{
			if(!set.add(arr[i]))
					{
				System.out.println(arr[i]);
				break;
					}
		}

	}

}


public class sequences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		buildSequence(n);

	}

	private static void buildSequence(int n) {
		// TODO Auto-generated method stub
		
		//StringBuilder sb=new StringBuilder("1");
		String str=new String("1");
		while(n-->1)
		{
			int count=1;
			StringBuilder temp=new StringBuilder();
			for(int i=1;i<str.length();i++)
			{
				if(str.charAt(i)==str.charAt(i-1))
				{
					count++;
				}
				else{
					temp.append(count);
					temp.append(str.charAt(i-1));
					
					count=1;
				}
			}
			temp.append(count);
			temp.append(str.charAt(str.length()-1));
			System.out.println(temp.toString());
			str=temp.toString();
		}
		
	}

}

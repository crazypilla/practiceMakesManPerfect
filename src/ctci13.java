
public class ctci13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Mr John Smith    ";
		System.out.println(urlify(str));
		

	}

	private static String urlify(String str) {
		// TODO Auto-generated method stub
		//return null;
		if(str==null)
			return null;
		str=str.trim();
		String[] strArr=str.split(" ");
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<strArr.length;i++)
		{
			sb.append(strArr[i]);
			if(i!=strArr.length-1)
			{
				
				sb.append("%20");
			}
		}
		return sb.toString();
	}

}

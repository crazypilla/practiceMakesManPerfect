
public class cc13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Mr John Smith    ";
		int trueLen=13;
		System.out.println(insert(str,trueLen));

	}

	private static String insert(String str,int len) {
		// TODO Auto-generated method stub
		//return null;
		String tbi="%20";
		StringBuilder sb=new StringBuilder();
		if(str==null&&len>0)
		{
			
			for(int i=0;i<len;i++)
			{
				sb.append(tbi);
			}
			
			return sb.toString();
		}
		else{
			
			if(str.length()==len)
				return str;
			else{
				String[] arr=str.split(" ");
				for(int i=0;i<arr.length;i++)
				{
					sb.append(arr[i]);
					if(i!=arr.length-1)
					  sb.append("%20");
				}
				
				return sb.toString();
					
			}
			
			
		}
	}

}


public class ctcionefour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="little johnny is shy ";
		System.out.println(putStuff(str));
		

	}

	private static String putStuff(String str) {
		// TODO Auto-generated method stub
		StringBuilder sb=new StringBuilder();
		str=str.trim();
		String[] strArr=str.split(" ");
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

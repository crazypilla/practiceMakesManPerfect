
public class stkll {
	public static void main(String[] args){
		for(int i=1;i<=100;i++)
		{
			if(binPals(i))
				System.out.println(i);
		}
		
		
	}

	private static boolean binPals(int i) {
		// TODO Auto-generated method stub
		//return false;
		
		String binStr=Integer.toBinaryString(i);
		if(isPal(binStr))
			return true;
		return false;
		
		
	}

	private static boolean isPal(String binStr) {
		// TODO Auto-generated method stub
		//return false;
		String firstPart=binStr.substring(0,binStr.length()/2);
		String secondPart;
		if(binStr.length()%2==0)
		{   secondPart=new StringBuilder(binStr.substring(binStr.length()/2)).reverse().toString();
			if(firstPart.equals(secondPart))
			  return true;
		}
		else{
			secondPart=new StringBuilder(binStr.substring(binStr.length()/2)+1).reverse().toString();
			if(firstPart.equals(secondPart))
			  return true;
			
		}
		return false;
		
		
	}

}

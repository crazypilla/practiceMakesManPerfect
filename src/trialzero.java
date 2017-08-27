
public class trialzero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=10;
		System.out.println(trailzerofun(num));

		
	}

	private static int trailzerofun(int num) {
		//return num;
		//return num;
		// TODO Auto-generated method stub
		//return null;
		int count=0;
		if(num<0)
			return -1;
		for(int i=5;num/i>=1;i*=5)
		{
			count+=num/i;
		}
		return count;
	}

}

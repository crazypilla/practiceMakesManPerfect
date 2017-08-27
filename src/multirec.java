
public class multirec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=3;
		int b=3;
		System.out.println(recurseMulti(a,b));

	}

	private static int recurseMulti(int a,int b) {
		// TODO Auto-generated method stub
		if(a==0||b==0)
			return 0;
		boolean sign=true;
		if((a<0&&b>0)||(a>0&&b<0))
		{
			sign=false;
		}
		
		if(!sign)
		{
			return (-1)*multiHelper(a,b,0);
		}
		return multiHelper(a,b,0);
	}

	private static int multiHelper(int a, int b, int prod) {
		// TODO Auto-generated method stub
		//return 0;
		if(b<0)
			return Integer.MIN_VALUE;
		if(b==0)
			return prod;
		
		return multiHelper(a,b-1,prod+a);
		
	}

}

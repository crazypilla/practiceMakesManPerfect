package practice;

public class powers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=6;
		powers(n);

	}

	private static int powers(int n) {
		// TODO Auto-generated method stub
		if(n<=0)
		{return 0;}
		else if(n==1){System.out.println("1"
				+ ""
				+ ""
				+ ""
				+ ""
				+ ""
				+ ""
				+ ""
				+ ""
				+ ""
				+ "");return 1;}
		else{
			 int  prev=powers(n/2);
			int curr=prev*2;
			System.out.println(curr);
			return curr;
		}
		
		
	}

}

package practice;

public class toh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=3;
		String S="source";
		String D="destination";
		String H="helper";
		toh(n,S,D,H);

	}

	private static void toh(int n, String s, String d, String h) {
		// TODO Auto-generated method stub
		if(n==1){
			System.out.println("Move from "+s+" to "+d);
			return;
		}
		toh(n-1,s,h,d);
		System.out.println("Move from "+s+" to "+d );
		toh(n-1,h,d,s);
	}

}

package practice;

public class trailZeroes {
	public static void main(String[] args){
		
		int n=10;
		System.out.println(trail(n));
	}

	private static int trail(int n) {
		// TODO Auto-generated method stub
		int count=0;
		if(n<0)
			return -1;
		if(n==5)
			return 1;
		for(int j=5;n/j>=1;j*=5){
			count+=n/j;
		}
		return count;
	}

}

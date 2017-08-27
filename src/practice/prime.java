package practice;

public class prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=1124
				;
		System.out.println(isPrime(n));

	}

	private static boolean isPrime(int n) {
		// TODO Auto-generated method stub
		for(int i=2;i*i<=n;i++){
			if(n%i==0)
				return false;
		}
		return true;
	}

}

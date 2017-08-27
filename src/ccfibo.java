
public class ccfibo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		System.out.println(fibo(n));
		System.out.println(fiboDP(n));
		System.out.println(fiboMemo(n));

	}

	private static int fiboMemo(int n) {
		// TODO Auto-generated method stub
		int[] arr=new int[n+1];
		arr[0]=0;arr[1]=1;
		if(n==1)
			return 1;
		for(int i=2;i<=n;i++)
			arr[i]=arr[i-1]+arr[i-2];
		return arr[n];
	}

	private static int fiboDP(int n) {
		// TODO Auto-generated method stub
		//return null;
		
		int a=1;
		int b=1;
		int c;
		if(n==1||n==2)
			return 1;
		for(int i=3;i<=n;i++)
		{ c=a+b;
		 
		  a=b; b=c;
			
			
		}
		return b;
	}

	private static int fibo(int n) {
		// TODO Auto-generated method stub
		//return null;
		if(n==0)
			return 0;
		if(n==1)
			return 1;
		return fibo(n-1)+fibo(n-2);
	}

}


public class integerBreak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=10;
		System.out.println(integerBreakFun(n));

	}
	public static int integerBreakFun(int n) {
	    int[] dp = new int[n+1];
	 
	    for(int i=1; i<n; i++){
	        for(int j=1; j<i+1; j++){
	            if(i+j<=n){
	                dp[i+j]=Math.max(Math.max(dp[i],i)*Math.max(dp[j],j), dp[i+j]);
	            }
	        }
	    }
	 
	    return dp[n];
	}
}

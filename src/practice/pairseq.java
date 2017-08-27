package practice;

public class pairseq {
	public 
	static int pairSumSeq(int n){
		int sum=0;
		for(int i=0;i<n;i++){
			sum+=pairSum(i,i+1);
		}
		return sum;
	}
	
	private static int pairSum(int i, int j) {
		// TODO Auto-generated method stub
		return i+j;
	}
	public static void main(String[] args){
		System.out.println(pairSumSeq(3));
		
	}

}

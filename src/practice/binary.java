package practice;

public class binary {
	static int[] A;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=3;
		setSize(n);
		binary(n);

	}
	private static void setSize(int n) {
		// TODO Auto-generated method stub
		A=new int[n];
	}
	private static void binary(int n) {
		// TODO Auto-generated method stub
		if(n<1){
			printArray(A);
			System.out.println(" ");
		}
		else{
			A[n-1]=0;
			binary(n-1);
			A[n-1]=1;
			binary(n-1);
		}
	}
	private static void printArray(int[] a2) {
		// TODO Auto-generated method stub
	for(int i=0;i<a2.length;i++){
		System.out.print(a2[i]);
	}
	}

}

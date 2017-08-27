
public class ctcionesix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] mat={{1,2,3},{4,5,6},{7,8,9}};
		print(mat);
		rotate(mat);
		print(mat);
	

	}
	private static void rotate(int[][] mat) {
		// TODO Auto-generated method stub
		
		
	}
	public static void print(int[][] mat)
	{
		for(int i=0;i<mat.length;i++)
		{
			for(int j=0;j<mat[0].length;j++)
			{
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
	}

}

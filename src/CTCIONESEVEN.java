
public class CTCIONESEVEN {
public static void main(String[] args)
{
	
 int[][] mat={{24,0,29},{32,36,39},{40,45,49}};
 makeZeroes(mat);


}

private static void makeZeroes(int[][] mat) {
	// TODO Auto-generated method stub
	
	int m=mat.length;
	int n=mat[0].length;
	int row,col;
	int newMat[][]=new int[m][n];
	for(int i=0;i<m;i++)
	{
		for(int j=0;j<n;j++)
		{
			newMat[i][j]=mat[i][j];
		}
	}
	
	for(int i=0;i<m;i++)
	{
		for(int j=0;j<n;j++)
		{
		   if(mat[i][j]==0)
		   {
			   row=i;
			   col=j;
			   putZeroes(newMat,row,col);
			   
		   }
		  
			   
		}
	}
	print(newMat);
	
}

private static void print(int[][] newMat) {
	// TODO Auto-generated method stub
	for(int i=0;i<newMat.length;i++)
	{
		for(int j=0;j<newMat[0].length;j++)
		{
			System.out.print(newMat[i][j]+" ");
			
		}
		System.out.println();
	}
	
}

private static void putZeroes(int[][] newMat, int row, int col) {
	// TODO Auto-generated method stub
	for(int j=0;j<newMat[0].length;j++)
	{
		newMat[row][j]=0;
	}
	for(int i=0;i<newMat.length;i++)
	{
		newMat[i][col]=0;
	}
	
}
}

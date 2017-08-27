
public class ctci1611 {
public static void main(String[] args)
{
  int shorter=2;
  int longer=5;
  int exactPlanks=3;
  calculatePossibleLengths(shorter,longer,exactPlanks);
  


}

private static void calculatePossibleLengths(int shorter, int longer, int exactPlanks) {
	// TODO Auto-generated method stub
	System.out.println("possible Lengths are: ");
	for(int i=0;i<=exactPlanks;i++)
	{  int len=(longer*exactPlanks)-(shorter*i);
	   int numlong= exactPlanks-i;
		System.out.println(len +"     with "+ i +" shorter planks and  "+ numlong +"  longer planks");
		
	}
	
}
}

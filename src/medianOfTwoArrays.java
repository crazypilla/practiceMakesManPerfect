
public class medianOfTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arra={1,3,5,11,17};
		int[] arrb={9,10,11,13,14};
		//int median=getMed(arra,0,arra.length-1,arrb,0,arrb.length-1);
		//System.out.println(median);

	}

	private static void getMed(int[] arra, int lefta, int righta, int[] arrb, int leftb, int rightb) {
		// TODO Auto-generated method stub
		int lenA=arra.length;
		//int lenB=arrb.length;
		int meda,medb;
		if(lenA%2==0)
		{   
			meda=arra[(righta-lefta)/2];
			medb=arrb[righta-lefta/2];
			
		}
		else{
			meda=(arra[lenA/2]+arra[(lenA/2)-1])/2;
			medb=(arrb[lenA/2]+arrb[(lenA/2)-1])/2;
		}
		if(meda==medb)
			{//return meda;}
		//else if(meda<medb){
			
			
			//getMed(arra,mid,)
			
			
			
			
		}
		
		
	}

}

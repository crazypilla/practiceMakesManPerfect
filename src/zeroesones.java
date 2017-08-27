
public class zeroesones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={1,1,1,1,1,0,0,0,0,0,0};
		int i=0; 
		int k=0;
		while(arr[i]!=0)
		{
			if(arr[(int)Math.pow(2,i)]==0)
			{
				k=(int)Math.pow(2,i);
				break;
			}
			i++;
			
			
		}
		System.out.println(k);
		System.out.println(arr[k]);
		
			int temp=k;
			k=k/2;
			for(int j=k;j<=temp;j++)
			{
				if(arr[j]==0)
				{
					System.out.println(j+" "+arr[j]);
					break;
				}
			}
			
		//}

	}

}

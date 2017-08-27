
public class sumofnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=-341;
		System.out.println(sum(num));

	}

	private static int sum(int num) {
		// TODO Auto-generated method stub
		int sum=0;
	  if(num<0)
		num=-num;
      if(num<10)
    	  return num;
      else{
    	 
    	  while(num>0)
    	  { 
    		  sum+=num%10;
    		  num=num/10;
    	  }
    	  
    	  if(sum<10)
    		  return sum;
    	  else{
    		  return sum(sum);
    	  }
      }
		
		//return sum;
	}

}

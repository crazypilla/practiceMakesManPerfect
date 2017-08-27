
public class countSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  System.out.println(456+85+2+23+46);
		    String s = new String("PST456DA85M2A!!23++46");
		    String strDigit = "";
		    boolean lastDigit=false;
		    int sum = 0;
		    for (int i = 0; i < s.length(); i++) {
		      Character charAt = (Character)s.charAt(i);
		      if (Character.isDigit(charAt)) {
		        strDigit +=charAt;
		        if(i==s.length()-1)
		        {lastDigit=true;}
		        if(lastDigit)
			      {
			    	  sum+=new Integer(strDigit);
			      }
		      } else {
		        if (strDigit.equals("") == false) {
		          sum = sum + new Integer(strDigit);
		          System.out.println(strDigit);
		          strDigit = "";
		        }
		        
		      }
		    
		      
		      
		    }
		    System.out.println(sum);
		  }


	

}


public class strnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="aaabbccccddeeeffghh";
		char prev=str.charAt(0); 
		int i=1;int cnt=1;
		StringBuilder sb=new StringBuilder();
		while(i<str.length())
		{
			if(prev==str.charAt(i))
				{cnt++;
				
				}
			else{
				sb.append(prev);
				sb.append(cnt);
				prev=str.charAt(i);
				cnt=1;
				
			}
			i++;
		}
		sb.append(prev);
		sb.append(cnt);
     System.out.println(sb.toString());
     int num=12345;
     int newnum=1;
     while(num>0)
     {
    	// int c=num%10;
    	 if(newnum!=1)
    	   newnum=num%10*10;
    	 newnum+=num%10;
    	 num=num/10;
    	 
     }
     System.out.println(newnum);
	}

}

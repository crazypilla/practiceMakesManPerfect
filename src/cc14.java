import java.util.HashMap;
import java.util.Map;

public class cc14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String str="malayal";
     String[] newstr=str.toLowerCase().split(" ");
     StringBuilder sb=new StringBuilder();
     for(int i=0;i<newstr.length;i++)
     {
    	 sb.append(newstr[i]);
     }
     String formattedStr=(sb.toString());
     HashMap<Character,Integer> map=new HashMap<>();
     for(int i=0;i<formattedStr.length();i++)
     { char c=formattedStr.charAt(i);
    	if(!map.containsKey(c))
    	{map.put(c, 1);}
    	else{
    		int val=map.get(c);
    		map.put(c, val+1);
    	}	
     }
     int unique=0;
     for(Map.Entry<Character,Integer> entry:map.entrySet())
     {
    	 if(entry.getValue()%2==1)
    		 unique=unique+1; 
     }
     if((formattedStr.length()%2)==0)
     {
    	 if(unique!=0)
    		 System.out.println("false");
    	 else
    		 System.out.println("true");
     }
     else{
    	 
    	 if(unique==1)
    		 System.out.println("true");
    	 else
    		 System.out.println("false");
    	 
     }
    	 
	}

}

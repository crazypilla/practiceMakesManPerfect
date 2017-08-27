import java.util.Stack;

public class stack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String exp="([harshi])ig}";
     System.out.println(check(exp));
	}

	private static boolean check(String exp) {
		// TODO Auto-generated method stub
		
        if(exp==null){
        	return true;
        }
		Stack<Character> stk=new Stack<>();
		
        for(int i=0;i<exp.length();i++){
        	char curr=exp.charAt(i);
        	System.out.println(curr);
        	if((exp.charAt(i)=='(')||(exp.charAt(i)=='{')||exp.charAt(i)=='[')
        	{
        	 stk.push(exp.charAt(i));
        	 
        	}
        	else{
        		
        		if(curr==')')
        		{  if(stk.isEmpty())
        			return false;
        			char popped=stk.pop();
        			if(popped!='(')
        				return false;
        		}
        		if(curr==']')
        		{   if(stk.isEmpty())
        			return false;
        			char popped=stk.pop();
        			if(popped!='[')
        				return false;
        		}
        		if(curr=='}')
        		{   if(stk.isEmpty())
        			return false;
        			char popped=stk.pop();
        			if(popped!='{')
        				return false;
        		}
        		
        	}
        	
        }
		if(!stk.isEmpty())
			return false;
		return true;
	}

}

import java.util.Stack;

public class infixEval {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String exp="(3+4)-(5-2)";
     //System.out.println(getResult(exp));
     
     
	}

	private static void getResult(String exp) {
		// TODO Auto-generated method stub
		Stack<Character> andstk=new Stack<>();
		Stack<Character> orstk=new Stack<>();
		for(int i=0;i<exp.length();i++){
			char curr=exp.charAt(i);
			if(curr=='+'||curr=='-'||curr=='*'||curr=='/')
			{
				orstk.push(curr);
			}
			else{
				char x=andstk.pop();
				char y=orstk.pop();
				
					
				}
			}
		}
	}


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class balancedstk {
    public static boolean isBalanced(String expression) {
        Stack<Character> stk=new Stack<>();
        for(int i=0;i<expression.length();i++)
            {
            char curr=expression.charAt(i);
            if(curr=='('||curr=='{'||curr=='[')
                {
                   stk.push(curr);
                }
            else if(curr==')'||curr=='}'||curr==']')
                { if(stk.isEmpty())
                	return false;
                else{
                  char popped=stk.pop();
                  System.out.println(popped);
                  System.out.println(curr);
                  if(curr==')')
                  { System.out.println("check");
                	  if((char)popped!='(')
                	  {  System.out.println("crazy");
                	    return false;
                	  }
                  }
                      
                   if(!((popped=='{')&&(curr=='}')))
                      {return false;}
                      
                   if(!((popped=='[')&&(curr==']')))
                       {return false;} 
                }
            }
        }
        System.out.println(stk.size());
        
       return stk.isEmpty();
     }

  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++) {
            String expression = in.next();
            boolean answer = isBalanced(expression);
            if(answer)
                System.out.println("YES");
            else System.out.println("NO");
        }
    }
}

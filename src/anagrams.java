
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class anagrams {
    public static int numberNeeded(String first, String second) {
        int count=0;
        HashMap<Character,Integer> fmap=new HashMap<>();
        HashMap<Character,Integer> smap=new HashMap<>();
        for(int i=0;i<first.length();i++)
            {
              int cnt=(!fmap.containsKey(first.charAt(i)))?1:(fmap.get(first.charAt(i))+1);
              fmap.put(first.charAt(i),cnt);
      
        }
        for(int i=0;i<second.length();i++)
            {
            int cnt=(!smap.containsKey(second.charAt(i)))?1:(smap.get(second.charAt(i))+1);
              smap.put(second.charAt(i),cnt);
        }
     /*   if(smap.size()!=fmap.size())
            {
            count=Math.abs(fmap.size()-smap.size());
        }*/
        //System.out.println(count);
        for(Map.Entry<Character,Integer> e:fmap.entrySet())
            {
                char curr=e.getKey();
              //  System.out.println(curr);
                int  currCnt=e.getValue();
                if(smap.containsKey(curr))
                    {
                      int secCnt=smap.get(curr);
                     // System.out.println(secCnt);
                      if(currCnt!=secCnt)
                          {
                          count+=Math.abs(currCnt-secCnt);
                        //  System.out.println("if part");
                         }
                      else{
                    	  
                      }
                   }
                else{
                	count+=currCnt;
                }
        }
        for(Map.Entry<Character,Integer> e:smap.entrySet())
            {
            if(!fmap.containsKey(e.getKey()))
                {count+=e.getValue();
                }
            
        }
        
        
     return count;
    }
  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.nextLine();
        String b = in.nextLine();
        System.out.println(numberNeeded(a, b));
    }
}

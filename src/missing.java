
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class missing {
    
    public static void getMissing(int[] a,int[] b)
        {
    	//System.out.println(a.length+" "+b.length);
        HashMap<Integer,Integer> aMap=new HashMap<>();
        HashMap<Integer,Integer> bMap=new HashMap<>();
        for(int i=0;i<b.length;i++)
            {
            if(!bMap.containsKey(b[i]))
                {bMap.put(b[i],1);}
            else{
                int ct=bMap.get(b[i]);
                
                bMap.put(b[i],ct+1);
            }
            
        }
         for(int i=0;i<a.length;i++)
            {
            if(!aMap.containsKey(a[i]))
                {aMap.put(a[i],1);}
            else{
                int ct=aMap.get(a[i]);
                aMap.put(a[i],ct+1);
            }
            
        }
        ArrayList<Integer> missing=new ArrayList<>();
        for(Map.Entry<Integer,Integer> e:bMap.entrySet())
            {
             int key=e.getKey();
          
            int count=e.getValue();
           // System.out.println(key+" "+count);
            if(aMap.containsKey(key))
            {int count2=aMap.get(key);
              int diff=Math.abs(count2-count);
             // System.out.println(diff);
              if(diff!=0)
                {
                for(int k=0;k<diff;k++)
                    {missing.add(key);
                    }
                 }
            }
            else{ //System.out.println("missing");
                missing.add(key);
                }
           
        }
       // System.out.println(missing);
        Collections.sort(missing);
       //System.out.println(missing);
           for(int l=0;l<missing.size();l++)
               {System.out.print(missing.get(l)+" ");}
    }
    

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner scan=new Scanner(System.in);
        int m=scan.nextInt();
        int[] A=new int[m];
        for(int i=0;i<m;i++)
            {   A[i]=scan.nextInt();  
            }
        int n=scan.nextInt();
        int[] B=new int[n];
        for(int j=0;j<n;j++)
            {B[j]=scan.nextInt();}
        scan.close();
        getMissing(A,B);
        
    }
}
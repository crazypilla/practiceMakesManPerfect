import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class luckmax {
    public static class ValueComparator implements Comparator<Integer> {

    private TreeMap<Integer,Integer> map;

    public ValueComparator(TreeMap<Integer,Integer> map) {
        this.map = map;
    }

    public int compare(Integer a, Integer b) {
        return map.get(a).compareTo(map.get(b));
    }
}
    public static int getmaxLuck(TreeMap<Integer,ArrayList<Integer>> sorted,int k)
        {
        int chosenK=0;
         int maxLuck=0;
         
         for(Map.Entry<Integer,ArrayList<Integer>> e: sorted.entrySet())
             { 
               if(e.getKey()==0)
                   { ArrayList<Integer> tempList=e.getValue();
                   //maxLuck+=e.getValue();
                   for(int a:tempList)
                   {
                	   maxLuck+=a;
                   }
                    }
             else{
            	    Collections.sort(e.getValue(),Collections.reverseOrder());
               
                	 for(int i=0;i<k;i++)
                        {maxLuck+=e.getValue().get(i);}
            	  //  System.out.println(e.getValue());
             
                  }
                
             
          }
        // System.out.println();
        return maxLuck;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int k=scan.nextInt();
        TreeMap<Integer,ArrayList<Integer>> map=new TreeMap<>();
        for(int i=0;i<n;i++)
            {  int one=scan.nextInt();
               int two=scan.nextInt();
               if(map.containsKey(two))
               {
            	   ArrayList<Integer> temp=map.get(two);
            	   temp.add(one);
               }
               else{
            	   ArrayList<Integer> al=new ArrayList<>();
            	   al.add(one);
            	   map.put(two,al);
               }
               
           }
        //System.out.println(map);
      //  TreeMap<Integer,Integer> sorted = new TreeMap<Integer,Integer>(new ValueComparator(map));
        
        System.out.println(getmaxLuck(map,k));
    }
}
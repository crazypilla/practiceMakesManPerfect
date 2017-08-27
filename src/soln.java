import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class soln {
    public static double findMedian(ArrayList<Integer>list)
        {
        Collections.sort(list);
        System.out.println(list);
        int n=list.size();
        if(n%2==1)
            {
            return (double)list.get(n/2);
        }
        else{
        	//System.out.println();
            return (double)((double)(list.get(n/2)+(double)list.get((n/2)-1))/2);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        ArrayList<Integer> list=new ArrayList<>();
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
            list.add(a[a_i]);
            System.out.println(findMedian(list));
            
        }
    }
}

import java.util.Arrays;
import java.util.Scanner;

public class Solution {
 // public static String getUnique(String str)
 
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        String number = in.next();
        int num=Integer.parseInt(number);
        int[] arr=new int[number.length()];
        int j=arr.length-1;
        while(num>0)
        {
        	arr[j]=num%10;
        	num=num/10;
        	j--;
        }
       // System.out.println(Arrays.toString(arr));
        int left=0;
        int right=arr.length-1;
        //StringBuilder sb=new StringBuilder();
        int count=0;
        while(left<right)
        {  //System.out.println("insode left right");
            if(arr[left]==arr[right])
                {//sb.append(""+arr[left]);
                 left++;
                 right--;
                }
            else{
            	//System.out.println(count);
                if(count<=k)
                    {
                    if(arr[left]>arr[right])
                        {
                        arr[right]=arr[left];
                    }
                    else{
                        arr[left]=arr[right];
                    }
                    left++;
                    right--;
                }
                else{
                    System.out.println("-1");
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    } 
      
 
  /* public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        StringBuffer s = new StringBuffer(stdin.nextLine());
        for(int i = 1; i < s.length(); i++) {
        	System.out.print(i);
            if(s.charAt(i) == s.charAt(i-1)) {
            	System.out.println(i+"inside");
                s.delete(i-1, i+1);
                i = 0;
            }
        }
        if(s.length() == 0) System.out.println("Empty String");
        else System.out.println(s);
   */
/*	
	public static int getDiff(String comp)
    { String trueStr="SOS";
    System.out.println(comp);
    if(comp.equals(trueStr))
        return 0;
    else{ int cnt=0;
        for(int i=0;i<comp.length();i++)
            {if(comp.charAt(i)!=trueStr.charAt(i))
                {cnt++;}
            
            }
       return cnt; 
    }
}

public static void main(String[] args) {
    //Scanner in = new Scanner(System.in);
    //String S = in.next(); 
	String S="SOSSOTSORSOS";
    int cnt=0;
    for(int i=0;i<S.length()-2;i=i+3)
        { 
        cnt+=getDiff(S.substring(i,i+3));
        //i=i+;
    }
    System.out.println(cnt);
}*/

}
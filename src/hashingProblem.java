import java.util.HashSet;
import java.util.Iterator;

//import javax.swing.text.html.HTMLDocument.Iterator;

public class hashingProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={1,2,2,3,3,4,4,4,5};
		int[] arr2={1,2,2,3,3,5,5,5,5};
        HashSet<Integer> set=new HashSet<>();
        HashSet<Integer> set2=new HashSet<>();
        for(int i=0;i<arr.length;i++)
        {
        	if(!set.contains(arr[i]))
        	{
        		set.add(arr[i]);
        		
        	}
        }
        for(int i=0;i<arr2.length;i++)
        {
        	if(!set2.contains(arr2[i]))
        	{
        		set2.add(arr2[i]);
        		
        	}
        }
        System.out.println(set);
        Integer[] newArr=set.toArray(new Integer[0]);
        for(int j=0;j<newArr.length;j++)
        {
        	System.out.println(newArr[j]);
        }
        Iterator<Integer> it=set.iterator();
        boolean same=true;
        while(it.hasNext())
        {
        	if(!set2.contains(it.next()))
        	{
        		same=false;
        		break;
        	}
        }
        System.out.println(same);
	}

}

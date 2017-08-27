import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class thirdlarge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr={23,1,21,7,12,16,11,72};
		TreeSet<Integer> set=new TreeSet<>(new Comparator<Integer>(){

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o2-o1;
			}
			
		});
		for(int i=0;i<arr.length;i++)
		{
			set.add(arr[i]);
			
		}
     System.out.println((set));
     Iterator<Integer> iter=set.iterator(); int cnt=0;
     while(iter.hasNext()&&cnt<=3)
     {  int x=iter.next();
    	 cnt++;
    	if(cnt==3)
    	 { System.out.println(x);
    	 break;
    	 }
    	
     }
//	ArrayList<Integer>list=new ArrayList<>(set);
	//System.out.println(list.get(list.size()-3));
	}

}

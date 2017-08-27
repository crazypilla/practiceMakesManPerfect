import java.util.ArrayList;

public class getMultiples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=300;
		//int n=(int) Math.log(num);
		//System.out.println(n);
		ArrayList<Integer> al=new ArrayList<>();
		int sum=1;
		int i=0;
		//al.add(sum);
		while(sum<num)
		{   //al.add(sum);
			sum=(int) Math.pow(2, i);
			if(sum<num)
			  al.add(sum);
			i++;
		}
        System.out.println(al);
	}

}

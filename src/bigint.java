import java.math.BigInteger;

public class bigint {
public static void main(String[] args)
{
	
BigInteger num=new BigInteger("1");
int[] arr={1,2,3,4,5};
for(int i=1;i<5;i++)
{
   	BigInteger value=new BigInteger(arr[i]+"");
   	num=num.add(value);
   //	System.out.println(Integer.parseInt(value.toString()));
   //	num=num.multiply(value);
   //	System.out.println(num);
}
System.out.println(Integer.parseInt(num.toString()));
}
}

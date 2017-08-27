package practice;

public class pr1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1=new String("newLife");
		String s2="NewLife";
		//String s3=new String(s2);
		 s1=new StringBuilder(s1).append(s2).toString();
		//System.out.println(s3.equals(s2));
		System.out.println(s1);

	}

}

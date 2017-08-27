
public class ctcioneeight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="erbottlewat";
		String str2="waterbottle";
		System.out.println(isRotation(str1,str2));

	}

	private static boolean isRotation(String str1,String str2) {
		// TODO Auto-generated method stub
		return (str1+str1).equalsIgnoreCase(str2);
	}

}

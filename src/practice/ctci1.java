


package practice;

import java.util.ArrayList;

public class ctci1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String checkString="abcds";
		System.out.println(checkUnique(checkString));

	}

	private static boolean checkUnique(String checkString) {
		// TODO Auto-generated method stub
		ArrayList<Character> list=new ArrayList<>();
		for(int i=0;i<checkString.length();i++){
			if(list.contains(checkString.charAt(i))){return false;}
			else{
				list.add(checkString.charAt(i));
			}
		}
		return true;
	}

}

package practice;

import java.util.ArrayList;

public class firstnonrepeated {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="aacdbc";
	//	System.out.println(anotherMethod(str));
		ArrayList<Character> list=new ArrayList<>();
		int initInd=0;
		char result=str.charAt(0);
		for(int i=0;i<str.length();i++){
			if(!list.contains(str.charAt(i)))
			{
				list.add(str.charAt(i));
			}
			else{
				if(result!=str.charAt(i))
				{result=str.charAt(initInd+1);
				initInd++;}
				else{
					result=str.charAt(initInd+2);
					initInd+=2;
				}
				
			}
		}
		System.out.println(result);

	}

	

}

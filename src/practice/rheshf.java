package practice;

public class rheshf {
	
	enum Color{RED,BLUE,GREEN}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Color c;
		for(Color c:Color.values())
		{
			System.out.println(c.ordinal());
		}
		
		//BitSet bs=new BitSet(Integer.MAX_VALUE)
		String str="anandidtandan";
		System.out.println(str.contains("did"));
		

	}

}

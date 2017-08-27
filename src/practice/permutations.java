package practice;

public class permutations {
	public static void main(String[] args) {
		String word="abc";
		permutations(word);
	}

	private static void permutations(String word) {
		// TODO Auto-generated method stub
		permutation(word,"");
		
	}

	private static void permutation(String word, String prefix) {
		// TODO Auto-generated method stub
		if(word.length()==0){
			System.out.println(prefix);
			
		}
		else{
			for(int i=0;i<word.length();i++){
				String rem=word.substring(0,i)+word.substring(i+1);
				permutation(rem,prefix+word.charAt(i));
			}
		}

	}

}

import java.util.ArrayList;

public class pseudoHits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ArrayList<Character> actual=new ArrayList<>();
       actual.add('R');
       actual.add('G');
       actual.add('B');
       actual.add('Y');
       ArrayList<Character> guess=new ArrayList<>();
       guess.add('G');
       guess.add('G');
       guess.add('R');
       guess.add('R');
       ArrayList<Character> hitLists=new ArrayList<>();
       ArrayList<Character> pseudoLists=new ArrayList<>();
       int hits=0;
       int pseudoHits=0;
       for(int i=0;i<4;i++)
       {
    	   if(actual.get(i)==guess.get(i))
    	   {
    		   hits++;
    		   hitLists.add(actual.get(i));
    	   }
       }
       for(int i=0;i<4;i++)
       {
    	   char g=guess.get(i);
    	   if(g!=actual.get(i)&&!hitLists.contains(g)&&actual.contains(g))
           {  
	           pseudoLists.add(g);
           }
       }
       for(int i=0;i<pseudoLists.size();i++)
       {   char g=pseudoLists.get(i);
    	   int actualOccs=numOccurences(g,actual);
    	   int guessOccs=numOccurences(g,guess);
    	   
		if(guessOccs==actualOccs)
    	   {
    		 pseudoHits++;   
    	   }
		else{
			pseudoHits+=Math.min(guessOccs,actualOccs);
		}	   
           System.out.println(g);
       }
       
       
       System.out.println(hits+"  hits   "+pseudoHits+"    pseudoHits");
	}

	private static int numOccurences(char g, ArrayList<Character> list) {
		int num=0;
		for(int i=0;i<4;i++)
		{
			if(list.get(i)==g)
				num++;
		}
		//System.out.println(num+" occs");
		return num;
	}

}

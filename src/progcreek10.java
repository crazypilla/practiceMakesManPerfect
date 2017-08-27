
public class progcreek10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String str="apple is a fruit";
      String[] strArr=str.split(" ");
     StringBuilder sb=new StringBuilder();
      String[] newStr=new String[str.length()];
      for(int i=strArr.length-1;i>=0;i--)
      {    
    //	  sb.append(strArr[i]);
    	 // if(i!=0)
    	 // {sb.append(" ");}
      }
    //  System.out.println(sb.toString());
      //System.out.println(new StringBuilder(str).reverse().toString());
      int left=0;
      int right=strArr.length-1;
      while(left<right)
      {
    	  String temp=strArr[left];
    	  strArr[left]=strArr[right];
    	  strArr[right]=temp;
    	  left++;
    	  right--;
      }
      for(int i=0;i<strArr.length;i++)
      {
    	sb.append(strArr[i]);
    	if(i!=strArr.length-1)
    		sb.append(" ");
      }
      System.out.println(sb.toString());
	}

}


public class progcreek12 {
	
  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sub c1=new sub();
		Super c2=new sub();
		System.out.println(c1.s);
		System.out.println(c2.s);
		//System.out.println(obj2.s);
		//mainobj.method();
		c1.method();
		c2.method();

	}

}
class sub extends Super{
	
	
	String s="in sub";
	public static void method(){
		System.out.println("in sub method");
	}
}
class Super {
	
	String s="in super";
	public static void method(){
		System.out.println("in super method");
	}
}
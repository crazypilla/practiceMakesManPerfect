import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Collections;

public class students {
	
	String name;
	int age;
	int marks;
	students(String n,int a,int m){
		this.name=n;
		this.age=a;
		this.marks=m;
	}
	  public String toString() {
	        return "Name of the student.:" + this.name + ",, "
	                + "Age.:" + this.age+ ",, " + "Marks..:"
	                 + this.marks;
	    }
	
	static Comparator<students> studentComparator=new Comparator<students>(){

		@Override
		public int compare(students o1, students o2) {
			// TODO Auto-generated method stub
			
			int mark=(o2.marks-o1.marks);
			if(mark!=0)
				return mark;
			else{
				
				int ages=o1.age-o2.age;
				if(ages!=0)
				{
					return ages;
				}
				else{
					return o1.name.compareTo(o2.name);
				}
			}
			
			//return 0;
		}};
	
	
	public static void main(String[] args){
		
		
		students s1=new students("apple",10,45);
		students s2=new students("balu",11,45);
		students s3=new students("chinnu",10,95);
		students s4=new students("dean",10,55);
		students s5=new students("apple",11,45);
		List<students> alist=new ArrayList<students>();
		alist.add(s1);
		alist.add(s2);
		alist.add(s3);
		alist.add(s4);
		alist.add(s5);
		Collections.sort(alist, studentComparator);
		for(int i=0;i<alist.size();i++){
		System.out.println(alist.get(i));
		}
			
			//Collections.sort(list);
	}

}

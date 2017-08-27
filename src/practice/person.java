package practice;

public class person {
	String name;int age;
	public person(String string, int i) {
		// TODO Auto-generated constructor stub
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		person p=new person("Mary",23);
		person newperson=p;
		newperson.age=25;
		System.out.println(p.age);

	}

}

package Package_1;

public class Anju 
{
	int age;
	int rollno;
	
	public void display1()
	{
		System.out.println("Welcome to all of you");
	}
	
	public void display2()
	{
		System.out.println("Automation is very easy");
	}
	public static void main(String[] args) {
		
		Anju ob=new Anju();
		ob.age = 31;
		ob.rollno = 9211;
		ob.display1();
		ob.display2();
		
		System.out.println("age is " + ob.age);
		System.out.println("roll no is " + ob.rollno);
	}

}

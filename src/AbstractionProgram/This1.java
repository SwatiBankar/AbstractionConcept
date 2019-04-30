package AbstractionProgram;

public class This1 {
	int rollno=10;
	static String name="sunil";
	
	public This1()
	{
		System.out.print("I am constructor");
	}
	private void m1()
	{
		//this.rollno=rollno;
		System.out.print("I am a method");
		System.out.print(this.rollno);//to call instance variable
		System.out.print(This1.name);//to call static variable
		this.m1();//to call method
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      This1 s=new This1();
		System.out.println(s.name);
	}

}

package AbstractionProgram;

public class circle extends shape {
	
	double radius;
	double pi=3.14;
	public circle(String colour,double radius)
	{
		super(colour);
		System.out.print("circle construction is called");
		this.radius=radius;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		shape s=new circle("blue", 3.14);
		System.out.print(s);
        s.area();
	}


	@Override
	double area() {
		// TODO Auto-generated method stub
		return 3.14*4*4;
	}
	


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return colour+""+radius+"";

	}
}

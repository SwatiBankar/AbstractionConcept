package AbstractionProgram;

public abstract class shape {

	String colour;
	abstract double area();
	public abstract String toString();
	
	public shape(String colour)
	{
		System.out.print("this is colour of the area");
		this.colour=colour;
	}
	public String getColour(String colour)
	{
		return colour+"";
	}
	
}

package AbstractionProgram;

public class Addition extends ArithmeticOperation {
	public static void main(String[] args)
	{
		Addition a=new Addition();
		System.out.print(a.add(10,20));
	}

	@Override
	public int add(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}

	@Override
	public double add1(int a, int b) {
		// TODO Auto-generated method stub
		return 0;
	}
	

}

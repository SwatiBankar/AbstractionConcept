package AbstractionProgram;

public class Salary {
	public static void main(String[] args)
	{
	Employee e=new Contractor("swati", 2, 3);
	System.out.println(e.getName());
	System.out.println(e.getPaymentPerHour());
	System.out.print(e.Calculatesalary(););
	

}
}

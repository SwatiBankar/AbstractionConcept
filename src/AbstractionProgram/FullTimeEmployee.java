package AbstractionProgram;

public  class FullTimeEmployee extends Employee {
	public FullTimeEmployee(String Employeename,int PaymentPerHour)
	{
		super(Employeename,PaymentPerHour);
	}
	public int CalculateSalary()
	{
		return getPaymentPerHour()*8;
	}
			

}

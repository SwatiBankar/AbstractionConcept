package AbstractionProgram;

public  class Contractor extends Employee {
	private int workingHour;
	
	public Contractor(String Employeename,int PaymentPerHour,int workingHour )
	{
		super (Employeename,PaymentPerHour);
		this.workingHour=workingHour;
	}
	
	public int calculateSalary()
	{
		return getPaymentPerHour() * workingHour;
		
	}

	@Override
	public void Calculatesalary() {
		// TODO Auto-generated method stub
		
	}
}

	
	
	
	
package AbstractionProgram;

public abstract class Employee {
	private String Employeename;
	private int PaymentPerHour;
	
		public Employee(String Employeename,int PaymentPerHour)
		{
			this.Employeename=Employeename;
			this.PaymentPerHour=PaymentPerHour;
			
		}
		public abstract void Calculatesalary();
		public String getName()
		{
			return Employeename;
		}
		public void setname()
		{
			this.Employeename=Employeename;
		}
		
		public int getPaymentPerHour()
		{
			return PaymentPerHour;
		}
		public void PaymentPerHour()
		{
		this.PaymentPerHour=PaymentPerHour;
        }	
		
	

}






	



package AbstractionProgram;

public abstract class companyEmployee {
	String name;
	String address;
	int salary;
	int number;
	public  abstract int  calculateSalary();
	public companyEmployee(String name,String address,int number, int salary)
	{
		this.name =name;
		this.address=address;
		this.salary=salary;
		this.number=number;
	}
	public String toString()
	{
		return(name+""+address+""+number+""+salary+"");
	}
	
	
	

}

package AbstractionProgram;

public class Calculation extends companyEmployee {
	
	
	

	public Calculation(String name, String address, int number, int salary) {
		super("swati", "samarth nagar", 21, 18000);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		companyEmployee e=new Calculation("swati","samarth nagar",21, 18000);
		System.out.println(e.name);
		System.out.println(e.address);
		System.out.println(e.number);
		//System.out.print(e.salary);
		System.out.println(e.calculateSalary());
	}

	@Override
	public int calculateSalary() {
		// TODO Auto-generated method stub
		return 18000*4;
				
	}
}


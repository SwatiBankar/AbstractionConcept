package AbstractionProgram;

public final class finalClass {
	int no;
	String name;
	public finalClass(String name,int no)
	{
		this.name=name;
		this.no=no;
		
	}
	public String m2()
	{
		return(name+""+no+"");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		finalClass t=new finalClass("swati", 10);
		//System.out.print("swati",10);
	
		System.out.println(t.name);
		System.out.println(t.no);

	}

}

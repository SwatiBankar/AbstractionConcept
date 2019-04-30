package AbstractionProgram;

public class CopyByIndex//requisit //singletone
{

	private static CopyByIndex myobj;
	static{
		myobj=new CopyByIndex();
	}
	public void RerurnInstance()
	{
		CopByIndex myobj=new myobj();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

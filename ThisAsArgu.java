class ThisAsArgument
{
	void m(ThisAsArgument obj)
	{
		System.out.println("method m is invoked");
	}
	void p()
	{
		m(this);
		System.out.println("method n is invoke");
	}
	void s()
	{
		m(this);
		System.out.println("method s calling p & m");
	}
}


public class ThisAsArgu {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}





public class AnonymsObject {
	void fact(int n)
	{
		int fact= 1;
		for(int i = 1; i <= n; i++)
		{
			fact= fact * i;
			
		}
		System.out.println(fact);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     new   AnonymsObject().fact(5);
     new  AnonymsObject().fact(10);
	}

}

 class Increment 
{
	static int count = 0;
	Increment()
	{
	count++;
	System.out.println(count);
	}
}
public class StaticVarIncrement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Increment obj = new Increment();
           Increment obj1 = new Increment();
           System.out.println(obj1);
           System.out.println(obj);
	}

}

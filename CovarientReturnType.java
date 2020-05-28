class A1
{
	A1 get()
	{
		System.out.println("hello A");
		return this;
		
	}
}
class B1
{
	B1 get()
	{
		System.out.println("hello B");
		return this;
	}
	void message()
	{
		System.out.println("printed message");
	}
}
public class CovarientReturnType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A1 a = new A1();
		B1 b = new  B1();
		a.get();
		b.get();
		b.get().message();;

	}

}

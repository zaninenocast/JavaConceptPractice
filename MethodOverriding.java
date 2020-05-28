class Vihecle
{
	void display()
	{
		System.out.println("Vihecle is running");
	}
}
public class MethodOverriding extends Vihecle {
     void display()
     {
    	 System.out.println("bike is running");
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vihecle v =  new Vihecle();
		MethodOverriding m = new MethodOverriding();
		v.display();
		m.display();

	}

}

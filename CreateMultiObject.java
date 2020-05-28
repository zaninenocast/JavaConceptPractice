class Rectangle
{
	int length;
	int width;
	void insert(int length1,int width1)
	{
		length = length1;
		width = width1;
		
	}
	void display () {
		System.out.println("Area of rectangle is:"+(length*width));
	}
	
}
public class CreateMultiObject {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle R1 = new Rectangle(),R2 = new Rectangle() , R3 = new Rectangle() ;
		R1.insert(5, 10);
		R2.insert(10,15);
		R3.insert(20, 25);
		R1.display();
		R2.display();
		R3.display();

	}

}

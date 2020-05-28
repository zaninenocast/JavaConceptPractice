class cons
{
	cons(){
		this(11);
		System.out.println("my defalut constructor");
	}
	cons(int c) {
		System.out.println("perameterrized constructor");
		c = c+ c;
		System.out.println(c);
		
		
		
	}
}
public class ConstructorReUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      cons one = new cons();
      System.out.println(one);
     
      
	}

}

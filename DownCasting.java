class A3{
	
}   

   public class DownCasting extends A3{
	
   static void method(A3 a) {
if (a  instanceof DownCasting) {
	
		 DownCasting b = (DownCasting)a;
		 System.out.println(b);
	 }

}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
     A3 a = new  DownCasting();
     DownCasting.method(a);
     A3 c = new  DownCasting();
     DownCasting.method(c);
	}
        
}

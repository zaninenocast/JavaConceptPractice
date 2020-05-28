class A{
	ThisAsArgConsCall obj;
	A(ThisAsArgConsCall obj){
		this.obj = obj ;
	}
	void display() {
		System.out.println(obj.data);
	}
}
public class ThisAsArgConsCall {
	int data = 10;
	ThisAsArgConsCall(){
	A a = new A(this);
	a.display();
	}
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		ThisAsArgConsCall var = new ThisAsArgConsCall();
		System.out.println(var);
		

		
	}

}

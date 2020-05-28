class Bank{
	int acc_no;
	String name;
	float ammount;
	void insert(int ac_No ,String acholdername,float amt) {
		acc_no = ac_No;
		name = acholdername;
	    ammount = amt;	
	}
	void display()
	{
		System.out.println("your account detail -");
		System.out.println("Customer Account no:"+acc_no);
		System.out.println("Customer name: " +name);
		System.out.println("Current balance:"+ammount);
	}
	void diposite(int amt) {
		ammount = ammount + amt;
		System.out.println("diposite ammount"+amt);
		System.out.println("Current balance:"+ammount);
		
	}
	void withdraw(int amt) {
		if (amt > ammount)
		   {
			System.out.println("insufficient balance");
			System.out.println("Current balance:"+ammount);
			}
		else
		{
			ammount = ammount - amt;
			System.out.println("withdraw ammount"+amt);
			System.out.println("Current balance:"+ammount);
		}
	}
	
}
public class BankingSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Bank customer = new Bank();
      customer.insert(0001, "komal Jatyani", 50000);
      System.out.println("*************************");
      customer.display();
      System.out.println("*************************");
      customer.diposite(100000);
      System.out.println("*************************");
      customer.withdraw(55000);
      System.out.println("*************************");
	}

}

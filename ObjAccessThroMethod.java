import java.util.Scanner;

public class ObjAccessThroMethod {
	int memberId ;
	String memberName;
	void displayInformation() {
		Scanner scer = new Scanner(System.in);
		System.out.println("Enter member id");
		int id = scer.nextInt();
		Scanner scer1 = new Scanner(System.in);
		System.out.println("Enter name");
		String name = scer1.nextLine();
		
		this.memberId = id;
		this.memberName = name ;
		System.out.println("name is "+name);
		System.out.println("id is "+ id);
		scer.close();
		scer1.close();
	}
	void inserRecord(int id, String name)
		{
			memberId = id;
			memberName = name;
		}
		
	void displayInfo() {
		System.out.println(memberId);
		System.out.println(memberName);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ObjAccessThroMethod person = new ObjAccessThroMethod();
       person.displayInformation();
       person.inserRecord(2, "Roshan");
       person.displayInfo();
	}

}

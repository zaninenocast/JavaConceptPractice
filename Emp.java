class Address 
{
	String city,state,country;
    Address(String city , String state , String country)
	{
		this.city = city;
		this.state = state;
		this.country = country ;
	}
}
public class Emp {
	int id;
	String name;
	Address address ;
	Emp(int id,String name , Address address)
	{
		this.id = id;
		this.name = name;
		this.address = address ;
		
		
	}
	void display()
	{
		System.out.println(id +" "+name);
		System.out.println(address.city + " " + address.state +" " +" "+ address.country);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address address1 = new Address("jodhpur","Rajasthan","India");
		Address address2 = new Address("surat","Gujrat","india");
		
		Emp emp1 = new Emp(1,"komal",address1);
		Emp emp2 = new Emp(2,"xyz",address2);
		
		emp1.display();
		emp2.display();

	}

}

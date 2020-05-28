class StudentRecord1
{
	int rollNo;
	String name,course;
	float fee;
	StudentRecord1(int rollNo,String name , String course)
	{
		this.rollNo = rollNo;
		this.course = course ;
		this.name = name;
	}
	StudentRecord1(int rollNo ,String name , String course ,float fee)
	{
		this(rollNo,course , name);
		this.fee = fee ;
	}
	void display () {
		  System.out.println(name + "" + rollNo +"" +course +"" + fee);
	}
}
public class StudentRecord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      StudentRecord1 student = new StudentRecord1(1, "komal", "developing" ,20000);
      student.display();
	}

}

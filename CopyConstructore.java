class Student1 
{
	String studentName;
	String studentRollno;
	int marks ;
	
	Student1(){
		studentName = "komal";
		studentRollno = "1";
		marks = 54 ;
	}
	Student1(Student1 one)
	{
		studentName = one.studentName;
		studentRollno = one.studentRollno;
		marks = one.marks;
		
	}
}
public class CopyConstructore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
	}

}

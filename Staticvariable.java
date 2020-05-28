class person {
	String personName;
    int personuniqueId ;
    String personPost;
    static String personCompany = "javatpoint";
    person(String name, int id , String post)
    {
    	personName = name;
    	personuniqueId = id;
    	personPost = post;
    }
    void display() {
    	System.out.println(personName +" 's id is "+personuniqueId +"and working as "+personPost +" at the company " +personCompany);
    }
}
public class Staticvariable {
public static void main(String[] arg) {
		// TODO Auto-generated method stub
       person one = new person("komal",1,"developer");
       person two = new person("priya",2,"seller");
       one.display();
       two.display();
	}

}

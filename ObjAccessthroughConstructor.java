
public class ObjAccessthroughConstructor {
	int memberId;
	String memberName;
   	

	public ObjAccessthroughConstructor(int id, String name) {
	
		this.memberId = id;
		this.memberName = name;
	}
	void diplay() {
		System.out.println(memberId);
		System.out.println(memberName);
	}

    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ObjAccessthroughConstructor member = new ObjAccessthroughConstructor(1, "honey");
		member.diplay();
		
		
       
	}

}

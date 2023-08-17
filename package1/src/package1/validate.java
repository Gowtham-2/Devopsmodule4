package package1;

public class validate {
	public static void main(String args[]) {
		String un1=new String("Name");
		String ps1=new String("Password");
		String user1=new String("Str");
		String password=new String("ster");
		if(un1==user1 && ps1==password) {
			System.out.println("Successfully matched");
		}
		else{
			System.out.println("Username or Password does not matched");
		}
	}
}

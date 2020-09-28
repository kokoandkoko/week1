package week13;

public class son implements father,mather {
	public void cook() {
		System.out.println("Mom cooking nice");
	}
	
	public void work() {
		System.out.println("Dad working good");
		
	}
	
	public static void main(String[]args) {
		son s = new son();
		s.cook();
		s.work();
	}
}

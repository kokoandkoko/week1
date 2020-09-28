package week13;
//import java.util.Scanner;
public class human {

	
	void run(){
		System.out.println("Human can run");
	}
	void eat() {
		System.out.println("Human can eat");
	}
//	void display(){
//		int i;
//		Scanner myin = new Scanner(System.in);
//		int a = myin.nextInt();
//		for(i=1;i<=a;++i	) {	
//			
//			System.out.println(i+ " Human " );
//			}
//		
//	}
}
	
	
	



class engineer extends human{
	void work(){
		System.out.println("Engineer can work");
	}
}

class student extends engineer {
	public static void main(String[]args) {
//		Scanner myin = new Scanner(System.in);
		student std1 = new student();
		engineer en = new engineer();
		en.work();
//		std1.display();
		std1.eat();
		std1.run();
	}
}

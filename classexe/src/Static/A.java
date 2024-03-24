package Static;

public class A {

	int x=10;
	static int y=10; 
	void m1(){
		System.out.println(x);
		System.out.println(y);
		System.out.println("===m1===");
		m3();
		m4();
		m5();
	}
	static void m2(){
		System.out.println(y);
		System.out.println("===m2===");
	}
	void m3(){
		System.out.println("===m3===");
	}
	static void m4(){
		System.out.println("==Static method==");
	}	
	void m5(){
		System.out.println("==Hello I am Instance Method==");
	}
}


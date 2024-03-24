package LambdaExp;

public class Test {
public static void main(String[] args) {
	A sum=(a,b)->a+b;
	System.out.println(sum.doOperation(20, 30));
	
	A mul=(a,b)->a*b;
	System.out.println(mul.doOperation(20, 40));
	
	A div=(a,b)->{return a/b;};
	System.out.println(div.doOperation(900, 30));

}
}

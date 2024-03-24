package Demo;

public class XTest {
public static void main(String[] args) {
	X xx= new X(89,"pune","4345");
	
	//xx.age=89;
    //xx.loc="pune";
	//xx.phone="5434";
	// this you need to write multiple 
	//times for every variable to reduce
	//this we will use constructor and toString
	//method and getter and setter method

	System.out.println(xx.phone);
	System.out.println(xx.age);
	System.out.println(xx.loc);
	
	System.out.println(xx);
	

}


}

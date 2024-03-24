package THIS;
//this keyword can be used to pass as an argument in the method call
public class Demo4 {
void m1(Demo4 d){
	System.out.println("I am in m1 method");
}
void m2(){
	m1(this);
}
}

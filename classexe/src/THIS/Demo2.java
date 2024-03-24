package THIS;
// this keyword can be used to invoke current class method(implicitly)
public class Demo2 {
void display(){
	System.out.println("hello");
}
void show(){
	//this.display();
	display();
}


}

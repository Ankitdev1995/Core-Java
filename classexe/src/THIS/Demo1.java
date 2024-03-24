package THIS;
// this keyword is used to invoke current class instance variable 
public class Demo1 {
int i;
void setValue(int i){
	this.i=i;
}
	void show(){
		System.out.println(i);	
}
}

package Static;

public class Room3 {
int empid;
String ename;
static String Company="Samsung";


 Room3(int empid,String ename){
	 
 this.empid=empid;
 this.ename=ename;
 
 }
void display(){
	System.out.println(empid+" "+ename +" "+ Company);
	
}
}

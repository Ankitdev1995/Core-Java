package Static;

public class AA {
static int ctr=0;
int i=100;
{
	System.out.println("before change in local block");
	System.out.println("ctr="+ctr);
	System.out.println("i="+i);
	
	int ctr=2,i=200;
	System.out.println(" ");
	System.out.println("After change in local block");
	System.out.println("ctr="+ctr);
	System.out.println("i="+i);
}
void display(){
	System.out.println("in another method");
	System.out.println("ctr="+ctr);
	System.out.println("i="+i);
}
}

package Logic;

public class Fibonaaci {
public static void main(String[] args) {
	int n=12 ,a=0,b=1;
    
	
	System.out.print(a + " " + b + " ");
	for(int i=3; i<=n; i++){
	int c=a+b;
	System.out.print(c + " ");
	a=b;
	b=c;
}
	

System.out.println("===============");
		/*triplet fibbonacci series*/
	 int p=10,x=0,y=0,z=1;
	 System.out.print(x+" "+y+" "+z+" ");
	 for(int i=4; i<=12;i++){
		 int d=x+y+z;
		 System.out.print(d+ " ");
		 x=y;
		 y=z;
		 z=d;
	 }
	 
	 
} 
}
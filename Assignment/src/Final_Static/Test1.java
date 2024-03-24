package Final_Static;

public class Test1 {
public static void main(String[] args) {
	StaticBlockEx obj1=new StaticBlockEx();
	StaticBlockEx obj2=new StaticBlockEx();
			obj1.increment();
			obj2.increment();
			System.out.println(obj1.count);
			System.out.println(obj2.count);
			}
}

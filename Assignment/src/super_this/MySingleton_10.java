package super_this;

public class MySingleton_10 {
	private static MySingleton_10 myobj;
	private MySingleton_10(){
		
	}
	public static MySingleton_10 getInstance(){
		if(myobj==null){
			myobj=new MySingleton_10();
			
		}
	return myobj;
	}
	public void getSomeThing()   
	{
		System.out.println("I am here.....");
	}
	public static void main(String[] args) {
	MySingleton_10 st= MySingleton_10.getInstance();
		st.getSomeThing();
	
	}
}
	

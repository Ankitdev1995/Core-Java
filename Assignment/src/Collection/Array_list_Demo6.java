package Collection;
//Program for to copy ArrayList into array
import java.util.ArrayList;

public class Array_list_Demo6 {
public static void main(String[] args) {
	ArrayList<String> arr1=new ArrayList<>();
	arr1.add("Pune");
	arr1.add("Mumbai");
	arr1.add("Delhi");
	arr1.add("Nagpur");
	System.out.println("Actual ArrayList:"+arr1);
	
	String[]strArr=new String[arr1.size()];
	arr1.toArray(strArr);
	System.out.println("\nCreated Array Element");
	for(String str:strArr){
		System.out.println(str);
		
	}
}
}

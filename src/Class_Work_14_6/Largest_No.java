package Class_Work_14_6;
//largest no in given array
public class Largest_No {
	
public static void main(String[] args) {
	
	int a[]={15,37,98,48,19,56,29,61};
	int large = a[0];
	for(int i=0;i<a.length;i++){
		if(a[i]>large)
			large = a[i];
	}
	System.out.println("Largest no in given array is=>"+ large);
}
}

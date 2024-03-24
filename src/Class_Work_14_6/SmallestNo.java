package Class_Work_14_6;
//Smallest number in given array 
public class SmallestNo {
public static void main(String[] args) {
	 
	int a[]={56,43,78,92,35,83,21,67};
	int small=a[0];
	for(int i=0;i<a.length;i++){
		if (a[i]<small)
			small=a[i];
		
	}
	System.out.println("Smallest number in given array is:==>"+ " "+small);
}
}

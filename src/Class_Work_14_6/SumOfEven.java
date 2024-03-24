package Class_Work_14_6;
// To Accept a array and print sum of even number
public class SumOfEven {
	public static void main(String[] args) {

		int a[]={68,85,93,76,38,97,83};
		int sum=0;
		for (int i=0;i<a.length;i++){

			if(a[i]%2==0){
				sum = sum+a[i];
			}
		}
		System.out.println("Sum of even Number is:==>" +" "+sum);
	}	
}


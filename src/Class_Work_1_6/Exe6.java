package Class_Work_1_6;
// print all element whose last digit is 8
public class Exe6 {
public static void main(String[] args) {
	int []a={51,4,66,198,7,78,122,28,69,1258};
	for(int i=0;i<a.length;i++){
	if(a[i]%10==8){
		System.out.println(a[i]);	
		}
		else{
		System.out.println();
	}
	}
System.out.println("=======================");

	int rem;
	for(int i=0;i<a.length;i++){
		int num = a[i];
		rem = num%10;
		num = num/10;
		
		if(rem==8){
			System.out.println(a[i]);
		}
	}

}
}
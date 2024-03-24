package Class_Work_1_6;
// To find maximum value in an array
public class Exe11 {
public static void main(String[] args) {
	int a[]={4,6,2,9,3,8,1,5};
	int max=a[0];
	for(int i=0;i<a.length;i++){
		if(a[i]>max){
			max=a[i];
		}	
		}
		System.out.println("maximum number is:" + max);
		
// To find minimum value in an array
		int min=a[1];
		for(int i=0;i<a.length;i++){
			if(a[i]<min){
				min=a[i];
				}
			}
		System.out.println("minimum number is:"+ min);
}
}

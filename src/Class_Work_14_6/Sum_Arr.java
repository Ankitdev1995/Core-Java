package Class_Work_14_6;
//Sum of each digit
public class Sum_Arr {
public static void main(String[] args) {
	
	int a[]={71,85,117,45,93,8};
	for(int i=0;i<a.length;i++){
		
		int sum = 0;
		int no = a[i];
		while(no>0){
		int	r=no%10;
			no=no/10;
			sum=sum+r;
			}
			System.out.println(sum);
		}
	}
}

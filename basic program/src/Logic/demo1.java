package Logic;

public class demo1 {
public static void main(String[] args) {
	int sum = 0;
	for(int i=1;i<5;i++){
		
	 sum = sum+i;
	System.out.println(sum);
}
System.out.println("========que1==========");
	  sum = 0;
	for(int i=1;i<5;i++){
	
		sum = sum+i;
		System.out.println(sum);
	}
System.out.println("====que2========");
	 sum = 0;
	for(int i=1;i<5;i++){
		if(i%2==0){
			i++;
		}
		sum = sum+i;
		
	}
	System.out.println(sum);

	System.out.println("======que3============");
	
	sum=0;
	for(int i=1;i<5;i++){
		if(sum%2==0){
			i++;
		}
		sum=sum+i;
		}
	System.out.println(sum);
	
	System.out.println("===============");
	
	int cnt=0;
	for(int i=1;i<=5;i++){
		if(i%2==0){
			i++;
			//j++;
		}
	cnt++;
	}
	System.out.println(cnt);
	System.out.println("==================");
	int n=2;
	int s=0;
	while(n!=0){
		int r=n%10;
		s=s+r;
		n=n/10;
		System.out.println(s);
	}

}
}
